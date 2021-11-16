import java.util.Objects;

public class Client {

    private int arrivalTime;
    private int departureTime;

    public Client(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getTimeSpent() {
        return this.getDepartureTime() - this.getArrivalTime();
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Client{" +
                "arrivalTime=" + arrivalTime +
                ", departureTime=" + departureTime +
                ", timeSpent=" + getTimeSpent() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return arrivalTime == client.arrivalTime && departureTime == client.departureTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrivalTime, departureTime);
    }

}
