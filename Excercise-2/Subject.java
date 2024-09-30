import java.util.List;

public interface Subject {
    void addObserver(Observer observer);   // Add an observer
    void removeObserver(Observer observer); // Remove an observer
    void notifyObservers();                // Notify all observers of state change
}
