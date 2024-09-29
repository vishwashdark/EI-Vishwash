public class compositepattern {
    public static void main(String[] args) {
        // Create individual parts
        carparts engine = new engine();  // Engine now has Pistons and Cylinders
        carparts body = new body();
        carparts wheels = new wheels();
        carparts transmission = new transmission();

        // Create a car and add parts to it
        car myCar = new car();
        myCar.add(engine);
        myCar.add(body);
        myCar.add(wheels);
        myCar.add(transmission);

        // Assemble the car
        myCar.assemble();
    }
}