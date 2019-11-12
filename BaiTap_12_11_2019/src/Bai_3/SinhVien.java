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
public class SinhVien extends Nguoi{
    private String nganh;
    private String khoa;
    private String namNhapHoc;
    private String namTotNghiep;
    private String maSV;
    public SinhVien(){
        SetNganh("nganh");
        SetKhoa("Khoa");
        SetNamNhapHoc("NamNhapHoc");
        SetNamTotNghiep("NamTotNghiep");
        SetMaSV("maSV");
        SetMaSo("soCMT");
        SetHoTen("hoTen");
        SetNgaySinh("NgaySinh");
        SetDiaChi("diaChi");
    };
    public SinhVien(String soCMT,String maSV,String hoTen,String ngaySinh,String diaChi,String nganh,String khoa,String namNhapHoc,String namTotNghiep){
        SetMaSo(soCMT);
        SetMaSV(maSV);
        SetHoTen(hoTen);
        SetNgaySinh(ngaySinh);
        SetDiaChi(diaChi);
        SetNganh(nganh);
        SetKhoa(khoa);
        SetNamNhapHoc(namNhapHoc);
        SetNamTotNghiep(namTotNghiep);
    };

    public void SetNganh(String nganh) {
        this.nganh=nganh;
    }
    public String GetNganh(){
        return this.nganh;
    }

    public void SetKhoa(String khoa) {
        this.khoa=khoa;
    }
    public String GetKhoa(){
        return this.khoa;
    }

    public void SetNamNhapHoc(String namNhapHoc) {
        this.namNhapHoc=namNhapHoc;
    }
    public String GetNamNhapHoc(){
        return this.namNhapHoc;
    }

    public void SetNamTotNghiep(String namTotNghiep) {
        this.namTotNghiep=namTotNghiep;
    }
    public String GetNamTotNghiep(){
        return this.namTotNghiep;
    }
    @Override
    public String toString(){
        return "Thong tin sinh vien: \n"+"Ten sinh vien: "+GetHoTen()+
                "\nMa sinh vien: "+GetMaSV()+
                "\nKhoa: "+GetKhoa()
                +"\nNganh: "+GetNganh()+"\nNgay sinh: "+GetNgaySinh()+"\nQue quan:"+GetDiaChi()+"\nNam nhap hoc: "+GetNamNhapHoc();
    }

    public void SetMaSV(String maSV) {
        this.maSV=maSV;
    }
    public String GetMaSV(){
        return this.maSV;
    }
}
