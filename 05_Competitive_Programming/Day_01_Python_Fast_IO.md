# Day 1: Python Fast I/O & CP Tricks

## 🚀 Quick Revision (The "Cheat Sheet")
*   **Time Complexity**: N/A (These are syntax tricks to speed up execution).
*   **Space Complexity**: N/A
*   **When to use**: IN EVERY SINGLE COMPETITIVE PROGRAMMING CONTEST (Codeforces, TCS NQT, etc.).
*   **Shortcuts/Formulas**: Use `sys.stdin.read().split()` for massive inputs instead of `input()`.

## 🧠 Deep Dive
In platforms like Codeforces or TCS NQT, sometimes your logic is perfect (O(N)), but you still get a **Time Limit Exceeded (TLE)** error. Why? Because the standard Python `input()` function is incredibly slow when reading hundreds of thousands of lines. 

By using `sys.stdin.read`, we read the entire input buffer into memory at once, which is lightning fast. We also use **List Comprehensions** instead of `for` loops with `.append()` because list comprehensions are implemented in C under the hood, making them significantly faster.

## 💻 Implementations

### Python (The logic language)
```python
import sys

# 1. THE FASTEST WAY TO READ INPUT
# Read all inputs at once and split by whitespace
def fast_io_example():
    input_data = sys.stdin.read().split()
    
    if not input_data:
        return
        
    # Example: First number is N (size of array), next N numbers are the array
    n = int(input_data[0])
    arr = [int(x) for x in input_data[1:n+1]]
    
    print(f"Read an array of size {n}: {arr}")

# 2. LIST COMPREHENSION TRICKS
# Instead of this slow code:
# evens = []
# for x in arr:
#     if x % 2 == 0:
#         evens.append(x)

# Do this (Lightning Fast):
def list_comprehension_demo(arr):
    evens = [x for x in arr if x % 2 == 0]
    return evens

# 3. SWAPPING VARIABLES (Python Magic)
def swap(a, b):
    # Forget temporary variables!
    a, b = b, a 
    return a, b
```

## 📝 PYQs & Practice Problems (Python Logic & Syntax Tricks)

**Q1. (Codeforces Pattern) Read N integers and print the sum of only the EVEN numbers.**
> **Solution**:
> ```python
> import sys
> def solve():
>     data = sys.stdin.read().split()
>     if not data: return
>     n = int(data[0])
>     arr = [int(x) for x in data[1:n+1]]
>     
>     # Pythonic 1-liner:
>     even_sum = sum(x for x in arr if x % 2 == 0)
>     print(even_sum)
> ```

**Q2. (TCS String Pattern) Reverse a string and check if it is a palindrome without using loops.**
> **Solution**:
> ```python
> def is_palindrome(s: str) -> bool:
>     # Python slicing trick: [::-1] reverses the sequence in C-speed
>     return s == s[::-1]
> ```

**Q3. (Array Pattern) Given a 2D matrix, flatten it into a 1D array.**
> **Solution**:
> ```python
> def flatten_matrix(matrix):
>     # List comprehension trick for nested loops
>     # Read as: give me 'num' for every 'row' in matrix, for every 'num' in row
>     return [num for row in matrix for num in row]
> ```

**Q4. (Hashing Intro) Given an array, find the frequency of each element in just 1-2 lines.**
> **Solution**:
> ```python
> from collections import Counter
> 
> def get_frequencies(arr):
>     # Counter automatically builds a dictionary of frequencies in O(N) time!
>     freq_dict = Counter(arr)
>     return freq_dict
> ```

**Q5. (Math Logic) Swap the maximum and minimum elements in an array.**
> **Solution**:
> ```python
> def swap_max_min(arr):
>     if not arr: return arr
>     # Find indices using built-in methods
>     min_idx = arr.index(min(arr))
>     max_idx = arr.index(max(arr))
>     
>     # Python tuple swapping
>     arr[min_idx], arr[max_idx] = arr[max_idx], arr[min_idx]
>     return arr
> ```
