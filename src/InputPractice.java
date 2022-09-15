import java.util.Scanner;

public class InputPractice {

    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);

        int intOne, intTwo;
        //add more variables, at least 2 of each type:
        //double, float, short, String
        double doubleOne, doubleTwo;
        float floatOne, floatTwo;
        short shortVal, shortValTwo;

        System.out.println("How are you feeling today?");
        String mood = keyboard.nextLine();

        System.out.println("What's the weather like today?");
        String weather = keyboard.nextLine();

        System.out.print("Enter an integer :: ");
        intOne = keyboard.nextInt();

        System.out.println("Enter an integer :: ");
        intTwo = keyboard.nextInt();

        //add in input for all variables

        System.out.println("Enter a double value :: ");
        doubleOne = keyboard.nextDouble();

        System.out.println("Enter a double value :: ");
        doubleTwo = keyboard.nextDouble();


        System.out.println("Enter float value :: ");
        floatOne = keyboard.nextFloat();

        System.out.println("Enter float value :: ");
        floatTwo = keyboard.nextFloat();


        System.out.println("Enter an short value :: ");
        shortVal = keyboard.nextShort();

        System.out.println("Enter an short value ::");
        shortValTwo = keyboard.nextShort();


        System.out.println();
        System.out.println("Mood = " + mood);
        System.out.println("Weather = " + weather);
        System.out.println("integer one = " + intOne );
        System.out.println("integer two = " + intTwo );
        System.out.println("double one = " + doubleOne);
        System.out.println("double two = " + doubleTwo);
        System.out.println("float one = " + floatOne);
        System.out.println("float two = " + floatTwo);
        System.out.println("short one = " + shortVal);
        System.out.println("short two = " + shortValTwo);


        //add output for all variables


    }
}