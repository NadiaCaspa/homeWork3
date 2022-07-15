public class SumOfDiagonals {
    public static void main(String[] args) {

        String[][] s1 = {{"2", "3", "4"},
                         {"5", "6", "7"},
                         {"8", "9", "10"}};

        String[][] s2 = {{"1", "2", "3"},
                {"5", "6", "7"},
                {"9", "10", "11"},
                {"13", "14", "15"}};
        String[][] s3 = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};
        try {
            sumOfDiagonals(s1);
            sumOfDiagonals(s2);
            sumOfDiagonals(s3);
        } catch (NumberFormatException ex) {
            System.out.println("Not a valid integer");
        } catch (IllegalArgumentException ex) {
            System.out.println("Array not a square");
        }
    }

    private static void sumOfDiagonals(String[][] arr) throws NumberFormatException, IllegalArgumentException {
        if (arr.length != arr[0].length)
            throw new IllegalArgumentException();
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum = sum + Integer.parseInt(arr[i][i]); // change every string at index i to an int and the code adds diagonally and the for loop checks each string in row and colunm
        System.out.println("Sum of major diagonal elements: " + sum);
    }
}