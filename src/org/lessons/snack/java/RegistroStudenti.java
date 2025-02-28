package org.lessons.snack.java;

public class RegistroStudenti {

  private Studente[] students;

  RegistroStudenti(){
    students = new Studente[0];
  }

  void addStudent(Studente newStudent){
    // Create the new array
    Studente[] newArray = new Studente[students.length + 1];

    for(int i = 0; i < newArray.length; i++){

      //Assign the new student
      if(i == (newArray.length - 1))
      newArray[newArray.length - 1] = newStudent;
        //Assign old student
      else
      newArray[i] = students[i];
    }

    // Substitute the old array
    students = newArray;
  }

  void showStudents(){
    String output = "";

    // For every student create a description
    for(int i = 0; i < students.length; i++){
      output += students[i].getStudente();
    }

    System.out.println(output);
  }

}
