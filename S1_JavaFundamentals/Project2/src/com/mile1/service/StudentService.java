package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {
    public int findNumberOfNullMarks(Student data[]){
        int countNullMarks = 0;

        for(int i=0;i<data.length;i++){
            try{
                data[i].getMarks();
            }
            catch(NullPointerException e){
                countNullMarks++;
            }
        }
        return countNullMarks;
    }
    public int findNumberOfNullNames(Student data[]){
        int countNullNames = 0;

        for(int i=0;i<data.length;i++){
            try{
                data[i].getName();
            }
            catch(NullPointerException e){
                countNullNames++;
            }
        }
        return countNullNames;
    }
    public int findNumberOfNullObjects(Student data[]){
        int countNullObjects = 0;

        for(int i=0;i<data.length;i++){
            if(data[i] == null){
                countNullObjects++;
            }
        }
        return countNullObjects;
    }
}
