public class Main {

    public static void main (String[] args) {
        boolean isMobileClient = true; //клиент мобильного оператора
        long startAmountInKopecks = 100; // исходная сумма на счете
        long incomeAmountInKopecks = 1100; // сумма, входящая на счет
        long incomeAmountForBonus = 1000; //минимальная сумма для расчета бонусов
        int bonusAmount = 100; //кратная сумма необходимая для расчета


        float totalSum = startAmountInKopecks + incomeAmountInKopecks;
        float totalBonus = incomeAmountInKopecks / bonusAmount;


        //если сумма больше 1000 рублей
       if (incomeAmountInKopecks == (incomeAmountForBonus + bonusAmount)) {

           System.out.println("Сумма пополнения: " + ((totalSum + totalBonus) + " руб"));
           System.out.println("Сумма начисленных бонусов: " + (totalBonus + " руб"));

       } else {
           //если сумма меньше 1000 рублей
           System.out.println("Сумма пополнения: " + totalSum + " руб");
       }


    }
    
}
