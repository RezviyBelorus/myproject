package org.example.lec_2.task_1;

public class ForExamplle {
        public static void main(String[] args) {
            double km = 10;
            int runDays = 1;
            double persent = 0.1;
            double totalKm = 0;
            for (km = 10; runDays <= 7; km = km + (km * persent)) {
                runDays++;
                totalKm += km;
                System.out.println(totalKm);
            }
        }
    }