import java.util.Scanner;

class Bicycle {
    // the Bicycle class has five fields
    public int cadence, gear, speed;
    String owner, type;
    // the Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear, String startType, String startOwner) {
        this.gear = startGear;
        this.cadence = startCadence;
        this.speed = startSpeed;
        this.type = startType;
        this.owner = startOwner;
    }
}

public class BicycleExample {
    static Scanner userinput = new Scanner(System.in);
    public static void main (String[] args)
    {
        Bicycle myBike = new Bicycle(45, 25, 7, "Schwinn", "Jon");
        //2184.82758621 revolutions to bike 1 mile on trail bike tires

        float minutesForMile;
        int miles;
        String cadenceChange;
        int changedCadence;
        String startLoop;


        System.out.println("Would you like to calculate how long it will take you to go x miles.");
        startLoop = userinput.nextLine();
        startLoop = startLoop.toLowerCase();

        if(startLoop.equals("no")){
            System.out.println("Goodbye");
            System.out.println("Come Back soon");
        }

        while(startLoop.equals("yes")) {

            System.out.println("How many miles do you want to go?");
            miles = userinput.nextInt();

            minutesForMile = (float) 2184.83 * miles / myBike.cadence;
            System.out.println("It will take you " + minutesForMile + " minutes to go " + miles + " miles at this " + myBike.cadence + " cadence");

            System.out.println("Would you like to change your cadence to go faster?");
            cadenceChange = userinput.nextLine().toLowerCase();
            cadenceChange = userinput.nextLine().toLowerCase();


            if (cadenceChange.equals("yes")) {
                System.out.println("What would you like your new cadence to be ");
                changedCadence = userinput.nextInt();
                myBike.cadence = changedCadence;
            }
            if (cadenceChange.equals("no")){
                System.out.println("Would you like to change how far you are biking?");
                startLoop = userinput.nextLine().toLowerCase();
                if(!startLoop.equals("yes")){
                    System.out.println("Goodbye");
                }

            }
        }

    }
}
