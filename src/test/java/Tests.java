import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
/**
 * Created by Oleg_Gondar on 8/15/2016.
 */
public class Tests {

    @Test
    public void alwaysTrue(){
        assertTrue(ForBuild.alwaysFalse());


    }

    @Test
    public void alwaysFalse(){

        assertFalse(ForBuild.alwaysTrue());

    }

}
