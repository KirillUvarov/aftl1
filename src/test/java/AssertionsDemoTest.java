import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssertionsDemoTest {
    @Test
    @DisplayName("демонстрация утверждения assertTrue и assertFalse")
    void assertTrueAndFalse(){
        //given
        boolean falseValue;
        boolean trueValue;
        //when
        falseValue = getFalse();
        trueValue = getTrue();
        //then
        Assertions.assertTrue(trueValue);
        Assertions.assertFalse(falseValue);

    }
    private boolean getFalse(){return false;}
    private boolean getTrue(){return true;}

    @Test
    @DisplayName("демонстрация ут")
    void assertArrayEquals(){
        //given
        String etalon[] = new String[]{
                "Toyota", "Mercedes", "BMW", "Volkswagen", "Skoda"
        };
        //when
        String result[] = getArrayString();
        //then
        Assertions.assertArrayEquals(etalon, result);

    }
    private String[] getArrayString(){
        String array[] = new String[]{
                "Toyota", "Mercedes", "BMW", "Volkswagen", "Skoda"
        };
        return array;
    }

    //given
    //when
    //then
    @Test
    @DisplayName("демонстрация утверждения assertNotNull и assetrNull")
    void assertNotNullAndAssertNull(){
        //given
        Object isNullValue;
        Object isNotNullValue;
        //when
        isNullValue = getNull();
        isNotNullValue = getNotNull();
        //then
        Assetrions.assertNotNull(isNotNullValue);
        Assetrions.assertNull(isNullValue);

    }

    private Object getNull(){return null;}
    
}
