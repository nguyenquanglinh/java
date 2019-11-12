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
public class Cylinder extends Circle {

    protected double height; // chiều cao của Cylinder

    public Cylinder() // constructor không có tham số
    {
        // ngầm gọi đến constructor của lớp cha
        setHeight(0);
    }
    // constructor có tham số

    public Cylinder(double cylinderHeight, double cylinderRadius,
            int xCoordinate, int yCoordinate) {
        // Gọi constructor của lớp cha
        super(cylinderRadius, xCoordinate, yCoordinate);
        setHeight(cylinderHeight);
    }

    public void setHeight(double cylinderHeight) {	// Gán chiều cao cho Cylinder	
        height = (cylinderHeight >= 0 ? cylinderHeight : 0);
    }

    public double getHeight() // Lấy chiều cao của Cylinder
    {
        return height;
    }

    public double area() // Tính diện tích xung quanh của Cylinder
    {
        return 2 * super.area() + 2 * Math.PI * radius * height;
    }

    public double volume() // Tính thể tích của Cylinder
    {
        return super.area() * height;
    }

    public String toString() // Biểu diễn Cylinder bằng một chuỗi
    {
        return super.toString() + "; Height = " + height;
    }

    public String getName() // trả về tên của shape
    {
        return "Cylinder";
    }
} // end class Cylinder

