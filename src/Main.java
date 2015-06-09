import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();

        Student student = new Student(name);

        //System.out.println("Thank you" + "Your name is "+ name);

        System.out.print("Please enter the number of modules you want to calculate CAP for: ");
        int numMods = sc.nextInt();

        for(int i=0;i<numMods;i++) {
            System.out.print("Enter Module Code and MCs: ");
            String moduleCode = sc.next();
            int credits = sc.nextInt();
            System.out.print("Please enter grade obtained for " + moduleCode + ": ");
            sc.nextLine();
            String gradeObtained = sc.nextLine();

            Result newResult = new Result(moduleCode,gradeObtained,credits);
            student.addResult(newResult);
        }

        System.out.println("Thank you for the input.\n");
        System.out.println(student.printResult());
        System.out.println("Your final CAP is " + student.getCAP());

        }

    }

