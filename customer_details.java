import java.util.Scanner;
public class Customer_details extends Room_details
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Room_details r=new Room_details();
        System.out.print("Enter the Customer name: ");
        String Cname=in.nextLine();
        System.out.print("Enter the date: ");
        String date=in.nextLine();
        System.out.println(":Customer Details:");
        System.out.println("Name :"+Cname);
        System.out.println("Date :"+date);
        System.out.println("Room NO :"+r.detail(101));
    }
}