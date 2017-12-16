package service;

import java.util.ArrayList;
import dao.SanPhamDao;
import model.SanPham;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author TUNGDUONG
 */
@Service
public class SanPhamService  {

    @Autowired
    SanPhamDao sanPhamDAO;

    
    public boolean insert(SanPham sp) {
        return sanPhamDAO.insert(sp);
    }

   
    public boolean update(SanPham sp) {
        return sanPhamDAO.update(sp);
    }

  
    public boolean delete(SanPham sp) {
        return sanPhamDAO.delete(sp);
    }

 
    public SanPham findByID(long id) {
        return sanPhamDAO.findByID(id);
    }

  
    public ArrayList<SanPham> getAll() {
        return sanPhamDAO.getAll();
    }

}