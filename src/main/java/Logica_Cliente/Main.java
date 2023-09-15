/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Persona;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declarar variables
     String Nombre="";
     int Cedula=0;
     int Añonacimiento=0;
     int Añoactual=2023;
   
    
       //Creacion De Objetos 
        Persona objpersona = new Persona();
        
        //Fijacion De Informacion
        Scanner scan =new Scanner (System.in);
        
        //Pedir y Fijar Informacion De La Compra
        
        System.out.println("digite su nombre completo");
        Nombre = scan.nextLine();
        objpersona.setNombre(Nombre);
        
        System.out.println("digite el numero de su cedula");
        Cedula= scan.nextInt();
        objpersona.setCedula(Cedula);
        
        System.out.println("digite su año de nacimiento");
        Añonacimiento = scan.nextInt();
        objpersona.setAñonacimiento(Añonacimiento);
        
        //Constructor paramteizado1
        Persona objpersona1 =new Persona(Nombre,Cedula,Añonacimiento);
   

        //operacion 
        int Converción = Añoactual - objpersona.getAñonacimiento();

        
        //imprecion de datos 
        System.out.println("su nombre es:              " + "\t"+objpersona.getNombre());
        
        System.out.println("su numero de cedula es:    " + "\t"+objpersona.getCedula());

        System.out.println("su edad actual es :        " + "\t"+ Converción );
   
          //imprecion de datos1
        System.out.println("su nombre1 es:              " + "\t"+objpersona1.getNombre());
        
        System.out.println("su numero de cedula1 es:    " + "\t"+objpersona1.getCedula());

        System.out.println("su edad1 actual es :        " + "\t"+ Converción );
   
}
    }

