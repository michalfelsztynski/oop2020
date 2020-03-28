package wsb.animals;

import wsb.Edible;

public class Pet extends Animal implements Edible {
    public Pet(String species) {
        super(species);
    }

    @Override
    public void eat() throws Exception {
        System.out.println("cannot eat a Pet !");
    }
}
