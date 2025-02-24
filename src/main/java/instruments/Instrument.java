package instruments;

abstract class Instrument {
    protected static int loadCount = 0;
    protected static int instanceCount = 0;

    protected String name;
    protected double price;
    abstract void play();
    static {
        loadCount++;
    }

    protected Instrument(double price, String name) {
        this.price = price;
        this.name = name;
        instanceCount++;
    }
}
