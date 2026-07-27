# Day 2: Aptitude — Number System & Basic Math (The Backbone)

## 🚀 Quick Revision — The "Cheat Sheet"

### ⚡ Must-Know Squares, Cubes & Shortcuts
| Square | Value | Cube | Value |
|--------|-------|------|-------|
| 11²    | 121   | 5³   | 125   |
| 12²    | 144   | 6³   | 216   |
| 13²    | 169   | 7³   | 343   |
| 14²    | 196   | 8³   | 512   |
| 15²    | 225   | 9³   | 729   |
| 16²    | 256   | 10³  | 1000  |
| 25²    | 625   | 12³  | 1728  |

### ⚡ LCM & HCF Cheat Rules
*   **LCM × HCF = Product of two numbers** → Use this to find one if you know the other!
*   **HCF always divides LCM**
*   **LCM of (a, b, c) where a, b, c are coprime** = a × b × c

### ⚡ Divisibility Rules Summary
| Divisor | Rule                                                   | Example                             |
|---------|--------------------------------------------------------|-------------------------------------|
| 2       | Last digit is 0, 2, 4, 6, 8                            | 148 → 8 is even ✅                  |
| 3       | Sum of digits divisible by 3                           | 123 → 1+2+3=6 ✅                    |
| 4       | Last 2 digits divisible by 4                           | 312 → 12 ÷ 4 = 3 ✅                 |
| 5       | Last digit is 0 or 5                                   | 135 → 5 ✅                          |
| 6       | Divisible by BOTH 2 AND 3                              | 222 → even AND 2+2+2=6 ✅           |
| 8       | Last 3 digits divisible by 8                           | 1120 → 120 ÷ 8 = 15 ✅              |
| 9       | Sum of digits divisible by 9                           | 729 → 7+2+9=18 ✅                   |
| 11      | (Odd place digits sum) – (Even place digits sum) = 0 or 11 | 121 → (1+1)–2=0 ✅             |

---

## 🧠 Deep Dive

### Finding HCF (Highest Common Factor)

**What is HCF?** HCF is the LARGEST number that divides all given numbers completely.

#### Standard Method 1: Prime Factorization
Find prime factors of each number, then pick the MINIMUM power of common factors.

*Example: HCF of 36 and 48*
*   36 = 2² × 3²
*   48 = 2⁴ × 3
*   Common prime factors: 2 and 3. Take minimum powers: 2² × 3¹ = 4 × 3 = **12**

#### Shortcut Method 2: Division Method (Euclid's Algorithm — Fastest!)
Divide the bigger number by the smaller. Then divide the smaller number by the remainder. Repeat until remainder = 0. The last divisor is the HCF.

*Example: HCF of 48 and 36*
```
48 ÷ 36 → remainder = 12
36 ÷ 12 → remainder = 0  ← STOP!
HCF = 12 ✅
```

---

### Finding LCM (Lowest Common Multiple)

**What is LCM?** LCM is the SMALLEST number that is divisible by all given numbers.

#### Standard Method 1: Prime Factorization
Find prime factors, take MAXIMUM powers of all factors.

*Example: LCM of 12 and 18*
*   12 = 2² × 3
*   18 = 2 × 3²
*   Take MAX powers: 2² × 3² = 4 × 9 = **36**

#### Shortcut Method 2: Division Method (For 3+ numbers, fastest!)
Write all numbers in a row. Find a prime that divides at least ONE number. Divide and bring down. Repeat until all are 1.

*Example: LCM of 4, 6, 8*
```
2 | 4  6  8
2 | 2  3  4
2 | 1  3  2
3 | 1  3  1
  | 1  1  1

LCM = 2 × 2 × 2 × 3 = 24 ✅
```

#### The Relationship Trick (Saves 90% of time in exams!):
$$LCM \times HCF = \text{Product of two numbers}$$

*Example: Two numbers have HCF 4 and product 48. Find LCM.*
LCM = 48 ÷ 4 = **12**

---

### Speed Calculation Tricks (Vedic Math Style)

