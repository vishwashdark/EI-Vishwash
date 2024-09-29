import java.util.ArrayList;
import java.util.List;

public class Weather {
    private List<Phones> phones = new ArrayList<>();
    private String currentWeather;

    public void addPhone(Phones phone) {
        this.phones.add(phone);
    }

    public void removePhone(Phones phone) {
        this.phones.remove(phone);
    }

    public void notifyPhones() {
        for (Phones phone : phones) {
            phone.update(currentWeather);
        }
    }

    public void update(String weather) {
        this.currentWeather = weather;
        notifyPhones();  
    }
}
