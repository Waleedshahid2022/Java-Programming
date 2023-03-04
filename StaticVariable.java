package GeeksforGeeks;

public class StaticVariable {
    static String myName;

    public static void main(String[] args) {
        System.out.println("By using Object 1");
        System.out.println("Before Decleration " + myName);
        myName= "Waleed";
        System.out.println("After Decleration "+ myName);

        InstanceVariables obj2 = new InstanceVariables();
        System.out.println( obj2.myName);

    }
}
