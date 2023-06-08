package org.example;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(21);
        persona.setNombre("Lorenzo");
        persona.setTelefono(555666777);

        System.out.println("Nombre: " + persona.getNombre() + "\nEdad: " + persona.getEdad() +
                "\nTelefono: " + persona.getTelefono());
    }
}

