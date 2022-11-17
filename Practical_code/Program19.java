public class Program19 {
    public static void main(String[] args) {
        String[][] twoDimentional = { { "1", "1" }, { "2", "2" }, { "3", "3" }, { "4", "4" } };
        System.out.println("Before updating an array: ");
        printArray(twoDimentional);
        twoDimentional[3][0] = "5";
        System.out.println("After updating an array element: ");
        printArray(twoDimentional);
    }

    private static void printArray(String[][] twoDimentional) {
        for (int i = 0; i < twoDimentional.length; i++) {
            for (int j = 0; j < twoDimentional[0].length; j++) {
                System.out.print(twoDimentional[i][j]);
            }
            System.out.println("");
        }
    }
}