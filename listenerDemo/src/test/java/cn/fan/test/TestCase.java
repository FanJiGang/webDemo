package cn.fan.test;

import org.junit.Test;

public class TestCase {
    @Test
    public void testListener(){
        A a = new A();
        a.printNum(new B());
    }
}
