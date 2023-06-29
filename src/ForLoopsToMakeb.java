public class ForLoopsToMakeb {
    public static void main(String[] args) {
        for (int columns = 0; columns < 5; columns++) {
            System.out.println(" ");
            for (int rows = 0; rows < 3; rows ++){
                System.out.print("*");
            }
        }
        for(int rows = 0; rows < 7; rows++){
            System.out.print("*");
        }
        for(int columns = 0; columns < 2;columns++){
            System.out.println(" ");
            System.out.printf("%-7s%s","***", "***");
        }
        System.out.println(" ");
        for(int rows = 0; rows < 10; rows++){
            System.out.print("*");
        }
    }
}
