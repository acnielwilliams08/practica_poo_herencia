package org.acniel.pooherencia.model;

public class Student extends Persona {
    private String institution;
    private double mathGrades;
    private double historyGrades;
    private double spanishGrades;

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public double getMathGrades() {
        return mathGrades;
    }

    public void setMathGrades(double mathGrades) {
        this.mathGrades = mathGrades;
    }

    public double getHistoryGrades() {
        return historyGrades;
    }

    public void setHistoryGrades(double historyGrades) {
        this.historyGrades = historyGrades;
    }

    public double getSpanishGrades() {
        return spanishGrades;
    }

    public void setSpanishGrades(double spanishGrades) {
        this.spanishGrades = spanishGrades;
    }
}
