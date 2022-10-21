/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_javierreyes;
import java.util.Scanner;
/**
 *
 * @author Javier Reyes
 */
public class Lab2P1_JavierReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Bienvenido ");
        System.out.println("que programa requiere del menu");
        System.out.println("1: indice academico / 2: ok Boomer / 3: gotta know them all / 4.salir");
        int menu = lea.nextInt();
        while (menu <= 4){
            System.out.println("ha seleccionado indice academico");
            System.out.println("ingrese un numero");
            int num1 = lea.nextInt();
            System.out.println("ingrese el segundo numero");
            int num2 = lea.nextInt();
            int acum = 0;
            if (num1 > num2)
                acum = num1 - num2;
            else
                if (num1 < num2)
                    acum = num2 - num1;
            
            
            
    
        else
            if (menu >= 2)
                System.out.println("ha seleccionado ok boomer");
                System.out.println("ingrese su año de nacimiento: ");
                int año = lea.nextInt();
                if (año >= 1946 || año <= 1964)
                System.out.println("felicidades usted es de la generacion Baby Boomer gen");
                else
                    if (año >= 1960 || año <= 1979)
                    System.out.println("felicidades usted es de la Generacion x");
                     else
                        if (año >= 1975 || año <= 1985)
                        System.out.println("felicidades usted es de la generacion Xennials");
                         else
                            if (año >= 1980 || año <= 1994)
                            System.out.println("felicidades usted es de la generacion Millenials");
                            else
                                if (año >= 1990 || año <= 2012)
                                System.out.println("felicidades usted es de la generacion Gen z");
                                else
                                    if (año >= 2013 || año <= 2025)
                                    System.out.println("felicidades usted es de la generacion Alpha");
            else
                if (menu >= 3)
                    System.out.println("ha seleccionado Gotta know Them all");
                    System.out.println("seleccione tipo: 1.hada /  2.hierro / 3. luchador / 4. psiquico ");
                    System.out.println("ingrese el tipo del atacador");
                    int ataque = lea.nextInt();
                    System.out.println("ingrese el tipo del defensor");
                    int defensa = lea.nextInt();
            
                
                    if (menu >= 4)
                        System.out.println("termino el programa");
            
                
        }
    }
    
}
