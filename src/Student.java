import java.util.ArrayList;

/**
 * Created by HarishV on 8/6/15.
 */

public class Student {
    private String name;
    private ArrayList<Result> resultArr;

    public Student(String name){
        this.name = name;
        resultArr = new ArrayList<Result>();
    }

    public void addResult(Result newResult){
        resultArr.add(newResult);
    }

    public double getCAP() {
        int totalCredits = this.sumCredits();
        //System.out.println("Total Credits: " + totalCredits);
        double numer = this.getNumer();
        //System.out.println("Numer: "+ numer);
        return numer / (double) totalCredits;
    }

    private int sumCredits(){
        int totalMCs = 0;
        for(int i=0;i<resultArr.size();i++) {
            totalMCs += resultArr.get(i).getCredits();
        }
        return totalMCs;
    }

    private double getNumer(){
        double totalSum = 0.0;
        for(int i=0;i<resultArr.size();i++) {
            int credits = resultArr.get(i).getCredits();
            String grade = resultArr.get(i).getGrade();
            double gradePts = this.getGradePoints(grade);
            totalSum += gradePts * credits;
        }
        return totalSum;
    }

    public String printResult(){
        String output = "====================================\nSummary of " + name + "'s results:\n====================================\n";
        for(int i=0;i<resultArr.size();i++) {
            String modCode = resultArr.get(i).getModCode();
            int credits = resultArr.get(i).getCredits();
            String grade = resultArr.get(i).getGrade();

            output += "Module Code: " + modCode + " MCs: " + credits + " Grade: " + grade + "\n";
            output += "====================================\n";

        }
        return output;
    }

    private double getGradePoints(String grade){
        switch(grade){
            case "A+":
            case "A":
                return 5.0;
            case "A-":
                return 4.5;
            case "B+":
                return 4.0;
            case "B":
                return 3.5;
            case "B-":
                return 3.0;
            case "C+":
                return 2.5;
            case "C":
                return 2.0;
            case "D+":
                return 1.5;
            case "D":
                return 1.0;
            case "F":
                return 0.0;
            default:
                return 0.0;
        }
    }
}



