
package com.Admin;
public class SanPham {
    private int donGia;
    private String id, tenSp, loaiSp;
    public SanPham(String id, String tenSp, int donGia, String loaiSp){
        setId(id);
        setTenSp(tenSp);
        setDonGia(donGia);
        setLoaiSp(loaiSp);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public String getId() {
        return id;
    }

    public String getTenSp() {
        return tenSp;
    }

    public int getDonGia() {
        return donGia;
    }
    
    public void setLoaiSp(String loaiSp) {
        this.loaiSp = loaiSp;
    }

    public String getLoaiSp() {
        return loaiSp;
    }
}
