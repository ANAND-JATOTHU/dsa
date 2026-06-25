# LeetCode 1: Two Sum

## 🚀 Quick Revision (The "Cheat Sheet")
*   **Time Complexity**: O(N) optimal, O(N²) brute force.
*   **Space Complexity**: O(N) optimal (using dictionary), O(1) brute force.
*   **When to use**: Whenever you need to find pairs that sum to a target.
*   **Shortcuts/Formulas**: `required_number = target - current_number`. Check if `required_number` exists in our dictionary.

## 🧠 Deep Dive
The naive approach is to use two nested loops to check every possible pair. This takes O(N²) time. Imagine a list of 100,000 numbers; checking every pair would take forever!

Instead, we use a Hashmap (Dictionary in Python). As we iterate through the array, we ask: "What number do I need to reach the target?" If we need a 7 and we haven't seen it yet, we store our current number and its index in the dictionary. If we have seen the 7, we found our pair!

## 💻 Implementations

### Python (Optimal O(N) Logic)
```python
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {} # val : index
        
        for i, num in enumerate(nums):
            required = target - num
            if required in seen:
                return [seen[required], i]
            
            seen[num] = i
            
        return []
```

### Python (Brute Force O(N²) - For Beginners)
```python
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] + nums[j] == target:
                    return [i, j]
```

## 📝 PYQs & Practice Problems
1.  [LeetCode 1: Two Sum](https://leetcode.com/problems/two-sum/) - The absolute classic starting point.
