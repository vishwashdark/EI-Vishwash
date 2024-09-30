import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrientationFactory factory = new OrientationFactory();
        Satellite satellite = new Satellite();

        // Set up solar panels and subscribe them to the satellite
        SolarPanel panel1 = new SolarPanel("Solar Panel 1");
        SolarPanel panel2 = new SolarPanel("Solar Panel 2");
        satellite.addObserver(panel1);
        satellite.addObserver(panel2);

        // List to manage both panels
        List<SolarPanel> panels = new ArrayList<>();
        panels.add(panel1);
        panels.add(panel2);

        // Set the default orientation to North
        Orientation currentOrientation = factory.getOrientation("North");
        if (currentOrientation != null) {
            currentOrientation.rotate(); // Initial rotation to North
        }

        // Variable to hold the current orientation string
        String currentOrientationString = "North";
        // Variable to track data collected
        int dataCollected = 0;

        // Now allow the user to control the satellite
        while (true) {
            System.out.println("\nEnter the orientation (North, South, East, West), 'activate' to open panels, 'deactivate' to close panels, or 'exit' to quit:");
            String input = sc.nextLine();

            // Exit condition
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            // Handle solar panel activation and deactivation
            if (input.equalsIgnoreCase("activate")) {
                satellite.activatePanels();
                continue;
            }

            if (input.equalsIgnoreCase("deactivate")) {
                satellite.deactivatePanels();
                continue;
            }

            // Check if the input orientation matches the current orientation
            if (input.equalsIgnoreCase(currentOrientationString)) {
                System.out.println("The satellite is already facing " + currentOrientationString + ".");
                continue; // Skip to the next iteration of the loop
            }

            // Use the factory to get the appropriate Orientation object
            currentOrientation = factory.getOrientation(input);

            // If valid orientation, rotate the satellite and update current orientation
            if (currentOrientation != null) {
                if (satellite.arePanelsActive(panels)) {
                    currentOrientation.rotate();
                    currentOrientationString = input; // Update current orientation
                    dataCollected += 10; // Increment data collected by 10
                    System.out.println("Data Collected: " + dataCollected + " units.");
                } else {
                    System.out.println("Cannot collect data. Solar panels are not active.");
                }
            }
        }

        System.out.println("Final Data Collected: " + dataCollected + " units.");
    }
}
