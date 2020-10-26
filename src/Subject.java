/**
 * The Subject class contains the subject name and the grade of the student.
 */
public class Subject {
    //The fields
    private String subjectName;
    private int grade;

    public Subject(String subjectName, int grade)
    {
        this.subjectName = subjectName;
        this.grade = grade;
    }

    public String getSubjectName()
    {
        return subjectName;
    }

    /**
     *  This methods set the subject name.
     * @param subjectName Accepts a string for subject name
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    /**
     *This method get student grade
     * @return Return a int for the student grade.
     */
    public int getGrade() {
        return this.grade;
    }

    /**
     * This method set the grade of the student.
      * @param grade Accepts a integer for the student grade.
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
