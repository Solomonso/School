import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * The School class contains the students in the school.
 * HashSet adds the students to the school.
 */
public class School {
    private String schoolName;
    private HashSet<Student> studentList;

     public School(String schoolName)
     {
         this.schoolName = schoolName;
         studentList = new HashSet<Student>();
     }

    /**
     * This method add a student into the school.
     * @param student Accepts a student object.
     */
    public void addStudent(Student student)
     {
         studentList.add(student);
     }

    /**
     *
     * @return Return the students in the school.
     */
    public HashSet<Student> getStudentList()
    {
        return this.studentList;
    }

    /**
     * This method gets a result of a student base on their Student name.
     * @param name Accepts a string to represent the name of the student.
     * @return Returns the student name and grades.
     */
    public String studentResult(String name)
    {
        StringBuilder result = new StringBuilder();
        for(Student student: studentList)
        {
            HashMap<String, Integer> subjects = student.getSubjectsAndGrades();
            if(student.getStudentName().equalsIgnoreCase(name))
            {
                for(Map.Entry<String, Integer> pair: subjects.entrySet())
                {
                         result.append("Student name ").append(name).append(", Subject:").append(pair.getKey()).append(" Grade:").append(pair.getValue()).append(" ");
                }
            }
        }
        return result.toString();

    }

    /**
     * This method prints the name of student  who failed a subject (less than 50)
     * @param subjectName Accepts a String to represent the subject name.
     */
    public void studentWhoFailed(String subjectName)
    {
        for(Student student: studentList)
        {
            HashSet<Subject> subjects = student.getSubjects();
            for(Subject s: subjects)
            {
                if(s.getSubjectName().equalsIgnoreCase(subjectName))
                {
                    if(s.getGrade() < 50)
                    {
                        System.out.println(student.getStudentName() + " has insufficient grade in " + subjectName);
                    }
                }
            }
        }
    }

    /**
     * This methods returns a school name in a url format.
     * @return Returns a a school name in url format.
     */
    public String schoolNameInUrl()  {
       return StringHelper.makeStringUrl(getSchoolName());
    }

    public String getSchoolName()
    {
        return schoolName;
    }


    public void setSchoolName(String schoolName)
    {
        this.schoolName = schoolName;
    }

}
