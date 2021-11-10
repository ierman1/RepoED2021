public class Cashier {

    private Client client;
    private int time;

    public Cashier() {
        this.setTime(120);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void substractTime(int time) {
        this.setTime(this.getTime() - time);
    }

}