**Trick 1: Multiplying any number by 11**
*   For 2-digit number AB: Put A, then A+B (carry if needed), then B.
*   Example: 34 × 11 → 3, (3+4), 4 → **374**
*   Example: 89 × 11 → 8, (8+9=17, write 7 carry 1), 9+1=10 → **979**

**Trick 2: Squaring numbers ending in 5**
*   Take the tens digit (let's call it N). Multiply N × (N+1). Append 25.
*   Example: 35² → 3 × 4 = 12. Append 25 → **1225** ✅
*   Example: 75² → 7 × 8 = 56. Append 25 → **5625** ✅

**Trick 3: Multiplying numbers close to 100**
*   Example: 97 × 96 → Deficiencies: (100-97)=3 and (100-96)=4.
*   Left part: 97 - 4 = 93 (or 96 - 3 = 93)
*   Right part: 3 × 4 = 12
*   Answer: **9312** ✅

---

## 📝 PYQs & Practice Problems

**Q1. (TCS NQT — LCM & HCF Basic)**
The HCF of two numbers is 11 and their LCM is 693. If one of the numbers is 77, what is the other?
> **Solution**:
> Use: LCM × HCF = Product of two numbers.
> Other number = (LCM × HCF) / First number = (693 × 11) / 77.
> = 7623 / 77 = **99**.

**Q2. (TCS NQT — HCF Application)**
Find the greatest number that will divide 43, 91, and 183, leaving the same remainder in each case.
> **Solution**:
> When the same remainder is left, the required number = HCF of the differences.
> 91 - 43 = 48
> 183 - 91 = 92
> 183 - 43 = 140
> HCF(48, 92, 140):
> HCF(48, 92) → 92 = 1×48 + 44; 48 = 1×44 + 4; 44 = 11×4 + 0 → HCF = 4.
> HCF(4, 140) = 4.
> **Answer: 4**.

**Q3. (Divisibility Rule — TCS Classic)**
A number when divided by 342 gives a remainder 47. When the same number is divided by 19, what will the remainder be?
> **Solution**:
> The number N = 342k + 47 for some integer k.
> Note that 342 = 19 × 18. So 342k is divisible by 19.
> Now, 47 = 19 × 2 + 9. So 47 when divided by 19 gives remainder 9.
> **Answer: 9**.

**Q4. (Number of Zeros — Very Common in TCS!)**
How many zeros are at the end of 100! (100 factorial)?
> **Solution**:
> Zeros come from pairs of 2 × 5 in the prime factors. There are more 2s than 5s, so count the 5s.
> $\lfloor100/5\rfloor + \lfloor100/25\rfloor + \lfloor100/125\rfloor = 20 + 4 + 0 = \textbf{24 zeros}$.

**Q5. (Vedic Math Speed — Exam Shortcut)**
Without a calculator, find the value of 45².
> **Solution**:
> Use the "number ending in 5" trick.
> Tens digit = 4. → 4 × (4+1) = 4 × 5 = 20.
> Append 25 → **2025** ✅. Done in 3 seconds!

**Q6. (Advanced — Remainder Theorem)**
What is the remainder when 2^100 is divided by 3?
> **Solution**:
> Look for a pattern:
> 2^1 ÷ 3 → remainder **2**
> 2^2 = 4 ÷ 3 → remainder **1**
> 2^3 = 8 ÷ 3 → remainder **2**
> 2^4 = 16 ÷ 3 → remainder **1**
> Pattern repeats with period 2: Odd powers → remainder 2; Even powers → remainder 1.
> 2^100 → 100 is even → **Remainder = 1**.

**Q7. (LCM Application — Bells!)**
Three bells ring at intervals of 12, 15, and 20 minutes respectively. If they all ring together at 9:00 AM, when will they next ring together?
> **Solution**:
> They ring together at LCM(12, 15, 20) minutes.
> 12 = 2² × 3
> 15 = 3 × 5
> 20 = 2² × 5
> LCM = 2² × 3 × 5 = **60 minutes**.
> They ring together again at 9:00 AM + 60 minutes = **10:00 AM**.
