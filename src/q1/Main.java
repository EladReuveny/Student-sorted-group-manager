/*
* @package Maman14Q1.q1

 The q1.Main class is the entry point to the program, and it handles the input and output to the user.
 It creates a q1.SortedGroup of q1.Student objects and allows the user to add and remove students.
 It also displays the current state of the q1.SortedGroup to the user.

 * @author Elad Reuveny
 */

package q1;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SortedGroup<Student> students = new SortedGroup<Student>();
        Scanner scn = new Scanner(System.in);
        int i = 0;
        do {
            System.out.println("Do you want to add a student? (y/n) ");
            String choice = scn.nextLine().toLowerCase();
            while (!choice.equals("y") && !choice.equals("n")) {
                System.out.println("Press only (y/n)");
                choice = scn.nextLine().toLowerCase();
            }
            if (choice.equals("n")) {
                break;
            }
            Student s = new Student("student" + (i + 1), i + 1);
            students.add(s);
            i++;
        } while (true);
        System.out.println("The group contains " + i + " students.");


        System.out.println("\nBefore REMOVING: ");
        Iterator<Student>iterator1 = students.iterator();
        while (iterator1.hasNext()) {
            Student s = iterator1.next();
            System.out.println(s.toString());
        }

        do {
            System.out.println("\nDo you want to remove a student? (y/n)");
            String choice = scn.nextLine().toLowerCase();
            while (!choice.equals("y") && !choice.equals("n")) {
                System.out.println("Press only (y/n)");
                choice = scn.nextLine().toLowerCase();
            }
            if (choice.equals("n")) {
                break;
            }
            System.out.println("Enter the NAME and ID, respectively,  of the student to be removed: ");
            String name = scn.nextLine();
            int id = scn.nextInt();
            scn.nextLine();
            int removedStudents = students.remove(new Student(name, id));
            System.out.println("\nAfter REMOVING: ");
            Iterator<Student> iterator2 = students.iterator();
            while (iterator2.hasNext()) {
                Student s = iterator2.next();
                System.out.println(s.toString());
            }
            System.out.println(removedStudents + " student(s) have been removed.");
        } while (true);

        System.out.println("\nq1.Reduce TEST: ");
        SortedGroup<Student> reduceStudents = new SortedGroup<Student>();
        Student studentReduceTest = new Student("q1.Student q1.Reduce Test", 60, 60);
        reduceStudents = Reduce.reduce(students, studentReduceTest);
        Iterator<Student>iterator3 = reduceStudents.iterator();
        while (iterator3.hasNext()) {
            Student s = iterator3.next();
            System.out.println(s.toString());
        }
    }
}
