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
public class division {
    private int n; //declaracion de variable de instancia
    
    public division(int n){//constructor
        setN(n);
    }
    
    public int getN(){
        return n;
    }
    
    public void setN(int n){//validacion de n
        //this.n = n>=0?n:0;
        if (n>=0) {
            this.n = n;
        }else{
            this.n = 0;
        }
    }
    
    //Metodo iterativo
    public void divIterativo(){//problema iterativo
        double r = 0;
        for (double i = 1; i <= n; i++) {
            r += 1/i;
        }
        JOptionPane.showMessageDialog(null, r);
    }
    
    public double divv(){
        return divRecursivo(n);
    }
    
    //Metodo Recursivo
    public double divRecursivo(double n){  //problema recursivo   
        if (n==1) {
            return 1;
        }else{
            return divRecursivo(n-1) + (1/n);
        }
    }
}
