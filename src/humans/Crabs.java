package humans;

import transport.ITransport;

public class Crabs extends Human{

    public void ride(ITransport transport) {

        System.out.println("Крабс ведет " + transport.toString());
        transport.ride();

    }

    @Override
    public void getInTransport(ITransport transport) {
        super.getInTransport(transport);
        System.out.println("Крабс сел в " + transport.toString());
    }

    @Override
    protected void checkHappiness(int happiness) {
        if (happiness >= 100) {

            System.out.println("Столько всего хорошего произошло и Крабс был счастлив!");

        }
    }
}
