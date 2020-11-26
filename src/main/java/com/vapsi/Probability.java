package com.vapsi;

import java.util.Objects;

public class Probability {
    private double chances;

    public Probability(double chances) {
        this.chances = chances;
    }

    @Override
    public String toString() {
        return "Probability{" +
                "chances=" + chances +
                '}';
    }

   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(that.chances, chances) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(chances);
    }

}



