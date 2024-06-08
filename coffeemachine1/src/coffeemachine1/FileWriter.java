/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeemachine1;
import java.io.*;
import java.util.*;
import java.io.IOException;
/**
 *
 * @author ASUS
 */

    public abstract class  FileWriter implements Logger{
   

    public FileWriter() {
         File logFile=new File("loq.txt");
        FileWriter fileWriter=null;
        try {
       
            fileWriter =new FileWriter() {
                @Override
                public void log(String msg) {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            };
            fileWriter.Write("");
        } catch (Exception e) {
            System.out.print("");
        }
    }

    private void Write(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
    

