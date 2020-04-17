package com.company;

import static com.company.Student.*;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        wrapUncheckedDeserialize();
        try {
            student.setAge(20);
            student.setName("Alex");
            deserialize("");
            wrapCheckedDeserialize();
        } catch (MyDomainException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.err.println(e.detail);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println("Ошибка " + e.getMessage());
        } finally {
            System.out.println("Выведем данные студента:  " + student.toString());
        }
    }
}
