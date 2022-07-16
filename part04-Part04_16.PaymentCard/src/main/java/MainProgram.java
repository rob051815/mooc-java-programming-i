
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!

        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();

        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        paulsCard.addMoney(20);
        mattsCard.eatHeartily();

        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        paulsCard.eatAffordably();
        paulsCard.eatAffordably();

        mattsCard.addMoney(50);

        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

//          Out should be
//        Paul: The card has a balance of 15.4 euros
//        Matt: The card has a balance of 27.4 euros
//        Paul: The card has a balance of 35.4 euros
//        Matt: The card has a balance of 22.799999999999997 euros
//        Paul: The card has a balance of 30.199999999999996 euros
//        Matt: The card has a balance of 72.8 euros
    }
}
