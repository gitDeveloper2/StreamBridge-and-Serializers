package com.gitDeveloper2.cloudFunctions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FunctionsTests {
    private Functions functions=new Functions();
@Test
        void testUppercase() {
    String input="Spring Cloud";
    String expectedValue = "SPRING CLOUD";

    String actualOutput=functions.uppercase().apply(input);
    assertThat(actualOutput).isEqualTo(expectedValue);
}
    @Test
    void testReverse() {
        String input="Spring Cloud";
        String expectedValue = "duolC gnirpS";

        String actualOutput=functions.reverse().apply(input);
        assertThat(actualOutput).isEqualTo(expectedValue);
    }
    @Test
    void testUppercaseThenReverse() {
        String input="Spring Cloud";
        String expectedValue = "DUOLC GNIRPS";

        String actualOutput=functions.uppercase().andThen(functions.reverse()).apply(input);
        assertThat(actualOutput).isEqualTo(expectedValue);
    }
}
