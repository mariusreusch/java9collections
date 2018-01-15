package ch.zuehlke.mare.java9collections;

import org.assertj.core.api.ThrowableAssert;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class Java9SetTest {

    @Test
    public void buildSetWithNewStaticMethod_twoStrings_setWithExactlyTwoElements() {
        Set<String> names = Set.of("Peterchen", "Klaus");

        assertThat(names).hasSize(2).containsExactlyInAnyOrder("Peterchen", "Klaus");
    }

    @Test
    public void tryToAddDuplicate_twoStrings_setWithExactlyTwoElements() {
        String lottchen = "Lottchen";

        ThrowingCallable tryToAddDasDoppelteLottchen= () -> Set.of(lottchen, lottchen);

        assertThatThrownBy(tryToAddDasDoppelteLottchen).isInstanceOf(IllegalArgumentException.class);
    }
}