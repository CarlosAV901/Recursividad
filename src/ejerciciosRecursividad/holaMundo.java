/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosRecursividad;

/**
 *
 * @author aguiv
 */
public class holaMundo {
    private int n; //declarando la variable de instancia

    public holaMundo(int n) {
        setN(n);
    }

    public void setN(int n) {
        this.n = n >= 0 ? n : 0; //validando n 
    }

    public int getN() {
        return n;
    }

    public void holaIterativo() { //imprimir los hola de manera iterativa
        for (int i = 1; i <= n; i++) {
            System.out.println("Hola mundo " + i);
        }
    }

    public void holaRecursivo() {
        hola1(n);
    }

    private void hola1(int n) { //imprimir los hola de manera recursiva 
        int r = n;
        if (n <= 1) {
            System.out.println("Hola mundo " + 1);
        } else {
            System.out.println("Hola mundo " + r);
            r = n - 1;
            hola1(n - 1);
        }
    }
}
