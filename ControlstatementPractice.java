public class ControlStatementsPractice {

    public static void main(String[] args) {

        // Even or Odd
        int number = 15;

        if(number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        System.out.println("----------------");

        // JavaCode Challenge
        for(int i = 1; i <= 15; i++) {

            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("JavaCode");
            }
            else if(i % 3 == 0) {
                System.out.println("Java");
            }
            else if(i % 5 == 0) {
                System.out.println("Code");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
