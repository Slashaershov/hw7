import java.awt.geom.Arc2D;

public class Main
{
    public static void main(String[] args)
    {

        //ex 1
        int sum = 0;
        int sumStep = 15000;
        int sumMax = 2459000;
        int monthCount = 0;
        while (sum < sumMax)
        {
            sum += sumStep;
            monthCount++;
        }
        System.out.println("Месяц " + monthCount + " сумма накоплений равна " + sum + " рублей");
        System.out.println();

        //ex2
        byte xStart = 1;
        byte xFinish = 10;
        byte x = xStart;
        while (x <= xFinish)
        {
            System.out.print(x + " ");
            x++;
        }
        System.out.println();

        xStart = 10;
        xFinish = 1;
        x = xStart;
        while (x >= xFinish)
        {
            System.out.print(x + " ");
            x--;
        }
        System.out.println();
        System.out.println();

        //ex 3
        int population = 12000000;
        int natality = 17;
        int mortality = 8;
        int per = 1000;
        int d = per + natality - mortality;
        for (var year = 1; year <= 10; year++)
        {
            population = population / per * d;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
        System.out.println();

        //ex 4
        sum = 0;
        sumMax = 12000000;
        sumStep = 15000;
        monthCount = 0;
        float perceprion = 1.07f;
        while (sum < sumMax)
        {
            sum = (int) (sum * perceprion) + sumStep;
            monthCount++;
            System.out.println("Месяц " + monthCount + " сумма накоплений равна " + sum + " рублей");
        }
        System.out.println();

        //ex 5
        System.out.println("ex5");
        sum = 0;
        sumMax = 12000000;
        sumStep = 15000;
        perceprion = 1.07f;
        monthCount = 0;
        while (sum < sumMax)
        {
            sum = (int) (sum * perceprion) + sumStep;
            monthCount++;
            if (monthCount % 6 == 0)
            {
                System.out.println("Месяц " + monthCount + " сумма накоплений равна " + sum + " рублей");
            }
        }
        System.out.println();

        //ex6
        System.out.println("ex6");
        int monthCountMax = 9 * 12;
        sumStep = 15000;
        perceprion = 1.07f;
        sum = 0;
        float year = 0;
        for (monthCount = 1; monthCount <= monthCountMax; monthCount++)
        {
            sum += sumStep;
            if (monthCount % 6 == 0)
            {
                year += 0.5f;
                System.out.println("год " + year + " сумма накоплений равна " + sum + " рублей");
            }
        }
        System.out.println();

        // ex 7
        System.out.println("ex7");
        int daysMax = 31;
        int dayFriday = 4;
        for (int day = dayFriday; day <= daysMax; day+=7)
        {
            System.out.println("Сегодня пятница, " + day +"-е число. Необходимо подготовить отчет");
        }
        System.out.println();

        // ex 8

    }
}