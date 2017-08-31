/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iva;

import java.util.Scanner;

/**
 *
 * @author cice
 */
public class Iva {
    public static void main(String[] args) {
        double precio;
        double IVAprecio;
        double IVA;
        
        System.out.print("Introduce el precio de las zapatillas indicada en la etiqueta: ");
        Scanner sc = new Scanner(System.in);
        precio = sc.nextDouble();
        
        IVA = precio*0.21;
        IVAprecio = precio+IVA;
        
        
        System.out.print("Si el precio introducido de las zapatillas " + precio + " es sin IVA, el IVA correspondiente será de: " + IVA + " haciendo un total de: " + IVAprecio);
        
        System.out.print("Si el precio introducido de las zapatillas " + precio + " es con IVA, el IVA que estás pagando es de: " +IVA + " , siendo el precio sin IVA de: " + (precio-IVA));
        
        
    }
    
}
