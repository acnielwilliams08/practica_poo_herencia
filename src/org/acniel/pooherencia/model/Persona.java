package org.acniel.pooherencia.model;

public class Persona {
    private String name;
    private String lastName;
    private int age;
    private String email;

    //Se puede acceder por protected a los atributos o por getters and setters, pero es mas estable y controlado hacerlo por lo segundo

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("La edad no puede ser menor que 0");

        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
