public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1(){

        byte varByte = 127;
        int varInt = 127000;
        short varShort = 12700;
        long varLong = 1270000000;
        float varFloat = 1224.3F;
        double varDouble = 12222222222.2121;

        System.out.println("Демонстрация задачи1");
        System.out.println("Значение переменной varByte с типом byte равно " + varByte);
        System.out.println("Значение переменной varInt с типом int равно " + varInt);
        System.out.println("Значение переменной varShort с типом short равно " + varShort);
        System.out.println("Значение переменной varLong с типом long равно " + varLong);
        System.out.println("Значение переменной varFloat с типом float равно " + varFloat);
        System.out.println("Значение переменной varDouble с типом double равно " + varDouble);
    }
    public static void task2(){

        byte varByte = 67;
        int varInt = 27897;
        short varShort = -159;
        short varShort2 = 569;
        long varLong = 987678965549L;
        float varFloat = 27.12F;
        double varDouble = 2.786;


        System.out.println("Демонстрация задачи2");
        System.out.println("Значение переменной varByte с типом byte равно " + varByte);
        System.out.println("Значение переменной varInt с типом int равно " + varInt);
        System.out.println("Значение переменной varShort с типом short равно " + varShort);
        System.out.println("Значение переменной varShort2 с типом short равно " + varShort2);
        System.out.println("Значение переменной varLong с типом long равно " + varLong);
        System.out.println("Значение переменной varFloat с типом float равно " + varFloat);
        System.out.println("Значение переменной varDouble с типом double равно " + varDouble);
    }

    public static void task3(){

        byte numberLP = 23;
        byte numberAC = 27;
        byte numberEA = 30;

        int totalPaper = 480;
        int numberPaperForStudent = totalPaper / (numberAC + numberEA + numberLP);

        System.out.println("Демонстрация задачи3");
        System.out.println("На каждого ученика рассчитано " + numberPaperForStudent + " листов бумаги");
    }

    public static void task4(){

        byte performanceBottles = 8;//за 1 мин
        byte numberMin = 20, numberDay = 1, numberMonth = 1;


        System.out.println("Демонстрация задачи4");
        System.out.println("За " + numberMin + " минут машина произвела " + performanceBottles * numberMin + " штук бутылок");
        System.out.println("За " + numberDay + " день машина произвела " + performanceBottles * numberDay * 86400 + " штук бутылок");

        numberDay *= 3;
        System.out.println("За " + numberDay + " дней машина произвела " + performanceBottles * numberDay * 86400 + " штук бутылок");
        System.out.println("За " + numberMonth + " месяц машина произвела " + performanceBottles * numberMonth * 86400 * 30 + " штук бутылок");
    }

    public static void task5(){

        byte totalTinPaint = 120;
        byte numberTinPaintWhite = 2;//на класс
        byte numberTinPaintBrown = 4;//на класс
        int numberClass = totalTinPaint / (numberTinPaintWhite + numberTinPaintBrown);

        System.out.println("Демонстрация задачи5");
        System.out.println("В школе, где " + numberClass + " классов, нужно " + numberClass * numberTinPaintWhite + " банок белой краски и " + numberClass * numberTinPaintBrown + " банок коричневой краски");
    }

    public static void task6(){

        byte banana = 5, milk = 2, iceCream = 2, egg = 4;
        byte bananaWeight = 80, milkWeight = 105, iceCreamWeight = 100, eggWeight = 70;

        int totalWeight = banana * bananaWeight + milk * milkWeight + iceCream * iceCreamWeight + egg * eggWeight;


        System.out.println("Демонстрация задачи6");
        System.out.println("Вес спортзавтрака составляет " + totalWeight + " грамм или " + totalWeight / 1000 + " кг и " + totalWeight % 1000 + " грамм");
    }

    public static void task7(){

        int decWeight = 250, goalWeight = 7000, numberDays;

        System.out.println("Демонстрация задачи7");
        numberDays = goalWeight / decWeight;
        System.out.println("Для похудения  на " + goalWeight / 1000 + " кг если терять каждый день по " + decWeight + " грамм понадобится " + numberDays + " дней");

        decWeight = 500;
        numberDays = goalWeight /decWeight;
        System.out.println("Для похудения  на " + goalWeight / 1000 + " кг если терять каждый день по " + decWeight + " грамм понадобится " + numberDays + " дней");

    }

    public static void task8(){

        int salaryMasha = 67760, salaryDenis = 83690, salaryKris = 76230;
        float incSalary = 1.1f;//10%

        int yearSalaryMasha = salaryMasha * 12, yearSalaryDenis = salaryDenis * 12, yearsalaryKris = salaryKris * 12;
        float newSalaryMasha = salaryMasha * incSalary, newSalaryDenis = salaryDenis * incSalary, newSalaryKris = salaryKris * incSalary;
        float newYearSalaryMasha = newSalaryMasha * 12,  newYearSalaryDenis = newSalaryDenis * 12, newYearSalaryKris = newSalaryKris * 12;

        System.out.println("Демонстрация задачи8");
        System.out.println("Изменения зарплат после повышния будет следующим:");
        System.out.println("- Маша за месяц получит: " + newSalaryMasha + ", что за год составит " + newYearSalaryMasha + ", это на " + (newYearSalaryMasha - yearSalaryMasha) + " больше, ранее зарплата за год была " + yearSalaryMasha);
        System.out.println("- Денис за месяц получит: " + newSalaryDenis + ", что за год составит " + newYearSalaryDenis + ", это на " + (newYearSalaryDenis - yearSalaryDenis) + " больше, ранее зарплата за год была " + yearSalaryDenis);
        System.out.println("- Кристина за месяц получит: " + newSalaryKris + ", что за год составит " + newYearSalaryKris + ", это на " + (newYearSalaryKris - yearsalaryKris) + " больше, ранее зарплата за год была " + yearsalaryKris);
    }

}