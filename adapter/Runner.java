package adapter;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
//        when we have client code(UI/App) which expects this data in certain format
//        and the data sender is a legacy code
//        in both places we don't want to change anything
//        so we write a adapter for client code, so it can take the data in expected format

//        eg: charging phones using different pins across countries as socket is not same in every country
//        Arrays.asList() is an example, read API note

        StudentClient studentClient=new StudentClient();
        List<Student> students=studentClient.getStudents();

        System.out.println(students);
    }
}
