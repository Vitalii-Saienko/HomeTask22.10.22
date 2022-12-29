import java.util.Scanner;

class DeviceWithFlasks {
    int temperatureIn1Flask;
    int temperatureIn2Flask;

    public void enterTemperature (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the temperature in the 1 flask:");
        this.temperatureIn1Flask = scanner.nextInt();
        System.out.println("Please enter the temperature in the 2 flask:");
        this.temperatureIn2Flask = scanner.nextInt();
    }

    public boolean checkDevice (){
        enterTemperature();
        return temperatureIn1Flask > 100 && temperatureIn2Flask < 100;
    }

    public void deviceResult(){
        boolean result = checkDevice();
        System.out.println(result ? "Device works properly." : "Device doesn't work properly!");
    }
}
