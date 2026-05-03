package main.java.org.manvendra.Basics.UML;

import java.util.ArrayList;
import java.util.List;

class Room {
    private String name;

    Room(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class House {
    private String name;
    private List<Room> rooms;

    public House(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
        rooms.add(new Room("Drawing Room"));
        rooms.add(new Room("Wash Room"));
    }

    public void showRooms() {
        System.out.println("List of Rooms in " + name + " house:");
        for (Room room: rooms) {
            System.out.println(room.getName());
        }
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        House house = new House("RK Apartment");

        /*
        * If house is destroyed, then rooms are also destroyed
        * Room object can't exist independently
        * */
        house.showRooms();

    }
}
