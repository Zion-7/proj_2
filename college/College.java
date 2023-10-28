package college;
import java.lang.reflect.Array;
public class College {
    private String name1;
    private Array [] teachers ;
    private Array [] students ;
    public College(String name) {
        this.name1 = name;
    }
    public String getName() {
        return name1;
    }
    public void setName(String name) {
        this.name1 = name;
    }

    public College(Array[] students) {
        this.students = students;
    }
    public Array[] getStudents() {
        return students;
    }
    public void setStudents(Array[] students) {
        this.students = students;
    }
    public Array[] getTeachers() {
        return teachers;
    }
    public void setTeachers(Array[] teachers) {
        this.teachers = teachers;
    }
}