/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 24 19:19:45 GMT 2019
 */

package View.ViewModel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Utils.Point;
import View.ViewModel.RegisterCar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegisterCar_ESTest extends RegisterCar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RegisterCar registerCar0 = new RegisterCar("25acl`X", "electric", 0.0, 302.0629, 0.0, 0, (Point) null, (String) null);
      int int0 = registerCar0.getRange();
      assertEquals(0, int0);
      assertEquals(0.0, registerCar0.getGasMileage(), 0.01);
      assertEquals(302.0629, registerCar0.getBasePrice(), 0.01);
      assertEquals(0.0, registerCar0.getAvgSpeed(), 0.01);
      assertEquals("25acl`X", registerCar0.getNumberPlate());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("any", "any", (-3870.582674), (-931.2302017), (-3870.582674), 1, point0, "any");
      int int0 = registerCar0.getRange();
      assertEquals((-931.2302017), registerCar0.getBasePrice(), 0.01);
      assertEquals(1, int0);
      assertEquals((-3870.582674), registerCar0.getAvgSpeed(), 0.01);
      assertEquals((-3870.582674), registerCar0.getGasMileage(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RegisterCar registerCar0 = new RegisterCar("25acl`X", "electric", 0.0, 302.0629, 0.0, 0, (Point) null, (String) null);
      registerCar0.getPos();
      assertEquals(302.0629, registerCar0.getBasePrice(), 0.01);
      assertEquals(0, registerCar0.getRange());
      assertEquals(0.0, registerCar0.getGasMileage(), 0.01);
      assertEquals(0.0, registerCar0.getAvgSpeed(), 0.01);
      assertEquals("25acl`X", registerCar0.getNumberPlate());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegisterCar registerCar0 = new RegisterCar((String) null, "electric", 0.0, 0.0, 0.15, 0, (Point) null, (String) null);
      String string0 = registerCar0.getNumberPlate();
      assertEquals(0.0, registerCar0.getAvgSpeed(), 0.01);
      assertNull(string0);
      assertEquals(0, registerCar0.getRange());
      assertEquals(0.15, registerCar0.getGasMileage(), 0.01);
      assertEquals(0.0, registerCar0.getBasePrice(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("", "any", (-295.91271), (-295.91271), 0.0, (-3398), point0, "^/$.>I1bG@ua6zNm");
      String string0 = registerCar0.getNumberPlate();
      assertEquals((-3398), registerCar0.getRange());
      assertEquals("", string0);
      assertEquals("^/$.>I1bG@ua6zNm", registerCar0.getBrand());
      assertEquals((-295.91271), registerCar0.getAvgSpeed(), 0.01);
      assertEquals(0.0, registerCar0.getGasMileage(), 0.01);
      assertEquals((-295.91271), registerCar0.getBasePrice(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegisterCar registerCar0 = new RegisterCar("25acl`X", "electric", 132.25, 302.0629, 0.0, 0, (Point) null, "25acl`X");
      double double0 = registerCar0.getGasMileage();
      assertEquals(0.0, double0, 0.01);
      assertEquals(132.25, registerCar0.getAvgSpeed(), 0.01);
      assertEquals(302.0629, registerCar0.getBasePrice(), 0.01);
      assertEquals(0, registerCar0.getRange());
      assertEquals("25acl`X", registerCar0.getNumberPlate());
      assertEquals("25acl`X", registerCar0.getBrand());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RegisterCar registerCar0 = new RegisterCar("25acl`X", "electric", 0.0, 302.0629, 302.0629, 0, (Point) null, (String) null);
      double double0 = registerCar0.getGasMileage();
      assertEquals(302.0629, double0, 0.01);
      assertEquals(0, registerCar0.getRange());
      assertEquals(302.0629, registerCar0.getBasePrice(), 0.01);
      assertEquals(0.0, registerCar0.getAvgSpeed(), 0.01);
      assertEquals("25acl`X", registerCar0.getNumberPlate());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RegisterCar registerCar0 = new RegisterCar("25acl`X", "electric", 0.0, 302.0629, 0.0, 0, (Point) null, (String) null);
      String string0 = registerCar0.getBrand();
      assertNull(string0);
      assertEquals(302.0629, registerCar0.getBasePrice(), 0.01);
      assertEquals(0, registerCar0.getRange());
      assertEquals(0.0, registerCar0.getGasMileage(), 0.01);
      assertEquals(0.0, registerCar0.getAvgSpeed(), 0.01);
      assertEquals("25acl`X", registerCar0.getNumberPlate());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("hybrid", "hybrid", 0.0, 0.0, 0.0, 957, point0, "");
      String string0 = registerCar0.getBrand();
      assertEquals(0.0, registerCar0.getAvgSpeed(), 0.01);
      assertEquals(0.0, registerCar0.getGasMileage(), 0.01);
      assertEquals("", string0);
      assertEquals("hybrid", registerCar0.getNumberPlate());
      assertEquals(957, registerCar0.getRange());
      assertEquals(0.0, registerCar0.getBasePrice(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("hybrid", "hybrid", (-921.4885078), 0.0, (-921.4885078), (-3188), point0, "\n");
      double double0 = registerCar0.getBasePrice();
      assertEquals((-3188), registerCar0.getRange());
      assertEquals("\n", registerCar0.getBrand());
      assertEquals((-921.4885078), registerCar0.getAvgSpeed(), 0.01);
      assertEquals((-921.4885078), registerCar0.getGasMileage(), 0.01);
      assertEquals("hybrid", registerCar0.getNumberPlate());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegisterCar registerCar0 = new RegisterCar("25acl`X", "electric", 132.25, 302.0629, 0.0, 0, (Point) null, "25acl`X");
      double double0 = registerCar0.getBasePrice();
      assertEquals(302.0629, double0, 0.01);
      assertEquals(0.0, registerCar0.getGasMileage(), 0.01);
      assertEquals("25acl`X", registerCar0.getNumberPlate());
      assertEquals("25acl`X", registerCar0.getBrand());
      assertEquals(132.25, registerCar0.getAvgSpeed(), 0.01);
      assertEquals(0, registerCar0.getRange());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegisterCar registerCar0 = new RegisterCar("25acl`X", "electric", 0.0, 302.0629, 0.0, 0, (Point) null, (String) null);
      double double0 = registerCar0.getAvgSpeed();
      assertEquals(0.0, registerCar0.getGasMileage(), 0.01);
      assertEquals(302.0629, registerCar0.getBasePrice(), 0.01);
      assertEquals(0, registerCar0.getRange());
      assertEquals(0.0, double0, 0.01);
      assertEquals("25acl`X", registerCar0.getNumberPlate());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegisterCar registerCar0 = new RegisterCar("25acl`X", "electric", 132.25, 302.0629, 0.0, 0, (Point) null, "25acl`X");
      double double0 = registerCar0.getAvgSpeed();
      assertEquals(132.25, double0, 0.01);
      assertEquals("25acl`X", registerCar0.getNumberPlate());
      assertEquals(302.0629, registerCar0.getBasePrice(), 0.01);
      assertEquals(0, registerCar0.getRange());
      assertEquals("25acl`X", registerCar0.getBrand());
      assertEquals(0.0, registerCar0.getGasMileage(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = null;
      try {
        registerCar0 = new RegisterCar((String) null, "", 0.0, 0.0, 0.2, (-286), point0, "");
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("View.ViewModel.RegisterCar", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = null;
      try {
        registerCar0 = new RegisterCar((String) null, (String) null, (-3238.706), (-3238.706), (-1416.9700403), 0, point0, "j:0HZ}sy");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("View.ViewModel.RegisterCar", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("hybrid", "hybrid", (-922.8143101130532), (-922.8143101130532), (-922.8143101130532), (-3184), point0, "hybrid");
      int int0 = registerCar0.getRange();
      assertEquals((-922.8143101130532), registerCar0.getBasePrice(), 0.01);
      assertEquals((-922.8143101130532), registerCar0.getGasMileage(), 0.01);
      assertEquals((-3184), int0);
      assertEquals((-922.8143101130532), registerCar0.getAvgSpeed(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("hybrid", "hybrid", (-922.8143101130532), (-922.8143101130532), (-922.8143101130532), (-3184), point0, "hybrid");
      double double0 = registerCar0.getBasePrice();
      assertEquals((-922.8143101130532), registerCar0.getGasMileage(), 0.01);
      assertEquals((-922.8143101130532), registerCar0.getAvgSpeed(), 0.01);
      assertEquals((-3184), registerCar0.getRange());
      assertEquals((-922.8143101130532), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("hybrid", "hybrid", (-922.8143101130532), (-922.8143101130532), (-922.8143101130532), (-3184), point0, "hybrid");
      double double0 = registerCar0.getAvgSpeed();
      assertEquals((-922.8143101130532), registerCar0.getGasMileage(), 0.01);
      assertEquals((-3184), registerCar0.getRange());
      assertEquals((-922.8143101130532), registerCar0.getBasePrice(), 0.01);
      assertEquals((-922.8143101130532), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("hybrid", "hybrid", (-922.8143101130532), (-922.8143101130532), (-922.8143101130532), (-3184), point0, "hybrid");
      registerCar0.getBrand();
      assertEquals((-922.8143101130532), registerCar0.getAvgSpeed(), 0.01);
      assertEquals((-922.8143101130532), registerCar0.getGasMileage(), 0.01);
      assertEquals((-3184), registerCar0.getRange());
      assertEquals((-922.8143101130532), registerCar0.getBasePrice(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("hybrid", "hybrid", (-922.8143101130532), (-922.8143101130532), (-922.8143101130532), (-3184), point0, "hybrid");
      registerCar0.getType();
      assertEquals((-3184), registerCar0.getRange());
      assertEquals((-922.8143101130532), registerCar0.getBasePrice(), 0.01);
      assertEquals((-922.8143101130532), registerCar0.getGasMileage(), 0.01);
      assertEquals((-922.8143101130532), registerCar0.getAvgSpeed(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("hybrid", "hybrid", (-922.8143101130532), (-922.8143101130532), (-922.8143101130532), (-3184), point0, "hybrid");
      double double0 = registerCar0.getGasMileage();
      assertEquals((-922.8143101130532), registerCar0.getAvgSpeed(), 0.01);
      assertEquals((-922.8143101130532), double0, 0.01);
      assertEquals((-922.8143101130532), registerCar0.getBasePrice(), 0.01);
      assertEquals((-3184), registerCar0.getRange());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      RegisterCar registerCar0 = new RegisterCar("hybrid", "hybrid", (-922.8143101130532), (-922.8143101130532), (-922.8143101130532), (-3184), point0, "hybrid");
      registerCar0.getNumberPlate();
      assertEquals((-922.8143101130532), registerCar0.getAvgSpeed(), 0.01);
      assertEquals((-922.8143101130532), registerCar0.getBasePrice(), 0.01);
      assertEquals((-3184), registerCar0.getRange());
      assertEquals((-922.8143101130532), registerCar0.getGasMileage(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      doReturn("hybrid").when(point0).toString();
      RegisterCar registerCar0 = new RegisterCar("hybrid", "hybrid", (-922.8143101130532), (-922.8143101130532), (-922.8143101130532), (-3184), point0, "hybrid");
      registerCar0.getPos();
      assertEquals((-3184), registerCar0.getRange());
      assertEquals((-922.8143101130532), registerCar0.getBasePrice(), 0.01);
      assertEquals((-922.8143101130532), registerCar0.getAvgSpeed(), 0.01);
      assertEquals((-922.8143101130532), registerCar0.getGasMileage(), 0.01);
  }
}
