import java.util.HashMap;
import java.util.Map;

class StudentManager {
    private Map<String, Student> students;

    public StudentManager() {
        this.students = new HashMap<>();
    }

    public boolean addStudent(String name, String surname, String studentId) {
        if (students.containsKey(studentId)) {
            return false;
        }
        Student newStudent = new Student(name, surname, studentId);
        students.put(studentId, newStudent);
        return true;
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

    void testAddStudent() {
        StudentManager manager = new StudentManager();
        String name = "John";
        String surname = "Doe";
        String studentId = "12345";

        boolean result = manager.addStudent(name, surname, studentId);

        assert result : "Adding student failed.";
    }

    void testAddDuplicateStudent() {
        StudentManager manager = new StudentManager();
        String name = "John";
        String surname = "Doe";
        String studentId = "12345";

        manager.addStudent(name, surname, studentId);
        boolean result = manager.addStudent(name, surname, studentId);

        assert !result : "Adding duplicate student should fail.";
    }


    public static void main(String[] args) {
        StudentManagerTests tests = new StudentManagerTests();
        tests.testAddStudent();
        tests.testAddDuplicateStudent();
    }
}