package demo.Task1;

/**
 * Clarity
 */
public class Clarity {

    private String studentName;

    public Clarity(String studentName) {
        this.studentName = studentName;
    }


    public void greet() {
        System.out.println("Hello, " + studentName + "!");
    }

    public static void main(String[] args) {
        Clarity test = new Clarity("Student");
        test.greet();
    }
}
