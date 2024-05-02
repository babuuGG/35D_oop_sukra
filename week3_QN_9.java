import java.util.Scanner;
public class week3_QN_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the month (1 to 12):");
        int month = scanner.nextInt();

        // Determine the season using switch case
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Fall";
                break;
            default:
                season = "Invalid month";
                break;
        }

        // Display the season
        System.out.println("The season for month " + month + " is " + season);

        scanner.close();
    }
}
