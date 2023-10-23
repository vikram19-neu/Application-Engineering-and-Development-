import java.util.Scanner;

public class hw_chap6 {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter any word: ");
        long startTime = System.currentTimeMillis(); 

        String inputWord = scanner.nextLine().trim();
        long endTime = System.currentTimeMillis(); 
        double reactionTime = (endTime - startTime) / 1000.0; 

        
        if (inputWord.isEmpty()) {
            System.out.println("You did not enter any word");
        } else {
            
            int wordLength = inputWord.length();
            String classification;
            if (wordLength <= 5) {
                classification = "short";
            } else if (wordLength <= 10) {
                classification = "medium";
            } else {
                classification = "long";
            }

            
            System.out.println("Your word is " + inputWord);
            System.out.println("It is a " + classification + " word");
            System.out.println("The length of the word is " + wordLength);
            System.out.println("Your reaction time is " + reactionTime + " seconds");
        }

        scanner.close();
}
}