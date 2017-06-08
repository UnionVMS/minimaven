package fish.focus.test.maven.minimaven;

import fish.focus.test.maven.minimaven.HelloWorld;
import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
  

  @Test
  public void helloTest() {
    assertEquals(HelloWorld.hello("world"), "Hello world");
    
  }
  
  @Test
  public void helloWorldTest() {
    HelloWorld hw = new HelloWorld();
    assertNotNull(hw);

  }
}
