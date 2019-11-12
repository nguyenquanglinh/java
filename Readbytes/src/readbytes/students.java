/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readbytes;

import java.io.Serializable;

/**
 *
 * @author thang
 */
public class students implements Serializable {

    private String names;
    private int ages;
    students(String name, int age) {
        names = name;
        ages = age;
    }

    @Override
    public String toString() {
        String ret;
        ret = "My name is " + names
                + "\nI am " + ages + " years old";
        return ret;
    }
}
