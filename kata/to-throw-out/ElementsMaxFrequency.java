import java.util.ArrayList;
import java.util.Collections;

// Letcode 3005

class Solution {
    public int maxFrequencyElements(int[] nums) {

        Map<Integer, Integer> maxFrequencies = new HashMap<>();

        int frequencyMaxValue = 0;
        for (int num : nums) {
            int frequencyValue = maxFrequencies.merge(num, 1, Integer::sum);
            frequencyMaxValue = Math.max(frequencyMaxValue, frequencyValue);
        }

        var maxFreqValues = maxFrequencies.values();

        int sumMaxFrequencies = 0;

        for (int num : maxFreqValues) {
            if (num == frequencyMaxValue) {
                sumMaxFrequencies += frequencyMaxValue;
            }
        }

        return sumMaxFrequencies;
    }
}