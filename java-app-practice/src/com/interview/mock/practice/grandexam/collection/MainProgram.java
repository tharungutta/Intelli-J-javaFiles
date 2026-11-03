package com.interview.mock.practice.grandexam.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainProgram {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Tharun", "CSE", 95));
        students.add(new Student(2, "Arun", "ECE", 85));
        students.add(new Student(3, "Rahul", "CSE", 90));
        students.add(new Student(4, "Kiran", "ECE", 92));
        students.add(new Student(5, "Vijay", "CSE", 85));
        students.add(new Student(6, "Priya", "IT", 96));
        students.add(new Student(7, "Sneha", "IT", 88));
        students.add(new Student(8, "Ravi", "ECE", 78));

        // Step 1: Sort by score descending.
        // If scores are equal, sort by name ascending.

        students.sort(
                Comparator.comparingDouble(Student::getScore)
                        .reversed()
                        .thenComparing(Student::getName)
        );
        System.out.println("STUDENT RANKING");
        System.out.printf("%-8s %-15s %-15s %s%n", "ROLL NO", "NAME", "DEPT", "SCORE");
        System.out.println("---------------------------------------------------------");
        for(Student student :students){
            student.display();
        }

        // Step 2: Display Top 3 students

        System.out.println("\nTop 3 Students");
        students.stream()
                .limit(3)
                .forEach(Student::display);

        // Step 3: Calculate department-wise average

        Map<String, Double> deptAvg = students.stream()
                .collect(
                        Collectors.groupingBy(
                                Student::getDepartment,
                                Collectors.averagingDouble(
                                        Student::getScore
                                )
                        )
                );
        System.out.println("\nDEPT WISE AVG");
        deptAvg.forEach(
                (department, average)-> {
                    System.out.printf("%s : %.2f%n", department, average);
                }
        );

        // Step 4: Students scoring above their department average

        System.out.println("\nSTUDENTS ABOVE THEIR DEPARTMENT AVERAGE");

        students.stream()
                .filter(
                        student -> student.getScore() > deptAvg.get(student.getDepartment())
                )
                .forEach(Student::display);

    }
}
