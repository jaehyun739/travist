import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class sumTest {

    @Test
    public void sum() {
        sum s = new sum();
        assertEquals(3, s.sum(1,2));
    }

    @Test
    public void min() {
        sum s = new sum();
        assertEquals(-1, s.min(1,2));
    }

    @Test
    public void mul() {
        sum s = new sum();
        assertEquals(2, s.mul(1,2));
    }

    @Test
    public void div() {
        sum s = new sum();
        assertEquals(3, s.div(6,2));
    }
}