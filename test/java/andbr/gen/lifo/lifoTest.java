package andbr.gen.lifo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class lifoTest {

    @Test
    public void intCreationTest(){
        int int1 = 1;
        int int2 = 2;
        int int3 = 3;
        int int4 = 4;
        LIFO<Integer> lifo = new LIFO();
        lifo.push(int1);
        lifo.push(int3);
        lifo.push(int2);
        lifo.push(int4);
        int size = lifo.getSize();

        //initial
        Assertions.assertEquals(4,size);

        //1 pop
        int pop1 = lifo.pop();
        size = lifo.getSize();
        Assertions.assertEquals(4,pop1);
        Assertions.assertEquals(3,size);
    }
}
