/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_hwk3;

/**
 *
 * @author Adeat
 */
public class Students {
    String name;
    String sectionName;
    double exam1;
    double exam2;
    double exam3;
    //double avgExamGrade = ((exam1 + exam2 + exam3) / 3);
    
    public Students(String stname, String stsectionName) {
        name = stname;
        sectionName = stsectionName;
    }
    public String getName(){
        return name;
    }
    public String getSectionName(){
        return sectionName;
    }
    public double getExam1(){
        return exam1;
    }
     public double getExam2(){
        return exam2;
    }
      public double getExam3(){
        return exam3;
    }
       public double getAvgGrade(){
        double avgExamGrade = ((exam1 + exam2 + exam3) / 3);
        return avgExamGrade;
    }
       public void setExam3(double newex){
           exam3 = newex;
       }
       public void setExam2(double newex){
           exam2 = newex;
       }
       public void setExam1(double newex){
           exam1 = newex;
       }
       private char calcLetterGrade(){
    
           if ( getAvgGrade() >=  85.0){
               return 'A';
           }
           else if ((78.0 < getAvgGrade()) && (getAvgGrade() < 85.0)){
               return 'B';
           }
           else if ((65.0 < getAvgGrade()) && (getAvgGrade() < 78.0)){
               return 'C';
           }
           else if ((60.0 < getAvgGrade()) && (getAvgGrade() < 65.0)){
               return 'D';
           }
           else {
               return 'F';
           }
           
       }
       public String toString(){
           char letterGrade = calcLetterGrade();
           String result = ("Student: " + name.toUpperCase() + "\n" + 
                            "Section Name: " + sectionName + "\n" + 
                            "Grade: " + letterGrade + "\n");
        return result;
       }
}
