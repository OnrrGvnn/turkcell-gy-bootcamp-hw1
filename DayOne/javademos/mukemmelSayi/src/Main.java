public class Main {
    public static void main(String[] args) {

        int number = 23;
        int total = 0;

        if (number <= 0) {
            System.out.println("0 veya da küçük bir sayı girdiniz. Mükkemmel sayı tanımına uymaz.");
            return;
        }

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }

        if (total == number) {
            System.out.println("Sayı mükemmeldir!");
        } else {
            System.out.println("Sayı mükemmel değildir!");
        }

    }
}