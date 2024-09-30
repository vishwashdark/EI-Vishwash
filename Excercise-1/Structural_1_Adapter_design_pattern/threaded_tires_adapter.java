public class threaded_tires_adapter implements normal_tires {
    private threaded_tires threadedTires;

    public threaded_tires_adapter(threaded_tires threadedTires) {
        this.threadedTires = threadedTires;
    }

    @Override
    public void drive(String str) {
        // Adapt the threaded tires' drive functionality to normal tires
        threadedTires.threadedDrive();
    }
}
