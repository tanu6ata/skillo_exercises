package skillo.lection9;

public class Student {
/* Create a class named Student with two attributes: one for the student's name and one for their grades. 
Add a method to the Student class that calculates and returns the average of the grades. 
Create student objects, each with a unique name and a set of grades. Print each student's name along with their average grade. */ 

String name;
int averageGrade;

// Parametrized constructor
public Student (String name) {
    this.name = name;
}

public int calculateAverageGrade (int mathGrade, int litGrade, int scienceGrade){
    return averageGrade = (mathGrade + litGrade + scienceGrade) / 3; 
}

public void printDetails() {
    System.out.println("Name: " + name);
    System.out.println("Average grade: " + averageGrade);
}

}
