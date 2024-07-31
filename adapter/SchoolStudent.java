package adapter;

public class SchoolStudent {

    private final String name;
    private final String grade;
    private final String email;

    SchoolStudent(String name, String grade, String email){
        this.name=name;
        this.grade=grade;
        this.email=email;
    }
    public String getName() {
        return this.name;
    }

    public String getGrade() {
        return this.grade;
    }

    public String getEmail() {
        return this.email;
    }
}
