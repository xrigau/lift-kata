public class Elevator {

    private int currentFloor = 0;

    public int move(int sourceFloor, int destinationFloor) {
        currentFloor = destinationFloor;
        return destinationFloor - sourceFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

}

class Passenger {
    int destinationFloor;
    int currentFloor;

    public Passenger(int currentFloor, int destinationFloor) {
        this.currentFloor = currentFloor;
        this.destinationFloor = destinationFloor;
    }
}

class Service {

    public Service(Elevator elevator) {

    }

    public void serve(Passenger passenger) {

    }
}
