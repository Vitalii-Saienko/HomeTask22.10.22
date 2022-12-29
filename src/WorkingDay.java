import java.util.Scanner;

class WorkingDay {
    int inputSeconds, restMinutes, restHours, restSeconds;

    public int inputSeconds() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the time till working day end (in seconds):");
        this.inputSeconds = scanner.nextInt();
        return inputSeconds;
    }

    public void randomInputSecond(){
        System.out.println("In this method the time before working day ends is random!");
        this.inputSeconds = (int) (Math.random() * (28800 + 1));
        this.restHours = inputSeconds/3600;
        this.restMinutes = (inputSeconds - restHours*3600)/60;
        this.restSeconds = inputSeconds - restHours*3600 - restMinutes*60;
        System.out.println("Time till working day ends in seconds: "+inputSeconds);
        System.out.println("Time till working day ends in standard format: "+restHours+" : "+restMinutes+" : "+restSeconds);
    }
    public void timeMinutesAndHours(){
        inputSeconds();
        this.restHours = inputSeconds/3600;
        this.restMinutes = (inputSeconds - restHours*3600)/60;
        this.restSeconds = inputSeconds - restHours*3600 - restMinutes*60;

    }
    public void whenThisDayEnds(){
        timeMinutesAndHours();
        System.out.println("Time till working day ends in seconds: "+inputSeconds);
        System.out.println("Time till working day ends in standard format: "+restHours+" : "+restMinutes+" : "+restSeconds);
    }
}
