import java.time.LocalDate;

public class Main {
    public static int verifyYear(int a) {
        if((a % 4 == 0) && a % 100 > 0){
            return 1;
        }else if(a % 100 == 0 && a % 400 == 0){
            return 1;
        }else {
            return 0;
        }
    }
    public static void verifyPhone(int phoneOs, int phoneYear) {
        if(phoneOs == 0){
            if(phoneYear < LocalDate.now().getYear()){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else if (phoneYear == LocalDate.now().getYear()) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
        }
        else {
            if(phoneYear < LocalDate.now().getYear()){
                System.out.println("Установите облегченную версию приложения для Андроид по ссылке.");
            } else if (phoneYear == LocalDate.now().getYear()) {
                System.out.println("Установите версию приложения для Андроид по ссылке.");
            }
        }
    }
    public static void daysForDistance(int distance) {
        if(distance < 20){
            System.out.println("Потребуется 1 день.");
        } else if (distance >= 20 && distance < 60) {
            System.out.println("Потребуется 2 дня.");
        } else if (distance >= 60 && distance <= 100) {
            System.out.println("Потребуется 3 дня.");
        }else if(distance > 100){
            System.out.println("Доставки нет.");
        }
    }
    public static void main(String[] args) {
        System.out.println("Task 1");
        int insertYear = 2021;
        int yearAnswer = 2;
        yearAnswer = verifyYear(insertYear);
        if (yearAnswer == 1){
            System.out.println(insertYear + " год - високосный год.");
        } else
            System.out.println(insertYear + " год  - не високосный год.");
        System.out.println(" ");
        System.out.println("Task 2");
        int clientDeviceOs = 1;
        int clientDeviceYear = 2024;
        verifyPhone(clientDeviceOs, clientDeviceYear);
        System.out.println(" ");
        System.out.println("Task 3");
        int distanceForClient = 5;
        daysForDistance(distanceForClient);
    }
}