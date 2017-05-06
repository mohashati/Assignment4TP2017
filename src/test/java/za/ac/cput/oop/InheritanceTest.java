package za.ac.cput.oop;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.oop.Inheritance.SoccerPlayer;
import za.ac.cput.oop.Inheritance.Striker;
import za.ac.cput.oop.config.AppConfig;

/**
 * Created by tmoshasha on 04/27/2017.
 */
public class InheritanceTest {

    private ApplicationContext ctx;
    private static SoccerPlayer sp;
    public InheritanceTest() {
    }
    @Before
    public void setUp() throws Exception
    {
         ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        sp = (Striker)ctx.getBean("inherit");
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testPassInheritance()
    {
        Assert.assertEquals("pass", sp.pass());
    }

    @Test
    public void testTacklesInheritance()
    {
        Assert.assertEquals("Tackles", sp.tackle());
    }

    @Test
    public void testScoresInheritance()
    {
        Assert.assertEquals("Scores", sp.score());
    }

    @Test
    public void testSkillInheritance()
    {
        Assert.assertEquals("Skills a player", sp.skills());
    }
}
