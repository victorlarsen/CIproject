package com.victorlarsen;

/**
 * Created by victor on 2017-09-08.
 */

//public talar om att vi har unrestricted access till klassen, vi har även private och protected
//inkapsulering görs med private, public eller private
//f = field, m = method, p = parameter. Visar även om de är privata etc.
public class Car {

    //Vi har nu definerat state med hjälp av fields.
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;
// Objekt ska kunna få sin data via metoder och inte direkt (dvs fälten görs private). Detta möjliggör att vi kan validera datat innan den definieras för ett visst objekt.
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("passat")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
