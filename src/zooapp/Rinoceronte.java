/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zooapp;

/**
 *
 * @author Leandro
 */
public class Rinoceronte extends Animal {
    private double largoCuerno;
    public Rinoceronte(int peso, String nombre, String sexo, int edad,double largoCuerno) {
        super(peso, nombre, sexo, edad);
        this.largoCuerno=largoCuerno;
        
    }

    public double getLargoCuerno() {
        return largoCuerno;
    }

    public void setLargoCuerno(double largoCuerno) {
        this.largoCuerno = largoCuerno;
    }

   
    
}
