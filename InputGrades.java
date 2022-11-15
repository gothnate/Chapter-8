import java.util.Scanner;

public class InputGrades {
    public static void main(String[] args) {

        final int NUM_STUDENTS = 1;
        final int NUM_COURSES = 5;

        Student[] students = new Student[NUM_STUDENTS];
        int s;
        int c;
        int stId;
        int csIndex;
        String courseId = "";
        int hours = 0;
        char grade = 'z';
        CollegeCourse course = new CollegeCourse(courseId,hours, grade);

        Scanner input = new Scanner(System.in);

        for(s = 0; s<NUM_STUDENTS; ++s)
        {
            students[s] = new Student(s);
            System.out.println("Enter ID for student #" + (s+1) + ":");
            stId = input.nextInt();
            input.nextLine();
            students[s].setStudentId(stId);
            for(c=0; c < NUM_COURSES; ++c)
            {
                csIndex=c;
                System.out.println("Enter course ID#" + (c+1) + ":");
                courseId = input.nextLine();
                course.setCourseId(courseId);
                System.out.println("Enter hours:");
                hours = input.nextInt();
                input.nextLine();
                course.setHours(hours);

                String enteredGrade = "";
                while (enteredGrade.length() != 1) {
                    System.out.println("Enter grade:");
                    enteredGrade = input.nextLine();
                    if (enteredGrade.length() == 1) {
                        grade = enteredGrade.charAt(0);
                    } else {
                        System.out.println("Type only one character!");
                    }
                }
                System.out.println();
                course.setGrade(grade);
                students[s].setCourse(csIndex, course);
            }
        }
        
        for(s = 0; s<NUM_STUDENTS; ++s)
        {
            System.out.println("\nStudent# " + students[s].getStudentId());
            for(c=0;c<NUM_COURSES;++c)
                System.out.println(students[s].getCourse(c) + " ");
                System.out.println(students[s].getCourse(grade));
                System.out.println();
        }
    }
}