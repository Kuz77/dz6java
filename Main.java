package dz6go;

import dz6.Elevator;

public class Main {
    public static void main(String[] args) {
        dz6.Elevator elevator = new Elevator(2, 10);
        elevator.move(7);
        System.out.println(elevator);
    }
}
