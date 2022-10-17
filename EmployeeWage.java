package com.bridgelabz;

public class EmployeeWage {
    public int fullTimeHrPerDay;
    public int partTimeHrPerDay;
    public int wagePerHr;
    public int workingDaysOfMonth;
    public int maxWorkingHrs;

    EmployeeWage(){
        fullTimeHrPerDay = 8 ;
        partTimeHrPerDay = 4 ;
        wagePerHr = 20 ;
        workingDaysOfMonth = 20;
        maxWorkingHrs = 100 ;
    }
    public int getEmployeeHrs(int present){
        switch (present) {
            case 2:
                return fullTimeHrPerDay ;
            case 1:
                return partTimeHrPerDay ;
            default :
                return 0 ;
        }
    }
    public int getEmployeeWageOfDay(int hours){
        return  wagePerHr * hours ;
    }
    public boolean checkCondition(int currentDay, int totalHrs){
        if (currentDay!=this.workingDaysOfMonth && totalHrs <= maxWorkingHrs){
            return true;
        }
        else{
            return false;
        }

    }
}
