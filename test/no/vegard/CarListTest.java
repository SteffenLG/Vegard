package no.vegard;

import no.vegard.CarList;
import no.vegard.ferdig.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class CarListTest {
    CarList carList;


    @BeforeEach
    void setUp() {
        carList = new CarList();
        carList.addAll(List.of(
                new Car("AS23450", "Blue", 150),
                new Car("AS23456", "Red", 250),
                new Car("AS23420", "Black", 350)
        ));
    }

    @Test
    void testAddAll() {
        
    }

}
