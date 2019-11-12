/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuchanh;

/**
 *
 * @author thang
 */
public interface  Shape {
    // trả về diện tích của một đối tượng hình học shape

    public double area() ;
    // trả về thể tích của một đối tượng hình học shape

    public double volume();
    // Phương thức trừu tượng cần phải được hiện thực
    // trong những lớp con để trả về tên đối tượng
    // hình học shape thích hợp
    public abstract String getName();
} // end class Shape

