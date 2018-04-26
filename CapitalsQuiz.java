/* Vince Simpson
Comp 171-800RL
Lab 11
 */


import java.util.Scanner;

public class CapitalsQuiz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;



        for(int i = 0; i < 50; i++ ) {
            System.out.print("What is the capital of " + displayStateAndCapital(i, 0) + "? ");
            String capitalInput = input.nextLine();
            if(capitalInput.equalsIgnoreCase(displayStateAndCapital(i, 1).trim())) {
                System.out.println("Your answer is correct.");
                count++;
            } else if(capitalInput.equals("TEST COUNT EARLY")) {
                break;

            } else {
                System.out.println("The correct answer should be " + displayStateAndCapital(i, 1));
            }


        }
        System.out.println("The correct count is " + count);
        input.close();




    }

    public static String displayStateAndCapital(int num1, int num2) {
            String[][] statesAndCapitals = {
                {"Alabama", "Montgomery"},
                {"Alaska", "Juneau"},
                {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"},
                {"California", "Sacramento"},
                {"Colorado", "Denver"},
                {"Connecticut", "Hartford"},
                {"Delaware", "Dover"},
                {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"},
                {"Hawaii", "Honolulu"},
                {"Idaho", "Boise"},
                {"Illinois", "Springfield"},
                {"Indiana", "Indianapolis"},
                {"Iowa", "Des Moines"},
                {"Kansas", "Topeka"},
                {"Kentucky", "Frankfort"},
                {"Louisiana", "Baton Rouge"},
                {"Maine", "Augusta"},
                {"Maryland", "Annapolis"},
                {"Massachusetts", "Boston"},
                {"Michigan", "Lansing"},
                {"Minnesota", "Saint Paul"},
                {"Mississippi", "Jackson"},
                {"Missouri", "Jefferson City"},
                {"Montana", "Helena"},
                {"Nebraska", "Lincoln"},
                {"Nevada", "Carson City"},
                {"New Hampshire", "Concord"},
                {"New Jersey", "Trenton"},
                {"New Mexico", "Santa Fe"},
                {"New York", "Albany"},
                {"North Carolina", "Raleigh"},
                {"North Dakota", "Bismarck"},
                {"Ohio", "Columbus"},
                {"Oklahoma", "Oklahoma City"},
                {"Oregon", "Salem"},
                {"Pennsylvania", "Harrisburg"},
                {"Rhode Island", "Providence"},
                {"South Carolina", "Columbia"},
                {"South Dakota", "Pierre"},
                {"Tennessee", "Nashville"},
                {"Texas", "Austin"},
                {"Utah", "Salt Lake City"},
                {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"},
                {"Washington", "Olympia"},
                {"West Virginia", "Charleston"},
                {"Wisconsin", "Madison"},
                {"Wyoming", "Cheyenne"}
        };
     return statesAndCapitals[num1][num2];
    }


}






























