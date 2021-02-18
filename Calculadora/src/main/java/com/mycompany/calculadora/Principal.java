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
    
    // Metodo principal
    public static void main (String[] args) {
        
        // Define variables a nivel del metodo
        Scanner objInput = new Scanner(System.in);
        String strContinuar = null;
        
        do {
         
        System.out.println("Seleccione una opcion");
        System.out.println("a - Si desea sumar");
        System.out.println("b - Si desea restar");
        System.out.println("c - Si desea multiplicar");
        System.out.println("d - Si desea dividir");
        System.out.println("Escriba su opcion: ");
        
        // Recibe el valor del buffer del teclado
        String strOpcion = objInput.nextLine();
        
        // Define las variables a utilizar en los calculos
        float[] fltArrNumeros = new float[2];
        float fltResultado = 0;
        
        // Define la variable de control para el error
        boolean blnError = true;
        
        // Case de la opcion
        switch (strOpcion) {
            case "a":
                strOpcion="Suma";
                System.out.println("");
                
                // Solicita los valores para el calculo
                for (int i=0; i<2; i++) {
                    System.out.println("Ingrese el numero " + (i+1) + " : ");
                    fltArrNumeros[i] = objInput.nextFloat(); 
                }
                
                fltResultado = fltArrNumeros[0] + fltArrNumeros[1];
                
                // Si la operacion es correcta
                blnError=false;
                
                // Sale del case
                break;
                
            case "b":
                strOpcion="Resta";
                System.out.println("");
                
                // Solicita los valores para el calculo
                for (int i=0; i<2;i++) {
                    System.out.println("Ingrese el numero " + (i+1) + " : ");
                    fltArrNumeros[i] = objInput.nextFloat(); 
                }
                
                fltResultado = fltArrNumeros[0] - fltArrNumeros[1];
                
                // Si la operacion es correcta
                blnError=false;
                
                // Sale del case
                break;
                
            case "c":
                strOpcion = "Multiplicacion";
                System.out.println("");
                
                // Solicita los valores para el calculo
                for (int i=0; i<2;i++) {
                    System.out.println("Ingrese el numero " + (i+1) + " : ");
                    fltArrNumeros[i] = objInput.nextFloat(); 
                }
                
                fltResultado = fltArrNumeros[0] * fltArrNumeros[1];
                
                // Si la operacion es correcta
                blnError=false;
                
                // Sale del case
                break;

            case "d":
                strOpcion = "Division";
                System.out.println("");
                
                // Solicita los valores para el calculo
                for (int i=0; i<2;i++) {
                    System.out.println("Ingrese el numero " + (i+1) + " : ");
                    fltArrNumeros[i] = objInput.nextFloat(); 
                }

                // Valida error de division por 0
                if (fltArrNumeros[1] != 0) {
                    
                    fltResultado = fltArrNumeros[0] / fltArrNumeros[1];
                    
                    // Operacion exitosa
                    blnError=false;
                    
                }
                // Si hay division por cero entonces error
                else { blnError = true; }
 
                // Sale del case
                break;
            
            // Si selecciona una opcion no valida
            default:
                
                // Error
                blnError = true;
                
                // Sale del case
                break;
        }
        
        System.out.println("");
        
        // Si no hay error muestra el resultado
        if (blnError==false) {
            System.out.println("El resultado es: " + fltResultado);   
        }
        else if (blnError==true) {
            System.out.println("Error no se puede realizar su operacion");
        }
        
        System.out.println("La opcion seleccionada es " + strOpcion);
        
        System.out.println("Desea continuar? S/N");
        
        // Captura de nuevo el buffer
        Scanner objInput2 = new Scanner(System.in);
        strContinuar = objInput2.nextLine();
        
        } while (strContinuar.equals("s") || strContinuar.equals("S"));
    }
}
