public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Populate the frequency map
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Create a Min Heap (PriorityQueue) based on the frequencies
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue()
        );
        
        // Iterate through the frequency map and add entries to the Min Heap
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest frequency element if heap size exceeds k
            }
        }
        
        // Create the result array
        int[] result = new int[k];
        int index = 0;
        
        // Extract elements from the Min Heap and add to the result array
        while (!minHeap.isEmpty()) {
            result[index++] = minHeap.poll().getKey();
        }
        
        return result;
    }
}
