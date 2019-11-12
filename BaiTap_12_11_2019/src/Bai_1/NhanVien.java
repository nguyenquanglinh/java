/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_1;

/**
 *
 * @author thang
 */
public class NhanVien {
    private int maNhanVien;
    private String hoTen;
    private int luong;

    public  NhanVien(){
        SetMaNhanVien(0);
        SetHoTenNhanVien("hoTen");
        SetLuongNhanVien(0);
    };
    public  NhanVien(int maNhanVien,String hoTen,int luong){
        SetMaNhanVien(maNhanVien);
        SetHoTenNhanVien(hoTen);
        SetLuongNhanVien(luong);
    };
    public void SetLuongNhanVien(int luong){
        this.luong=luong;
    }
    public int GetLuongNhanVien(){
        return this.luong;
    }
    public void SetHoTenNhanVien(String hoTen){
        this.hoTen=hoTen;
    }
    public String GetHoTenNhanVien(){
        return this.hoTen;
    }
    private void SetMaNhanVien(int maNhanVien){
        this.maNhanVien=maNhanVien;
    }
    public int GetMaNhanVien(){
        return this.maNhanVien;
    }
    public  int GetTongLuongNam(){
        return 12*GetLuongNhanVien();
    }
    @Override
    public String toString(){
        return "Thong tin nhan vien: \n"+
                "Ten nhan vien: "+this.GetHoTenNhanVien()
                +"\nMa nhan vien: "+this.GetMaNhanVien()
                +"\nLuong cua nhan vien: "+this.GetLuongNhanVien();
    }
}
