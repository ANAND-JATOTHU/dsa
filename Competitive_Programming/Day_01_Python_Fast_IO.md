# Day 1: Python Fast I/O & CP Tricks

## 🚀 Quick Revision — The "Cheat Sheet"

*   **When to use**: In EVERY CP contest and TCS NQT coding round — always.
*   **Core Rule**: Never use `input()` inside a loop when reading large data. Use `sys.stdin.read()`.
*   **Print Speed**: Use `'\n'.join(...)` instead of calling `print()` in a loop.

### ⚡ Top 5 Python CP Tricks at a Glance
| Trick | Slow Way | Fast Way |
|-------|----------|----------|
| Read all input | `input()` in loop | `sys.stdin.read().split()` |
| Build list | `for` + `.append()` | List comprehension `[... for ...]` |
| Swap variables | `temp = a; a = b; b = temp` | `a, b = b, a` |
| Sum evens | `for` + `if` + `sum` | `sum(x for x in arr if x%2==0)` |
| Print output | `print()` in loop | `sys.stdout.write('\n'.join(res))` |

---

## 🧠 Deep Dive

### Why is `input()` Slow?
In Python, each call to `input()` makes a separate system call to the OS to read a line. If you're reading 1,00,000 numbers, that's 1,00,000 system calls — each with overhead. This is exactly why you get **TLE (Time Limit Exceeded)** even when your algorithm is correct.

`sys.stdin.read()` reads the **entire input buffer** in a **single system call**, then we process it in Python's fast memory. This can be **10–20x faster** than using `input()` in a loop.

### Why are List Comprehensions Faster?
List comprehensions are executed by Python's interpreter in **optimised C bytecode** internally. A `for` loop with `.append()` has extra Python-level overhead per iteration. The difference becomes noticeable when processing tens of thousands of elements.

---

## 💻 Implementations

### Python — All Essential Tricks

```python
import sys
from collections import Counter, defaultdict

# ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
# TRICK 1: FAST INPUT (Use this as your CP template!)
# ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
def solve():
    data = sys.stdin.read().split()
    idx = 0  # Pointer to track position in data list

    n = int(data[idx]); idx += 1
    arr = [int(data[idx + i]) for i in range(n)]; idx += n

    # Process and print...
    print(sum(arr))

# ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
# TRICK 2: LIST COMPREHENSIONS
# ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

# Slow (do NOT do this in contests)
evens_slow = []
arr = [1, 2, 3, 4, 5, 6]
for x in arr:
    if x % 2 == 0:
        evens_slow.append(x)

# Fast (Pythonic!)
evens_fast = [x for x in arr if x % 2 == 0]  # [2, 4, 6]

# Nested list comprehension — flatten a 2D matrix
matrix = [[1, 2], [3, 4], [5, 6]]
flat = [num for row in matrix for num in row]  # [1, 2, 3, 4, 5, 6]

# ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
# TRICK 3: PYTHONIC SWAPPING
# ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
a, b = 10, 20
a, b = b, a  # Swap! No temp variable needed. a=20, b=10.

# ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
# TRICK 4: MAP() FOR READING MULTIPLE VALUES ON ONE LINE
# ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
# When input is: "5 10 15 20"
# SLOW:  values = [int(x) for x in input().split()]
# FAST (elegant):
# a, b, c, d = map(int, input().split())

# ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
# TRICK 5: FAST OUTPUT — DON'T print() IN A LOOP
# ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
results = [1, 4, 9, 16, 25]

# Slow (each print() flushes to stdout separately)
for r in results:
    print(r)

# Fast (join all results and write once)
sys.stdout.write('\n'.join(map(str, results)) + '\n')

# ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
# TRICK 6: USEFUL PYTHON BUILT-INS (Know These!)
# ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
arr = [3, 1, 4, 1, 5, 9, 2, 6]

print(max(arr))          # 9       — O(N)
print(min(arr))          # 1       — O(N)
print(sum(arr))          # 31      — O(N)
print(sorted(arr))       # Sorted  — O(N log N)
print(arr[::-1])         # Reverse — O(N), no extra space with arr.reverse()

# Frequency counter in ONE LINE
freq = Counter(arr)      # Counter({1: 2, 3: 1, 4: 1, 5: 1, ...})
most_common = freq.most_common(1)  # [(1, 2)] — most frequent element
```

---

## 📝 PYQs & Practice Problems

**Q1. (Codeforces Pattern) Read N integers and print the sum of only the EVEN numbers.**
> **Solution**:
> ```python
> import sys
>
> def solve():
>     data = sys.stdin.read().split()
>     n = int(data[0])
>     arr = [int(data[i+1]) for i in range(n)]
>     print(sum(x for x in arr if x % 2 == 0))
>
> solve()
> ```
> *Input: `6\n1 2 3 4 5 6` → Output: `12`*

**Q2. (TCS String Pattern) Reverse a string and check if it is a palindrome — without using any loop.**
> **Solution**:
> ```python
> def is_palindrome(s: str) -> bool:
>     # Python slicing [::-1] reverses at C-speed — no loop needed!
>     return s == s[::-1]
>
> print(is_palindrome("racecar"))  # True
> print(is_palindrome("hello"))    # False
> ```

**Q3. (Array Pattern) Given a 2D matrix, flatten it into a 1D array using a one-liner.**
> **Solution**:
> ```python
> def flatten_matrix(matrix):
>     return [num for row in matrix for num in row]
>
> matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
> print(flatten_matrix(matrix))  # [1, 2, 3, 4, 5, 6, 7, 8, 9]
> ```

**Q4. (TCS NQT — Frequency Count) Find the most frequently occurring element in an array.**
> **Solution**:
> ```python
> from collections import Counter
>
> def most_frequent(arr):
>     freq = Counter(arr)
>     return freq.most_common(1)[0][0]  # Returns the element, not the count
>
> print(most_frequent([1, 2, 2, 3, 3, 3]))  # 3
> ```

**Q5. (Math Logic) Swap the values of the maximum and minimum elements in an array in-place.**
> **Solution**:
> ```python
> def swap_max_min(arr):
>     if not arr: return arr
>     min_idx = arr.index(min(arr))
>     max_idx = arr.index(max(arr))
>     arr[min_idx], arr[max_idx] = arr[max_idx], arr[min_idx]
>     return arr
>
> print(swap_max_min([3, 1, 4, 1, 5, 9]))  # [3, 9, 4, 1, 5, 1]
> ```

**Q6. (map() Trick) Read 3 integers from a single line and print their product.**
> **Solution**:
> ```python
> # Input: "3 4 5"
> a, b, c = map(int, input().split())
> print(a * b * c)  # 60
> ```
> *Why is this better than a list comprehension here? Because `map()` lazily evaluates—it doesn't build a full list in memory, which is marginally more efficient for unpacking.*

**Q7. (Output Trick — TCS NQT) Print squares of 1 to N on separate lines, efficiently.**
> **Solution**:
> ```python
> import sys
>
> def print_squares(n):
>     # Collect results first, then write to stdout ONCE
>     output = '\n'.join(str(i*i) for i in range(1, n+1))
>     sys.stdout.write(output + '\n')
>
> print_squares(5)
> # Output: 1\n4\n9\n16\n25
> ```
