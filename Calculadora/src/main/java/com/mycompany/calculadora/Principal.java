/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author wvirt
 */
public class Principal {
    
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Seleccione una opcion");
        System.out.println("a - Si desea sumar");
        System.out.println("b - Si desea restar");
        System.out.println("c - Si desea multiplicar");
        System.out.println("d - Si desea dividir");
        System.out.println("Escriba su opcion: ");
        
        String op = input.nextLine();
        
        System.out.println("La opcion seleccionada es ") & op;
              
        
    }
}
