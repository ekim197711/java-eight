package com.example.javaeight.references;

import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;

class MethodReferenceTest {

    interface NoiseMaker{
        void noise();
    }

    static void MetallicNoise(){
        System.out.println("Klliinnnngg klaaanggg diiing");
    }

    @Test
    void testMethodRef(){
        NoiseMaker nm = MethodReferenceTest::MetallicNoise;
        nm.noise();
    }

    static int someMath(int a, int b){
        return (a + b)*10;
    }

    @Test
    void testBiFunction(){
        BiFunction<Integer, Integer, Integer> function = MethodReferenceTest::someMath;
        Integer result = function.apply(10, 20);
        System.out.println("Result " + result);
    }
}
