package com.victorlarsen;


//Definiera en klass i JAVA görs med public class sedan namnet på klassen.
public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("carrera");
        System.out.println("Model is " + porsche.getModel());

        holden.setModel("Passat");
        System.out.println("Model is " + holden.getModel());
    }
}
