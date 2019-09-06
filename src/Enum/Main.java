package Enum;

public class Main {

    public static void main(String[] args) {

        University.Faculty[] faculty = University.Faculty.values();
        for(University.Faculty f : faculty) {
            System.out.println(f);
        }

    }
}