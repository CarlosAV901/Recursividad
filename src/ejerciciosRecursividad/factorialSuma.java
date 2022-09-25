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
    private int n; //declaracion de las variables de instancia 
    private double r;
    
    public factorialSuma(int n){
        setN(n); //inicializando la variable en el constructor
        r = 1;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        if (n>=0) { //validando n
            this.n = n;
        }
    }

    public double getR(){
        return r;
    }

    public void setR(double r) {
        this.r = r; 
    }

    
    public void facIterativo(){ //problema con metodo iterativo    
        double factorial = 1;
        double r = 0;
        for (double i = 1; i <= n; i++) {           
            factorial *= i;
            r += i/factorial;
        }
        JOptionPane.showMessageDialog(null, "La suma es: " + r);
    }

    private double fact(int n){ //factorial para resolver el metodo recursivo 
        if (n == 1 || n == 0) {
            //caso base
            return 1;
        }else{
            //caso general
            return n * fact(n-1);
        }
    }

    public double facRecusrsivo(int n){ //problema resuelto con metodo recursivo 
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
