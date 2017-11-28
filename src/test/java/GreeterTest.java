import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GreeterTest {

    @Test
    public void greet_returnHelloName(){
        Greeter greeter = new Greeter();
        String actual = greeter.greet("Sander");
        assertThat(actual).isEqualTo("Hello Sander!");
    }

}