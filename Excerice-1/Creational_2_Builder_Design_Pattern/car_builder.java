public class car_builder {
    private String model;
    private String color;
    private int year;
    private int topSpeed;
    public car_builder setmodel(String model) {
        this.model = model;
        return this;
    }
    public car_builder setcolor(String color) {
        this.color = color;
        return this;
    }
    public car_builder setyear(int year) {
        this.year = year;
        return this;
    }
    public car_builder settopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
        return this;
    }
    public static car buildCar(String model, String color, int year, int topSpeed) {
        return new car(model, color, year, topSpeed);
    }
}
