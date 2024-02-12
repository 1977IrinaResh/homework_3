// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int intVar = 10;
        System.out.println("This is an example of integer " + intVar);
        boolean boolVar = true;
        System.out.println("This is an example of boolean " + boolVar);
        float floatVar = 56.3F;
        System.out.println("This is an example of float " + floatVar);
        byte byteVar = 5;
        System.out.println("This is an example of byte " + byteVar);
        short shortVar = 1000;
        System.out.println("This is an example of short " + shortVar);
        long longVar = 1_000_000;
        System.out.println("This is an example of long " + longVar);
        double doubleVar = 1_000_000_000;
        System.out.println("This is an example of double " + doubleVar);
        char charVar = 'y';
        System.out.println("This is an example of char " + charVar);

        float floatVar2= 27.12F;
        long longVar2= 987_678_965_549L;
        float floatVar3=2.786F;
        short shortVar2=569;
        short shortVar3=-159;
        short shortVar4=27897;
        byte byteVar2=67;

        short ludmilaPetrovna=23;
        short annaSergeevna=27;
        short ekaterinaAndreevna=30;
        short paper=480;
        float paperList=paper/(ludmilaPetrovna+annaSergeevna+ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано по " +paperList+" листов бумаги");

        short machineProduction=8;
        int production_20_Min=machineProduction*20;
        System.out.println("Производительность за 20 мин равна "+production_20_Min);
        int production_24_Hours=machineProduction*24*60;
        System.out.println("Производительность за сутки равна "+production_24_Hours);
        int production_3_Days=production_24_Hours*3;
        System.out.println("Производительность за трое суток равна "+production_3_Days);
        int production_1_month=production_24_Hours*30;
        System.out.println("Производительность за месяц равна "+production_1_month);

        short boxesTotal=120;
        short whiteColorBoxes=2;
        short brownColorBoxes=4;
        short classesNumber=120/6;
        int whiteColorBoxesTotal=classesNumber*whiteColorBoxes;
        int brownColorBoxesTotal=classesNumber*brownColorBoxes;
        System.out.println("В школе, где "+classesNumber+" классов "+"необходимо "+whiteColorBoxesTotal+" банок белой краски и "+brownColorBoxesTotal+" банок коричневой краски");

        short bananas=5;
        short milk=200;
        short icecream=2;
        short eggs=4;
        short bananaWeight=80;
        short milkWeight=105;
        short icecreamWeight=100;
        short eggWeight=70;
        float totalWeight=bananas*bananaWeight+milk*milkWeight+icecreamWeight*icecreamWeight+eggs*eggWeight;
        System.out.println("Общий вес в граммах "+totalWeight);
        System.out.println("Общий вес в килограммах "+(totalWeight/1000));

        int totalWeightLoss=7;
        float weighLoss1=0.25F;
        float weignLoss2=0.5F;
        float daysTotal1=totalWeightLoss/weighLoss1;
        float daysTotal2=totalWeightLoss/weignLoss2;
        System.out.println("Спортсмену потребуется "+daysTotal1+" дней если он будет терять по 250 грамм в день");
        System.out.println("Спортсмену потребуется "+daysTotal2+" дней если он будет терять по 500 грамм в день");

        float salaryMasha=67760F;
        float salaryDenis=83690F;
        float salaryChritine=76230F;
        float salaryMashaIncr= (float) (salaryMasha+(salaryMasha*0.1));
        float salaryDenisInc=(float) (salaryDenis+(salaryDenis*0.1));
        float salaryChristineInc=(float)(salaryChritine+(salaryChritine*0.1));
        float yearlyIncrMasha=(float)(salaryMashaIncr*12-salaryMasha*12);
        float yearlyIncrDenis=(float)(salaryDenisInc*12-salaryDenis*12);
        float yearlyIncrChristine=(float)(salaryChristineInc*12-salaryChritine*12);
        System.out.println("Маша теперь получает "+salaryMashaIncr+". Годовой доход вырос на "+yearlyIncrMasha);
        System.out.println("Денис теперь получает "+salaryDenisInc+". Годовой доход вырос на "+yearlyIncrDenis);
        System.out.println("Кристина теперь получает "+salaryChristineInc+". Годовой доход вырос на "+yearlyIncrChristine);







    }







    }
