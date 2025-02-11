/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 24 19:13:12 GMT 2019
 */

package View;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import View.Table;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Table_ESTest extends Table_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      linkedList1.add("3QN<YObvN2");
      LinkedList<List<List<Integer>>> linkedList2 = new LinkedList<List<List<Integer>>>();
      Table<List<Integer>> table0 = new Table<List<Integer>>(linkedList2, linkedList0, linkedList1);
      String string0 = table0.toString();
      assertEquals("+--+------------+\n|  | 3QN<YObvN2 |\n+--+------------+\n", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      LinkedList<List<Object>> linkedList1 = new LinkedList<List<Object>>();
      linkedList0.add("+--+\n|  |\n+--+\n");
      linkedList0.add("");
      Table<Object> table0 = new Table<Object>(linkedList1, linkedList0, linkedList0);
      // Undeclared exception!
      try { 
        table0.toString();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      linkedList1.addLast("b3ck#-e0pNkhU\"Pd$9");
      Table<Integer> table0 = new Table<Integer>((List<List<Integer>>) null, linkedList1, linkedList0);
      String string0 = table0.toString();
      assertEquals("+--------------------+\n|                    |\n+--------------------+\n| b3ck#-e0pNkhU\"Pd$9 |\n+--------------------+\n", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("");
      linkedList0.add("az++<r]uiDZCa^1D*!!");
      LinkedList<List<String>> linkedList1 = new LinkedList<List<String>>();
      linkedList1.add((List<String>) linkedList0);
      linkedList1.add((List<String>) linkedList0);
      Table<String> table0 = new Table<String>(linkedList1, linkedList0, linkedList0);
      String string0 = table0.toString();
      assertFalse(linkedList0.contains(string0));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<List<Integer>> linkedList0 = new LinkedList<List<Integer>>();
      Table<Integer> table0 = new Table<Integer>(linkedList0, (List<String>) null, (List<String>) null);
      // Undeclared exception!
      try { 
        table0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("View.Table", e);
      }
  }
}
