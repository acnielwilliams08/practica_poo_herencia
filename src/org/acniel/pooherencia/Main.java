package org.acniel.pooherencia;

import org.acniel.pooherencia.model.InternationalStudent;
import org.acniel.pooherencia.model.Student;
import org.acniel.pooherencia.model.Teacher;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Acniel");
        student.setLastName("Williams");
        student.setInstitution("Lambrada");
        student.setMathGrades(8.6);
        student.setHistoryGrades(5);
        student.setSpanishGrades(10);

        InternationalStudent internationalStudent = new InternationalStudent();
        internationalStudent.setName("Peter");
        internationalStudent.setLastName("Williams");
        internationalStudent.setCountry("Australia");
        internationalStudent.setAge(15);
        internationalStudent.setInstitution("Instituto Nacional");
        internationalStudent.setLanguageGrade(2.9);
        internationalStudent.setSpanishGrades(9);
        internationalStudent.setHistoryGrades(7);
        internationalStudent.setMathGrades(10);

        Teacher teacher = new Teacher();
        teacher.setName("Luis");
        teacher.setLastName("Perez");
        teacher.setSubject("Matematicas");

        System.out.println(student.getName() + " " + student.getLastName() + " " + student.getInstitution());

        System.out.println(internationalStudent.getName()
                + " " + internationalStudent.getLastName()
                + " " + internationalStudent.getInstitution()
                + " " + internationalStudent.getCountry());
        
        System.out.println(teacher.getName() + " " + teacher.getLastName() + " " + teacher.getSubject());

        //El tipo de dato Class<> nos ayuda a tener una referencia de la misma clase en tiempo de ejecucion y nos da datos para trabajar
        Class clase = internationalStudent.getClass();
        while (clase.getSuperclass() != null) {
            String child = clase.getName();
            String father = clase.getSuperclass().getName();
            System.out.println(child + " es hija de " + father);

            clase = clase.getSuperclass();
        }
    }
}
