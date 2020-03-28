package wsb;

public interface Soldable {
    void sell(Human buyer, Human seller, Double price) throws Exception;
}
