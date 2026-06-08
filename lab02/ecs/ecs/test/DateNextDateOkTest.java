import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class DateNextDateOkTest {

    private final int year;
    private final int month;
    private final int day;
    private final Date expected;

    public DateNextDateOkTest(int year, int month, int day, Date expected) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {1700, 6, 20, new Date(1700, 6, 21)},
            {2005, 4, 15, new Date(2005, 4, 16)},
            {1901, 7, 20, new Date(1901, 7, 21)},
            {3456, 3, 27, new Date(3456, 3, 28)},
            {1500, 2, 17, new Date(1500, 2, 18)},
            {1700, 6, 29, new Date(1700, 6, 30)},
            {1800, 11, 29, new Date(1800, 11, 30)},
            {3453, 1, 29, new Date(3453, 1, 30)},
            {444, 2, 29, new Date(444, 3, 1)},
            {2005, 4, 30, new Date(2005, 5, 1)},
            {3453, 1, 30, new Date(3453, 1, 31)},
            {3456, 3, 30, new Date(3456, 3, 31)},
            {1901, 7, 31, new Date(1901, 8, 1)},
            {3453, 1, 31, new Date(3453, 2, 1)},
            {3456, 12, 31, new Date(3457, 1, 1)}
        });
    }

    @Test
    public void testNextDateOk() {
        assertEquals(expected, new Date(year, month, day).nextDate());
    }
}