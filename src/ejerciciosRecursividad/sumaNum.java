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
public class sumaNum {
    private int n;
    
    public sumaNum(int n){
        setN(n);
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n>=1)?n:1;
    }
    
    public void sumIterativo(){
        int r = 0;
        for (int i = 1; i <= n; i++) {
            r = r + i;                
        }
        JOptionPane.showMessageDialog(null, "La suma es: " + r);  
    }
    
    public int sumRecursivo(int n){
        if (n == 1) {
            return 1;
        }else{
            return n + sumRecursivo(n-1);
        }
    }
}
