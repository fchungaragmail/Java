/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usoArchivos;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author utnso
 */
public class ManejoArchivos {
    public static void main(String[] args) {
        //crear achivo para escritura
        
        try {
            Formatter salida;
            salida = new Formatter("src//usoArchivos//nomina.txt");
            salida.format("%d,%s,%.2f\n",2,"daniel",2000.00 );
            salida.close();
            
        } catch (Exception e ) {
            System.out.println("error formater");
        }

        
    }
}
