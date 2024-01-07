package com.employeewage;
public class EmployeeWageUC4 {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;

        int employeeType = (int) (Math.random() * 3);

        int dailyWage;

        switch (employeeType) {
            case 0:
                dailyWage = wagePerHour * fullDayHour;
                System.out.println("Employee is Full Time");
                break;
            case 1:
                dailyWage = wagePerHour * partTimeHour;
                System.out.println("Employee is Part Time");
                break;
            default:
                dailyWage = 0;
                System.out.println("Employee is Absent");
        }

        System.out.println("Daily Employee Wage: " + dailyWage);
    }

}

