package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    
    
    @Test
    public void testApp() {
        App app = new App();
        assertEquals(App.HELLO, app.sayHello());
    }
}
