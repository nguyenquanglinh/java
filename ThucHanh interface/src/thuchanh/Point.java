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
public class Point extends Shape {

    protected int x, y; // Tọa độ x, y của 1 điểm

    public Point() {
        setPoint(0, 0);
    } // constructor không tham số.

    public Point(int xCoordinate, int yCoordinate) // constructor có tham số.
    {
        setPoint(xCoordinate, yCoordinate);
    }

    public void setPoint(int xCoordinate, int yCoordinate)// gán tọa độ x, y cho 1 điểm
    {
        x = xCoordinate;
        y = yCoordinate;
    }

    public int getX() {
        return x;
    } // lấy tọa độ x của 1 điểm

    public int getY() {
        return y;
    } // lấy tọa độ y của 1 điểm

    public String toString() // Thể hiện tọa độ của 1 điểm dưới dạng chuỗi
    {
        return "[" + x + ", " + y + "]";
    }

    public String getName() // trả về tên của đối tượng shape
    {
        return "Point";
    }
} // end class Point

