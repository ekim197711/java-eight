package com.example.javaeight.streams;

import com.example.javaeight.SpaceShip;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {

    List<SpaceShip> ships(){
        List<SpaceShip> ships = new ArrayList<>();
        ships.add(new SpaceShip("Round", "Mike", 50));
        ships.add(new SpaceShip("Pyramid", "Susan", 65));
        ships.add(new SpaceShip("Cube", "Ingrid", 75));
        ships.add(new SpaceShip("Banana", "Søren", 15));
        ships.add(new SpaceShip("Owl", "Lone", 25));
        ships.add(new SpaceShip("Stork", "Ib", 90));
        ships.add(new SpaceShip("Cone", "Pia", 80));
        return ships;
    }

    @Test
    void testStreams(){
        List<SpaceShip> ships = ships();

        List<String> listOfCaptains = ships
                .stream()
                .filter((ship) -> ship.getFuel() >= 50)
                .map((ship) -> ship.getCaptain())
                .sorted((captain1, captain2) -> captain1.compareTo(captain2))
                .collect(Collectors.toList());

        listOfCaptains.forEach(System.out::println);

    }
    @Test
    void testParallelStreams(){
        List<SpaceShip> ships = ships();

        List<String> listOfCaptains = ships
                .parallelStream()
                .filter((ship) -> ship.getFuel() >= 50)
                .map((ship) -> ship.getCaptain())
                .sorted((captain1, captain2) -> captain1.compareTo(captain2))
                .collect(Collectors.toList());

        listOfCaptains.forEach(System.out::println);

    }
}
