package ch.zuehlke.mare.java9collections;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class SamsSortedHashSetTest {

    @Test
    @Ignore
    public void setToString_setWithNumbers_fixOrder() {
        Set<String> numbers = Set.of("one", "two", "three", "four", "five");

        String numberAsString = numbers.toString();

        //TODO discuss
        assertThat(numberAsString).isEqualTo("[one, two, three, four, five]");
    }
}
