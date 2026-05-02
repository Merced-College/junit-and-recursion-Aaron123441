//This confuses me
package java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RecursionProblemsTest {

   // ---------------- count8 ----------------

   @Test
   public void testCount8_single() {
      assertEquals(1, RecursionProblems.count8(8));
   }

   @Test
   public void testCount8_basic() {
      assertEquals(2, RecursionProblems.count8(818));
   }

   @Test
   public void testCount8_double8() {
      assertEquals(4, RecursionProblems.count8(8818));
   }

   @Test
   public void testCount8_none() {
      assertEquals(0, RecursionProblems.count8(123));
   }

   // ---------------- countHi ----------------

   @Test
   public void testCountHi_basic() {
      assertEquals(1, RecursionProblems.countHi("xxhixx"));
   }

   @Test
   public void testCountHi_multiple() {
      assertEquals(2, RecursionProblems.countHi("xhixhix"));
   }

   @Test
   public void testCountHi_exact() {
      assertEquals(1, RecursionProblems.countHi("hi"));
   }

   // ---------------- countHi2 ----------------

   @Test
   public void testCountHi2_basic() {
      assertEquals(1, RecursionProblems.countHi2("ahixhi"));
   }

   @Test
   public void testCountHi2_ignoreX() {
      assertEquals(0, RecursionProblems.countHi2("xhixhi"));
   }

   @Test
   public void testCountHi2_mixed() {
      assertEquals(2, RecursionProblems.countHi2("ahibhi"));
   }

   // ---------------- strCount ----------------

   @Test
   public void testStrCount_cat() {
      assertEquals(2, RecursionProblems.strCount("catcowcat", "cat"));
   }

   @Test
   public void testStrCount_cow() {
      assertEquals(1, RecursionProblems.strCount("catcowcat", "cow"));
   }

   @Test
   public void testStrCount_none() {
      assertEquals(0, RecursionProblems.strCount("catcowcat", "dog"));
   }

   // ---------------- stringClean ----------------

   @Test
   public void testStringClean_basic() {
      assertEquals("yza", RecursionProblems.stringClean("yyzzza"));
   }

   @Test
   public void testStringClean_hello() {
      assertEquals("Helo", RecursionProblems.stringClean("Hello"));
   }

   @Test
   public void testStringClean_abbbcdd() {
      assertEquals("abcd", RecursionProblems.stringClean("abbbcdd"));
   }
}