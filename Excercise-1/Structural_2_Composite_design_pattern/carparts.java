import java.util.ArrayList;
import java.util.List;

// Component interface for all car parts
interface carparts { 
    void assemble();
}

// Leaf classes
class Pistons implements carparts {
    public void assemble() {
        System.out.println("Assembling pistons");
    }
}

class Cylinders implements carparts {
    public void assemble() {
        System.out.println("Assembling cylinders");
    }
}

class body implements carparts { // Leaf
    public void assemble() {
        System.out.println("Assembling body");
    }
}

class wheels implements carparts { // Leaf
    public void assemble() {
        System.out.println("Assembling wheels");
    }
}

class transmission implements carparts { // Leaf
    public void assemble() {
        System.out.println("Assembling transmission");
    }
}

// Composite class - Engine (which now contains sub-parts)
class engine implements carparts { // Composite
    private List<carparts> engineParts = new ArrayList<>();

    public engine() {
        // Add sub-parts of the engine
        engineParts.add(new Pistons());
        engineParts.add(new Cylinders());
    }

    public void add(carparts part) {
        engineParts.add(part);
    }

    @Override
    public void assemble() {
        System.out.println("Assembling engine with its sub-parts:");
        for (carparts part : engineParts) {
            part.assemble(); // Calls assemble on each sub-part of the engine
        }
        System.out.println("Engine assembly completed");
    }
}

// Composite class - Car
class car implements carparts { // Composite
    private List<carparts> carParts = new ArrayList<>();

    public void add(carparts part) {
        carParts.add(part);
    }

    @Override
    public void assemble() {
        System.out.println("Assembling car");
        for (carparts part : carParts) {
            part.assemble(); // Calls assemble on each part of the car
        }
        System.out.println("Car assembly completed");
    }
}
