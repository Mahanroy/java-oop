public class GradeBooksTest {
    public static void main(String[] args){
        int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        GradeBooks myGradeBooks = new GradeBooks("CS101 Introduction to Java Programming", gradesArray);
        System.out.printf("Welcome to the grade book for %n%s%n%n", myGradeBooks.getCourseName());
        myGradeBooks.processGrade();
    }
}
