import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringsTest {

    @Test
    void stringMetod() {
        Strings strings = new Strings();

        String res = strings.stringMetod("e");
        String res2 = strings.stringMetod("");

        assertAll(
                () -> assertEquals("question", res),
                () -> assertEquals("IDK", res2)
        );
    }
}
