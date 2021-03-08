package com.example.javaeight.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

class OptionalTest {

    @Test
    void testOptional(){
        Optional<String> message = Optional.empty();
        System.out.println("is present " + message.isPresent());
        String result = message.orElse("You have no new messages!");
        System.out.println(result);

        message = Optional.of("Remember to buy Milk and flour!");
        String otherresult = message.orElse("You have no new messages!");
        System.out.println(otherresult);

    }
}
