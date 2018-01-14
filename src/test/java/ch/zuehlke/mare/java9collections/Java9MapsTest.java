package ch.zuehlke.mare.java9collections;

import org.junit.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class Java9MapsTest {

    @Test
    public void buildMapdWithNewStaticMethod_twoEntries_mapWithExactlyToEntries() {
        Map<Long, String> stringMap = Map.of(123L, "Peterchen", 844L, "Klaus");

        assertThat(stringMap).hasSize(2).containsOnlyKeys(123L, 844L);
    }
}