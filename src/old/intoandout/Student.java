package old.intoandout;

import java.util.List;

public class Student {
    int age;
    String className;
    List<Student> studentName;

    public Student(int age, String className, List<Student> studentName){
        this.age = age;
        this.className = className;
        this.studentName = studentName;
    }
    public static void main(String[] args) {
        SeasonEnum season = SeasonEnum.SUMMER;
        System.out.println(season);
        System.out.println(season.getValue());

        System.out.println(SeasonEnum.WINTER.getValue());
        if (true) {
            System.out.println("is true");
        }
    }

}
