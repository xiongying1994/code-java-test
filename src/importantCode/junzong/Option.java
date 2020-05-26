package importantCode.junzong;

import importantCode.junzong.entity.Student;

import java.util.Optional;

public class Option {
    public static void main(String[] args) {
        Student student = new Student();
        Optional.ofNullable(student);
    }
}
