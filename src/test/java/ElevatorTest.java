import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElevatorTest {

    private final Elevator elevator = new Elevator();

    @Test
    public void move_whenGoingFrom0To2_return2() {
        assertEquals(2, elevator.move(0, 2));
    }

    @Test
    public void move_whenGoingFrom2To0_return_minus2() {
        assertEquals(-2, elevator.move(2, 0));
    }

    @Test
    public void getCurrentFloor_whenAtFloor0_return0() {
        assertEquals(0, elevator.getCurrentFloor());
    }

    @Test
    public void getCurrentFloor_whenWeMoveElevatorTo2_return2() {
        elevator.move(0, 2);
        assertEquals(2, elevator.getCurrentFloor());
    }
}
