/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

public class DemoTest {


    @Test
    public void test_isTriangle_01(){
        assertTrue(Demo.isTriangle(3, 4, 5));
    }
    @Test
    public void test_isTriangle_02(){
        assertTrue(Demo.isTriangle(5, 4, 3));
    }
    @Test
    public void test_isTriangle_03(){
        assertTrue(Demo.isTriangle(5, 5, 5));
    }
    @Test
    public void test_isTriangle_04(){
        assertFalse(Demo.isTriangle(0, 5, 5));
    }
    @Test
    public void test_isTriangle_05(){
        assertFalse(Demo.isTriangle(5, 0, 5));
    }
    @Test
    public void test_isTriangle_06(){
        assertFalse(Demo.isTriangle(5, 5, 0));
    }
    @Test
    public void test_isTriangle_07(){
        assertFalse(Demo.isTriangle(0, 5, 5));
    }
    @Test
    public void test_isTriangle_08(){
        assertFalse(Demo.isTriangle(0, 0, 5));
    }
    @Test
    public void test_isTriangle_09(){
        assertFalse(Demo.isTriangle(0, 0, 0));
    }
    @Test
    public void test_isTriangle_10(){
        assertFalse(Demo.isTriangle(-3, -4, -5));
    }
    @Test
    public void test_isTriangle_11(){
        assertFalse(Demo.isTriangle(10, -4, -5));
    }
    @Test

    public void main_Method_Test_Input1(){
        ByteArrayInputStream in = new ByteArrayInputStream("5\n12\n13\n".getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String consoleOutput = "Enter side 1: \n";
        consoleOutput += "Enter side 2: \n";
        consoleOutput += "Enter side 3: \n";
        consoleOutput += "This is a triangle.\n";


        assertEquals(consoleOutput, out.toString());
    }

    @Test
    public void main_Method_Test_Input2(){
        ByteArrayInputStream in = new ByteArrayInputStream("-5\n12\n13\n".getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String consoleOutput = "Enter side 1: \n";
        consoleOutput += "Enter side 2: \n";
        consoleOutput += "Enter side 3: \n";
        consoleOutput += "This is not a triangle.\n";


        assertEquals(consoleOutput, out.toString());
    }

}
