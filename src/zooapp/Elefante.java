/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zooapp;

/**
 *
 * @author Leandro
 */
public class Elefante extends Animal{
    private int largoTrompa;

    public Elefante(int codigo, String nombre, String sexo, int edad, double peso) {
        super(codigo, nombre, sexo, edad, peso);
    }

    public int getLargoTrompa() {
        return largoTrompa;
    }

    public void setLargoTrompa(int largoTrompa) {
        this.largoTrompa = largoTrompa;
    }

    
    
}
