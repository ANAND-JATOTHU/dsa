public class copy {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[5];
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        System.out.println("Copied array: " + Arrays.toString(arr2));
    }
}
