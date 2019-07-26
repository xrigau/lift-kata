import org.junit.Test;

public class ServiceTest {

    @Test
    public void passengerCanCallElevator() {
        Service service = new Service(new Elevator());

        Passenger passenger = new Passenger(0, 2);
        service.serve(passenger);

        assertEquals()
    }
}
