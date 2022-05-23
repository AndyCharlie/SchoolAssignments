/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_hwk4;

/**
 *
 * @author Adeat
 */
public class Student {
    
    String first;
    String last;
    char middle;
    Double gpa;
    Team team;
    static int count;
    
    public Student(String firstName, String lastName, char middleInitial, double gradePoint, String teamName, String teamMascot, String teamColor){
    first = firstName;
    last = lastName;
    middle = middleInitial;
    gpa = gradePoint;
    team = new Team(teamName, teamMascot, teamColor);
    count++;
    }
    public boolean sameLast(Student newStudent){
        if (newStudent.getLast().equals(last)){
            return true;
        }
        else {
            return false;
        }
    }
    public String getFirst(){
        return first;
    }
    public String getLast(){
        return last;
    }
    public char getMiddle(){
        return middle;
    }
    public double getGPA(){
        return gpa;
    }
    public int getCount(){
        return count;
    }
    public void setFirst(String newFirst){
        first = newFirst;
    }
    public void setLast(String newLast){
        last = newLast;
    }
    public void setMiddle(char newMiddle){
        middle = newMiddle;
    }
    public void setGPA(double newGPA){
        gpa = newGPA;
    }
    public String toString(){
        String out = ("Name: " + first + " " + middle + " " + last + "\n" +
                      "GPA: " + gpa + "\n" +
                      team.toString() + "\n" +
                      "Total Students: " + count);
        return out;
    }
}
