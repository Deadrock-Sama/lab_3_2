package humans;

import clothes.ClothesElement;
import transport.ITransport;

import java.util.HashSet;
import java.util.Set;

abstract public class Human {

    private Set<ClothesElement> clothes = new HashSet<>();
    private int happiness = 0;
    public void getInTransport(ITransport ITransport) {
        ITransport.takeSeat(this);
    }

    public void addHappiness(int happiness) {
        this.happiness += happiness;
        checkHappiness(this.happiness);

    }

    abstract protected void checkHappiness(int happiness);
    public void wear(ClothesElement clothesElement) {

        clothes.add(clothesElement);

    }

}
