package org.lessons.snack.java;

public class Main {
  public static void main(String[] args) {

    // // Snack 1
    // Studente student = new Studente("Francesco", "Rossi", 16);
    // System.out.println(student.getStudente());;

    // // Snack 2
    // ContoBancario conto = new ContoBancario(55689);
    // conto.depositMoney(50);
    // conto.withDrawMoney(20);
    // System.out.println(conto.getContoBancario());;

    // Snack 3
    RegistroStudenti register = new RegistroStudenti();
    register.addStudent("Mario", "Rossi", 14);
    register.addStudent("Francesco", "Verdi", 41);
    register.showStudents();
  }
}
