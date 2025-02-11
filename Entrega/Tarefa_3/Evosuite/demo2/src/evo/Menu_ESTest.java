/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 11:49:10 GMT 2019
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Menu_ESTest extends Menu_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SystemInUtil.addInputLine("0 - Sair\n ");
      // Undeclared exception!
      try { 
        Menu.MenuLerInt((-1848), (-1409), "", "0 - Sair\n ");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SystemInUtil.addInputLine("0 - Sair\n ");
      int int0 = Menu.MenuLerInt(0, 0, "0 - Sair\n ", "0 - Sair\n ");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SystemInUtil.addInputLine("8");
      String[] stringArray0 = new String[8];
      stringArray0[0] = "*";
      Menu menu0 = new Menu(stringArray0);
      assertEquals(0, menu0.getOpcao());
      assertEquals(8, stringArray0.length);
      assertNotNull(menu0);
      
      menu0.executa();
      assertEquals(8, menu0.getOpcao());
      assertEquals(8, stringArray0.length);
      
      int int0 = menu0.getOpcao();
      assertEquals(8, menu0.getOpcao());
      assertEquals(8, stringArray0.length);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SystemInUtil.addInputLine("8");
      int int0 = Menu.MenuLerInt(7, 12, "8", "*");
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[9];
      Menu menu0 = new Menu(stringArray0);
      assertEquals(0, menu0.getOpcao());
      assertEquals(9, stringArray0.length);
      assertNotNull(menu0);
      
      // Undeclared exception!
      try { 
        menu0.executa();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Menu", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Menu menu0 = new Menu(stringArray0);
      assertEquals(0, menu0.getOpcao());
      assertEquals(0, stringArray0.length);
      assertNotNull(menu0);
      
      // Undeclared exception!
      try { 
        menu0.executa();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("java.util.Arrays$ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Menu menu0 = null;
      try {
        menu0 = new Menu((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[7];
      SystemInUtil.addInputLine(",#M*nX8<");
      stringArray0[0] = ",#M*nX8<";
      Menu menu0 = new Menu(stringArray0);
      assertEquals(0, menu0.getOpcao());
      assertEquals(7, stringArray0.length);
      assertNotNull(menu0);
      
      // Undeclared exception!
      try { 
        menu0.executa();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SystemInUtil.addInputLine("0 !r air ");
      // Undeclared exception!
      try { 
        Menu.MenuLerInt(1054, 1054, "0 !r air ", "0 !r air ");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SystemInUtil.addInputLine("0 - Sair\n ");
      String[] stringArray0 = new String[5];
      stringArray0[0] = "0 - Sair\n ";
      Menu menu0 = new Menu(stringArray0);
      menu0.executa();
      assertEquals(0, menu0.getOpcao());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SystemInUtil.addInputLine("8");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "*";
      Menu menu0 = new Menu(stringArray0);
      // Undeclared exception!
      try { 
        menu0.executa();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[5];
      Menu menu0 = new Menu(stringArray0);
      int int0 = menu0.getOpcao();
      assertEquals(0, int0);
  }
}
