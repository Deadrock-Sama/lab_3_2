package humans;

import clothes.ClothesElement;
import transport.ITransport;

import java.util.HashMap;

public class Scuperfild extends Human{

    private HashMap<Emotion, String> emotions = new HashMap<>();

    public Scuperfild() {
        emotions.put(Emotion.HAPPY, "Скупперфильд от души радовался");
    }
    public void say(String phrase) {
        System.out.println("\"" +  phrase + "\", - сказал Скуперфильд"  );
    }

    public void feel(Emotion emotion)
    {
        System.out.println(emotions.get(emotion));
    }

    @Override
    public void wear(ClothesElement clothesElement) {
        super.wear(clothesElement);
        System.out.println("Скупперфильд надел " + clothesElement.toString());
    }

    @Override
    public void getInTransport(ITransport ITransport) {
        super.getInTransport(ITransport);
        System.out.println("Скупперфильд сел в " + ITransport.toString());
    }

    @Override
    protected void checkHappiness(int happiness) {
        if (happiness >= 100) {

            System.out.println("Столько всего хорошего произошло и Скупперфильд был счастлив!");

        }
    }

    @Override
    public String toString() {
        return "Скупперфильд";
    }
}
