package com.employeewage;

public class EmployeeWageUC6 {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;
        int workingDaysPerMonth = 20;
        int maxWorkingHours = 100;

        int totalWage = 0;
        int totalWorkingHours = 0;
        int daysWorked = 0;

        while (daysWorked < workingDaysPerMonth && totalWorkingHours < maxWorkingHours) {
            int employeeType = (int) (Math.random() * 3);
            int dailyWorkingHours;

            switch (employeeType) {
                case 0:
                    dailyWorkingHours = fullDayHour;
                    break;
                case 1:
                    dailyWorkingHours = partTimeHour;
                    break;
                default:
                    dailyWorkingHours = 0;
            }

            totalWorkingHours += dailyWorkingHours;
            daysWorked++;

            int dailyWage = wagePerHour * dailyWorkingHours;
            totalWage += dailyWage;
        }

        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Working Days: " + daysWorked);
        System.out.println("Total Employee Wage: " + totalWage);
    }

}

