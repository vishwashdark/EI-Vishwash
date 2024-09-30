import java.util.ArrayList;
import java.util.List;

public class Satellite implements Subject {
    private String panelStatus = "Inactive"; // Start with inactive panels
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(panelStatus);
        }
    }

    public void activatePanels() {
        System.out.println("Activating solar panels...");
        this.panelStatus = "Active";
        notifyObservers();  // Notify all panels
    }

    public void deactivatePanels() {
        System.out.println("Deactivating solar panels...");
        this.panelStatus = "Inactive";
        notifyObservers();  // Notify all panels
    }

    // Check if both panels are active
    public boolean arePanelsActive(List<SolarPanel> panels) {
        for (SolarPanel panel : panels) {
            if (!panel.isActive()) {
                return false;
            }
        }
        return true;
    }
}
