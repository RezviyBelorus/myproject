package org.example.lec_2.task_1;

public class ForExamplle {
        public static void main(String[] args) {
            double km = 10; // ты здесь присваиваешь значение 10 и в 9 строке делаешь тоже самое
            int runDays = 1;
            double persent = 0.1; // это скорее коэффициент, а не процент + persent -> perCent, буква С
            double totalKm = 0;
            for (km = 10; runDays <= 7; km = km + (km * persent)) { // использовать разные переменные в условии цикла не лучшее решение, очень путает
                runDays++;
                totalKm += km;
                System.out.println(totalKm);
            }
                
                /*
                Я предложу тебе вариант кода, который выглядит немного проще
                
                double dailyDistance = 10;
                double dailyProgressCoefficient = 0.1;
        
                double totalKm = dailyDistance;

                for (int i = 1; i < 7; i++) {
                    dailyDistance = dailyDistance + dailyDistance * dailyProgressCoefficient;
                    totalKm += dailyDistance;
                }

                System.out.println(totalKm);
                */
        }
    }
