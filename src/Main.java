import java.util.HashMap;
import java.util.Map;

class StudentManager {
    private Map<String, Student> students;

    public StudentManager() {
        this.students = new HashMap<>();
    }
}
class Student {
    private String name;
    private String surname;
    private String studentId;

    public Student(String name, String surname, String studentId) {
        this.name = name;
        this.surname = surname;
        this.studentId = studentId;
    }
}
class StudentManagerTests {

    public static void main(String[] args) {
        StudentManagerTests tests = new StudentManagerTests();
    }
}