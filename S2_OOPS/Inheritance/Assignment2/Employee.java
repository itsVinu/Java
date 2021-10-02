
class Employee extends Person{
    private double annualSalary;
    private String joiningYear;
    private String insuranceNumber;
    
    // Employee(double s,String j,String i){
    //     annualSalary = s;
    //     joiningYear = j;
    //     insuranceNumber = i;
    // }

    public void setAnnualSalary(double s){
        annualSalary = s;
    }
    public void setJoiningYear(String y){
        joiningYear = y;
    }
    public void setInsuranceNumber(String n){
        insuranceNumber = n;
    }

    public double getAnnualSalary(){
        return annualSalary;
    }
    public String getJoiningYear(){
        return joiningYear;
    }
    public String getInsuranceNumber(){
        return insuranceNumber;
    }
}