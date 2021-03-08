package com.example.javaeight.defaultmethods;

import org.junit.jupiter.api.Test;

public class DefaultMethodTest {

    interface FlyingObject{
        default void takeOff(){
            System.out.println("Swwuuuuusshhh");
        }

        default void land(){
            System.out.println("landing.... perfectly");
        }

        String destination();

    }

    @Test
    void testDefault(){
        FlyingObject fo = () -> "Mars";
        fo.takeOff();
        fo.land();
        System.out.println("The destination is " + fo.destination());
    }
}
