/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zooapp;

/**
 *
 * @author Kawaa
 */
class Ave extends Animal {
    private String especieAve;
    private String color;

    public Ave(int codigo, String nombre, String sexo, int edad, double peso, String especieAve, String color) {
        super(codigo, nombre, sexo, edad, peso);
        this.especieAve = especieAve;
        this.color = color;
    }

    public String getEspecie() {
        return especieAve;
    }

    public void setEspecie(String especie) {
        this.especieAve = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public double calcularComida() {
        return getPeso() / 3;
    }
}
