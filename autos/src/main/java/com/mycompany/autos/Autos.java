package com.mycompany.autos;

public class Autos {

    public static void main(String[] args) {
        Auto auto1 = new Auto("Toyota", "Corolla", 2018);
        Auto auto2 = new Auto("Ford", "Ranger", 2022);
        Auto auto3 = new Auto("Toyota", "Hilux", 2015);
        
        auto1.mostrarDetalles();
        auto2.mostrarDetalles();
        auto3.mostrarDetalles();
        
        auto1.setAño(2022);
        
    }
   
}
