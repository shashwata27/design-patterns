package adapter;

public class SchoolStudentAdapter implements Student{
    SchoolStudent schoolStudent;
    SchoolStudentAdapter(SchoolStudent schoolStudent){
        this.schoolStudent=schoolStudent;
    }
    @Override
    public String getName() {
        return this.schoolStudent.getName();
    }

    @Override
    public Integer getYear() {
        int i = Integer.parseInt( this.schoolStudent.getGrade()) - 12;
        return i;
    }

    @Override
    public String getEmail() {
        return this.schoolStudent.getEmail();
    }
}
