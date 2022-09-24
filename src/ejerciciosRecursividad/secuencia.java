/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosRecursividad;

/**
 *
 * @author aguiv
 */
public class secuencia {
    private int n;
    
    public secuencia(int n){
        setN(n);
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n>=0?n:0;
    }
    
    //Metodo iterativo
    public void secIterativo(){
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
    
    public void secRecursivo(){
        secuenciaRec(n);
    }
    
    public void secuenciaRec(int n){
        if (n==1) {
            System.out.println(1);
        }else{          
            secuenciaRec(n - 1);
            System.out.println(n);
        }
    }
    
}
