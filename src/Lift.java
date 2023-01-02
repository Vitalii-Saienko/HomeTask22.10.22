import java.util.Scanner;

/*
Ввод:
H = 200, N = 50, M = 1 ==>  Ответ: 5
Объяснение:
Первый подьем: 50 - 1 = 49
Второй подьем: 49 + 50 - 1 = 98
Третий подьем: 98 + 50 - 1 = 147
Четвертый подьем: 147 + 50 - 1 = 196
Пятый подьем: выйти за пределы H.

реализовать метод numberOfLifts(int floor, int stepUp, int stepDown)
 */
class Lift {
    int lastFloor;
    int stepUp;
    int stepDown;
    int currentFloor = 1;
    int counter = 0;

    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter in order: last floor, stepUp and stepDown:");
        this.lastFloor = scanner.nextInt();
        this.stepUp = scanner.nextInt();
        this.stepDown = scanner.nextInt();
    }
    public int calculateFloor(){
        inputInfo();
        while (currentFloor<=lastFloor){
            currentFloor = currentFloor+stepUp;
            counter++;
            if (currentFloor>=lastFloor){
                break;
            }
            currentFloor = currentFloor-stepDown;
        }
        return counter;
    }
    public void answer(){
        calculateFloor();
        System.out.println("The number of steps up that will do elevator is: "+counter);
    }
}
