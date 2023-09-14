import java.util.Scanner;
public class Pages {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        System.out.println ("Please enter your age:");
        age = Integer.parseInt(scan.nextLine());
        if(age<100)
        {
            int pages = 100-age;
            System.out.println(age+" year olds should read at least "+ pages+" pages before giving up on a book.");
        }else
            System.out.println(age+" year olds do not have to read any pages before giving up a book");
    }
}
