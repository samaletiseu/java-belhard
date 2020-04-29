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
        double percent = 0.01;
        int years = 4;
        
        double currentSum = startSum;
        double tax = startSum * 0.01;
        double currentSumWithTax = startSum;

        for (int curYear = 1; curYear <= years ; curYear++) {
            currentSum = currentSum + currentSum * percent;
            currentSumWithTax = currentSum - tax;
        }

// Alternative way (mine)
//        int i = 1;
//        while (i <= years) {
//            i++;
//            currentSum = currentSum + currentSum * percent;
//            currentSumWithTax = currentSum - tax;
//        }

        System.out.printf("Balance after " + years + " years = %.3f\n", currentSum);
        System.out.printf("Balance after " + years + " years with tax = %.3f\n", currentSumWithTax);
    }
}