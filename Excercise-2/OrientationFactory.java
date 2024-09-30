// OrientationFactory.java
public class OrientationFactory {
    // Factory method to return the correct Orientation object
    public Orientation getOrientation(String direction) {
        switch (direction) {
            case "North":
                return new North();
            case "South":
                return new South();
            case "East":
                return new East();
            case "West":
                return new West();
            default:
                System.out.println("Invalid orientation. Please enter North, South, East, or West.");
                return null;
        }
    }
}
