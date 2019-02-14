import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculatorDemo {

    private int gradePercentage;
    private String letterGradeA = "A";
    private String letterGradeB = "B";
    private String letterGradeC = "C";
    private String letterGradeD = "D";
    private String letterGradeF = "F";
    private String letterGrade;

    ArrayList<Integer> collectionOfPercentageGrades = new ArrayList<>();

    private int percentageGrade1;
    private int percentageGrade2;
    private int percentageGrade3;
    private int percentageGrade4;
    private int percentageGrade5;


    public void enterPercentageGradesIntoArray (int percentageGrade1, int percentageGrade2, int percentageGrade3, int percentageGrade4, int percentageGrade5){
        collectionOfPercentageGrades.add(percentageGrade1);
        collectionOfPercentageGrades.add(percentageGrade2);
        collectionOfPercentageGrades.add(percentageGrade3);
        collectionOfPercentageGrades.add(percentageGrade4);
        collectionOfPercentageGrades.add(percentageGrade5);
    }

    public String returnLetterGradeFromPercentage (int gradePercentage){
        if(gradePercentage <= 100 && gradePercentage >=90){
            return letterGradeA;
        }else if(gradePercentage <= 89 && gradePercentage >= 80){
            return letterGradeB;
        }else if(gradePercentage <= 79 && gradePercentage >=70){
            return letterGradeC;
        }else if(gradePercentage <= 69 && gradePercentage >=60){
            return letterGradeD;
        }else{
            return letterGradeF;
        }
    }

    public double returnAveragePercentageFromCollectionOfPercentages () {
        double sum = 0;
        for (double averagingArrayLoop: collectionOfPercentageGrades) {
            sum += averagingArrayLoop; }
        return sum/collectionOfPercentageGrades.size();
    }

    public double returnCorrespondingNumberGradeFromLetterGrade (String letterGrade){
        if(letterGrade.equalsIgnoreCase("A")){
            return 4.0;
        }else if(letterGrade.equalsIgnoreCase("A-")){
            return 3.75;
        }else if(letterGrade.equalsIgnoreCase("B+")){
            return 3.25;
        }else if(letterGrade.equalsIgnoreCase("B")){
            return 3.0;
        }else if(letterGrade.equalsIgnoreCase("B-")){
            return 2.75;
        }else if(letterGrade.equalsIgnoreCase("C+")){
            return 2.5;
        }else if(letterGrade.equalsIgnoreCase("C")){
            return 2.0;
        }else if(letterGrade.equalsIgnoreCase("C-")){
            return 1.75;
        }else if(letterGrade.equalsIgnoreCase("D+")){
            return 1.5;
        }else if(letterGrade.equalsIgnoreCase("D")){
            return 1.0;
        }else if(letterGrade.equalsIgnoreCase("D-")){
            return 0.75;
        }else{
            return 0.0;
        }
    }








}
