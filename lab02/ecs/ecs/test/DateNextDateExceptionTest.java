import static org.junit.Assert.assertThrows;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class DateNextDateExceptionTest {

    private final int year;
    private final int month;
    private final int day;

    public DateNextDateExceptionTest(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {1500, 2, 31},
            {1500, 2, 29},
            {-1, 10, 20},
            {1458, 15, 12},
            {1975, 6, -50}
        });
    }

    @Test
    public void testNextDateException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Date(year, month, day);
        });
    }
}