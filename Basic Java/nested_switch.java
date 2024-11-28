import java.util.Scanner;

public class nested_switch {
    public static void main(String[] args) {
        System.out.println("Enter the employee id");
        Scanner sc = new Scanner(System.in);
        int empid = sc.nextInt();
        String department = sc.next();
        switch (empid) {
            case 1:
                System.out.println("Shiva Sai");
                break;
            case 2:
                System.out.println("Nitin Raghavendra");
                break;
            case 3:
                System.out.println("Vivekananda Gavini");
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Accouts":
                        System.out.println("Accounts Department");
                        break;
                    default:
                        System.out.println("Enter the correct Department name");
                        break;
                }
                break;
            default:
                System.out.println("Employee doesn't exist.");
                break;
        }
        sc.close();
    }
}
