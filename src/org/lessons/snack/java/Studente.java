package org.lessons.snack.java;

public class Studente {

  private String name;
  private String surname;
  private int age;

  Studente(String name, String surname, int age){
    this.name = name;
    this.surname = surname;
    this.age = age;
  }

  String getStudente(){
    return "Studente: " + name + " " + surname + ", " + age + " anni";
  }

}
