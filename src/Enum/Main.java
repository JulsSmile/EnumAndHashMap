package Enum;

public class Main{

    public static void main(String[] args) {

        University.Faculty[] faculty = University.Faculty.values();
        for (University.Faculty f : faculty) {
            System.out.println("Faculty: " + f);
        }
        University.Group[] groups = University.Group.values();
        for (University.Group g : groups) {
            System.out.println("Group: " + g);
        }
        University.Course[] course = University.Course.values();
        for (University.Course c : course) {
            System.out.println("Course: " + c);
        }
    }
}