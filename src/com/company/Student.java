package com.company;

public class Student {
    private String name;
    private int age;

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException(" Имя отсутсвует. Пожалуйста введите имя");
        } else this.name = name;
    }

    public void setAge(int age) {
        if (age < 1 || age > 120) {
            throw new IllegalArgumentException("Возраст некорректный. Допустимый возраст от 1 до 120 лет");
        } else {
            this.age = age;
        }
    }

    public static Student deserialize(String n) throws MyDomainException {
        throw new MyDomainException("Checked exception", "Ошибка десериализации");
    }

    public static void wrapCheckedDeserialize() throws MyDomainException {
        try {
            deserialize("");
        } catch (MyDomainException e) {
            System.out.println("Перехватили исключение и перебрасываем его дальше");
            e.getCause();
            throw e;
        }
    }

    public static void wrapUncheckedDeserialize() {
        try {
            deserialize("message");
        } catch (MyDomainException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
