package com.example.javaeight.references;

import org.junit.jupiter.api.Test;

public class ConstructorReferenceTest {

    interface Engine {
        EngineSound getEngineSound(String engineSound);
    }

    class EngineSound {
        EngineSound(String engineSound) {
            System.out.print(engineSound);
        }
    }

    class CrewSound {
        CrewSound(String crewSound) {
            System.out.print(crewSound);
        }
    }

    @Test
    public void test() {
        Engine engine = EngineSound::new;
        EngineSound engineSound = engine.getEngineSound("Wroouuuummm");

    }

}
