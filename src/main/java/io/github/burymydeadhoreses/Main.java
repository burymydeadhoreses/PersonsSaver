package io.github.burymydeadhoreses;

public class Main {
    public static void main(String[] args) {
        System.out.println(DbContext.addPerson(new Person("Ben", 10)));
        System.out.println(DbContext.addPerson(new Person("Gwen", 10)));
        System.out.println(DbContext.addPerson(new Person("Max", 59)));
    }
}