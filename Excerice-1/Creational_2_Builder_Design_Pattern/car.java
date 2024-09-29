public class car {
    private String Model;
    private String Color;
    private int Year;
    private int TopSpeed;
    public car(String model, String color, int year, int topSpeed) {
        super();
        this.Model = model;
        this.Color = color;
        this.Year = year;
        this.TopSpeed = topSpeed;
    }
    @Override
    public String toString() {
        return "Car [Model=" + Model + ", Color=" + Color + ", Year=" + Year + ", TopSpeed=" + TopSpeed + "]";
    }

}
