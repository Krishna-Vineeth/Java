import java.util.Scanner;
public class EmployeeMain {

    public static void main(String[] args) {

        Employee arr[] = new Employee[1];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter employee"+(i+1)+"records");
            String name = sc.next();
            String designation = sc.next();
            int empid = sc.nextInt();
            double salary = sc.nextDouble();

            arr[i] = new Employee(name, designation, empid, salary);

        }
    
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        for(Employee emp:arr)
        {
            System.out.println(emp);
        }


    }
}
