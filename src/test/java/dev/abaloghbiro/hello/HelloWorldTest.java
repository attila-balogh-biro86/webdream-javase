package dev.abaloghbiro.hello;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {



    private HelloWorld h = new HelloWorld();


    @Test
    public void testDisplayingMessage(){

        Assert.assertEquals("Hello Attila",h.displayMessage("Attila"));
    }
}
