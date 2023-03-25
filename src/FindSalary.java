import java.util.Scanner;

public class FindSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] hoursWorked = new int[7];
        int salary = 0;

        System.out.println("Enter hours worked for each day:");
        hoursWorked[0] = scanner.nextInt();
        hoursWorked[1] = scanner.nextInt();
        hoursWorked[2] = scanner.nextInt();
        hoursWorked[3] = scanner.nextInt();
        hoursWorked[4] = scanner.nextInt();
        hoursWorked[5] = scanner.nextInt();
        hoursWorked[6] = scanner.nextInt();

        //for sunday
        salary += hoursWorked[0] *100 * 1.5;
        //for saturday
        salary += hoursWorked[6] *100 * 1.25;

        for(int i = 1; i < 6 ;i++){
            if(hoursWorked[i] > 8){
                salary += (hoursWorked[i] - 8)*115 + 800;
            }
            else{
                salary += hoursWorked[i] *100;
            }
        }

        System.out.println(salary);

    }
}