/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Real
 */
import java.util.Scanner;

public class Principal {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        String marca,modelo,placa;
        int cantidad;
        
        System.out.print("Cantidad de Vehiculos");
        cantidad = entrada.nextInt();
        
        vehiculo transporte[] = new vehiculo[cantidad];
        for (int i=0; i<transporte.length;i++){
            System.out.print("\nDigite Datos de Vehiculo"+(i+1)+":");
            System.out.print("Introdusca Marca: ");
            marca = entrada.nextLine();
            System.out.print("Introdusca Modelo: ");
            modelo = entrada.nextLine();
            System.out.print("Introdusca Placa: ");
            placa = entrada.nextLine();
            
            transporte[i] = new vehiculo(marca,modelo,placa);
            
        }
    } 
    
}
