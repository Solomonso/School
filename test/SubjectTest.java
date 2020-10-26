import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {

    @Test
    void testGetSubjectName() {
        Subject db = new Subject("db",83);
        assertEquals("db",db.getSubjectName());
    }

    @Test
    void testSubjectName() {
        Subject php = new Subject("php",74);
        php.setSubjectName("C");
        assertEquals("C",php.getSubjectName());
    }

    @Test
    void testGetGrade() {
        Subject php = new Subject("php", 74);
        assertEquals(74, php.getGrade());
    }

    @Test
    void testSetGrade() {
        Subject os = new Subject("Os", 84);
        assertEquals(84, os.getGrade());
    }
}
