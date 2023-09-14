import java.util.Scanner;
public class Dateable {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double age;
        System.out.println ("Please enter your age:");
        age = Integer.parseInt(scan.nextLine());
        double dateAge = (age/2)+7;
        System.out.println(age+" year olds should date somebody who is at least "+ dateAge +" years old.");
    }
}
