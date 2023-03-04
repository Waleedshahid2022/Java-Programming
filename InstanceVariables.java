package GeeksforGeeks;

public class InstanceVariables {
    public String myName;
    void print (String myName){
        System.out.println(this.myName);
    }

    public static void main(String[] args) {

        InstanceVariables obj = new InstanceVariables();
        System.out.println("Before Decleration "+ obj.myName);
        obj.myName="Waleed Shahid";
        System.out.println("After Decleration " + obj.myName);
        String myName = "Shahid";
        obj.print(myName);


    }
}
