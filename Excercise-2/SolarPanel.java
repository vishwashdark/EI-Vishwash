public class SolarPanel implements Observer {
    private String panelName;
    private String panelStatus = "Inactive"; // Panels start inactive by default

    public SolarPanel(String panelName) {
        this.panelName = panelName;
    }

    // This method will be called when the satellite notifies observers of status changes
    @Override
    public void update(String status) {
        this.panelStatus = status;
        System.out.println(panelName + " is now " + panelStatus);
    }

    // Method to check if the solar panel is active
    public boolean isActive() {
        return panelStatus.equals("Active");
    }
}
