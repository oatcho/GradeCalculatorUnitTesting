public class GradeCalculatorDemo {

    private int gradePercentage;
    private String letterGradeA = "A";
    private String letterGradeB = "B";
    private String letterGradeC = "C";
    private String letterGradeD = "D";
    private String letterGradeF = "F";

    public void enterGradePercentage (){
        gradePercentage = 56;
    }

    public String returnLetterGradeFromPercentage (){
        if(gradePercentage <= 100 && gradePercentage >=90){
            return letterGradeA;
        }else if(gradePercentage <= 89 && gradePercentage >= 80){
            return letterGradeB;
        }else if(gradePercentage <= 79 && gradePercentage >=70){
            return letterGradeC;
        }else if(gradePercentage <=69 && gradePercentage >=60){
            return letterGradeD;
        }else{
            return letterGradeF;
        }
    }


}
