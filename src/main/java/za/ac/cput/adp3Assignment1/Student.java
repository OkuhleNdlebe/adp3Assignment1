package za.ac.cput.adp3Assignment1;

/**
 * @author Lihle Njobe - 218193882
 *
 * This is a student program
 */
public class Student {

    private String firstName;
    private String lastName;
    private String studentNumber;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    public void set(String fN, String lN, String sN) {
        firstName = fN;
        lastName = lN;
        studentNumber = sN;
    }
    public void show() {
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " +  lastName);
        System.out.println("Student number: "  + studentNumber);
    }
    public static void main(String[] args) {
        Student s = new Student();

        s.set(" Lihle ", " Njobe ", "218193882");

        s.show();

}
}
