package killianhalpin.killianassignment.ADT;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private Person validPerson;

    @BeforeEach
    public void setUp() {
        validPerson = new Person(12345678,"Killian","28/11/2001","0862287289","none","123456","","");
    }
    @Test
    void getPps() {
        assertEquals(12345678,validPerson.getPps());
    }

    @Test
    void setPps() {
        validPerson.setPps(123456789);
        System.out.println(validPerson.getPps());
        assertEquals(123456789,validPerson.getPps());

    }

    @Test
    void getName() {
        assertEquals("Killian",validPerson.getName());
    }

    @Test
    void setName() {
        validPerson.setName("Bob");
        System.out.println(validPerson.getName());
        assertEquals("Bob",validPerson.getName());
    }

    @Test
    void getDob() {
        assertEquals("28/11/2001",validPerson.getDob());
    }



    @Test
    void setDob() {
        validPerson.setDob("29/11/2001");
        System.out.println(validPerson.getDob());
        assertEquals("29/11/2001",validPerson.getDob());
    }


    @Test
    void getContinfo() {
    }

    @Test
    void setContinfo() {
    }

    @Test
    void getAccessability() {
    }

    @Test
    void setAccessability() {
    }

    @Test
    void testToString() {
    }
}