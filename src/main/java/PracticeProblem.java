public class PracticeProblem {

    public static int towerOfHanoi(int num) {
        if (num < 3) {
            return -1; // Invalid case
        }
        return hanoiRecursive(num);
    }

    private static int hanoiRecursive(int n) {
        if (n == 1) {
            return 1; // Base case: 1 disk requires 1 move
        }
        return 2 * hanoiRecursive(n - 1) + 1;
    }

    // Optional: quick test
    public static void main(String[] args) {
        System.out.println(towerOfHanoi(3)); // Should print 7
        System.out.println(towerOfHanoi(4)); // Should print 15
        System.out.println(towerOfHanoi(2)); // Should print -1
    }
}