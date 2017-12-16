package model;

import java.text.DecimalFormat;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

/**
 *
 * @author TUNGDUONG
 */
@Entity(name = "san_pham")
public class SanPham  {

    @Id
    @GeneratedValue
    private long maSanPham;
    private String tenSanPham;
    private int soluongSanPham;
    private double giaBan;
    private String danhmucSanPham;

    public SanPham() {
    }

    public SanPham(long maSanPham, String tenSanPham, int soluongSanPham, double giaBan, String danhmucSanPham) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soluongSanPham = soluongSanPham;
        this.giaBan = giaBan;
        this.danhmucSanPham = danhmucSanPham;
    }

    public long getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(long maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getSoluongSanPham() {
        return soluongSanPham;
    }

    public void setSoluongSanPham(int soluongSanPham) {
        this.soluongSanPham = soluongSanPham;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getDanhmucSanPham() {
        return danhmucSanPham;
    }

    public void setDanhmucSanPham(String danhmucSanPham) {
        this.danhmucSanPham = danhmucSanPham;
    }
    
    public String formatPrice(){
        String temp = new DecimalFormat("###,###,###").format(giaBan);
        String result = temp.replace(",", ".");
        return result;
    }

   

}