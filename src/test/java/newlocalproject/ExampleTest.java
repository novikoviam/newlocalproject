package newlocalproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    void  exampleTest0() {
        Assertions.assertFalse(2<1);
    }
    @Test
    void  exampleTest2() {
        Assertions.assertTrue(3<=3);
    }
    @Test
    void  exampleTest3() {
        Assertions.assertTrue(3>=3);
    }
}
