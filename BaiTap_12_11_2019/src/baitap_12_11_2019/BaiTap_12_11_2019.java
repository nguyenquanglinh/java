/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap_12_11_2019;

import Bai_1.NhanVien;
import Bai_2.HoaDon;
import Bai_3.GiaoVien;
import Bai_3.Nguoi;
import Bai_3.SinhVien;

/**
 *
 * @author thang
 */
public class BaiTap_12_11_2019 {
    public static void main(String[] args) {
        // TODO code application logic here
        NhanVien nv=new NhanVien(0,"abc",1000000);
        System.out.println(nv);
        System.out.println(nv.GetTongLuongNam());
        HoaDon hd=new HoaDon("123","kem danh rang", 1, 12000);
        System.out.println(hd);
        Nguoi ng=new Nguoi("12345678", "nguyen van a","1/1/2000","nam dinh");
        System.out.println(ng);
        SinhVien sv=new SinhVien("12345678", "17150140", "nguyen van a", "1/1/2000", "yen cuong", "cntt", "cntt", "2017", "2022");
        System.out.println(sv);
        GiaoVien gv=new GiaoVien("12345678", "nguyen van a", "1/1/2000", "nam dinh", "toan", "cntt", "tien si", 100000000);
        System.out.println(gv);
    }
}
