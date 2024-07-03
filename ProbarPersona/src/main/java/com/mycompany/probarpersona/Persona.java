package com.mycompany.probarpersona;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private char sexo;
    private static int numPersonas = 0; //Al crear la primera persona

    

Persona() {
    nombre = "";
    apellido = "";
    edad = 0;
    sexo = 'X';
    nuevaPersona();
}

Persona(String n, String a, int e, char s) {
    nombre = n;
    apellido = a;
    edad = e;
    sexo = s;
    nuevaPersona();
}

static void  nuevaPersona() {
    numPersonas++;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String txt) {
    nombre = txt;
}

public String getApellido() {
    return apellido;

}

public void setApellido(String txt) {
    apellido = txt;

}

public int getEdad() {

    return edad;
}

public void setEdad(int n) {
    edad = n;
}

public String getSexo() {
    String s = "Desconocido";
    if (sexo == 'H') {
    s = "Hombre";
}
    if(sexo == 'M'){
    s = "Mujer";

}
return s;
}
public void setSexo(char s) {
    sexo = s;

}
}
