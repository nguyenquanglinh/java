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
public class GiaoVien extends Nguoi{

    private String boMon;
    private String khoa;
    private int luong;
    private String hocHam;
    public GiaoVien(){
        SetMaSo("soCMT");
        SetHoTen("hoTen");
        SetNgaySinh("ngaySinh");
        SetDiaChi("DiaChi");
        SetBoMon("boMon");
        SetKhoa("khoa");
        SetHocHam("hocHam");
        SetLuong(0);
    }
    public GiaoVien(String soCMT,String hoTen,String ngaySinh,String diaChi,String boMon,String khoa,String hocHam,int luong){
        SetMaSo(soCMT);
        SetHoTen(hoTen);
        SetNgaySinh(ngaySinh);
        SetDiaChi(diaChi);
        SetBoMon(boMon);
        SetKhoa(khoa);
        SetHocHam(hocHam);
        SetLuong(luong);
    }
    public void SetBoMon(String boMon) {
        this.boMon=boMon;
    }
    public String GetBoMon(){
        return this.boMon;
    }

    public void SetKhoa(String khoa) {
        this.khoa=khoa;
    }
    public String getKhoa(){
        return this.khoa;
    }

    private void SetHocHam(String hocHam) {
        this.hocHam=hocHam;
    }
    public String GetHocHam(){
        return this.hocHam;
    }

    private void SetLuong(int luong) {
        this.luong=luong;
    }
    public int GetLuong(){
        return this.luong;
    }
    public String toString(){
        return "Thong tin giao vien: \n"+"Ten giao vien: "+GetHoTen()+
                "\nKhoa: "+getKhoa()+
                "\nBo mon: "+GetBoMon()+
                "\nHoc ham: "+GetHocHam()+
                "\nLuong: "+GetLuong()+
                "\nQue quan: "+GetDiaChi();
    }
}
