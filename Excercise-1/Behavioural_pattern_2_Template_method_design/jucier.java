abstract class jucier {
    public final void makeJuice() {
        cutFruits();
        BlendFruits();
        addsugar();
        addwater();
    }
    abstract void cutFruits();
    abstract void addwater();

    void addsugar() {
        System.out.println("adding sugar");
    }
    void BlendFruits(){
        System.out.println("Blending fruits");
    }
}
