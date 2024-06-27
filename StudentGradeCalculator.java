import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the total number of subjects: ");
        int len = s1.nextInt();
        System.out.println("Please enter a list of your subject totals: ");
        String inputted = s1.nextLine();
        String[] inputList = inputted.split(",");

        double[] marksList = new double[len];

        for(i=0; i<inputList.length; i++){
            marksList[i] = Double.parseDouble(inputList[i]);
        }

        
        

        
    }
}
