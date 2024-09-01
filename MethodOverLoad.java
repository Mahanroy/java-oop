import java.util.Locale;
public class MethodOverLoad {
    public static void main(String[] arge){
        System.out.printf("Square of 7 is %d%n", square(7));
        System.out.printf(Locale.US,"Square of 7.5 is %f%n", square(7.5));
    }
    public static int square(int intValue){
        System.out.printf("Called square with int argument: %d\n" ,intValue);
        return intValue*intValue;
    }
    public static double square(double doubleValue){
        System.out.printf("Called square with double argument: %f\n" ,doubleValue,Locale.US);
        return doubleValue*doubleValue;
    }
}
