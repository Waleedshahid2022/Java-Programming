package GeeksforGeeks;

public class BlankFinalVariable {
    public static void main(String[] args) {
        final int i;
        i=10;
        // i=20 not allowed becuase i is already defined
        System.out.println(i);
    }
}
