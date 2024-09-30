public class car_tires {
    public static void main(String[] args) {
        drive carDrive = new drive();
        // Using threaded tires via the adapter
        threaded_tires threadedTires = new threaded_tires();
        normal_tires adapter = new threaded_tires_adapter(threadedTires);
        carDrive.setTires(adapter);
        carDrive.drivecar("Drive with threaded tires");
    }
}
