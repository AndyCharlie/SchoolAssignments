/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_hwk3;

import java.io.IOException;
import java.io.File;
import java.util.*;
/**
 *
 * @author Adeat
 */
public class Deaton_Hwk3 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        int index = 0;
        String stdName;
        String stdClass;
        double stdExam1;
        double stdExam2;
        double stdExam3;
        int sec100Stu = 0;
        int sec200Stu = 0;
        int sec300Stu = 0;
        double sec100Sum = 0;
        double sec200Sum = 0;
        double sec300Sum = 0;
        
        Scanner fileIn = new Scanner(new File("students.txt"));
        ArrayList<Students> student = new ArrayList();
        
        while (fileIn.hasNext()){
            stdName = fileIn.next();
            stdClass = fileIn.next();
            stdExam1 = fileIn.nextDouble();
            stdExam2 = fileIn.nextDouble();
            stdExam3 = fileIn.nextDouble();
            Students stdObj = new Students(stdName, stdClass);
            stdObj.setExam1(stdExam1);
            stdObj.setExam2(stdExam2);
            stdObj.setExam3(stdExam3);
            student.add(stdObj);
        }
        fileIn.close();
        
        while (student.size() > index){
            String section = (student.get(index).getSectionName());
            switch (section) {
                case "Section100":
                    sec100Sum += (student.get(index).getAvgGrade());
                    sec100Stu++;
                    break;
                    
                case "Section200":
                    sec200Sum += (student.get(index).getAvgGrade());
                    sec200Stu++;
                    break;
                    
                case "Section300":
                    sec300Sum += (student.get(index).getAvgGrade());
                    sec300Stu++;
                    break;
                default:
                    break;
            }
            index++;
            
            
        }
        
        index = 0;
        
        System.out.println("The Average Grade in Secion 100 is : " + (sec100Sum/sec100Stu));
        System.out.println("The Average Grade in Secion 200 is : " + (sec200Sum/sec200Stu));
        System.out.println("The Average Grade in Secion 300 is : " + (sec300Sum/sec300Stu));
        
        double exam1Total = 0;
        double exam2Total = 0;
        double exam3Total = 0;
        
        while (student.size() > index) {
            System.out.println(student.get(index).toString());
            exam1Total += student.get(index).getExam1();
            exam2Total += student.get(index).getExam2();
            exam3Total += student.get(index).getExam3();
            index++;
        }
        
        double exam1Avg = (exam1Total / student.size());
        double exam2Avg = (exam2Total / student.size());
        double exam3Avg = (exam3Total / student.size());
        
        System.out.println("Exam 1 Average: " + exam1Avg);
        System.out.println("Exam 2 Average: " + exam2Avg);
        System.out.println("Exam 3 Average: " + exam3Avg);
                           
            
        }
      
            
        
        
        
    }
    
    
