package ch.zuehlke.mare.java9collections;

import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class Java9ListTest {

    @Test
    public void buildListWithNewStaticMethod_twoStrings_listWithExactlyTwoElements() {
        List<String> names = List.of("Peterchen", "Klaus");

        assertThat(names).hasSize(2).containsExactly("Peterchen", "Klaus");
    }

    @Test
    public void tryToAddElementToList_listWithTwoElements_throwsUnsupportedOperationException() {
        List<String> names = List.of("Peterchen", "Klaus");

        ThrowingCallable tryToAdd = () -> names.add("Manni");

        assertThatThrownBy(tryToAdd).isInstanceOf(UnsupportedOperationException.class);
    }

    @Test
    public void tryToAddNullToList_nullObject_throwsUnsupportedOperationException() {
        Object nullIsNotAllowed = null;
        
        ThrowingCallable tryToAddNull = () -> List.of("Peterchen", nullIsNotAllowed);

        assertThatThrownBy(tryToAddNull).isInstanceOf(NullPointerException.class);
    }
}