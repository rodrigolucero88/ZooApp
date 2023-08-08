/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zooapp;

/**
 *
 * @author Kawaa
 */
class Jirafa extends Animal {
    private double largoCuello;

    public Jirafa(int codigo, String nombre, String sexo, int edad, double peso, double largoCuello) {
        super(codigo, nombre, sexo, edad, peso);
        this.largoCuello = largoCuello;
    }

    @Override
    public double calcularComida() {
        return getPeso() / 2;
    }
}
