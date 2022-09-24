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
public class Main {

    public static void main(String[] args) {
        int n, a, b;
        String menu, opcion;
        boolean SENTINEL = true;

        do {
            menu = "MENU\n1) Hola mundo\n2) Secuencia\n3) Suma de Division\n4) MCD\n5) Suma de Factorial\n6) Salir";
            opcion = JOptionPane.showInputDialog(menu);
            switch (opcion) {
                case "1":
                    menu = "1) Metodo Iterativo\n2) Metodo Recursivo";
                    opcion = JOptionPane.showInputDialog(menu);

                    switch (opcion) {
                        case "1":
                            n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de hola mundo"));
                            holaMundo obj = new holaMundo(n);
                            obj.holaIterativo();
                            JOptionPane.showMessageDialog(null, "Listo");
                            break;
                        case "2":
                            n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de hola mundo"));
                            holaMundo obj2 = new holaMundo(n);
                            obj2.holaRecursivo();
                            JOptionPane.showMessageDialog(null, "Listo");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion no valida");
                    }
                    break;
                case "2":
                    menu = "1) Metodo Iterativo\n2) Metodo Recursivo";
                    opcion = JOptionPane.showInputDialog(menu);

                    switch (opcion) {
                        case "1":
                            n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de secuencia"));
                            secuencia obj = new secuencia(n);
                            obj.secIterativo();
                            JOptionPane.showMessageDialog(null, "Listo");
                            break;
                        case "2":
                            n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de secuencia"));
                            secuencia obj2 = new secuencia(n);
                            obj2.secRecursivo();
                            JOptionPane.showMessageDialog(null, "Listo");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion no valida");
                    }
                    break;
                case "3":
                    menu = "1) Metodo Iterativo\n2) Metodo Recursivo";
                    opcion = JOptionPane.showInputDialog(menu);

                    switch (opcion) {
                        case "1":
                            n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero"));
                            division obj = new division(n);
                            obj.divIterativo();
                            JOptionPane.showMessageDialog(null, "Listo");
                            break;
                        case "2":
                            n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero"));
                            division obj2 = new division(n);
                            JOptionPane.showMessageDialog(null, obj2.divRecursivo(n));
                            JOptionPane.showMessageDialog(null, "Listo");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion no valida");
                    }
                    break;
                case "4":
                    menu = "1) Metodo Iterativo\n2) Metodo Recursivo";
                    opcion = JOptionPane.showInputDialog(menu);

                    switch (opcion) {
                        case "1":
                            a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dividendo"));
                            b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el divisor"));
                            mcd obj = new mcd(a, b);
                            obj.mcdIterativo();
                            JOptionPane.showMessageDialog(null, "Listo");
                            break;
                        case "2":
                            a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dividendo"));
                            b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el divisor"));
                            mcd obj2 = new mcd(a, b);
                            JOptionPane.showMessageDialog(null, "El MCD es: " + obj2.recursivo());
                            JOptionPane.showMessageDialog(null, "Listo");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion no valida");
                    }
                    break;
                case "5":
                    menu = "1) Metodo Iterativo\n2) Metodo Recursivo";
                    opcion = JOptionPane.showInputDialog(menu);

                    switch (opcion) {
                        case "1":
                            n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
                            factorialSuma obj = new factorialSuma(n);
                            obj.facIterativo();
                            JOptionPane.showMessageDialog(null, "Listo");
                            break;
                        case "2":
                            n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
                            factorialSuma obj2 = new factorialSuma(n);
                            JOptionPane.showMessageDialog(null, "La suma es: " + obj2.facRecusrsivo(n));
                            JOptionPane.showMessageDialog(null, "Listo");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion no valida");
                    }
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, "Hasta pronto...");
                    SENTINEL = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        } while (SENTINEL);

    }
}
