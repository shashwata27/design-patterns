package adapter;

public class CollegeStudent implements Student{
    private final String name;
    private final Integer year;
    private final String email;

    CollegeStudent(String name, Integer year, String email){
        this.name=name;
        this.year=year;
        this.email=email;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getYear() {
        return this.year;
    }

    @Override
    public String getEmail() {
        return this.email;
    }
}
