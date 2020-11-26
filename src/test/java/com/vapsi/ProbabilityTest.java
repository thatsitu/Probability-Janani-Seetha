package com.vapsi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProbabilityTest {

    @Test
    public void ShouldReturnTrueWhenTwoProbabilityAreEqual() {
        Probability probability1 = new Probability(0.5);
        Probability probability2 = new Probability(0.5);
        assertEquals(true, (probability1.equals(probability2)));
    }

        @Test
        public void ShouldReturnFalseWhenTwoProbabilityAreNotEqual(){
            Probability probability1 = new Probability(0.1);
            Probability probability2 = new Probability(0.5);
            assertEquals(false,(probability1.equals(probability2)));

    }


}
