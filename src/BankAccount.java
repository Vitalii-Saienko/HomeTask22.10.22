import java.util.Scanner;

/*
У вас на банковском счету N долларов. ВЫ хотите снять все, но банк разрешает снять только сумму, которая является
 делителем текущей суммы на счету и меньше текущей суммы.
Если вы снимаете максимально возможную сумму каждый день, сколько дней вам понадобится, чтобы забрать все свои
деньги из банка?  Примечание: если оставшаяся сумма равна 1, вы можете снять ее.
 */
class BankAccount {
    int amountMoney;
    int counter;

    public void inputAmount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the sum on the bank account:");
        this.amountMoney = scanner.nextInt();
    }
    public int calculateDaysOfWithdrawal(){
        inputAmount();
        int nod = amountMoney-1;
        while (amountMoney>1){
            if(amountMoney%nod==0){
                counter = counter + 1;
                amountMoney = amountMoney-nod;
                nod = amountMoney - 1;
                if (amountMoney==1){
                    counter = counter + 1;
                }
            }
            else {
                nod = nod - 1;
            }
        }
        return counter;
    }
    public void answer(){
        calculateDaysOfWithdrawal();
        System.out.println("Due to current policy you need "+counter+" days to withdraw all money from your bank account");
    }
}
