public class drive {
    private normal_tires tires;

    public normal_tires getTires() {
        return tires;
    }

    public void setTires(normal_tires tires) {
        this.tires = tires;
    }

    public void drivecar(String str) {
        if (tires != null) {
            tires.drive(str);
        } else {
            System.out.println("No tires are set for driving!");
        }
    }
}
