import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the total number of subjects: ");
        int len = s1.nextInt();
        s1.nextLine();
        System.out.println("Please enter a list of your subject totals: ");
        String inputted = s1.nextLine();
        String[] inputList = inputted.split(",");

        double[] marksList = new double[len];

        try{
        for(int i=0; i<inputList.length; i++){
            marksList[i] = Double.parseDouble(inputList[i]);
        }
        }
        catch (NumberFormatException e){
            System.out.println("The input string is invalid");
        }
        //Total Marks Calculations:
        Double sum = 0.0;
        for (int j = 0; j<marksList.length; j++){
            sum = sum + marksList[j];
        }
        System.out.println("Total Marks: "+ sum);

        //Average Percentage
        Double avg = sum/len;
        System.out.println("Average Percentage: "+ avg +"%");
        
        //Grade Obtained
        if(avg > 79 && avg < 101){
            System.out.println("Grade Obtained: A");
        }
        else if(avg > 59 && avg < 80){
            System.out.println("Grade Obtained: B");
        
        }
        else if(avg > 49 && avg < 60){
            System.out.println("Grade Obtained: C");
        }
        else if(avg<50){
            System.out.println("Grade Obtained: F");
        }
        
    }
}
