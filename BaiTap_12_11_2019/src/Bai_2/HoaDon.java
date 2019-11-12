/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_2;

/**
 *
 * @author thang
 */
public class HoaDon {
    private String maHoaDon;
    private String moTa;
    private int soLuong;
    private int donGia;
    public HoaDon(){
        SetMaHoaDon("0");
        SetMoTa("HoaDon");
        SetDonGia(0);
        SetSoLuong(0);
    };
    public HoaDon(String maHoaDon,String moTa,int soLuong,int donGia){
        SetMaHoaDon(maHoaDon);
        SetMoTa(moTa);
        SetSoLuong(soLuong);
        SetDonGia(donGia);
    }

    public void SetMaHoaDon(String string) {
        this.maHoaDon=string;
    }
    public String GetMaHoaDOn(){
        return this.maHoaDon;
    }

    public void SetMoTa(String hoaDon) {
        this.moTa=hoaDon;
    }
    public String GetMoTa(){
        return this.moTa;
    }

    public void SetDonGia(int donGia) {
        this.donGia=donGia;
    }
    public int GetDonGia(){
        return this.donGia;
    }

    public void SetSoLuong(int soLuong) {
        this.soLuong=soLuong;
    }
    public int GetSoLuong(){
        return this.soLuong;
    }
    public int GetTongTien(){
        return GetSoLuong()*GetDonGia();
    }
    public String toString(){
        return "Thong tin hoa don:\n"+"ma hoa don: "+GetMaHoaDOn()
                +"\nMo ta sa pham: "+GetMoTa()+"\nSo luong: "+GetSoLuong()+
                "\nDon gia: "+GetDonGia()+"\nTong tien: "+GetTongTien();
    }
}
