public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        double harmonicAvarage = 0;
        for (int i : numbers) {
            harmonicAvarage += 1.0 / (double) i;
        }

        System.out.println("Harmonik ortalama: " + harmonicAvarage);
    }
}