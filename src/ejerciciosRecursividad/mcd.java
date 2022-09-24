/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosRecursividad;

import javax.swing.JOptionPane;

/**
 *
 * @author aguiv
 */
public class mcd {
    private int a;
    private int b;

    public mcd(int a, int b) {
        setA(a);
        setB(b);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a >= 0 ? a : 0;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b >= 0 ? b : 0;
    }

    public void mcdIterativo() {
        int aux = 0;
        while (b != 0) {
            aux = b;
            b = a % b;
            a = aux;
        }
        JOptionPane.showMessageDialog(null, "El MCD es: " + aux);
    }

    public int recursivo() {
        return mcdRecursivo(a, b);
    }

    private int mcdRecursivo(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcdRecursivo(b, a % b);
        }
    }
}
