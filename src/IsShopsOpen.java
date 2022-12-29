import java.util.Scanner;

class IsShopsOpen {
    Boolean isEdekaOpen = false;
    Boolean isReweOpen = false;

    public void isOpen(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 'true' if Edeka is open, otherwise 'false':");
        this.isEdekaOpen = scanner.nextBoolean();
        System.out.println("Please enter 'true' if REWE is open, otherwise 'false':");
        this.isReweOpen = scanner.nextBoolean();
    }
    public boolean canBuy(){
        if (isReweOpen || isEdekaOpen){
            return true;
        }
        else {
            return false;
        }
    }
    public void activity(boolean canBuy){
        if (canBuy){
            System.out.println("I can go shopping!");
        }
        else {
            System.out.println("I can't buy anything, shops are closed.");
        }
    }
}
