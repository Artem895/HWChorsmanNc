package ChorsmanHomeWork.ChHW3.Ch9;

import java.util.Scanner;

public class Tets9 {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Hourly("Morgan, Harry", 30);
        staff[1] = new Salaried("Lin, Sally", 52000);
        staff[2] = new Manager("Smith, Mary", 104000, 50);
        Scanner in = new Scanner(System.in);
        for (Employee e : staff)
        {
            System.out.print("Hours worked by " + e.getName() + ": ");
            int hours = in.nextInt();
            System.out.println("Salary: " + e.weeklyPay(hours));
        }
    }
}
