/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.probarpersona;


public class ProbarPersona {

    public static void main(String[] args) {
        Persona a = new Persona();
        a.setNombre("Juan");
        a.setApellido("Dualibe");
        a.setEdad(32);
        a.setSexo('H');
        
        Persona b = new Persona();
        b.setNombre("Carlos");
        b.setApellido("Gomez");
        b.setEdad(44);
        b.setSexo('H');
        
        System.out.println("Nombre: " + a.getNombre() + " " + a.getApellido());
        System.out.println("Edad: " + a.getEdad());
        System.out.println("Sexo: " + a.getSexo());
        
        System.out.println("-----------------------------------------------------------");
        
        
        System.out.println("Nombre: " + b.getNombre() + " " + b.getApellido());
        System.out.println("Edad: " + b.getEdad());
        System.out.println("Sexo: " + b.getSexo());
    }
}
