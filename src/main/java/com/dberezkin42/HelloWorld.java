package com.dberezkin42;

public class HelloWorld {

    boolean aBoolean = false; //*
    char aChar = '$';
    byte aByte = 1;
    short aShort = 1;
    int anInt = 1; //*
    long aLong = 1;
    float aFloat = 1.0F;
    double aDouble = 1.0D; //*

    static class Human {
        int age; // по умолчанию 0             // static int age;
        String name; // по умолчанию null      // static String name;

        public void sayName() {
            System.out.println(name);
        }
        public void sayAge() {
            System.out.println(age);
        }
        public void incmentAge() { // public void incmentAge() { age = age + 1; } // статический метод будет влиять на все объекты класса Human
            age = age + 1;                                                        // и при этом поля класса тоже должны быть статическим
        }                                                                         // при этом нельзя будет работать с разными данными у разных объектов класса Human


    }

    public static void main(String[] args) {
//        String message = "HelloWorld";
//        System.out.println(message);
        int age = 10; // в данном случае age это и есть число 10
        Human dima = new Human(); // здесь dima имя объекта - это ссылка на адрес в памяти
        Human alex = new Human();
        dima.name = "Дима";
        dima.age = 32;
        alex.name = "Александр";
        alex.age = 32;

        dima.sayName();
        alex.sayName();

        dima.incmentAge();
        dima.sayAge();
        alex.sayAge();

    }
}
