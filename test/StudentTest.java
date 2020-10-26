import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testAddSubject() {
        Student solomon = new Student(123,"Solomon", LocalDate.of(1998,10,10));
        Subject db = new Subject("db",83);
        solomon.addSubject(db);
        assertEquals("db", db.getSubjectName());
    }

    @Test
    void testAddSubjectAndGrade() {
        Student solomon = new Student(123,"Solomon", LocalDate.of(1998,10,10));
        Student ese = new Student(123,"Ese", LocalDate.of(1996,12,7));

        Subject html = new Subject("html", 89);
        Subject chem = new Subject("chem401", 90);

        ese.addSubject(chem);
        solomon.addSubject(html);

        solomon.addSubjectAndGrade(html.getSubjectName(),html.getGrade());
        ese.addSubjectAndGrade(chem.getSubjectName(),chem.getGrade());

        assertEquals(ese.getSubjectsAndGrades(),ese.getSubjectsAndGrades());
    }


}
