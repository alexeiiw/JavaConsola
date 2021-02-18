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
        
        float[] nums = new float[2];
        
        float resultado = 0;
        
        boolean error = true;
        
        switch (op) {
            case "a":
                op="Suma";
                System.out.println("");
                
                for (int i=0; i<2;i++) {
                    System.out.println("Ingrese el numero " + (i+1) + ": ");
                    nums[i] = input.nextFloat(); 
                }
                
                resultado = nums[0] + nums[1];
                
                error=false;
                
                break;
                
            case "b":
                op="Resta";
 
                System.out.println("");
                
                for (int i=0; i<2;i++) {
                    System.out.println("Ingrese el numero " + (i+1) + ": ");
                    nums[i] = input.nextFloat(); 
                }
                
                resultado = nums[0] - nums[1];
                
                error=false;
                
                break;
                
            case "c":
            
                op = "Multiplicacion";
                
                System.out.println("");
                
                for (int i=0; i<2;i++) {
                    System.out.println("Ingrese el numero " + (i+1) + ": ");
                    nums[i] = input.nextFloat(); 
                }
                
                resultado = nums[0] * nums[1];
                
                error=false;
                
                break;

            case "d":
                
                op = "Division";
                
                System.out.println("");
                
                for (int i=0; i<2;i++) {
                    System.out.println("Ingrese el numero " + (i+1) + ": ");
                    nums[i] = input.nextFloat(); 
                }

                if (nums[1] != 0) {
                    
                    resultado = nums[0] / nums[1];
                    
                    error=false;
                    
                }
                else { error = true; }
 
                break;
                
            default:
                
                error = true;
                
                break;
        }
        
        System.out.println("");
        
        if (error==false) {
            System.out.println("El resultado es: " + resultado);   
        }
        else if (error==true) {
            System.out.println("Error no se puede realizar su operacion");
        }
        
        System.out.println("La opcion seleccionada es " + op);
        
    }
}
