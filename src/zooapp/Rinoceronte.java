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
 private double largocuerno;

    public Rinoceronte(int codigo, String nombre, String sexo, int edad, double peso) {
        super(codigo, nombre, sexo, edad, peso);
    }

    public double getLargocuerno() {
        return largocuerno;
    }

    public void setLargocuerno(double largocuerno) {
        this.largocuerno = largocuerno;
    }
       @Override
    public double calcularComida() {
        return 3 * getPeso();
    }
   
    
}
