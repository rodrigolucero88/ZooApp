/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zooapp;

/**
 *
 * @author Kawaa
 */
class Mono extends Animal {
    private String especie;

    public Mono(int codigo, String nombre, String sexo, int edad, double peso, String especie) {
        super(codigo, nombre, sexo, edad, peso);
        this.especie = especie;
    }

    @Override
    public double calcularComida() {
        return getPeso() / 4;
    }
}
