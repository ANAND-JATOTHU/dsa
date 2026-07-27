class l283{
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int n = nums.length;
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
                }
            }

        while (k < n) {
            nums[k] = 0;
            k++;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}