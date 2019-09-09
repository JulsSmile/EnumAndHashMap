package Enum;

import java.util.List;

public class University{
    private String univerName;
    private List<Student> students;

    public enum Faculty{
        PSYCHOLOGY,
        JAVALOGY,
        SOCIALOGY,
        POLITOLOGY
    }

    public enum Group{
        PS1, PS2,
        J1, J2, J3,
        SO1, SO2, SO3,
        PO1, PO3
    }

    public enum Course{
        first("1-й курс"),
        second("2-й курс"),
        third("3-й курс"),
        fousth("4-й курс");
        private String course;

        Course(String course) {
            this.course = course;
        }

        public String getCourse() {
            String course = "";
            return course;
        }

        @Override
        public String toString() {
            return course;
        }
    }

    public University(String univerName, List<Student> students) {
        this.univerName = univerName;
        this.students = students;
    }

    @Override
    public String toString() {
        return univerName + "\n" + students + "\n";
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