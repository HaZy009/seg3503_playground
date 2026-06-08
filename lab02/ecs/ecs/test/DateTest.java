import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

  @Test
  void tc01() {
    assertEquals(new Date(1700, 6, 21), new Date(1700, 6, 20).nextDate());
  }

  @Test
  void tc02() {
    assertEquals(new Date(2005, 4, 16), new Date(2005, 4, 15).nextDate());
  }

  @Test
  void tc03() {
    assertEquals(new Date(1901, 7, 21), new Date(1901, 7, 20).nextDate());
  }

  @Test
  void tc04() {
    assertEquals(new Date(3456, 3, 28), new Date(3456, 3, 27).nextDate());
  }

  @Test
  void tc05() {
    assertEquals(new Date(1500, 2, 18), new Date(1500, 2, 17).nextDate());
  }

  @Test
  void tc06() {
    assertEquals(new Date(1700, 6, 30), new Date(1700, 6, 29).nextDate());
  }

  @Test
  void tc07() {
    assertEquals(new Date(1800, 11, 30), new Date(1800, 11, 29).nextDate());
  }

  @Test
  void tc08() {
    assertEquals(new Date(3453, 1, 30), new Date(3453, 1, 29).nextDate());
  }

  @Test
  void tc09() {
    assertEquals(new Date(444, 3, 1), new Date(444, 2, 29).nextDate());
  }

  @Test
  void tc10() {
    assertEquals(new Date(2005, 5, 1), new Date(2005, 4, 30).nextDate());
  }

  @Test
  void tc11() {
    assertEquals(new Date(3453, 1, 31), new Date(3453, 1, 30).nextDate());
  }

  @Test
  void tc12() {
    assertEquals(new Date(3456, 3, 31), new Date(3456, 3, 30).nextDate());
  }

  @Test
  void tc13() {
    assertEquals(new Date(1901, 8, 1), new Date(1901, 7, 31).nextDate());
  }

  @Test
  void tc14() {
    assertEquals(new Date(3453, 2, 1), new Date(3453, 1, 31).nextDate());
  }

  @Test
  void tc15() {
    assertEquals(new Date(3457, 1, 1), new Date(3456, 12, 31).nextDate());
  }

  @Test
  void tc16() {
    assertThrows(IllegalArgumentException.class,
        () -> new Date(1500, 2, 31));
  }

  @Test
  void tc17() {
    assertThrows(IllegalArgumentException.class,
        () -> new Date(1500, 2, 29));
  }

  @Test
  void tc18() {
    assertThrows(IllegalArgumentException.class,
        () -> new Date(-1, 10, 20));
  }

  @Test
  void tc19() {
    assertThrows(IllegalArgumentException.class,
        () -> new Date(1458, 15, 12));
  }

  @Test
  void tc20() {
    assertThrows(IllegalArgumentException.class,
        () -> new Date(1975, 6, -50));
  }
}