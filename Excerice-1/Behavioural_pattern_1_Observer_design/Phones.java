public class Phones {
    private String model;
    private String weatherUpdate;

    public void update(String weather) {
        this.weatherUpdate = weather;
        System.out.println("Weather update on phone: " + weather);
    }
}
