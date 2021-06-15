package no.vegard.ferdig;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * Just a POJO
 */
public class Car {

    public static void main(String[] args) {
        List<Integer> myIntList = List.of(1,2,3,4,5);


    }

    private String regNo;
    private String color;
    private int hp;

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Car(String regNo, String color, int hp) {
        this.regNo = regNo;
        this.color = color;
        this.hp = hp;
    }

}
