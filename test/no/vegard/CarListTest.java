package no.vegard;

import no.vegard.ferdig.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.List;

public class CarListTest {
    CarList carList;

    @BeforeEach
    void setUp() {
        carList = new CarList();
    }

    @Test
    void testAdd() {
        carList.add(new Car("AS23450", "Blue", 150));
        Assertions.assertTrue(carList.contains(new Car("AS23450", "Blue", 150)));
    }

    @Test
    void testAddUnique() {
        carList.add(new Car("AS23450", "Blue", 150));
        Assertions.assertThrows(Exception.class, () -> carList.add(new Car("AS23450", "Blue", 150)));
    }

    @Test
    void testContains() {
        carList.add(new Car("AS23450", "Blue", 150));
        Assertions.assertTrue(carList.contains(new Car("AS23450", "Blue", 150)));
        Assertions.assertFalse(carList.contains(new Car("AS2345", "Blue", 150)));
    }

    @Test
    void testAddAll() {
        carList.addAll(List.of(
                new Car("AS23450", "Blue", 150),
                new Car("AS23456", "Red", 250),
                new Car("AS23420", "Black", 350)
        ));

    }

}
