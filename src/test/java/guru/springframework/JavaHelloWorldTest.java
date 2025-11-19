package guru.springframework;


import org.junit.Test;

public class JavaHelloWorldTest {

    @Test
    public void getHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assert("Hello World".equals(javaHelloWorld.getHello()));
    }
}
