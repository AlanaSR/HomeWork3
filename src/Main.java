public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, куратор!");

        System.out.println("Задание 1");
        byte q = 125;
        short w = 213;
        int e = 431;
        long r = 8456L;
        float t = 458.2456f;
        double y = 8.24656546;
        System.out.println("Значение переменной q с типом byte равно "+q);
        System.out.println("Значение переменной w с типом short равно "+w);
        System.out.println("Значение переменной e с типом int равно "+e);
        System.out.println("Значение переменной r с типом long равно "+r);
        System.out.println("Значение переменной t с типом float равно "+t);
        System.out.println("Значение переменной y с типом double равно "+y);

        System.out.println("Задание 2");
        float a = 27.12f;
        long s = 987678965549L;
        float d = 2.786f;
        short f = 569;
        short g = 159;
        short h = 27897;
        byte j = 67;

        System.out.println("Задание 3");
        byte ludmilaPavl = 23;
        byte annaSerg = 27;
        byte ekatAndre = 30;
        short allPaper = 480;
        int forOnePupil = allPaper/(ludmilaPavl+annaSerg+ekatAndre);
        System.out.println("На каждого ученика рассчитано " + forOnePupil + " листов бумаги.");

        System.out.println("Задание 4");
        byte min20 = 20;
        short hours24 = 24*60;
        int days3 = hours24*3;
        int month = hours24*30;
        byte bottleInMinute = 16;
        String time1 = "20 минут", time2 = "24 часа", time3 = "3 дня", time4 = "месяц";
        int capacityMin20 = min20 * bottleInMinute;
        int capacityHours24 = hours24 * bottleInMinute;
        int capacityDays3 = days3 * bottleInMinute;
        int capacityMonth = month * bottleInMinute;
        System.out.println("За " + time1 + " машина произвела " + capacityMin20 + " штук бутылок.");
        System.out.println("За " + time2 + " машина произвела " + capacityHours24 + " штук бутылок.");
        System.out.println("За " + time3 + " машина произвела " + capacityDays3 + " штук бутылок.");
        System.out.println("За " + time4 + " машина произвела " + capacityMonth + " штук бутылок.");

        System.out.println("Задание 5");
        byte totalPaintCans = 120;
        byte whitePaintOneClass = 2;
        byte brownPaintOneClass = 4;
        int classes = totalPaintCans / (whitePaintOneClass + brownPaintOneClass);
        int totalBrownPaint = classes * brownPaintOneClass;
        int totalWhitePaint = classes * whitePaintOneClass;
        System.out.println("В школе, где " + classes + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски.");

        System.out.println("Задание 6");
        byte bananas = 5;
        byte weightOneBanana = 80;
        short milk = 200;
        byte weight100Milk = 105;
        byte iceCream = 2;
        byte weightOneIceCream = 100;
        byte rawEggs = 4;
        byte weightOneEgg = 70;
        int breakfastG = bananas*weightOneBanana+milk*weight100Milk/100+iceCream*weightOneIceCream+rawEggs*weightOneEgg;
        float breakfastKg = breakfastG/1000f;
        System.out.println("Общий вес завтрака спортсмена " + breakfastG + "г или " + breakfastKg + " кг.");

        System.out.println("Задание 7");
        byte overweight = 7;
        short loseWeight1 = 250;
        short loseWeight2 = 500;
        int days1 = overweight * 1000 / loseWeight1;
        int days2 = overweight * 1000 / loseWeight2;
        int middleDays = (days1 + days2) /2;
        System.out.println("Если в день терять по " + loseWeight1 + " г, то для похудения потребуется " + days1 + " дней.");
        System.out.println("Если в день терять по " + loseWeight2 + " г, то для похудения потребуется " + days2 + " дней.");
        System.out.println("В среднем, чтобы добиться результата похудения, потребуется " + middleDays + " день.");

        System.out.println("Задание 8");
        String name1 = "Маша", name2 = "Денис", name3 = "Кристина";
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int indexation = 10;
        int newSalaryMasha = salaryMasha*indexation/100 + salaryMasha;
        int newSalaryDenis = salaryDenis*indexation/100 + salaryDenis;
        int newSalaryKristina = salaryKristina*indexation/100 + salaryKristina;
        int differenceMasha = newSalaryMasha-salaryMasha;
        int differenceDenis = newSalaryDenis-salaryDenis;
        int differenceKristina = newSalaryKristina-salaryKristina;
        System.out.println(name1 + " теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " +differenceMasha + " рублей.");
        System.out.println(name2 + " теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " +differenceDenis + " рублей.");
        System.out.println(name3 + " теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " +differenceKristina + " рублей.");

    }
}