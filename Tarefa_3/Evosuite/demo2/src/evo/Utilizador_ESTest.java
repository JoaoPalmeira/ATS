/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 11:49:57 GMT 2019
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockZonedDateTime;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Utilizador_ESTest extends Utilizador_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now();
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      Utilizador utilizador0 = new Utilizador((String) null, (String) null, (String) null, (String) null, (String) null, gregorianCalendar0);
      utilizador0.setPassword("C_@F`Hu{ ~`Cfh");
      utilizador0.getPassword();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      utilizador0.getPassword();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now();
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      Utilizador utilizador0 = new Utilizador((String) null, (String) null, (String) null, (String) null, (String) null, gregorianCalendar0);
      utilizador0.getNome();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      utilizador0.getNome();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 0, (-1887), 1);
      Utilizador utilizador0 = new Utilizador("9vZv2YFl`{Tl", "9vZv2YFl`{Tl", ">#38]mh=?L(w>Wy]", "VaIQKvk-aWBvF#l5", ">#38]mh=?L(w>Wy]", mockGregorianCalendar0);
      utilizador0.getNIF();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      utilizador0.getNIF();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      Utilizador utilizador0 = new Utilizador("EI.-eF<Y+", "}Gw#c#\"vCUL+)T;N%h", "", "", "h^_bg^/oVI2@m", mockGregorianCalendar0);
      utilizador0.getMorada();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador(",^}1)!X+e^", ",^}1)!X+e^", ",^}1)!X+e^", "0mQy>'FH2n;", ",^}1)!X+e^", (GregorianCalendar) null);
      utilizador0.setMorada("");
      utilizador0.getMorada();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Utilizador utilizador0 = new Utilizador((String) null, "?V+O\nxO'= IfWOq", "?V+O\nxO'= IfWOq", (String) null, (String) null, mockGregorianCalendar0);
      utilizador0.setEmail((String) null);
      utilizador0.getEmail();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador(",^}1)!X+e^", ",^}1)!X+e^", ",^}1)!X+e^", "0mQy>'FH2n;", ",^}1)!X+e^", (GregorianCalendar) null);
      utilizador0.getEmail();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      utilizador0.setDataNasc((GregorianCalendar) null);
      utilizador0.getDataNasc();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      TimeZone timeZone0 = TimeZone.getTimeZone("|QAv7C(zGRh");
      Locale locale0 = Locale.KOREAN;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale0);
      mockGregorianCalendar0.setLenient(false);
      utilizador0.setDataNasc(mockGregorianCalendar0);
      utilizador0.getDataNasc();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-436), 3427, 0, (-436), (-436));
      assertNotNull(mockGregorianCalendar0);
      
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-436));
      assertEquals((-436), mockGregorianCalendar0.getMinimalDaysInFirstWeek());
      assertEquals(1, mockGregorianCalendar0.getFirstDayOfWeek());
      assertTrue(mockGregorianCalendar0.isLenient());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-436,ERA=?,YEAR=-436,MONTH=3427,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=0,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=-436,HOUR_OF_DAY=-436,MINUTE=-436,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
      
      Utilizador utilizador0 = new Utilizador("", (String) null, "", "Utilizador", "NIF: ", mockGregorianCalendar0);
      assertEquals((-436), mockGregorianCalendar0.getMinimalDaysInFirstWeek());
      assertEquals(1, mockGregorianCalendar0.getFirstDayOfWeek());
      assertTrue(mockGregorianCalendar0.isLenient());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-436,ERA=?,YEAR=-436,MONTH=3427,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=0,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=-436,HOUR_OF_DAY=-436,MINUTE=-436,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
      assertNull(utilizador0.getNIF());
      assertEquals("Utilizador", utilizador0.getPassword());
      assertEquals("", utilizador0.getEmail());
      assertEquals("", utilizador0.getNome());
      assertEquals("NIF: ", utilizador0.getMorada());
      assertNotNull(utilizador0);
      
      GregorianCalendar gregorianCalendar0 = utilizador0.getDataNasc();
      assertSame(mockGregorianCalendar0, gregorianCalendar0);
      assertSame(gregorianCalendar0, mockGregorianCalendar0);
      assertEquals((-436), mockGregorianCalendar0.getMinimalDaysInFirstWeek());
      assertEquals(1, mockGregorianCalendar0.getFirstDayOfWeek());
      assertTrue(mockGregorianCalendar0.isLenient());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-436,ERA=?,YEAR=-436,MONTH=3427,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=0,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=-436,HOUR_OF_DAY=-436,MINUTE=-436,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
      assertNull(utilizador0.getNIF());
      assertEquals("Utilizador", utilizador0.getPassword());
      assertEquals("", utilizador0.getEmail());
      assertEquals("", utilizador0.getNome());
      assertEquals("NIF: ", utilizador0.getMorada());
      assertTrue(gregorianCalendar0.isLenient());
      assertEquals((-436), gregorianCalendar0.getMinimalDaysInFirstWeek());
      assertEquals(1, gregorianCalendar0.getFirstDayOfWeek());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-436,ERA=?,YEAR=-436,MONTH=3427,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=0,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=-436,HOUR_OF_DAY=-436,MINUTE=-436,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", gregorianCalendar0.toString());
      assertNotNull(gregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      assertEquals("", utilizador0.getEmail());
      assertEquals("", utilizador0.getNome());
      assertEquals("", utilizador0.getMorada());
      assertEquals("", utilizador0.getPassword());
      assertEquals("", utilizador0.getNIF());
      assertNotNull(utilizador0);
      
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      assertNotNull(mockGregorianCalendar0);
      
      mockGregorianCalendar0.setFirstDayOfWeek((-1));
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals(1, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
      assertTrue(mockGregorianCalendar0.isLenient());
      assertEquals((-1), mockGregorianCalendar0.getFirstDayOfWeek());
      
      utilizador0.setDataNasc(mockGregorianCalendar0);
      assertEquals("", utilizador0.getEmail());
      assertEquals("", utilizador0.getNome());
      assertEquals("", utilizador0.getMorada());
      assertEquals("", utilizador0.getPassword());
      assertEquals("", utilizador0.getNIF());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals(1, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
      assertTrue(mockGregorianCalendar0.isLenient());
      assertEquals((-1), mockGregorianCalendar0.getFirstDayOfWeek());
      
      GregorianCalendar gregorianCalendar0 = utilizador0.getDataNasc();
      assertSame(gregorianCalendar0, mockGregorianCalendar0);
      assertEquals("", utilizador0.getEmail());
      assertEquals("", utilizador0.getNome());
      assertEquals("", utilizador0.getMorada());
      assertEquals("", utilizador0.getPassword());
      assertEquals("", utilizador0.getNIF());
      assertEquals(1, gregorianCalendar0.getMinimalDaysInFirstWeek());
      assertEquals((-1), gregorianCalendar0.getFirstDayOfWeek());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", gregorianCalendar0.toString());
      assertTrue(gregorianCalendar0.isLenient());
      assertNotNull(gregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2724), (-2724), (-2724), (-2724), (-2724), 1278);
      assertNotNull(mockGregorianCalendar0);
      
      Utilizador utilizador0 = new Utilizador(".8bu'IvKH*Plzei\f", ".8bu'IvKH*Plzei\f", "n<", ".8bu'IvKH*Plzei\f", "Aq", mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=-2724,MONTH=-2724,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=-2724,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=-2724,HOUR_OF_DAY=-2724,MINUTE=-2724,SECOND=1278,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
      assertEquals(1, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
      assertEquals(1, mockGregorianCalendar0.getFirstDayOfWeek());
      assertTrue(mockGregorianCalendar0.isLenient());
      assertEquals(".8bu'IvKH*Plzei\f", utilizador0.getPassword());
      assertEquals(".8bu'IvKH*Plzei\f", utilizador0.getNome());
      assertEquals("Aq", utilizador0.getMorada());
      assertEquals("n<", utilizador0.getEmail());
      assertEquals(".8bu'IvKH*Plzei\f", utilizador0.getNIF());
      assertNotNull(utilizador0);
      
      mockGregorianCalendar0.setLenient(false);
      assertEquals(1, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
      assertEquals(1, mockGregorianCalendar0.getFirstDayOfWeek());
      assertFalse(mockGregorianCalendar0.isLenient());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=-2724,MONTH=-2724,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=-2724,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=-2724,HOUR_OF_DAY=-2724,MINUTE=-2724,SECOND=1278,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
      
      // Undeclared exception!
      try { 
        utilizador0.toString();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // YEAR
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      assertEquals("", utilizador0.getPassword());
      assertEquals("", utilizador0.getNIF());
      assertEquals("", utilizador0.getMorada());
      assertEquals("", utilizador0.getNome());
      assertEquals("", utilizador0.getEmail());
      assertNotNull(utilizador0);
      
      Utilizador utilizador1 = utilizador0.clone();
      assertNotSame(utilizador0, utilizador1);
      assertNotSame(utilizador1, utilizador0);
      assertTrue(utilizador1.equals((Object)utilizador0));
      assertEquals("", utilizador0.getPassword());
      assertEquals("", utilizador0.getNIF());
      assertEquals("", utilizador0.getMorada());
      assertEquals("", utilizador0.getNome());
      assertEquals("", utilizador0.getEmail());
      assertEquals("", utilizador1.getPassword());
      assertEquals("", utilizador1.getNIF());
      assertEquals("", utilizador1.getMorada());
      assertEquals("", utilizador1.getNome());
      assertEquals("", utilizador1.getEmail());
      assertNotNull(utilizador1);
      
      utilizador0.setEmail((String) null);
      assertNotSame(utilizador0, utilizador1);
      assertEquals("", utilizador0.getPassword());
      assertEquals("", utilizador0.getNIF());
      assertEquals("", utilizador0.getMorada());
      assertEquals("", utilizador0.getNome());
      assertNull(utilizador0.getEmail());
      
      // Undeclared exception!
      try { 
        utilizador0.equals(utilizador1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Utilizador utilizador0 = null;
      try {
        utilizador0 = new Utilizador((Utilizador) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Utilizador", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-436), 3427, 0, (-436), (-436));
      assertNotNull(mockGregorianCalendar0);
      
      Utilizador utilizador0 = new Utilizador("", (String) null, "", "Utilizador", "NIF: ", mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=-436,MONTH=3427,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=0,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=-436,HOUR_OF_DAY=-436,MINUTE=-436,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
      assertEquals(1, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
      assertTrue(mockGregorianCalendar0.isLenient());
      assertEquals(1, mockGregorianCalendar0.getFirstDayOfWeek());
      assertEquals("NIF: ", utilizador0.getMorada());
      assertEquals("", utilizador0.getEmail());
      assertNull(utilizador0.getNIF());
      assertEquals("Utilizador", utilizador0.getPassword());
      assertEquals("", utilizador0.getNome());
      assertNotNull(utilizador0);
      
      String string0 = utilizador0.getNIF();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=-436,MONTH=3427,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=0,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=-436,HOUR_OF_DAY=-436,MINUTE=-436,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
      assertEquals(1, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
      assertTrue(mockGregorianCalendar0.isLenient());
      assertEquals(1, mockGregorianCalendar0.getFirstDayOfWeek());
      assertEquals("NIF: ", utilizador0.getMorada());
      assertEquals("", utilizador0.getEmail());
      assertNull(utilizador0.getNIF());
      assertEquals("Utilizador", utilizador0.getPassword());
      assertEquals("", utilizador0.getNome());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now();
      assertNotNull(zonedDateTime0);
      
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", gregorianCalendar0.toString());
      assertTrue(gregorianCalendar0.isLenient());
      assertEquals(2, gregorianCalendar0.getFirstDayOfWeek());
      assertEquals(4, gregorianCalendar0.getMinimalDaysInFirstWeek());
      assertNotNull(gregorianCalendar0);
      
      Utilizador utilizador0 = new Utilizador((String) null, (String) null, (String) null, (String) null, (String) null, gregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", gregorianCalendar0.toString());
      assertTrue(gregorianCalendar0.isLenient());
      assertEquals(2, gregorianCalendar0.getFirstDayOfWeek());
      assertEquals(4, gregorianCalendar0.getMinimalDaysInFirstWeek());
      assertNull(utilizador0.getEmail());
      assertNull(utilizador0.getNome());
      assertNull(utilizador0.getNIF());
      assertNull(utilizador0.getMorada());
      assertNull(utilizador0.getPassword());
      assertNotNull(utilizador0);
      
      String string0 = utilizador0.getMorada();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", gregorianCalendar0.toString());
      assertTrue(gregorianCalendar0.isLenient());
      assertEquals(2, gregorianCalendar0.getFirstDayOfWeek());
      assertEquals(4, gregorianCalendar0.getMinimalDaysInFirstWeek());
      assertNull(utilizador0.getEmail());
      assertNull(utilizador0.getNome());
      assertNull(utilizador0.getNIF());
      assertNull(utilizador0.getMorada());
      assertNull(utilizador0.getPassword());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      assertNotNull(mockGregorianCalendar0);
      
      Utilizador utilizador0 = new Utilizador((String) null, "?V+O\nxO'= IfWOq", "?V+O\nxO'= IfWOq", (String) null, (String) null, mockGregorianCalendar0);
      assertEquals(1, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals(1, mockGregorianCalendar0.getFirstDayOfWeek());
      assertTrue(mockGregorianCalendar0.isLenient());
      assertNull(utilizador0.getMorada());
      assertNull(utilizador0.getNome());
      assertNull(utilizador0.getPassword());
      assertEquals("?V+O\nxO'= IfWOq", utilizador0.getNIF());
      assertEquals("?V+O\nxO'= IfWOq", utilizador0.getEmail());
      assertNotNull(utilizador0);
      
      String string0 = utilizador0.getPassword();
      assertEquals(1, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals(1, mockGregorianCalendar0.getFirstDayOfWeek());
      assertTrue(mockGregorianCalendar0.isLenient());
      assertNull(utilizador0.getMorada());
      assertNull(utilizador0.getNome());
      assertNull(utilizador0.getPassword());
      assertEquals("?V+O\nxO'= IfWOq", utilizador0.getNIF());
      assertEquals("?V+O\nxO'= IfWOq", utilizador0.getEmail());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador(",^}1)!X+e^", ",^}1)!X+e^", ",^}1)!X+e^", "0mQy>'FH2n;", ",^}1)!X+e^", (GregorianCalendar) null);
      assertEquals(",^}1)!X+e^", utilizador0.getNIF());
      assertEquals(",^}1)!X+e^", utilizador0.getEmail());
      assertEquals("0mQy>'FH2n;", utilizador0.getPassword());
      assertEquals(",^}1)!X+e^", utilizador0.getNome());
      assertEquals(",^}1)!X+e^", utilizador0.getMorada());
      assertNotNull(utilizador0);
      
      String string0 = utilizador0.getNome();
      assertEquals(",^}1)!X+e^", utilizador0.getNIF());
      assertEquals(",^}1)!X+e^", utilizador0.getEmail());
      assertEquals("0mQy>'FH2n;", utilizador0.getPassword());
      assertEquals(",^}1)!X+e^", utilizador0.getNome());
      assertEquals(",^}1)!X+e^", utilizador0.getMorada());
      assertEquals(",^}1)!X+e^", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      assertEquals("", utilizador0.getEmail());
      assertEquals("", utilizador0.getNIF());
      assertEquals("", utilizador0.getMorada());
      assertEquals("", utilizador0.getNome());
      assertEquals("", utilizador0.getPassword());
      assertNotNull(utilizador0);
      
      String string0 = utilizador0.getEmail();
      assertEquals("", utilizador0.getEmail());
      assertEquals("", utilizador0.getNIF());
      assertEquals("", utilizador0.getMorada());
      assertEquals("", utilizador0.getNome());
      assertEquals("", utilizador0.getPassword());
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      assertEquals("", utilizador0.getNIF());
      assertEquals("", utilizador0.getMorada());
      assertEquals("", utilizador0.getNome());
      assertEquals("", utilizador0.getEmail());
      assertEquals("", utilizador0.getPassword());
      assertNotNull(utilizador0);
      
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1758), (-1758), (-842), (-2130094126), 4150);
      assertNotNull(mockGregorianCalendar0);
      
      utilizador0.setDataNasc(mockGregorianCalendar0);
      assertEquals("", utilizador0.getNIF());
      assertEquals("", utilizador0.getMorada());
      assertEquals("", utilizador0.getNome());
      assertEquals("", utilizador0.getEmail());
      assertEquals("", utilizador0.getPassword());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=-1758,MONTH=-1758,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=-842,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=-2130094126,HOUR_OF_DAY=-2130094126,MINUTE=4150,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
      assertEquals(1, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
      assertEquals(1, mockGregorianCalendar0.getFirstDayOfWeek());
      assertTrue(mockGregorianCalendar0.isLenient());
      
      Utilizador utilizador1 = new Utilizador();
      assertFalse(utilizador1.equals((Object)utilizador0));
      assertEquals("", utilizador1.getNIF());
      assertEquals("", utilizador1.getEmail());
      assertEquals("", utilizador1.getPassword());
      assertEquals("", utilizador1.getMorada());
      assertEquals("", utilizador1.getNome());
      assertNotNull(utilizador1);
      
      boolean boolean0 = utilizador0.equals(utilizador1);
      assertNotSame(utilizador0, utilizador1);
      assertNotSame(utilizador1, utilizador0);
      assertFalse(utilizador0.equals((Object)utilizador1));
      assertFalse(utilizador1.equals((Object)utilizador0));
      assertEquals("", utilizador0.getNIF());
      assertEquals("", utilizador0.getMorada());
      assertEquals("", utilizador0.getNome());
      assertEquals("", utilizador0.getEmail());
      assertEquals("", utilizador0.getPassword());
      assertEquals("", utilizador1.getNIF());
      assertEquals("", utilizador1.getEmail());
      assertEquals("", utilizador1.getPassword());
      assertEquals("", utilizador1.getMorada());
      assertEquals("", utilizador1.getNome());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      assertEquals("", utilizador0.getMorada());
      assertEquals("", utilizador0.getNome());
      assertEquals("", utilizador0.getNIF());
      assertEquals("", utilizador0.getPassword());
      assertEquals("", utilizador0.getEmail());
      assertNotNull(utilizador0);
      
      Utilizador utilizador1 = utilizador0.clone();
      assertNotSame(utilizador0, utilizador1);
      assertNotSame(utilizador1, utilizador0);
      assertTrue(utilizador1.equals((Object)utilizador0));
      assertEquals("", utilizador0.getMorada());
      assertEquals("", utilizador0.getNome());
      assertEquals("", utilizador0.getNIF());
      assertEquals("", utilizador0.getPassword());
      assertEquals("", utilizador0.getEmail());
      assertEquals("", utilizador1.getEmail());
      assertEquals("", utilizador1.getNIF());
      assertEquals("", utilizador1.getMorada());
      assertEquals("", utilizador1.getNome());
      assertEquals("", utilizador1.getPassword());
      assertNotNull(utilizador1);
      
      utilizador1.setMorada("^");
      assertNotSame(utilizador0, utilizador1);
      assertNotSame(utilizador1, utilizador0);
      assertFalse(utilizador0.equals((Object)utilizador1));
      assertFalse(utilizador1.equals((Object)utilizador0));
      assertEquals("", utilizador0.getMorada());
      assertEquals("", utilizador0.getNome());
      assertEquals("", utilizador0.getNIF());
      assertEquals("", utilizador0.getPassword());
      assertEquals("", utilizador0.getEmail());
      assertEquals("", utilizador1.getEmail());
      assertEquals("", utilizador1.getNIF());
      assertEquals("", utilizador1.getNome());
      assertEquals("", utilizador1.getPassword());
      assertEquals("^", utilizador1.getMorada());
      
      boolean boolean0 = utilizador0.equals(utilizador1);
      assertNotSame(utilizador0, utilizador1);
      assertNotSame(utilizador1, utilizador0);
      assertFalse(utilizador0.equals((Object)utilizador1));
      assertFalse(utilizador1.equals((Object)utilizador0));
      assertEquals("", utilizador0.getMorada());
      assertEquals("", utilizador0.getNome());
      assertEquals("", utilizador0.getNIF());
      assertEquals("", utilizador0.getPassword());
      assertEquals("", utilizador0.getEmail());
      assertEquals("", utilizador1.getEmail());
      assertEquals("", utilizador1.getNIF());
      assertEquals("", utilizador1.getNome());
      assertEquals("", utilizador1.getPassword());
      assertEquals("^", utilizador1.getMorada());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2724), (-2724), (-2724), (-2724), (-2724), 1278);
      Utilizador utilizador0 = new Utilizador(".8bu'IvKH*Plzei\f", ".8bu'IvKH*Plzei\f", "n<", ".8bu'IvKH*Plzei\f", "Aq", mockGregorianCalendar0);
      Utilizador utilizador1 = new Utilizador(utilizador0);
      assertTrue(utilizador1.equals((Object)utilizador0));
      
      utilizador1.setPassword("Aq");
      boolean boolean0 = utilizador0.equals(utilizador1);
      assertFalse(utilizador1.equals((Object)utilizador0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      Utilizador utilizador1 = new Utilizador(utilizador0);
      assertTrue(utilizador1.equals((Object)utilizador0));
      
      utilizador0.setEmail("^");
      boolean boolean0 = utilizador1.equals(utilizador0);
      assertFalse(utilizador1.equals((Object)utilizador0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      Utilizador utilizador1 = new Utilizador(utilizador0);
      assertTrue(utilizador1.equals((Object)utilizador0));
      
      utilizador0.setNome("U");
      boolean boolean0 = utilizador1.equals(utilizador0);
      assertFalse(utilizador1.equals((Object)utilizador0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2724), (-2724), (-2724), (-2724), (-2724), 1278);
      Utilizador utilizador0 = new Utilizador(".8bu'IvKH*Plzei\f", ".8bu'IvKH*Plzei\f", "n<", ".8bu'IvKH*Plzei\f", "Aq", mockGregorianCalendar0);
      Utilizador utilizador1 = utilizador0.clone();
      boolean boolean0 = utilizador1.equals(utilizador0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      boolean boolean0 = utilizador0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      boolean boolean0 = utilizador0.equals(utilizador0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      Object object0 = new Object();
      boolean boolean0 = utilizador0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      utilizador0.setDataNasc((GregorianCalendar) null);
      // Undeclared exception!
      try { 
        utilizador0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Utilizador", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      utilizador0.setNIF("");
      assertEquals("", utilizador0.getNIF());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      String string0 = utilizador0.toString();
      assertEquals("*****    UTILIZADOR    *****\nNome: \nNIF: \nEmail: \nPassword: \nMorada: \nData de Nascimento: 14/2/2014\n", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      Utilizador utilizador1 = utilizador0.clone();
      assertTrue(utilizador1.equals((Object)utilizador0));
      
      utilizador0.setNIF("?");
      boolean boolean0 = utilizador0.equals(utilizador1);
      assertFalse(utilizador1.equals((Object)utilizador0));
      assertFalse(boolean0);
  }
}
