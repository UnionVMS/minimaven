package fish.focus.test.maven.minimaven;

import fish.focus.test.maven.minimaven.HelloWorld;
import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldIT {
  
  
  
  @Test
  public void helloIT() {
    assertEquals(HelloWorld.hello("world of IT "), "Hello world  of IT ");
    
  }
  
}
