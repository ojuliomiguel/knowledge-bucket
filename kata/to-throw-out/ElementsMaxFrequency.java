public class ElementsMaxFrequency {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9};
        maxFrequency(nums);
    }

    public static int maxFrequency(int[] nums) {
       if (nums.length == 1) {
            return 1;
        }

        ArrayList<Integer> maxFrequencies = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            int count = 1;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    nums[i] = -1;
                    count++;
                }
            }

            maxFrequencies.add(count);
        }

        int max = Collections.max(maxFrequencies);

        if (max == 1) {
            return nums.length;
        }

        maxFrequencies.forEach(e -> System.out.println(e));
        
        int maxQtde = 0;
        for (int k = 0; k < maxFrequencies.size(); k++) {
            
            if (maxFrequencies.get(k) == max) {
                maxQtde++;
            }
        }

        if (maxQtde != 0) {
            max *= maxQtde;
       }
        System.out.println(max);
        return max;
    }
}