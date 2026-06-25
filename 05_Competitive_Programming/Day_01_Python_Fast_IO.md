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

## 📝 PYQs & Practice Problems
*   *Practice applying these tricks in any basic array problem on LeetCode or Codeforces.*
