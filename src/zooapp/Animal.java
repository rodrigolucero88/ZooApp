/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zooapp;

/**
 *
 * @author Leandro
 */
public class Animal {
    private int codigo;
    private String nombre;
    private String sexo;
    private int edad;
    private double peso;

    public Animal(int codigo, String nombre, String sexo, int edad, double peso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double calcularComida() {
        return 0; // Método por defecto, será implementado en las subclases
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    @Override
    public String toString() {
        return "Animal{" + "peso=" + peso + ", nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + '}';
    }
    
}
