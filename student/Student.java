package student;
public class Student {
    private String name3;
    private int id;
    private int [] grade;
    public Student(String name) {
        this.name3 = name;
    }
    public Student(int id) {
        this.id = id;
    }
    public Student(int[] grade) {
        this.grade = grade;
    }
    public int[] getGrade() {
        return grade;
    }
    public void setGrade(int[] grade) {
        this.grade = grade;
    }
    public String getName() {
        return name3;
    
    public void setName(String name) {
        this.name3 = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
