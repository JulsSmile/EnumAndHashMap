package Enum;

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

    public String getStudentsList(String faculty) {
        String result = "";
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) {
                result = result + student.getFirstName() + " " + student.getLastName() + "\n";
            }
        }
        return result;
    }

    public List<Student> getStudentsList_(String faculty) {
        ArrayList<Student> listOfStudentsByFaculty = new ArrayList<Student>();
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) {
                return listOfStudentsByFaculty;
            }
        }
        return null;
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