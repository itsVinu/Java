package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.service.*;
import com.mile1.exception.*;

public class StudentMain {
    static Student data[] = new Student[4];

    static{
        for(int i=0;i<data.length;i++){
            data[i] = new Student();
        }
        data[0] = new Student("Sekar", new int[]{35,35,35});
        data[1] = new Student(null, new int[]{11,22,33});
        data[2] = null;
        data[3] = new Student("Manoj",null);
    }

    public static void main(String[] args) {
        StudentReport sr = new StudentReport();
        StudentService studentService = new StudentService();

        String x;

        System.out.println("Grade Calculation:");

        for(int i=0;i<data.length;i++){
            try{
                x = sr.validate(data[i]);
            }
            catch(NullMarksArrayException e){
                x = "NullMarksArrayException occured";
            }
            catch(NullStudentException e){
                x = "NullStudentException occured";
            }
            catch(NullNameException e){
                x = "NullNameException occured";
            }
            System.out.println("GRADE = " + x);
        }

        System.out.println("Number of Objects with Marks array as null = " +
								studentService.findNumberOfNullMarks(data));
		System.out.println("Number of Objects with Name as null = " +
								studentService.findNumberOfNullNames(data));
		System.out.println("Number of Objects that are entierly null = " +
								studentService.findNumberOfNullObjects(data));
		
		// // TC7
		// System.out.println("TC7: Number of Objects with Name as null = " +
		// 		studentService.findNumberOfNullNames(data));		
		// // TC8
		// System.out.println("TC8: Number of Objects that are entierly null = " +
		// 		studentService.findNumberOfNullObjects(data));
		// // TC9
		// System.out.println("TC9: Number of Objects with Marks array as null = " +
		// 		studentService.findNumberOfNullMarks(data));
    }
}
