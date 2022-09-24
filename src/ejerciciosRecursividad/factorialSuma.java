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
public class factorialSuma {
    private int n;
    private double r;
    
    public factorialSuma(int n){
        setN(n);
        r = 1;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        if (n>=0) {
            this.n = n;
        }
    }

    public double getR(){
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    
    public void facIterativo(){             
        double factorial = 1;
        double r = 0;
        for (double i = 1; i <= n; i++) {           
            factorial *= i;
            r += i/factorial;
        }
        JOptionPane.showMessageDialog(null, "La suma es: " + r);
    }

    private double fact(int n){
        if (n == 1 || n == 0) {
            //caso base
            return 1;
        }else{
            //caso general
            return n * fact(n-1);
        }
    }

    public double facRecusrsivo(int n){
        if (n == 1) {
            //caso base
            return 1;
        }else{
            //caso general
            
            r += n/fact(n);
            facRecusrsivo(n-1);
            return r;
        }
        
    }

    
}
