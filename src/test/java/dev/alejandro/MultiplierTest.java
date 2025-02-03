package dev.alejandro;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;              
import static org.hamcrest.Matchers.equalTo;

public class MultiplierTest {

    @Test
    @DisplayName("It shold return the multiplication table of a given number")
    public void test_returns_multiplication_table_of_a_given_number(){

        Multiplier multiplier = new Multiplier();

        int n = 5;
        multiplier.createMultiplicationTable(n);

        List<String> expected = List.of(
            n + "x1=" + n*1,
            n + "x2=" + n*2,
            n + "x3=" + n*3,
            n + "x4=" + n*4,
            n + "x5=" + n*5,
            n + "x6=" + n*6,
            n + "x7=" + n*7,
            n + "x8=" + n*8,
            n + "x9=" + n*9,
            n + "x10=" + n*10
        );

        assertThat(multiplier.getMultiplicationTable(), is(equalTo(expected)));
    }

}
