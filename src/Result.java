/**
 * Created by HarishV on 8/6/15.
 */
public class Result {
    private String modCode, grade;
    private int credits;
    public Result(String modCode, String grade,int credits){
        this.modCode = modCode;
        this.grade = grade;
        this.credits = credits;
    }

    public int getCredits() {
        return this.credits;
    }
    public String getGrade() {
        return grade;
    }
    public String getModCode() {
        return modCode;
    }
}
