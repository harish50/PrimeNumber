import org.junit.Assert;
import org.junit.Test;

public class PrimeNumberTest {
    @Test
    public void checkForPrimeForOne(){
        PrimeCheck primeCheck = new PrimeCheck();
        Assert.assertEquals(false,primeCheck.isPrime(1));
    }

    @Test
    public void checkForPrimeForTwo(){
        PrimeCheck primeCheck   = new PrimeCheck();
        Assert.assertEquals(true,primeCheck.isPrime(2));
        Assert.assertEquals(false,primeCheck.isPrime(98));
        Assert.assertEquals(true,primeCheck.isPrime(101));
    }
}
