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
public class vehiculo {
    private String marca, modelo, placa;

    public vehiculo(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }
    
    public String mostrar(){
        return "Marca: "+marca+"\nModelo: "+modelo+"\nPlaca: $"+placa+"\n";
    }
    
}
