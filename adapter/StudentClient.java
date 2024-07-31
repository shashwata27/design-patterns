package adapter;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {
    public List<Student> getStudents() {

        ArrayList<Student> students = new ArrayList<>();

        CollegeStudent collegeStudent=new CollegeStudent("sam",2,"sam@gmail.com");
        students.add(collegeStudent);

        SchoolStudent schoolStudent=new SchoolStudent("smol","5","Smol@gmail.com");
//      client facing so SchoolStudentAdapter
        students.add(new SchoolStudentAdapter(schoolStudent));

        return students;
    }
}
