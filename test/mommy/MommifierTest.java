package mommy;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MommifierTest {

    private Mommifier mommifier;

    @Before
    public void setUp() throws Exception {
        mommifier = new Mommifier();
    }

    @Test
    public void shouldReturnEmptyStringWhenInputNothing() throws Exception {
        assertEquals("",mommifier.mommify(""));
    }

    @Test
    public void shouldReturnSameConsonantWhenInputIsConsonant() throws Exception {
        assertEquals("c", mommifier.mommify("c"));
    }

    @Test
    public void shouldReturnMommyWhenInputIsVowelA() throws Exception {
        assertEquals("mommy", mommifier.mommify("a"));
    }
    @Test
    public void shouldReturnMommyWhenInputIsVowelE() throws Exception {
        assertEquals("mommy", mommifier.mommify("e"));
    }
    @Test
    public void shouldReturnMommyWhenInputIsVowelI() throws Exception {
        assertEquals("mommy", mommifier.mommify("i"));
    }

    @Test
    public void shouldReturnMommyWhenInputIsVowelO() throws Exception {
        assertEquals("mommy", mommifier.mommify("o"));
    }
    @Test
    public void shouldReturnMommyWhenInputIsVowelU() throws Exception {
        assertEquals("mommy", mommifier.mommify("u"));
    }

    @Test
    public void shouldReturnSameStringWhenInputStringDoNotContainVowels() throws Exception {
        assertEquals("fsty", mommifier.mommify("fsty"));
    }
    @Test
    public void shouldChangeVowelsToMommyWhenInputStringHasMoreThanThirtyPercentVowels() throws Exception {
        assertEquals("dmommyf", mommifier.mommify("def"));
    }
    @Test
    public void shouldNotChangeVowelsToMommyWhenInputStringHasLessThanThirtyPercentVowels() throws Exception {
        assertEquals("hard", mommifier.mommify("hard"));
    }
    @Test
    public void shouldChangeContinuousVowelsToMommyWhenInputStringHasMoreThanThirtyPercentVowels() throws Exception {
        assertEquals("dmommyf", mommifier.mommify("deef"));
    }
    @Test
    public void shouldChangeContinuousVowelsToMommyWhenInputStringHasMoreThanThirtyPercentVowelsAtTrailing() throws Exception {
        assertEquals("dmommyfmommy", mommifier.mommify("deefeee"));
    }
    @Test
    public void shouldChangeContinuousVowelsToMommyWhenInputStringHasMoreThanThirtyPercentVowelsMoreGroups() throws Exception {
        assertEquals("dmommyfmommyfmommy", mommifier.mommify("deefaafeeo"));
    }

    @Test
    public void shouldChangeContinuousVowelsToMommyWhenInputStringHasMoreThanThirtyPercentVowelsMoreGroupsWithAMommy() throws Exception {
        assertEquals("mommymmommymmy", mommifier.mommify("oomommy"));
    }


}
