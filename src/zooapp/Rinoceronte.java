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

    public Rinoceronte(int codigo, String nombre, String sexo, int edad, double peso,double largoCuerno) {
        super(codigo, nombre, sexo, edad, peso);
        this.largoCuerno=largoCuerno;
       
    }

    public double getLargocuerno() {
        return largoCuerno;
    }

    public void setLargocuerno(double largocuerno) {
        this.largoCuerno = largoCuerno;
    }
       @Override
    public double calcularComida() {
        return 3 * getPeso();
    }
   
    
}
