/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author PC
 */
public class Persona {
    //Variables
     public String Nombre;
    public int Cedula;
    public int  Añonacimiento;
    
    //constructor no parametrizado
    
    public Persona(){}
    
    //constructor parametrizado

    public Persona(String Nombre, int Cedula, int Añonacimiento) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Añonacimiento = Añonacimiento;
    }
    //setter

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public void setAñonacimiento(int Añonacimiento) {
        this.Añonacimiento = Añonacimiento;
    }
    //getter

    public String getNombre() {
        return Nombre;
    }

    public int getCedula() {
        return Cedula;
    }

    public int getAñonacimiento() {
        return Añonacimiento;
    }
    
}
