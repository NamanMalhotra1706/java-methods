import java.util.Random;

public class FootballTeam {

     // Generate random heights between 150 and 250 cm
     public static void generateRandomHeights(int[] heights) {
        Random random = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150;
        }
    }

    // Calculate the sum of heights
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Calculate the mean height
    public static double calculateMean(int sum, int count) {
        return (double) sum / count;
    }

    // method of shortest height
    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // method of tallest height
    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        generateRandomHeights(heights);

        int sum = calculateSum(heights);
        double meanHeight = calculateMean(sum, heights.length);
        int shortestHeight = findShortestHeight(heights);
        int tallestHeight = findTallestHeight(heights);

        // Display results
        System.out.println("Player Heights :");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println("Mean Height: " + meanHeight + " cm");
        System.out.println("Shortest Height: " + shortestHeight + " cm");
        System.out.println("Tallest Height: " + tallestHeight + " cm");
    }
}
