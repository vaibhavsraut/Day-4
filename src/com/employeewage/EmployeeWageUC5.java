package com.employeewage;
public class EmployeeWageUC5 {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;
        int workingDaysPerMonth = 20;

        int totalWage = 0;

        for (int day = 1; day <= workingDaysPerMonth; day++) {
            int employeeType = (int) (Math.random() * 3);

            int dailyWage;

            switch (employeeType) {
                case 0:
                    dailyWage = wagePerHour * fullDayHour;
                    break;
                case 1:
                    dailyWage = wagePerHour * partTimeHour;
                    break;
                default:
                    dailyWage = 0;
            }

            totalWage += dailyWage;
        }

        System.out.println("Monthly Employee Wage: " + totalWage);
    }

}

