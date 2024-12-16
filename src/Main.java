import java.time.LocalDate;

public class Main {
    public static void verifyYear(int a) {
        if ((a % 4 == 0) && a % 100 > 0) {
            System.out.println(a + " год - високосный год.");
        } else if (a % 100 == 0 && a % 400 == 0) {
            System.out.println(a + " год - високосный год.");
        } else {
            System.out.println(a + " год  - не високосный год.");
        }
    }

    public static void verifyPhone(int phoneOs, int phoneYear) {
        if (phoneOs == 0) {
            if (phoneYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
        } else {
            if (phoneYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Андроид по ссылке.");
            } else {
                System.out.println("Установите версию приложения для Андроид по ссылке.");
            }
        }
    }

    public static void daysForDistance(int distance) {
        if (distance < 20) {
            System.out.println("Потребуется 1 день.");
        } else if (distance >= 20 && distance < 60) {
            System.out.println("Потребуется 2 дня.");
        } else if (distance >= 60 && distance <= 100) {
            System.out.println("Потребуется 3 дня.");
        } else if (distance > 100) {
            System.out.println("Доставки нет.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Task 1");
        int insertYear = 2021;
        Main.verifyYear(insertYear);
        System.out.println(" ");
        System.out.println("Task 2");
        int clientDeviceOs = 0;
        int clientDeviceYear = 2010;
        verifyPhone(clientDeviceOs, clientDeviceYear);
        System.out.println(" ");
        System.out.println("Task 3");
        int distanceForClient = 5;
        daysForDistance(distanceForClient);
    }
}