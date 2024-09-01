import java.util.Arrays;
import java.util.Locale;

public class ArrayManipulations {
    public ArrayManipulations() {
    }

    public static void main(String[] var0) {
        double[] var1 = new double[]{8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(var1);
        System.out.printf(Locale.US, "%n doubleArray: ");
        double[] var2 = var1;
        int var3 = var1.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            double var5 = var2[var4];
            System.out.printf(Locale.US, " %.1f ", var5);
        }

        int[] var8 = new int[10];
        Arrays.fill(var8, 7);
        displayArray(" filledIntArray", var8);
        int[] var9 = new int[]{1, 2, 3, 4, 5, 6};
        int[] var10 = new int[var9.length];
        System.arraycopy(var9, 0, var10, 0, var9.length);
        displayArray("intArray", var9);
        displayArray("intArrayCopy", var10);
        boolean var11 = Arrays.equals(var9, var10);
        System.out.printf("%n%nintArray %s intArrayCopy%n", var11 ? "== " : "!=");
        var11 = Arrays.equals(var9, var8);
        System.out.printf("intArray %s filledIntArray%n", var11 ? "==" : "!=");
        int var6 = Arrays.binarySearch(var9, 5);
        if (var6 >= 0) {
            System.out.printf("Found 5 at element in intArrray %n", var6);
        } else {
            System.out.printf("Not found");
        }

        int var7 = Arrays.binarySearch(var9, 8763);
        if (var7 >= 0) {
            System.out.printf("Found 5 at element in intArrray %n", var7);
        } else {
            System.out.printf("Not found");
        }

    }

    public static void displayArray(String var0, int[] var1) {
        System.out.printf("%s%n", var0);
        int[] var2 = var1;
        int var3 = var1.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int var5 = var2[var4];
            System.out.printf("%d ", var5);
        }

    }
}
