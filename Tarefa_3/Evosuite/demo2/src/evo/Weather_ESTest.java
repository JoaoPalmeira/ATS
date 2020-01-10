/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 11:54:24 GMT 2019
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Weather_ESTest extends Weather_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = Weather.getPercentage(0.0, (-795.75));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        Weather.jsonToMap("{c\"v)Q");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.MapTypeAdapterFactory$Adapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        Weather.jsonToMap("XIKZ0cV");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BEGIN_OBJECT but was STRING at line 1 column 1 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://api.openweathermap.org/data/2.5/weather?lat=-669.2986149394593&lon=0.0&appid=28c4efcbaf88fde7e5ae89d0b8f05dcd");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "{serializeNulls:");
      // Undeclared exception!
      try { 
        Weather.getPercentage((-669.2986149394593), 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.MapTypeAdapterFactory$Adapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://api.openweathermap.org/data/2.5/weather?lat=0.4&lon=-953.63&appid=28c4efcbaf88fde7e5ae89d0b8f05dcd");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "ou&.'$1J'{");
      // Undeclared exception!
      try { 
        Weather.getPercentage(0.4, (-953.63));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BEGIN_OBJECT but was STRING at line 1 column 1 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Map<String, Object> map0 = Weather.jsonToMap("");
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Weather weather0 = new Weather();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://api.openweathermap.org/data/2.5/weather?lat=0.0&lon=0.0&appid=28c4efcbaf88fde7e5ae89d0b8f05dcd");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "#");
      // Undeclared exception!
      try { 
        Weather.getPercentage(0.0, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Weather", e);
      }
  }
}
