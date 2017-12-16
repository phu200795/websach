package controller;

import model.SanPham;
import service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 *
 * @author TUNGDUONG
 */
@Controller
@RequestMapping(value ="/home")
public class HomepageController {

    @Autowired
    SanPhamService sanPhamService;

    // trang chủ
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(ModelMap mm) {
        mm.put("listSanPham", sanPhamService.getAll());
        return "jsp/index";
    }

    // tạo mới dữ liệu
    @RequestMapping(value = "them-du-lieu.html", method = RequestMethod.GET)
    public String insert(ModelMap mm) {
        mm.put("sanPham", new SanPham());
        return "jsp/themsp";
    }

    // sửa dữ liệu
    @RequestMapping(value = "sua-du-lieu/{id}.html", method = RequestMethod.GET)
    public String update(ModelMap mm, @PathVariable(value = "id") long id) {
        mm.put("sanPham", sanPhamService.findByID(id));
        return "jsp/suasp";
    }

    // lưu dữ liệu
    @RequestMapping(value = "luu-du-lieu.html", method = RequestMethod.POST)
    public String save(ModelMap mm, @ModelAttribute(value = "sanPham") SanPham sanPham) {
        sanPhamService.insert(sanPham);
        mm.put("listSanPham", sanPhamService.getAll());
        return "jsp/index";
    }
    //xoa dữ liệu
     @RequestMapping(value = "xoa-du-lieu/{id}.html", method = RequestMethod.GET)
    public String delete(ModelMap mm, @PathVariable(value = "id") long id) {
        sanPhamService.delete(sanPhamService.findByID(id));
        mm.put("listSanPham", sanPhamService.getAll());
        
        return "jsp/index";
    }
    //update luu 
    @RequestMapping(value = "update-du-lieu.html", method = RequestMethod.POST)
    public String saveUpdate(ModelMap mm, @ModelAttribute(value = "sanPham") SanPham sanPham) {
        sanPhamService.update(sanPham);
        mm.put("listSanPham", sanPhamService.getAll());
        return "jsp/index";
    }
}