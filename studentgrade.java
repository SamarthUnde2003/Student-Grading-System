
import java.util.Scanner;

class studentgrade
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Student Grade Calculator.");

        System.out.print("Enter the total number of subjects   :-");

        int totalSub = sc.nextInt();

        int totalMarks = 0;

        for(int i = 1;i<=totalSub;i++){
            System.out.print("Enter the marks of "+i+" subject   :-");
            int marks = sc.nextInt();
            totalMarks = totalMarks + marks;
        }

        double percent = (totalMarks/totalSub);
        
        System.out.println(percent);

        if((percent>=90) && (percent<100))
        {
            System.err.println("A Grade");
        }
        else if((percent>=80) && (percent<90))
        {
            System.err.println("B Grade");
        }
        else if((percent>=70) && (percent<80))
        {
            System.err.println("C Grade");
        }
        else if((percent>=60) && (percent<70))
        {
            System.err.println("D Grade");
        }   
    }
}