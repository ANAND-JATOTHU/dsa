# Day 2: Time & Space Complexity (Big O Notation)

## 🚀 Quick Revision — The "Cheat Sheet"

### ⚡ Big O Order (Fastest → Slowest)
```
O(1) < O(log N) < O(√N) < O(N) < O(N log N) < O(N²) < O(2ᴺ) < O(N!)
```

### 📌 Common Complexities at a Glance
| Big O       | Name              | Example                                 | Passes for N =    |
|-------------|-------------------|-----------------------------------------|-------------------|
| O(1)        | Constant          | Accessing arr[i]                        | Any N             |
| O(log N)    | Logarithmic       | Binary Search                           | Up to 10^18       |
| O(√N)       | Square Root       | Checking prime factors                  | Up to 10^12       |
| O(N)        | Linear            | Single loop                             | Up to 10^8        |
| O(N log N)  | Linearithmic      | Merge Sort, Heap Sort                   | Up to 10^6        |
| O(N²)       | Quadratic         | Nested loops, Bubble Sort               | Up to 10^4        |
| O(2ᴺ)       | Exponential       | Recursive Fibonacci (naive)             | Up to 25          |
| O(N!)       | Factorial         | Permutations brute force                | Up to 12          |

### 🧠 The TCS NQT Golden Rule:
> If the question gives N ≤ 10^5 or 10^6, your solution MUST be O(N log N) or better.
> If N ≤ 10^3, O(N²) is acceptable.

### 🔑 Shortcuts to Remember
*   **Drop constants**: O(2N) → O(N), O(5) → O(1)
*   **Drop smaller terms**: O(N² + N) → O(N²)
*   **Nested loops multiply**: Two nested loops = O(N²). Three nested = O(N³)
*   **Halving loops = log**: Anything that halves on each step is O(log N)

---

## 🧠 Deep Dive

### The Problem: Why Does Complexity Even Matter?

Imagine TCS NQT gives you this task: *"Find if a number exists in an array of 1,00,000 numbers."*

*   **You (naive approach)**: Check each number one by one = O(N) = 1,00,000 operations. Takes ~0.1 seconds. ✅ Passes.
*   **Nested loop guy**: For each element, loop through all others = O(N²) = 10,000,000,000 operations. Takes 10 SECONDS. ❌ TLE. Dead.

Big O is how we **predict** this BEFORE we write the code.

---

### O(1) — Constant Time
No matter how big the input is, the operation takes the same time.
```python
arr = [10, 20, 30, 40]
print(arr[2])  # Always 1 step. O(1).
```

---

### O(N) — Linear Time
You visit each element once. The bigger the input, the more time it takes, proportionally.
```python
def find_max(arr):
    max_val = arr[0]
    for x in arr:     # Loop runs N times -> O(N)
        if x > max_val:
            max_val = x
    return max_val
```

---

### O(N²) — Quadratic Time (The TLE Killer)
Two nested loops. For each of N elements, you do N operations.
```python
def bubble_sort(arr):
    n = len(arr)
    for i in range(n):         # outer: N times
        for j in range(n-1):   # inner: N times
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
    return arr
# Total: N * N = N² operations. For N=10000, that's 10^8 — borderline TLE!
```

---

### O(log N) — Logarithmic Time (The Hero)
The input is **halved** on each step. This is Binary Search.
```python
def binary_search(arr, target):
    left, right = 0, len(arr) - 1
    while left <= right:
        mid = left + (right - left) // 2  # Avoids integer overflow
        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            left = mid + 1   # Discard LEFT half -> halving!
        else:
            right = mid - 1  # Discard RIGHT half -> halving!
    return -1
# For N=1,000,000 elements, this takes just ~20 steps! log2(1000000) ≈ 20
```

---

### Space Complexity — The Memory Side of the Story

Space complexity measures **how much extra memory** your code uses.

*   **O(1) Space**: You're only using a few variables. No extra arrays/lists.
*   **O(N) Space**: You're creating a new array/list of size N.
*   **O(N²) Space**: You're creating a 2D matrix.

```python
# O(1) Space - Just 2 variables, no matter how big arr is
def find_sum(arr):
    total = 0
    for x in arr:
        total += x
    return total

# O(N) Space - Creating a new list of same size
def double_all(arr):
    result = [x * 2 for x in arr]  # New list of size N -> O(N) space
    return result
```

---

### How to CALCULATE Complexity (Step-by-Step)

**Rule 1: Count the loops.**
```python
# 1 loop = O(N)
for i in range(n):
    pass

# 2 nested loops = O(N²)
for i in range(n):
    for j in range(n):
        pass

# 2 sequential loops = O(N) + O(N) = O(2N) = O(N)
for i in range(n):
    pass
for j in range(n):
    pass
```

**Rule 2: Halving = log.**
```python
# Loop runs log2(N) times
i = n
while i > 1:
    i = i // 2   # Halving each time -> O(log N)
```

