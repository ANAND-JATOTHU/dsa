# LeetCode 1: Two Sum

## 🚀 Quick Revision — The "Cheat Sheet"
*   **Time Complexity**: O(N) optimal | O(N²) brute force
*   **Space Complexity**: O(N) optimal (dictionary) | O(1) brute force
*   **Pattern**: "Find a pair" → Think **Hashmap** first.
*   **Core Idea**: `required = target - current`. Has `required` been seen before?
*   **Key Insight**: We only need ONE pass through the array (not two!).

---

## 🧠 Deep Dive

### The Wrong Way First (Brute Force — O(N²))
Check every possible pair. Two nested loops. For N=1,00,000, this is 10^10 operations → instant TLE.

### The Right Way (Hashmap — O(N))
As we walk through the array, we ask: *"What number do I need to complete the target?"*
- That number is `required = target - current_number`.
- If `required` is already in our dictionary → **found the pair!**
- If not → store `current_number` and its index in the dictionary, move on.
- We never go back, we never look twice. One pass. Done.

**Visual Trace** — `nums = [2, 7, 11, 15]`, `target = 9`:
```
i=0: num=2, required=9-2=7. seen={}. 7 not in seen. Store {2:0}
i=1: num=7, required=9-7=2. seen={2:0}. 2 IS in seen! Return [seen[2], 1] = [0, 1] ✅
```
---

## 💻 Implementations

### Python — Brute Force O(N²) (For Understanding)
```python
from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n = len(nums)
        for i in range(n):
            for j in range(i + 1, n):       # j starts from i+1 to avoid same element
                if nums[i] + nums[j] == target:
                    return [i, j]
        return []  # Problem guarantees a solution exists, but good practice

# Time: O(N²) | Space: O(1)
```

### Python — Optimal Hashmap O(N) (This is what you submit!)
```python
from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}  # Maps value -> index

        for i, num in enumerate(nums):
            required = target - num          # What do I need?

            if required in seen:             # Have I seen it before?
                return [seen[required], i]   # Yes! Return both indices.

            seen[num] = i                    # No. Store current number.

        return []  # Should never reach here per problem constraints

# Time: O(N) | Space: O(N)
```

---

## 📝 PYQs & Practice Problems

**Q1. [LeetCode 1 — Two Sum](https://leetcode.com/problems/two-sum/) ← Start Here**
Given `nums = [2, 7, 11, 15]`, `target = 9`. Return `[0, 1]`.
> See solution above. Classic Hashmap pattern.

**Q2. Two Sum Variant — Count ALL pairs (not just one)**
Given an array, count how many pairs have sum equal to target K.
> **Solution**:
> ```python
> from collections import Counter
>
> def count_pairs(arr, k):
>     seen = Counter()
>     count = 0
>     for num in arr:
>         complement = k - num
>         count += seen[complement]  # How many times have we seen the complement?
>         seen[num] += 1
>     return count
>
> print(count_pairs([1, 5, 7, -1, 5], 6))  # Output: 3  (pairs: 1+5, 7-1, 1+5)
> ```

**Q3. [LeetCode 167 — Two Sum II (Sorted Array)](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)**
Array is SORTED. Find pair. Must use O(1) space.
> **Solution** — Two Pointers (no dictionary needed when sorted!):
> ```python
> def twoSum(numbers: list, target: int) -> list:
>     left, right = 0, len(numbers) - 1
>     while left < right:
>         s = numbers[left] + numbers[right]
>         if s == target:
>             return [left + 1, right + 1]  # 1-indexed per problem
>         elif s < target:
>             left += 1
>         else:
>             right -= 1
>     return []
> ```
> *Time: O(N) | Space: O(1) — This is why sorting matters!*

**Q4. [LeetCode 1. Variant] Two Sum — Check if ANY pair exists (True/False only)**
> **Solution**:
> ```python
> def has_pair_with_sum(arr: list, target: int) -> bool:
>     seen = set()  # Use set (not dict) — we only need to know IF we saw it, not WHERE
>     for num in arr:
>         if (target - num) in seen:
>             return True
>         seen.add(num)
>     return False
>
> print(has_pair_with_sum([1, 4, 45, 6, 10, 8], 16))  # True (6+10)
> print(has_pair_with_sum([1, 2, 4, 3, 6], 11))       # False
> ```

**Q5. [LeetCode 15 — 3Sum](https://leetcode.com/problems/3sum/) (Three Sum — next level)**
Find all unique triplets that sum to zero.
> **Solution** — Sort + Two Pointers:
> ```python
> def threeSum(nums: list) -> list:
>     nums.sort()
>     result = []
>     for i in range(len(nums) - 2):
>         if i > 0 and nums[i] == nums[i-1]:  # Skip duplicates
>             continue
>         left, right = i + 1, len(nums) - 1
>         while left < right:
>             s = nums[i] + nums[left] + nums[right]
>             if s == 0:
>                 result.append([nums[i], nums[left], nums[right]])
>                 while left < right and nums[left] == nums[left+1]: left += 1
>                 while left < right and nums[right] == nums[right-1]: right -= 1
>                 left += 1; right -= 1
>             elif s < 0:
>                 left += 1
>             else:
>                 right -= 1
>     return result
> # Time: O(N²) | Space: O(1) excluding output
> ```

**Q6. (TCS NQT Style) Given an array of N numbers and a target K, print "YES" if any two elements sum to K, else "NO".**
> **Solution**:
> ```python
> import sys
>
> def solve():
>     data = sys.stdin.read().split()
>     n, k = int(data[0]), int(data[1])
>     arr = [int(data[i+2]) for i in range(n)]
>
>     seen = set()
>     for num in arr:
>         if k - num in seen:
>             print("YES")
>             return
>         seen.add(num)
>     print("NO")
>
> solve()
> ```
