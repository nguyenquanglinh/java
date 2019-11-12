/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhapxuatfile;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author thang
 */
public class NhapXuatFile {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int data[] = new int[0];
        System.out.print("nhap gia tri cua chuoi ");

        System.out.print("You entered: " + data.length + "\n");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < data.length; i++) {
            try {
                System.out.print("Nhap gia tri cua data[" + i + "]: ");
                data[i] = input.nextInt();
            } catch (InternalError ex) {
                System.out.println("chi nhap so");
                i--;
            }
        }
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + "\t");
        }

        DocFile df = new DocFile();
        df.Doc();

        CopyFile cf = new CopyFile();
        cf.Coppy();

        GhiFile gf = new GhiFile();
        gf.Ghi();

        RamDomFile rf = new RamDomFile();
        rf.RanDom();
        System.out.println();

    }

}
