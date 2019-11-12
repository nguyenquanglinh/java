/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhapxuatfile;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author thang
 */
public class GhiFile extends FileTest {

    public void Ghi() throws IOException {

        DataOutputStream dataOut;
        DataInputStream dataIn;
        int i = 10;
        double d = 1023.56;
        boolean b = true;
        String s = "nguyen quang linh";
        try {
            dataOut = new DataOutputStream(new FileOutputStream("C:\\testdata.txt"));
            try {
                System.out.println("Writing: " + i);
                dataOut.writeInt(i);

                System.out.println("Writing: " + d);
                dataOut.writeDouble(d);

                System.out.println("Writing: " + b);
                dataOut.writeBoolean(b);

                System.out.println("Writing: " + 12.2 * 7.4);
                dataOut.writeDouble(12.2 * 7.4);

                System.out.println("Writing: " + s);
                dataOut.writeBytes(s);

                System.out.println("Write file complete");
            } catch (IOException exc) {
                System.out.println("Write error.");
            } //XEM TIẾP Ở SLIDE TIẾP THEO
            dataOut.close();
            System.out.println();
            // Now, read them back.
            try {
                dataIn = new DataInputStream(new FileInputStream("C:\\testdata.txt"));
                try {

                    i = dataIn.readInt();
                    System.out.println("Reading " + i);
                    d = dataIn.readDouble();
                    System.out.println("Reading " + d);
                    b = dataIn.readBoolean();
                    System.out.println("Reading " + b);
                    d = dataIn.readDouble();
                    System.out.println("Reading " + d);
                } catch (IOException exc) {
                    System.out.println("Read error.");
                }
                dataIn.close();
                System.out.println("write after read complete");
            } catch (IOException exc) {
                System.out.println("Cannot open file.");
            }
        } catch (IOException exc) {
            System.out.println("Cannot open file.");
        }

    }

}
