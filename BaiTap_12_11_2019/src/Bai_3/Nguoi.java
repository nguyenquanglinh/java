/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_3;

/**
 *
 * @author thang
 */
public class Nguoi {
    String maSo;
    String hoTen;
    String ngaySinh;
    String diaChi;
    public Nguoi(){
        SetMaSo("soCMT");
        SetHoTen("hoTen");
        SetNgaySinh("ngaySinh");
        SetDiaChi("DiaChi");
    };
    public Nguoi(String soCMT,String hoTen,String ngaySinh,String diaChi){
        SetMaSo(soCMT);
        SetHoTen(hoTen);
        SetNgaySinh(ngaySinh);
        SetDiaChi(diaChi);
    };

    public void SetMaSo(String soCMT) {
        this.maSo=soCMT;
    }
    public String GetMaSo(){
        return this.maSo;
    }

    public void SetHoTen(String hoTen) {
        this.hoTen=hoTen;
    }
    public String GetHoTen(){
        return this.hoTen;
    }

    public void SetNgaySinh(String ngaySinh) {
        this.ngaySinh=ngaySinh;
    }
    public String GetNgaySinh(){
        return this.ngaySinh;
    }

    public void SetDiaChi(String diaChi) {
        this.diaChi=diaChi;
    }
    public String GetDiaChi(){
        return this.diaChi;
    }
    @Override
    public String toString(){
        return "Thong tin nguoi: \n"+"Ho ten: "+GetHoTen()+"\nMa nguoi: "+GetMaSo()+"\nNgay sinh: "+GetNgaySinh()+"\nDia chi: "+GetDiaChi();
    }
    
    
}
