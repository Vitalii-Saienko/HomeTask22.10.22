import java.util.Scanner;

/*
Создайте две переменные isWeekend и isRain. Создайте переменную canWalk, значение которой должно быть истинным,
если это выходной день (isWeekend=true) и не идет дождь (isRain=false).
 */
class IsWeekendIsRain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isWeekend = scanner.nextBoolean();
        boolean isRain = scanner.nextBoolean();
        boolean canWalk = false;
        if (isWeekend && !isRain) {
            canWalk = true;
        }
        System.out.println(canWalk);
    }
    }