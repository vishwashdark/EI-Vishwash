public class app {
    public static void main(String[] args) {
        Weather weatherChannel = new Weather();  
        Phones phone1 = new Phones();
        Phones phone2 = new Phones();
        weatherChannel.addPhone(phone1);
        weatherChannel.addPhone(phone2);

        weatherChannel.update("sunny");
    }   
}
