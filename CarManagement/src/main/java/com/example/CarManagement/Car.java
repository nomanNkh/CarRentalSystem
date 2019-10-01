package com.example.CarManagement;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car{
    private Long id;
    private String carplate;
    private String firstname;
    private String lastname;
    private String description;

    private Car(){}

    public Car(String carplate, String firstname, String lastname, String description){
        this.carplate = carplate;
        this.firstname = firstname;
        this.lastname = lastname;
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId(){
        return id;
    }

    public void setid(Long id){
        this.id = id;
    }

    public String getCarPlate(){
        return carplate;
    }

    public void setCarPlate(String carplate){
        this.carplate = carplate;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id) &&
                Objects.equals(carplate, car.carplate) &&
                Objects.equals(firstname, car.firstname) &&
                Objects.equals(lastname, car.lastname) &&
                Objects.equals(description, car.description);
    }

    @Override
    public String toString() {
        return "car{" +
                "id=" + id +
                ", carplate='" + carplate + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}