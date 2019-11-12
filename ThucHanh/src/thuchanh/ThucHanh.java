/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuchanh;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author thang
 */
public class ThucHanh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.println(cs);
        Point point = new Point(7, 11);
        Circle circle = new Circle(3.5, 22, 8);
        Cylinder cylinder = new Cylinder(10, 3.3, 10, 10);
        // Tạo một mảng các đối tượng hình học
        Shape arrayOfShapes[] = new Shape[3];
        // arrayOfShapes[ 0 ] là một đối tượng Point
        arrayOfShapes[0] = point;
        // arrayOfShapes[ 1 ] là một đối tượng Circle
        arrayOfShapes[1] = circle;
        // arrayOfShapes[ 2 ] là một đối tượng cylinder
        arrayOfShapes[2] = cylinder;
        String output = point.getName() + ": " + point.toString() + "\n"
                + circle.getName() + ": " + circle.toString() + "\n"
                + cylinder.getName() + ": " + cylinder.toString();
        DecimalFormat precision2 = new DecimalFormat("0.00");
        // duyệt mảng arrayOfShapes lấy tên, diện tích, thể tích
        // của mỗi đối tượng hình học trong mảng.
        for (Shape arrayOfShape : arrayOfShapes) {
            output += "\n\n" +
                    arrayOfShape.getName() + 
                    ": " + arrayOfShape.toString()
                    + "\n Area = " + precision2.format(arrayOfShape.area())
                    + "\nVolume = " + precision2.format(arrayOfShape.volume());
        }
        System.out.println(output);
    }
    
    
    private static void Nhap(){
        
    }
}
