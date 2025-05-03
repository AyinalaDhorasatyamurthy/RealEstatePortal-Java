package first;

public class para {

}


public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] A, int[] B) {
        int n = A.length;
        // Ensure that A is the smaller array
        if (A.length > B.length) {
            return findMedianSortedArrays(B, A); // Call the same function with A and B swapped
        }

        int low = 0, high = n;
        int total = 2 * n;

        while (low <= high) {
            // Partition A
            int partitionA = (low + high) / 2;
            // Partition B will complement partition A to balance total elements on both sides
            int partitionB = n - partitionA;

            // Edge cases: if partitionA is 0, it means there are no elements on the left side of A
            int maxLeftA = (partitionA == 0) ? Integer.MIN_VALUE : A[partitionA - 1];
            int minRightA = (partitionA == n) ? Integer.MAX_VALUE : A[partitionA];

            // Similarly for B
            int maxLeftB = (partitionB == 0) ? Integer.MIN_VALUE : B[partitionB - 1];
            int minRightB = (partitionB == n) ? Integer.MAX_VALUE : B[partitionB];

            // Check if we have a correct partition
            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
                // If the combined arrays have an even number of elements
                return (Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB)) / 2.0;
            } 
            // If maxLeftA > minRightB, move left in A
            else if (maxLeftA > minRightB) {
                high = partitionA - 1;
            } 
            // If maxLeftB > minRightA, move right in A
            else {
                low = partitionA + 1;
            }
        }

        // Arrays are not sorted properly or input is invalid
        throw new IllegalArgumentException("Input arrays are not valid.");
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 8, 9, 15};
        int[] B = {7, 11, 18, 19, 21};
        
        double result = findMedianSortedArrays(A, B);
        System.out.println("The median is: " + result);
    }
}
