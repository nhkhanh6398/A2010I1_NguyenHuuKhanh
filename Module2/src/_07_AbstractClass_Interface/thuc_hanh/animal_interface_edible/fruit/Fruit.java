package _07_AbstractClass_Interface.thuc_hanh.animal_interface_edible.fruit;

import _07_AbstractClass_Interface.thuc_hanh.animal_interface_edible.edible.Edible;

public abstract class Fruit implements Edible {
    @Override
    public String howToEat() {
        return "Apple could be slided";
    }
}
