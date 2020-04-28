package by.belhard.j22.homeworks.hw_03;

//Банк предлагает вклад под процент.
//Дано: начальная сумма вклада startSum, процент годовых proc, количество лет years, на которые совершается вклад.
//Сумма индексируется каждый год (это значит, что после каждого года процент начисляется не на изначальную сумму, а на текущую).
//Вывести, сколько денег будет на счету после years лет.
//
//*доп. Каждый год банк вычитает из суммы вклада налог в размере 1% от изначального вклада.

public class ht_03_04 {

    public static void main(String[] args) {

        double startSum = 1000;
        double proc = 0.01;
        int years = 4;
        
        double currentSum = startSum;
        double tax = startSum * 0.01;
        double currentSumWithTax = startSum;


        for (int curYear = 1; curYear <= years ; curYear++) {

            currentSum = currentSum + currentSum * proc;
            currentSumWithTax = currentSum - tax;
        }

////        alternative way
//        int i = 1;
//        while (i <= years) {
//
//            i++;
//            currentSum = currentSum + currentSum * proc;
//            currentSumWithTax = currentSum - tax;
//        }

        System.out.print("Balance after " + years + " years = ");
        System.out.printf("%.3f", currentSum);
        System.out.println();
        System.out.print("Balance after " + years + " years with tax = ");
        System.out.printf("%.3f", currentSumWithTax);

    }
}
