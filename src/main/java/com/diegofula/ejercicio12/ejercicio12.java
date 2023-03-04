package com.diegofula.ejercicio12;

//  importamos la libreria Scanner
import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {
        //  Declaramos el Scanner con la variable scan
        Scanner scan = new Scanner(System.in);
        
        double salbr = 5000 * 48 * 4;
        double retfs = salbr * 0.125;
        double salnto = salbr - retfs;
        
        System.out.println("El salario bruto del trabajador:" + "\t" + "$" + salbr);
        System.out.println("La retención en la fuente es de:" + "\t" + "$" + retfs);
        System.out.println("El salario neto del trabajador es de:" + "\t" + "$" + salnto);
    }
    
}
