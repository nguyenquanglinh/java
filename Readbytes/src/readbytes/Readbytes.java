/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readbytes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author thang
 */
public class Readbytes {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        try{
            new MyArray().MethodeX();
        }
        catch(Exception ex){
            System.out.println("loi trong try: "+ex);
        }
        System.out.println("ct kt bt");
    
        // TODO code application logic here
    }
}
