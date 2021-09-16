import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
public class DictionaryTest {


    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void test() {
        fail("Not yet implemented");
    }

    Dictionary dict = new Dictionary("Undico");

    @Test public void testDictionaryName() {
        assertThat(dict.getUndictionnaire(), equalTo("Example"));


    @Test public void testOneTranslation() {
                dict.addTranslation("contre", "against");
                assertThat(dict.getTranslation("contre"), equalsTo("against"));
        }
    
}
