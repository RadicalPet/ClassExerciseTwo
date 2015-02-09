/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jagenau
 */
public class ClassExercise {

    
    static ArrayList<Students> students = new ArrayList<>();
    static ArrayList<International> international = new ArrayList<>();
    static ArrayList<Teachers> teachers = new ArrayList<>();
    
    public static void main(String[] args) {
        
        
        Students student1 = new Students(0, "Martin Palimm", "Mobile", "Web Development", 1);
        students.add(student1);
        Students student2 = new Students(1, "Maria Plomm", "Security", "Web Development", 2);
        students.add(student2);
        Students student3 = new Students(0, "Norman Blah", "Bullshitting", "IT Management", 1);
        students.add(student3);
        
        International int1 = new International (1, "Carrie Wormwood", "Mobile", "Web Development", 2, "UK");
        international.add(int1);
        
        Teachers teacherOne = new Teachers(0, "Holger Breit", "Web Development", "A-3", Arrays.asList("Mobile", "Frontend", "NoSQL"));
        teachers.add(teacherOne);
        
        enterStudentControl();
        enterIntControl();
        enterTeacherControl();
        
        int countFirst = 0;
        int countSecond = 0;
        
        System.out.println("Students in Web Development:");
        for (Students student : students) {
            if ("Web Development".equals(student.getProgramme())) {
                System.out.println(student.getName());
            }
            if (student.getSemester() == 1){
                countFirst = countFirst + 1;
            }
            if (student.getSemester() == 2){
                countSecond = countSecond + 1;
            }
        }
        
        int quot = countFirst - countSecond;
        int perc = 100 - (quot * 100 / countFirst);
        String percentage = Integer.toString(perc);
        
        System.out.println("There are " + percentage + "% more students in first semester.");
        
        for (Teachers teacher : teachers) {
            System.out.println();
            System.out.println("Teachers:");
            System.out.println(teacher.getName() + " - ");
            for (int j = 0; teacher.getCourses().size() > j; j++) {
                System.out.println(teacher.getCourses().get(j));
            }
        }
        System.out.println();
    }
    public static void enterStudent(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter student gender. (0 for male, 1 for female, 2 for other):");
        int inpGender = scan.nextInt();
        System.out.println("Enter full name:");
        scan.nextLine();
        String inpName = scan.nextLine();
        System.out.println("Enter course:");
        String inpCourse = scan.nextLine();
        System.out.println("Enter programme:");
        String inpProgramme = scan.nextLine();
        System.out.println("Enter semester:");
        int currentSemester = scan.nextInt();
        students.add(new Students(inpGender, inpName, inpCourse, inpProgramme, currentSemester ));
    }
    public static void enterStudentControl(){
        System.out.println("Do you want to enter a new student? (y for yes, n for no):");
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        if(null != answer)switch (answer) {
            case "y":
                enterStudent();
                enterStudentControl();
                break;
            case "n":
                break;
            default:
                enterStudentControl();
                break;
        }
    }
    public static void enterInternational(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter student gender. (0 for male, 1 for female, 2 for other):");
        int inpGender = scan.nextInt();
        System.out.println("Enter full name:");
        scan.nextLine();
        String inpName = scan.nextLine();
        System.out.println("Enter course:");
        String inpCourse = scan.nextLine();
        System.out.println("Enter programme:");
        String inpProgramme = scan.nextLine();
        System.out.println("Enter semester:");
        int currentSemester = scan.nextInt();
        System.out.println("Enter country code:");
        String inpCountry = scan.nextLine();
       
        international.add(new International(inpGender, inpName, inpCourse, inpProgramme, currentSemester, inpCountry));
    }
    public static void enterIntControl(){
        System.out.println("Do you want to enter a new international student? (y for yes, n for no):");
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        if(null != answer)switch (answer) {
            case "y":
                enterInternational();
                enterIntControl();
                break;
            case "n":
                break;
            default:
                enterIntControl();
                break;
        }
    }
    public static void enterTeacher(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter teacher gender. (0 for male, 1 for female, 2 for other):");
        int inpGender = scan.nextInt();
        System.out.println("Enter full name:");
        scan.nextLine();
        String inpName = scan.nextLine();
        System.out.println("Enter programme:");
        String inpProgramme = scan.nextLine();
        System.out.println("Enter office:");
        String inpOffice = scan.nextLine();
        String inpCourse = "q";
        List<String> inpCourses = new ArrayList<>();
        
         do{
            System.out.println("Enter course or q to quit:");
            inpCourse = scan.nextLine();
            inpCourses.add(inpCourse);
        }while(!"q".equals(inpCourse));
         
       teachers.add(new Teachers(inpGender, inpName, inpProgramme, inpOffice, inpCourses));
    }
    public static void enterTeacherControl(){
        System.out.println("Do you want to enter a new teacher? (y for yes, n for no):");
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        if(null != answer)switch (answer) {
            case "y":
                enterTeacher();
                enterTeacherControl();
                break;
            case "n":
                break;
            default:
                enterTeacherControl();
                break;
        }
    }
}
