public class Page10 {
    public static void main(String[] args) {
        int x = 3;
        String name = "Dirk";
        x = x * 17;
        System.out.println("x is " + x);
        double d = Math.random();
        System.out.println("d is " + d);

        int y = 3;
        while (y > 12) {
            y = y - 1;
            System.out.println("y ====" + x);
        }

        for (int z = 0; z < 10; z = z + 1) {
            System.out.println("z is now" + z);
        }
        int w = 10;
        if (w == 10) {
            System.out.println("w must be 10");
        } else {
            System.out.println("w isnt 10");
        }

        if ((w > 3) & (name.equals("Dirk"))) {
            System.out.println("Gently");
        }
        System.out.println("This line runs no matter what");
    }
}

// Changed the variable to y,z,w