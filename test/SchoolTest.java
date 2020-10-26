import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {
    @Test
    void testGetSchoolName() {
        School wofs = new School("wofs");
        assertEquals("wofs", wofs.getSchoolName());
    }

    @Test
    void testSetSchoolName() {
        School stenden = new School("stenden");
        stenden.setSchoolName("NhlStenden");
        assertEquals("NhlStenden", stenden.getSchoolName());
    }

    @Test
    void testAddStudent() {
        School school = new School("stenden");
        Student solomon = new Student(12,"Solomon", LocalDate.of(1998,10,10));
        school.addStudent(solomon);
        assertEquals("Solomon",solomon.getStudentName());
    }

}
