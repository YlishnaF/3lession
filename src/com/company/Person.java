package com.company;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void info(){
        System.out.println("Персону зовут " + name);
    }

    @Override
    public String toString() {
        return name;
    }
}
