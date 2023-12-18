import Situation.Situation;
import clothes.TopHat;
import humans.Crabs;
import humans.Emotion;
import humans.Scuperfild;
import transport.Car;
import transport.Quality;

public class Main {
    public static void main(String[] args) {

        Crabs crabs = new Crabs();
        Scuperfild scuperfild = new Scuperfild();

        Car car = new Car(crabs, Quality.CHIC);
        TopHat topHat = new TopHat(scuperfild);

        scuperfild.say("С ослами пора кончать. В городе появился брехенвильский скупец Скуперфильд. За последствия не отвечаю. Крабс");
        scuperfild.wear(topHat);

        scuperfild.getInTransport(car);
        crabs.getInTransport(car);

        crabs.ride(car);

        scuperfild.feel(Emotion.HAPPY);

        Situation goodCar = new Situation("бесплатно прокатится на шикарной машине", 25);
        Situation freeLunch = new Situation("пообедает на даровщинку", 25);
        Situation goodDeal = new Situation("собирался обтяпать, как он выражался, выгодное дельце", 50);

        goodCar.inflictOnHuman(scuperfild);
        freeLunch.inflictOnHuman(scuperfild);
        goodDeal.inflictOnHuman(scuperfild);

    }
}