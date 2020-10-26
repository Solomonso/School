import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

/**
 * The Student class contains the student in the school.
 * Student no of the student.
 * Student name of the student.
 * Date of birth of the student.
 * A HashSet use for adding the subject before storing it into the HashMap.
 * A HashMap is used in storing the subject and grade of the student.
 */
public class Student {
    private int studentNo;
    private String studentName;
    private LocalDate dateOfBirth;
    private HashMap<String, Integer> subjectAndGrade;
    private HashSet<Subject> subjects;

    /**
     * Creates A Student.
     * @param studentNo Accepts an integer for the student no.
     * @param studentName Accepts a String for the student name.
     * @param dateOfBirth Used LocalDate to represent the date of birth of student (YYYY-MM-DD).
     */
    public Student(int studentNo, String studentName, LocalDate dateOfBirth)
    {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.dateOfBirth = dateOfBirth;
        subjectAndGrade = new HashMap<String, Integer>();
        subjects = new HashSet<>();
    }

    /**
     *
     * @return return the date of birth of student
     */
    public LocalDate getDateOfBirth()
    {
        return this.dateOfBirth;
    }

    /**
     * This method adds the student subjects into the HashMap.
     * @param subject accepts a Subject object
     */
    public void addSubject(Subject subject)
    {
        this.subjects.add(subject);
    }

    /**
     * This method adds the student subject and grade into the hashmap. And the student cannot get more than 10 grades.
     * @param subject Accepts a string to represent the student subject.
     * @param grade Accepts a int to represent the grade of the student.
     */
    public void addSubjectAndGrade(String subject, int grade)
    {
            if(!(subjectAndGrade.size() > StringHelper.MAX_GRADE))
            {
                subjectAndGrade.put(subject, grade);
            }
    }

    /**
     *  The methods sets the student name.
     * @param studentName Accepts a String to set the studentName
     */
    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    /**
     * This methods returns all the subject.
     * @return Returns the student subjects.
     */
    public HashSet<Subject> getSubjects()
    {
        return this.subjects;
    }

    public void setStudentNo(int studentNo)
    {
        this.studentNo = studentNo;
    }

    /**
     *
     * @return Returns the student age
     */
    public int getStudentAge()
    {
        return LocalDate.now().getYear() - this.dateOfBirth.getYear();
    }

    /**
     * This method gets students details in url
     * @return Return student name and dob in url format.
     */
    public String studentDetailsInUrl()
    {

        return StringHelper.makeStringUrl(getStudentName() + ":" + getDateOfBirth());
    }

    /**
     * This methods returns all the subjects and grade of a student.
     * @return the students subject and grade.
     */

    public HashMap<String, Integer> getSubjectsAndGrades()
    {
        return this.subjectAndGrade;
    }

    public int getStudentNo()
    {
        return studentNo;
    }

    public String getStudentName()
    {
        return studentName;
    }

}
