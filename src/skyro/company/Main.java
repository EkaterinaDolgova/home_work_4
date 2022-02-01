package skyro.company;

public class Main {

    public static void main(String[] args) {
// Задача №1
        int clientOs = 1;
        boolean linkClientOs = clientOs == 1;
        if (linkClientOs) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        //Задача №2
        int clientOs1 = 1;
        int year = 2014;
        boolean linkClientOs1 = clientOs1 == 1;
        if (year < 2015) {
            if (linkClientOs1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (year >= 2015) {
            if (linkClientOs1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        //Задача №3
        int year1 = 400;
        boolean leapYear = ((year1 % 4 == 0) && (year1 % 100 != 0) || (year1 % 400 == 0));
        if (leapYear) {
            System.out.println(year1 + " год является високосным");
        } else {
            System.out.println(year1 + " год не является високосным");
        }
        //Задача №
        int deliveryDistance = 95;
        boolean distanceOneDay = deliveryDistance < 20;
        boolean distanceTwoDay = (deliveryDistance >= 20 && deliveryDistance <= 60);
        boolean distanceThreeDay = deliveryDistance > 60;
        int day = 1;
        if (distanceOneDay) {
        }
        if (distanceTwoDay) {
            day ++;
        }
        if (distanceThreeDay) {
            day ++;
            ++day;
        }
        System.out.println("Потребуется дней: " + day);
        //Задача №5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сезон зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон осень");
                break;
            default:
                System.out.println("Номер месяца больше 13");
        }
    }
}
