/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zooapp;

/**
 *
 * @author Leandro
 */
public class Cocodrillo extends Animal{
    private double longitud;

    public Cocodrillo(double longitud, int codigo, String nombre, String sexo, int edad, double peso) {
        super(codigo, nombre, sexo, edad, peso);
        this.longitud = longitud;
    }
    @Override
    public double calcularComida() {
        return getPeso();
    }
}
