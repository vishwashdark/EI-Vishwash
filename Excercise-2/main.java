import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrientationFactory factory = new OrientationFactory();

        // Set the default orientation to North
        Orientation orientation = factory.getOrientation("North");
        if (orientation != null) {
            orientation.rotate(); // Initial rotation to North
        }

        // Now allow the user to change the orientation
        while (true) {
            System.out.println("Enter the orientation (North, South, East, West) or 'exit' to quit:");
            String orientationInput = sc.nextLine();

            // Exit condition
            if (orientationInput.equalsIgnoreCase("exit")) {
                break;
            }

            // Use the factory to get the appropriate Orientation object
            orientation = factory.getOrientation(orientationInput);

            // If valid orientation, rotate the satellite
            if (orientation != null) {
                orientation.rotate();
            }
        }
    }
}
