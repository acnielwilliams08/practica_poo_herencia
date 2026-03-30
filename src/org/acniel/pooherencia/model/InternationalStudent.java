package org.acniel.pooherencia.model;

public class InternationalStudent extends Student {
    private String country;
    private double languageGrade;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLanguageGrade() {
        return languageGrade;
    }

    public void setLanguageGrade(double languageGrade) {
        this.languageGrade = languageGrade;
    }
}
