package advancedConcepts;

public class AnimalPrinter< P extends Animal> {

    public void print(P p) {
        p.print();
    }
}
