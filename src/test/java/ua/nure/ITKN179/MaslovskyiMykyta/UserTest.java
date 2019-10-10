package ua.nure.ITKN179.MaslovskyiMykyta;

import java.util.Calendar;
import java.util.Date;

import junit.framework.TestCase;

public class UserTest extends TestCase {
    
    
    private static final int CURRENT_YEAR = 2019;
    private static final int YEAR_OF_BIRTH = 2000;
    
    //Òåñò1 - äåíü ðîæäåíèÿ âæå ïðîøåë
    private static final int ETALONE_AGE_1 = CURRENT_YEAR - YEAR_OF_BIRTH;
    private static final int DAY_OF_BIRTH_1 = 5;
    private static final int MONTH_OF_BIRTH_1 = Calendar.APRIL;
    
    //Òåñò2 - äåíü ðîæäåíèÿ ïðîéøîâ íî ì³ñÿöü äíÿ íàðîäæåííÿ ùå èäåò
    private static final int ETALONE_AGE_2 = CURRENT_YEAR - YEAR_OF_BIRTH;
    private static final int DAY_OF_BIRTH_2 = 7;
    private static final int MONTH_OF_BIRTH_2 = Calendar.OCTOBER;
    
    // Òåñò3 -äåíü ðîæäåíèÿ ñåãîäÿ
    private static final int ETALONE_AGE_3 = CURRENT_YEAR - YEAR_OF_BIRTH;
    private static final int DAY_OF_BIRTH_3 = 9;
    private static final int MONTH_OF_BIRTH_3 = Calendar.OCTOBER;
    
    // Òåñò4 - äåíü ðîæäåíèÿ â ýòîì ìåñÿöå åùå íå íàñòàëî
    private static final int ETALONE_AGE_4 = CURRENT_YEAR - YEAR_OF_BIRTH - 1;
    private static final int DAY_OF_BIRTH_4 = 21;
    private static final int MONTH_OF_BIRTH_4 = Calendar.OCTOBER;
    
    // Òåñò5 - äåíü ðîæäåíèÿ íå íàñòàë â ýòîì ìåñÿöå íî áóäåò â äðóãîì
    private static final int ETALONE_AGE_5 = CURRENT_YEAR - YEAR_OF_BIRTH - 1;
    private static final int DAY_OF_BIRTH_5 = 11;
    private static final int MONTH_OF_BIRTH_5 = Calendar.DECEMBER;

    
    private User user;
    private Date dateOfBirthd;
    
    protected void setUp() throws Exception {
        super.setUp();
        user = new User();
    }
    
    public void testGetFullName() {
        user.setFirstName("John");
        user.setLastName("Doe");
        assertEquals("Doe, John", user.getFullName());
    }
    
    public void testGetAge1() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH_1, DAY_OF_BIRTH_1);
        dateOfBirthd = calendar.getTime();
        user.setDateofBirth(dateOfBirthd);
        assertEquals(ETALONE_AGE_1, user.getAge());
    }
    
    public void testGetAge2() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH_2, DAY_OF_BIRTH_2);
        dateOfBirthd = calendar.getTime();
        user.setDateofBirth(dateOfBirthd);
        assertEquals(ETALONE_AGE_2, user.getAge());
    }
    public void testGetAge3() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH_3, DAY_OF_BIRTH_3);
        dateOfBirthd = calendar.getTime();
        user.setDateofBirth(dateOfBirthd);
        assertEquals(ETALONE_AGE_3, user.getAge());
    }
    public void testGetAge4() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH_4, DAY_OF_BIRTH_4);
        dateOfBirthd = calendar.getTime();
        user.setDateofBirth(dateOfBirthd);
        assertEquals(ETALONE_AGE_4, user.getAge());
    }
    public void testGetAge5() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH_5, DAY_OF_BIRTH_5);
        dateOfBirthd = calendar.getTime();
        user.setDateofBirth(dateOfBirthd);
        assertEquals(ETALONE_AGE_5, user.getAge());
    }
}
