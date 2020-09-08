import org.junit.Assert;
import org.junit.Test;

public class RangeParserShould {

    @Test
    public void translateHelloWorld(){
        Assert.assertEquals("Hola mundo", RangeParser.parse("Hello world"));
    }
}
