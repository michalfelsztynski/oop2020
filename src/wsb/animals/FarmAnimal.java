package wsb.animals;

import wsb.Edible;

public class FarmAnimal extends Animal implements Edible {
    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void eat() throws Exception {
        System.out.println("that was yuammy");
        this.setWeight(0D);
    }
}
