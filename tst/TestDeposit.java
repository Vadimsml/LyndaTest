import org.junit.Test;
import java.awt.*;
import static org.junit.Assert.*;

public class TestDeposit {

    @Test
    public void testDeposit(){


        BancAccount account= new BancAccount ();
        int inputValue = 50;
        int expectedValue = 0;
        account.deposite(inputValue);
        expectedValue = account.getBalance();
        assertEquals(expectedValue,inputValue);
    }

}
