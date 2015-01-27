/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usoArchivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author utnso
 */
public class EscribirArchivoPrintWriter {
   public static void main(String[] args) 
   { 
       Scanner entrada = new Scanner(System.in); 
      File file = new File ("archivo.txt"); 

      try { 
         System.out.print("Deme cadena: "); 
         String cad = entrada.nextLine(); 

          PrintWriter pw = new PrintWriter(new FileWriter(file)); 

         pw.println(cad); 
         pw.close(); 
      } 
      catch (IOException excep) { 
         javax.swing.JOptionPane.showMessageDialog(null, excep.getMessage()); 
         excep.printStackTrace(); 
      } 
   }     
}
