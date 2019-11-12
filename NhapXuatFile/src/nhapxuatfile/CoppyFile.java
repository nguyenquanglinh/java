/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhapxuatfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author thang
 */
class CopyFile extends FileTest {

    public void Coppy() throws FileNotFoundException, IOException {
        int i;
        FileInputStream fin;
        FileOutputStream fout;
        try { // open input file
            try {
                fin = new FileInputStream("c:\\abc.txt");
            } catch (FileNotFoundException exc) {
                System.out.println("Input File Not Found");
                return;
            }
            // open output file
            try {
                fout = new FileOutputStream("c:\\abc_coppy.txt");
            } catch (FileNotFoundException exc) {
                System.out.println("Error Opening Output File");
                return;
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Usage: CopyFile From To");
            return;
        }
        try {// Copy File
            do {
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                }
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("File Error");
        }
        fin.close();
        fout.close();
        System.out.println("coppy file complete");
    }
} //Kết 
