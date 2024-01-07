package com.employeewage;
public class EmployeeWageUC3 {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;

        int dailyWage = wagePerHour * fullDayHour;
        int partTimeWage = wagePerHour * partTimeHour;

        System.out.println("Daily Employee Wage: " + dailyWage);
        System.out.println("Part Time Employee Wage: " + partTimeWage);
    }
}
