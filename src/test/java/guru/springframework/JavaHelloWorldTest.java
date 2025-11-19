package guru.springframework;


import org.junit.jupiter.api.Test;

public class JavaHelloWorldTest {

    @Test
    void getHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assert("Hello World".equals(javaHelloWorld.getHello()));
    }
}
