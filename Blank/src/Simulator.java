public class Simulator {
    public static void main(String[] args) {
        Fighter jonard = new Fighter("Jonard", 200, 15, 200, 5, 100, 100, 1);
        Fighter hanzo = new Fighter("Hanzo", 100, 15, 100, 5, 100, 100, 1);

        jonard.hit(jonard, hanzo);


    }
}
