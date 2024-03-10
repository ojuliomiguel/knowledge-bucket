public class ElementsMaxFrequency {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9};
        maxFrequency(nums);
    }

    public static int maxFrequency(int[] nums) {
       Map<Integer, Integer> maxFrequencies = new HashMap<>();
		
		for (int num: nums) {
		    maxFrequencies.put(num, 0);
		}
		
	    for (int num: nums) {
	        maxFrequencies.computeIfPresent(num, (k, v) -> v += 1);
	    }

        var maxFreqValues = maxFrequencies.values();
	    
	    int frequenciesMaxValue = Collections.max(maxFreqValues);
	
	    int sumMaxFrequencies = 0;
	    
	     for (int num: maxFreqValues) {
	        if (num == frequenciesMaxValue) {
	            sumMaxFrequencies += frequenciesMaxValue;
	        }
	    }
	    
	    
	    System.out.println(sumMaxFrequencies);

        return sumMaxFrequencies;
    }
}