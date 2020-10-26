import java.net.MalformedURLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Main {

    public static LocalTime testTime()
    {
        LocalTime time = LocalTime.of(1,10,30);
        LocalTime time1 = LocalTime.parse("06:30:10");
        return  time;
    }

    public static String test(int a)
    {
        return "Episode is " + testTime() + " Long";
    }

    public static void main(String[] args)  {
        //Creates all the objects
        School school = new School("wofs");

        Student solomon = new Student(12,"Solomon", LocalDate.of(1998,10,10));

        Subject db = new Subject("db", 83);
        Subject cSharp = new Subject("C#", 71);
        Subject os = new Subject("Os", 84);
        Subject db2 = new Subject("Php", 74);
        Subject java2 = new Subject("Html", 89);
        Subject php = new Subject("php", 74);

        //add a subject to a student
        solomon.addSubject(db);
        solomon.addSubject(cSharp);
        solomon.addSubject(os);

        //add a student subject and grade
        solomon.addSubjectAndGrade(os.getSubjectName(),os.getGrade());
        solomon.addSubjectAndGrade(cSharp.getSubjectName(),cSharp.getGrade());
        solomon.addSubjectAndGrade(db.getSubjectName(),db.getGrade());

        //add a student to a school
        school.addStudent(solomon);

        System.out.println(school.studentResult("Solomon"));
        school.studentWhoFailed("db");

    }
}
