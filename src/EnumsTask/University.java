package EnumsTask;

import java.util.ArrayList;
import java.util.List;

public class University{
    private String univerName;
    private List<Student> students;

    public University(String univerName, List<Student> students) {
        this.univerName = univerName;
        this.students = students;
    }

    @Override
    public String toString() {
        return "University{" +
                "univerName='" + univerName + '\'' +
                ", students=" + students +
                '}';
    }

    public List<Student> getStudentsList_(String faculty) {
        ArrayList<Student> listOfStudentsByFaculty = new ArrayList<>();
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) {
                System.out.println(student.getLastName());
            }
        }
        return students;
    }

    public List<Student> getStudentsListByFacultyAndGroup() {
        return students;
    }

    public String getStudentsByFacultyAndGroup(String faculty, int group) {
        String result = "";
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) {
                if (student.getGroup().equals(group))
                    result = result + student.getFirstName() + " " + student.getLastName() + "\n";
            }
        }
        return result;
    }

    public String getStudentsListByGroup(Integer group) {
        String result = "";
        for (Student student : students) {
            if (student.getGroup().equals(group)) {
                result = result + student.getFirstName() + " " + student.getLastName() + "\n";
            }
        }
        return result;
    }

    public String getStudentsListByBirsday(Integer birsday) {
        String result = "";
        for (Student student : students) {
            if (student.getBirsday() > birsday) {
                result = result + student.getFirstName() + " " + student.getLastName() + "\n";
            }
        }
        return result;
    }
}