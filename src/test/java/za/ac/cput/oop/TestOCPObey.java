package za.ac.cput.oop;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.oop.OCP.Obey.StudentInfo;
import za.ac.cput.oop.config.AppConfig;

/**
 * Created by tmoshasha on 04/27/2017.
 */
public class TestOCPObey {

    private ApplicationContext ctx;
    private StudentInfo s;
    private StudentInfo s2;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        s = (StudentInfo)ctx.getBean("OCPObey");
        s2 = (StudentInfo)ctx.getBean("OCPObey2");
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testFootballer()
    {
        Assert.assertEquals("Students position is left wing", s.Sport());
    }

    @Test
    public void testRugbyPlayer()
    {
        Assert.assertEquals("Student is a flanker", s2.Sport());
    }


}
