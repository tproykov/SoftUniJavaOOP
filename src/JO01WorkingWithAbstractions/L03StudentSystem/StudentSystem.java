package JO01WorkingWithAbstractions.L03StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {

    private Map<String, Student> studentMap;

    public StudentSystem() {
        this.studentMap = new HashMap<>();
    }

    public void parseCommand(String[] command) {

        if (command[0].equals("Create")) {

            String name = command[1];
            int age = Integer.parseInt(command[2]);
            double grade = Double.parseDouble(command[3]);

            if (!studentMap.containsKey(name)) {
                Student student = new Student(name, age, grade);
                studentMap.put(name, student);
            }
        } else if (command[0].equals("Show")) {

            String name = command[1];
            if (studentMap.containsKey(name)) {

                Student student = studentMap.get(name);

                String view = String.format("%s is %s years old.", student.getName(), student.getAge());

                if (student.getGrade() >= 5.00) {
                    view += " Excellent student.";
                } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
                    view += " Average student.";
                } else {
                    view += " Very nice person.";
                }

                System.out.println(view);
            }
        }
    }
}
