import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class GreeterTest {

    @Test
    public void greet_returnHelloName() {
        Greeter greeter = new Greeter();
        String actual = greeter.greet("Sander");
        assertThat(actual).isEqualTo("Hello Sander!");
    }

    @Test
    public void greet_givenNull_thenExplode() {
        Greeter greeter = new Greeter();
        assertThatThrownBy(() -> greeter.greet(null)).hasMessageMatching("Screw you");

    }

}