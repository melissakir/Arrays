import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) throws Exception {
        // Create Categories
        Category sightseeing = new Category("a sightseeing vaction", "You always want to explore and see new things."
                + "You are very curious and love to experience .");
        Category tropical = new Category("a tropical vacation", "You like to relax and spend time on yourself "
                + "You don't take things too seriously and you like to have fun.");
        Category winter = new Category("a winter vacation",
                "You love the winter, snow, and the holidays. You prefer the cold over the hot and you might ski or snowboard.");
        // Create Questions
        Question q1 = new Question("You just finished a really tiring sports practice and you are really craving something savory. What do you eat?");
        // Attach Answers to Questions
        q1.possibleAnswers[0] = new Answer("Tacos and salsa", sightseeing);
        q1.possibleAnswers[1] = new Answer("Truffle fries", tropical);
        q1.possibleAnswers[2] = new Answer("Burger and onion rings", winter);
     

        Question q2 = new Question("You are going out to dinner with your friends and no one knows what to eat. What do you volunteer for all of you to eat?");
        q2.possibleAnswers[0] = new Answer("Penne alla vodka", sightseeing);
        q2.possibleAnswers[1] = new Answer("Sushi", tropical);
        q2.possibleAnswers[2] = new Answer("Grilled cheese and soup", winter);
       

        Question q3 = new Question("It has been a long day and you are craving something sweet to end off your day. What tasty dessert do you pick?");
        q3.possibleAnswers[0] = new Answer("Gelato or ice cream", sightseeing);
        q3.possibleAnswers[1] = new Answer("Ice pop", tropical);
        q3.possibleAnswers[2] = new Answer("Chocolate lava cake:", winter);
       
        Question q4 = new Question("You just finished class and need a “pick me up” drink. What do you order?");
        q4.possibleAnswers[0] = new Answer("Iced coffee.", sightseeing);
        q4.possibleAnswers[1] = new Answer("Fruit smoothie or slush", tropical);
        q4.possibleAnswers[2] = new Answer("Hot chocolate with marshmallows", winter);
       

        Question q5 = new Question(
                "After studying for a test for an hour you start to feel hungry and you want to eat something light. What do you eat?");
        q5.possibleAnswers[0] = new Answer("Guacamole", sightseeing);
        q5.possibleAnswers[1] = new Answer("Tuna tartare", tropical);
        q5.possibleAnswers[2] = new Answer("Chips and nachos", winter);
        
        // For each question, ask, read input, store answer.
        Scanner sc = new Scanner(System.in);
        gameIntro(sc);
        Question[] qList = { q1, q2, q3, q4, q5 };
        for (Question q : qList)
         {
            Category c = q.ask(sc);
            c.points++;
        }
        // Get most common category from the questions asked
        // Return Category
        Category[] cList = { sightseeing, tropical, winter};
        int[] counts = { sightseeing.points, tropical.points, winter.points };
        // these need to be in the same order or the points will be incorrect!
        int index = getMostPopularCatIndex(counts);
        System.out.println("Based on the foods you like, you would want " + cList[index].label + " .");
        System.out.println(cList[index].description);

    }

    public static void gameIntro(Scanner sc) {
        // requires 1 to keep going
        System.out.println("What's your dream vacation based on your favorite foods?");
        System.out.println("You get to choose numbers 1-4 for every question. Enter '1' to play!");
        int play = sc.nextInt();
        if (play != 1) {
            System.out.println("Unidentifiable input. Please enter '1' to play");
            gameIntro(sc);
        }
    }

    public static int getMostPopularCatIndex(int[] counts) {
        // returns the index that is the max
        int maxCount = 0;
        int maxIndex = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > maxCount) {
                maxCount = counts[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}