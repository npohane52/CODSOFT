import java.util.Scanner;

public class Grade_Calculator {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks obtained in each subject (out of 100):");

        int Total_Marks = 100;
        int Total_Sub;

        System.out.print("Enter the number of subjects: ");
        Total_Sub = sc.nextInt();

        int[] marks = new int[Total_Sub];

        for (int i = 0; i < Total_Sub; i++)
        {
            System.out.print("Marks of subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            Total_Marks += marks[i];
        }

        double averagePercentage = (double) Total_Marks / Total_Sub; //Calculate total marks

        //Grade Calculation
        char Grade;
        if (averagePercentage >= 90) 
        {
            Grade = 'A';
        } else if (averagePercentage >= 80) 
        {
            Grade = 'B';
        } else if (averagePercentage >= 70) 
        {
            Grade = 'C';
        } else if (averagePercentage >= 60) 
        {
            Grade = 'D';
        } else 
        {
            Grade = 'F';
        }

        System.out.println("\nTotal Marks: " + Total_Marks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + Grade);

        sc.close();
    }
}
