package com.example.javaeight.references;

import com.example.javaeight.SpaceShip;
import org.junit.jupiter.api.Test;

class InstanceMethodReference {

    interface DoSomething{
        void doStuff();
    }

    @Test
    void testInstanceMethodRef(){
        SpaceShip spaceShip = new SpaceShip();
        DoSomething doSomething = spaceShip::flyAway;
        doSomething.doStuff();
    }

}
