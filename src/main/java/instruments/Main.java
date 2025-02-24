package instruments;

public class Main {
    public static void main(String[] args) {
        Instrument windInstrument = new WindInstrument(321, "flute");
        System.out.println("Después de referenciar la clase instruments.Instrument por primera vez, esta se ha cargado " + Instrument.loadCount + " vez.");
        windInstrument.play();

        Instrument stringInstrument = new StringInstrument(200.99, "guitar");
        stringInstrument.play();

        Instrument percussionInstrument = new PercussionInstrument(2599.99, "drums");
        percussionInstrument.play();

        System.out.println("Después de instanciar tres objetos, la clase instruments.Instrument se ha cargado " + Instrument.loadCount + " vez.");
        System.out.println("La clase instruments.Instrument se ha heredado en " + Instrument.instanceCount + " instancias.");
    }
}
