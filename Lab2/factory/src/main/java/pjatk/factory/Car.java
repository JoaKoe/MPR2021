package pjatk.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Car {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)  // dzięki temu id nadawane jest encja a nie globalnie
    private Long id;

    private String wheels; //ilosc albo rodzaj
    private String color; //kolor karoserii
    private String engine; //typ silnika
    private String model; //kombi, kabrio czy jak
    private String marka; //marka czyli audi czy cos
    private int numberOfWheels;

    public boolean isWrack() {
        return wrack;
    }

    public void setWrack(boolean wrack) {
        this.wrack = wrack;
    }

    private boolean wrack;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;

    }

    public Car(String marka, String wheels, String color, String engine, String model, int numberOfWheels, boolean wrack) { //konstruktor auta

        this.marka = marka;
        this.wheels = wheels;
        this.color = color;
        this.engine = engine;
        this.model = model;
        this.numberOfWheels = numberOfWheels;
        this.wrack = wrack;
    }

    @Override //zapisuje zmienne jako string aby wyświeltić jako napis
    public String toString() {
        return "Car{" +
                "Id= " + id + '\'' +
                "Marka= " + marka + '\'' +
                "wheels='" + wheels + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", model='" + model + '\'' +
                ", ilosc kol ='" + numberOfWheels + '\'' +
                "wrak?: " + wrack +
                '}';
    }
}
