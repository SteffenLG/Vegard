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
        Assertions.assertThrows(RuntimeException.class, () -> carList.add(new Car("AS23450", "Blue", 150)));
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
        Assertions.assertTrue(carList.contains(new Car("AS23450", "Blue", 150)));
        Assertions.assertTrue(carList.contains(new Car("AS23456", "Red", 250)));
        Assertions.assertTrue(carList.contains(new Car("AS23420", "Black", 350)));
    }

    @Test
    void testSize() {
        Assertions.assertEquals(0, carList.size());
        carList.addAll(List.of(
                new Car("AS23450", "Blue", 150),
                new Car("AS23456", "Red", 250),
                new Car("AS23420", "Black", 350)
        ));
        Assertions.assertEquals(3, carList.size());
    }

    @Test
    void testRemove() {
        carList.addAll(List.of(
                new Car("AS23450", "Blue", 150),
                new Car("AS23456", "Red", 250),
                new Car("AS23420", "Black", 350)
        ));
        Assertions.assertEquals(3, carList.size());
        Assertions.assertEquals(
                new Car("AS23456", "Red", 250),
                carList.remove(new Car("AS23456", "Red", 250))
        );
    }

    @Test
    void testGet() {
        carList.add(new Car("AS23456", "Red", 250));
        Assertions.assertEquals(new Car("AS23456", "Red", 250), carList.get(0));
    }

    @Test
    void testRemoveString() {
        carList.add(new Car("AS23456", "Red", 250));
        Assertions.assertEquals(new Car("AS23456", "Red", 250), carList.remove("AS23456"));
        Assertions.assertEquals(null, carList.remove("AS23456"));
    }

    @Test
    void testRemoveAll() {
        carList.addAll(List.of(
                new Car("AS23450", "Blue", 150),
                new Car("AS23456", "Red", 250),
                new Car("AS23420", "Black", 350)
        ));

        carList.removeAll(List.of(
                new Car("AS23450", "Blue", 150),
                new Car("AS23456", "Red", 250))
        );

        Assertions.assertEquals(1, carList.size());
        Assertions.assertEquals(new Car("AS23420", "Black", 350), carList.get(0));
    }


}
