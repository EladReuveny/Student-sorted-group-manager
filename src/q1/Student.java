/*
 * @package Maman14Q1.q1
 *
 * The q1.Student class represents a student with a name, ID, and grade. It implements the Comparable
 * interface to enable comparison based on the grade. It also overrides the equals' method to compare
 * students based on their name and ID.
 */

package q1;

import java.util.Random;

public class Student implements Comparable<Student> {
    private final String name;
    private final int id;
    private final int grade;

    /**
     * Constructs a new q1.Student object with the given name and ID. The grade is randomly generated.
     *
     * @param name the name of the student
     * @param id the ID of the student
     */
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        Random rnd = new Random();
        this.grade = rnd.nextInt(101);
    }

    /**
     * Constructs a new q1.Student object with the given name, ID, and grade.
     *
     * @param name the name of the student
     * @param id the ID of the student
     * @param grade the grade of the student
     */
    public Student(String name, int id, int grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    /**
     * Returns the name of the student.
     *
     * @return the name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the ID of the student.
     *
     * @return the ID of the student
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the grade of the student.
     *
     * @return the grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     * Returns a string representation of the student.
     *
     * @return a string representation of the student
     */
    public String toString() {
        return "(" + getId() + ") Name: " + getName() + "\tI.D: " + getId() + "\tGrade: " + getGrade();
    }


    /**
     * Compares this student with another student based on their grades.
     *
     * @param student the student to compare with
     * @return a negative integer if this student's grade is lower than the other student,
     *         zero if their grades are equal, or a positive integer if this student's grade
     *         is higher than the other student
     */
    @Override
    public int compareTo(Student student) {
        if (this.grade > student.getGrade())
            return 1;
        else if (this.grade < student.getGrade())
            return -1;
        return 0;
    }

    /**
     * Checks if this student is equal to another object. Two students are considered equal
     * if they have the same name and ID.
     *
     * @param obj the object to compare with
     * @return true if the object is a student with the same name and ID, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Student student))
            return false;
        return this.name.equals(student.getName()) && this.id == student.getId();
    }
}
