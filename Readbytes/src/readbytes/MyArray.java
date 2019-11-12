/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readbytes;

import java.awt.Point;

/**
 *
 * @author thang
 */
public class MyArray {

    public MyArray() {
    }

    public void MethodeX() {
        Point[] pts = new Point[10];
        for (int i = 0; i < pts.length; i++) {
            pts[i].x = i; // chua tao object
            pts[i].y = i + 1;
        }
    }
}
