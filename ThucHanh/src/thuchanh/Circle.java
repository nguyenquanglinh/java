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
public class Circle extends Point // Dẫn xuất từ lớpPoint
{

    protected double radius;

    public Circle() // constructor không tham số
    {
        // ngầm gọi đến constructor của lớp cha
        setRadius(0);
    }

    public Circle(double circleRadius, int xCoordinate, int yCoordinate) {	 // constructor có tham số
        // gọi constructorcủa lớp cha
        super(xCoordinate, yCoordinate);
        setRadius(circleRadius);
    }

    public void setRadius(double circleRadius) // Gán bán kính của đường tròn
    {
        radius = (circleRadius >= 0 ? circleRadius : 0);
    }

    public double getRadius() // Lấy bán kính của đường tròn
    {
        return radius;
    }

    @Override
    public double area() // Tính diện tích đường tròn Circle
    {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() // Biểu diễn đường tròn bằng một chuỗi
    {
        return "Center = " + super.toString() + "; Radius = " + radius;
    }

    @Override
    public String getName() // trả về tên của shape
    {
        return "Circle";
    }
} // end class Circle

