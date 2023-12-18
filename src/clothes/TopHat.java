package clothes;

import humans.Human;

public class TopHat extends Hat{

    public TopHat(Human owner) {
        super(owner);
    }

    @Override
    public String toString() {
        return "Шляпа цилиндр";
    }
}
