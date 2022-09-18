package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    void exampleTest0(){
        Assertions.assertTrue(new Random().nextInt()>1);
    }

    @Test
    void exampleTest1(){
        Assertions.assertTrue(new Random().nextInt()>2);
    }
}
