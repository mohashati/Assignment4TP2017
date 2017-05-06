package za.ac.cput.oop;

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.oop.PLK.Obey.Rectangle;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by tmoshasha on 04/27/2017.
 */
public class TestPLKObey extends TestCase{

    Rectangle rectangle = new Rectangle(100.00, 100.00);
    //  rectangle.setWidth(100.00);



    @Test
    public void testWidth()
    {

        assertEquals(100.00, rectangle.getWidth(rectangle));
    }


    @Test
    public void testHeight()
    {

        assertEquals(100.00, rectangle.getHeight(rectangle));
    }





    @Test

    public void testAreaSquare()
    {
        assertEquals(10000.00, rectangle.area(rectangle));
    }
}
