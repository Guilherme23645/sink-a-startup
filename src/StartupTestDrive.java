
import java.util.ArrayList;

public class StartupTestDrive {
    public static void main(String[] args) {
        // Game Setup
        ArrayList<Startup> startups = new ArrayList<>();
        Startup startup1 = new Startup();
        Startup startup2 = new Startup();
        Startup startup3 = new Startup();
        startups.add(startup1);
        startups.add(startup2);
        startups.add(startup3);

        startup1.setName("poniez");
        startup2.setName("hacqi");
        startup3.setName("cabista");

        // Placing Startups
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("G0");
        arr1.add("G1");
        arr1.add("G2");

        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("C2");
        arr2.add("D2");
        arr2.add("E2");

        ArrayList<String> arr3 = new ArrayList<>();
        arr3.add("B6");
        arr3.add("C6");
        arr3.add("D6");

        startup1.setLocationCells(arr1);
        startup2.setLocationCells(arr2);
        startup3.setLocationCells(arr3);

        // Creating Guesses and Checking Them
        String guess1 = "C2";
        String guess2 = "D2";
        String guess3 = "E2";

        startup2.checkYourself(guess1);
        startup2.checkYourself(guess2);
        System.out.println(startup2.checkYourself(guess3)); // This should output "kill"
    }
}
