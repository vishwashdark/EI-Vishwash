import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrientationFactory factory = new OrientationFactory();

        // Set the default orientation to NorthN
        Orientation currentOrientation = factory.getOrientation("North");
        if (currentOrientation != null) {
            currentOrientation.rotate(); // Initial rotation to North
        }

        // Variable to hold the current orientation string
        String currentOrientationString = "North";
        // Variable to track data collected
        int dataCollected = 0;

        // Now allow the user to change the orientation
        while (true) {
            System.out.println("Enter the orientation (North, South, East, West) or 'exit' to quit:");
            String orientationInput = sc.nextLine();

            // Exit condition
            if (orientationInput.equalsIgnoreCase("exit")) {
                break;
            }

            // Check if the input orientation matches the current orientation
            if (orientationInput.equalsIgnoreCase(currentOrientationString)) {
                System.out.println("The satellite is already facing " + currentOrientationString + ".");
                continue; // Skip to the next iteration of the loop
            }

            // Use the factory to get the appropriate Orientation object
            currentOrientation = factory.getOrientation(orientationInput);

            // If valid orientation, rotate the satellite and update current orientation
            if (currentOrientation != null) {
                currentOrientation.rotate();
                currentOrientationString = orientationInput; // Update current orientation
                dataCollected += 10; // Increment data collected by 10
                System.out.println("Data Collected: " + dataCollected + " units.");
            }
        }

        System.out.println("Final Data Collected: " + dataCollected + " units.");
    }
}
