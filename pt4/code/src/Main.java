import java.util.ArrayList;

public class Main {

    public static void simulation(int maxClients, int maxCashiers) {

        Queue<Client> q = new Queue<>();
        ArrayList<Client> servedClients = new ArrayList<>();
        Cashier[] cashiers = new Cashier[maxCashiers];
        int totalTime = 0, meanTime = 0;

        for (int i = 0; i < maxCashiers; i++) cashiers[i] = new Cashier();

        q.insert(new Client(totalTime));

        while (!q.isEmpty() && servedClients.size() != 100) {

            for (int j = 0; j < maxCashiers; j++) {
                if (cashiers[j].getClient() == null) {
                    cashiers[j].setClient(q.extract());
                } else {
                    cashiers[j].substractTime(15);
                    if (cashiers[j].getTime() == 0) {
                        cashiers[j].getClient().setDepartureTime(totalTime);
                        meanTime += cashiers[j].getClient().getTimeSpent();
                        servedClients.add(cashiers[j].getClient());
                        cashiers[j].setClient(q.extract());
                        cashiers[j].setTime(120);
                    }
                }
            }

            totalTime += 15;
            q.insert(new Client(totalTime));

        }

        System.out.println("{ Cashiers => " + maxCashiers + ", Clients => " + maxClients + ", Mean time spent => " + meanTime / maxClients + "}");

    }

    public static void main(String[] args) {
        simulation(100, 1);
        simulation(100, 2);
        simulation(100, 3);
        simulation(100, 4);
        simulation(100, 5);
        simulation(100, 6);
        simulation(100, 7);
        simulation(100, 8);
        simulation(100, 9);
        simulation(100, 10);
    }

}
