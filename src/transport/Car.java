package transport;

import humans.Human;

public class Car implements ITransport{
    private Human owner;
    private Human[] seats = new Human[4];
    private int peopleInside = 0;
    public Quality quality;

    @Override
    public void ride() {
        System.out.println("Машина едет!");
    }

    public void takeSeat(Human human) {
        //here will be ex
        if (peopleInside < seats.length) {
            seats[peopleInside] = human;
            peopleInside++;
        }

    }
    public Car(Human owner, Quality quality){
        this.owner = owner;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Машина";
    }
}