**Rule 3: Recursion — Count the tree.**
```python
# Naive fibonacci: f(5) calls f(4) and f(3), f(4) calls f(3) and f(2)...
# It branches into 2 every call = 2^N total calls = O(2^N). Very slow!
def fib(n):
    if n <= 1:
        return n
    return fib(n-1) + fib(n-2)  # O(2^N) - NEVER use this without memoization!
```

---

## 💻 Implementations

### Python (Demonstrating O(N) vs O(N²) with runtime comparison)
```python
import time

def linear_search(arr, target):
    """O(N) - checks each element once"""
    for i, val in enumerate(arr):
        if val == target:
            return i
    return -1

def naive_all_pairs_sum(arr, target):
    """O(N²) - checks every pair"""
    pairs = []
    for i in range(len(arr)):
        for j in range(i + 1, len(arr)):
            if arr[i] + arr[j] == target:
                pairs.append((i, j))
    return pairs

# Demo
if __name__ == "__main__":
    import random
    n = 5000
    arr = list(range(n))
    
    # Time O(N)
    start = time.time()
    linear_search(arr, n - 1)
    print(f"O(N) Linear Search:  {(time.time() - start)*1000:.2f} ms")
    
    # Time O(N²)
    start = time.time()
    naive_all_pairs_sum(arr, n - 1)
    print(f"O(N²) All Pairs Sum: {(time.time() - start)*1000:.2f} ms")
```

---

## 📝 PYQs & Practice Problems

**Q1. (TCS NQT Code Output — Complexity Reasoning)**
What is the time complexity of the following code?
```python
for i in range(n):
    for j in range(i, n):
        print(i, j)
```
> **Solution**:
> The inner loop runs `n - i` times for each `i`.
> Total iterations = n + (n-1) + (n-2) + ... + 1 = n(n+1)/2.
> Big O drops constants → **O(N²)**.

**Q2. (Classic Interview)**
What is the time complexity of this code?
```python
i = 1
while i < n:
    i = i * 2
```
> **Solution**:
> i starts at 1 and doubles each time: 1, 2, 4, 8, 16...
> After k steps, i = 2^k. Loop stops when 2^k ≥ n → k = log₂(n).
> **Time Complexity: O(log N)**.

**Q3. (TCS Pattern — Identify the Best Algorithm)**
A sorted array of 1,00,000 elements is given. You need to find if a specific number exists. Which approach is best and what is its complexity?
> **Solution**:
> Use **Binary Search**. Since the array is sorted, we can eliminate half the search space each time.
> Time Complexity: **O(log N)** = ~17 operations for N=1,00,000.
> Using linear search would be O(N) = 1,00,000 operations. Binary Search is ~5882x faster here!

**Q4. (Space Complexity)**
What is the space complexity of the following function?
```python
def reverse_array(arr):
    result = []
    for i in range(len(arr)-1, -1, -1):
        result.append(arr[i])
    return result
```
> **Solution**:
> We create a new `result` list that grows to size N.
> **Space Complexity: O(N)**.
> *Optimization*: `arr.reverse()` does it **in-place** with O(1) space!

**Q5. (Advanced — Recursive Complexity)**
What is the time complexity of this function?
```python
def power(base, exp):
    if exp == 0:
        return 1
    return base * power(base, exp - 1)
```
> **Solution**:
> The function calls itself `exp` times (exp, exp-1, exp-2, ..., 1, 0).
> **Time Complexity: O(N)** where N = exp.
> *Did you know?* You can do this in **O(log N)** using fast exponentiation (`base ** exp` in Python uses this internally)!

**Q6. (Real TCS NQT Code Question)**
Given an array of N integers, find the count of pairs whose sum equals a target K. What is the optimal time complexity achievable in Python?
> **Solution**:
> - **Brute Force**: Two nested loops → O(N²). Fails for large N.
> - **Optimal**: Use a dictionary (Hashmap). Loop once, for each element check if `K - element` exists in the dictionary → **O(N) time, O(N) space**.
> ```python
> def count_pairs(arr, k):
>     seen = {}
>     count = 0
>     for num in arr:
>         complement = k - num
>         if complement in seen:
>             count += seen[complement]
>         seen[num] = seen.get(num, 0) + 1
>     return count
> ```

**Q7. (LeetCode 704 — Binary Search)**
Given a sorted array and a target, return the index of target using Binary Search. Return -1 if not found.
> **Solution** — Time: O(log N), Space: O(1):
> ```python
> class Solution:
>     def search(self, nums: list[int], target: int) -> int:
>         left, right = 0, len(nums) - 1
>         while left <= right:
>             mid = left + (right - left) // 2
>             if nums[mid] == target:
>                 return mid
>             elif nums[mid] < target:
>                 left = mid + 1
>             else:
>                 right = mid - 1
>         return -1
> ```
