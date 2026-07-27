# Day 1: Aptitude — Percentages (The Foundation)

## 🚀 Quick Revision — The "Cheat Sheet"

### ⚡ Decimal ↔ Fraction ↔ Percentage (Memorise These!)
| Fraction | Decimal | Percentage  | Memory Trick            |
|----------|---------|-------------|-------------------------|
| 1/2      | 0.5     | 50%         | Half of anything        |
| 1/3      | 0.333   | 33.33%      | One-third               |
| 2/3      | 0.666   | 66.66%      | Two-thirds              |
| 1/4      | 0.25    | 25%         | Quarter                 |
| 3/4      | 0.75    | 75%         | Three-quarters          |
| 1/5      | 0.2     | 20%         | Divide by 5             |
| 2/5      | 0.4     | 40%         | —                       |
| 3/5      | 0.6     | 60%         | —                       |
| 4/5      | 0.8     | 80%         | —                       |
| 1/6      | 0.1666  | 16.66%      | Close to 1/5            |
| 5/6      | 0.8333  | 83.33%      | —                       |
| 1/7      | 0.1428  | 14.28%      | —                       |
| 1/8      | 0.125   | 12.5%       | Half of 0.25            |
| 3/8      | 0.375   | 37.5%       | —                       |
| 1/9      | 0.111   | 11.11%      | —                       |
| 1/10     | 0.1     | 10%         | Easy! Divide by 10      |

### ⚡ Key Formulas
*   **Percentage of a number**: `P% of X = (P/100) × X`
*   **What % is A of B**: `(A/B) × 100`
*   **Increase A by P%**: `A × (1 + P/100)` or `A × (100 + P)/100`
*   **Decrease A by P%**: `A × (1 - P/100)` or `A × (100 - P)/100`
*   **Successive Change Formula**: `Net Change = A + B + (A×B)/100`
*   **Magic Swap**: `x% of y = y% of x` ← Saves 30 seconds per question!

### ⚡ Price-Consumption Shortcut (Very Common in TCS!)
If price increases by `r%`, to keep expenditure same:
> Consumption must decrease by = `r / (100 + r) × 100` %

If price decreases by `r%`, to keep expenditure same:
> Consumption must increase by = `r / (100 - r) × 100` %

---

## 🧠 Deep Dive: Basic Math Tricks (TCS Lifesavers)

Before diving into Percentages, you MUST know these calculation tricks. They will save you minutes in the exam.

### 1. Divisibility Rules (For quick cancellation)
| Divisor | Rule | Example |
|---------|------|---------|
| 2 | Last digit is even (0,2,4,6,8) | 148 → last digit 8 ✅ |
| 3 | Sum of digits divisible by 3 | 123 → 1+2+3=6 ✅ |
| 4 | Last 2 digits divisible by 4 | 512 → 12÷4=3 ✅ |
| 9 | Sum of digits divisible by 9 | 729 → 7+2+9=18 ✅ |
| 11 | (Sum of odd-position digits) – (Sum of even-position digits) = 0 or 11 | 121 → (1+1)–2=0 ✅ |

### 2. Finding LCM (Lowest Common Multiple)
*   **Standard Method**: Prime factorization — take **MAXIMUM** powers of all prime factors.
*   **Shortcut (TCS Exam Style)**: Write numbers in a row. Divide by smallest prime that divides at least one number. Repeat until all become 1. Multiply all divisors.

**Example: LCM of 4, 6, 8**
```
2 | 4  6  8
2 | 2  3  4
2 | 1  3  2
3 | 1  3  1
  | 1  1  1

LCM = 2 × 2 × 2 × 3 = 24 ✅
```

### 3. Cross Multiplication (For Ratio/Proportion)
When you have $\frac{a}{b} = \frac{c}{d}$, always cross multiply: $a \times d = b \times c$.

---

## 🧠 Deep Dive: Percentages

Percentages are the backbone of Quantitative Aptitude. If you master percentages, you automatically master Profit & Loss, Simple Interest, Compound Interest, and Data Interpretation (DI).

### Successive Percentage Change
If a value is increased by `A%` and then by `B%`, the net percentage change is NOT `A + B`.
$$\text{Net Change} = A + B + \frac{A \times B}{100}$$

> **Note**: If decrease, use negative sign. E.g., increase 10% then decrease 10%:
> Net = 10 + (-10) + (10 × -10)/100 = 0 - 1 = **-1%** (net decrease)

*Example: TCS increases salary by 10% in Year 1, and 20% in Year 2.*
Net increase = 10 + 20 + (10 × 20)/100 = 30 + 2 = **32%**

### How to Verify Using Multiplication:
Start with 100. Multiply by 1.10 × 1.20 = 132. Gain = 32%. Same answer! ✅

---

## 📝 PYQs & Practice Problems (TCS / Wipro Patterns)

**Q1. (Price & Consumption — TCS NQT Classic)**
The price of rice increases by 25%. By what percentage should a family reduce its consumption so that the expenditure remains the same?
> **Solution**:
> Method 1 (Formula): Decrease % = 25/(100+25) × 100 = 25/125 × 100 = **20%**
>
> Method 2 (Shortcut Fraction): 25% = 1/4. Price is now 5 parts. Same expenditure means 4 parts consumption. Reduction = 1/5 = **20%** ✅

**Q2. (Relative Comparison — TCS Favourite)**
If A's salary is 20% less than B's salary, by how much percent is B's salary more than A's?
> **Solution**:
> Method 1 (Formula): 20% decrease from B's perspective means A = 0.80 × B.
> So B = A/0.80 = 1.25A. B is 25% more than A.
>
> Method 2 (Shortcut): 20% = 1/5. A is 4 parts, B is 5 parts. Difference = 1 part.
> % more for B = 1/4 × 100 = **25%** ✅

**Q3. (Successive Percentage / Population)**
The population of a town increases by 10% in Year 1 and decreases by 10% in Year 2. Starting population is 100. What is the population after 2 years?
> **Solution**:
> Formula: Net Change = 10 + (-10) + (10 × -10)/100 = -1%.
> Final population = 100 - 1% of 100 = 100 - 1 = **99** ✅
>
> Verification: 100 × 1.10 × 0.90 = 100 × 0.99 = 99 ✅

**Q4. (Examinations & Passing Marks)**
A student who gets 20% of maximum marks fails by 5 marks. Another student who scores 30% of maximum marks gets 20 marks more than pass marks. Find maximum marks.
> **Solution**:
> Let Max marks = M, Pass marks = P.
> From student 1: P = 0.20M + 5
> From student 2: P = 0.30M - 20
> Equating: 0.20M + 5 = 0.30M - 20
> 25 = 0.10M → **M = 250**
>
> Verify: Pass marks = 0.20×250 + 5 = 55. Student 2 gets 0.30×250 = 75 = 55+20 ✅

**Q5. (Elections — TCS NQT Type)**
In an election between two candidates, the winner got 60% of valid votes and won by 14,000 votes. Find total valid votes.
> **Solution**:
> Winner = 60%, Loser = 40%. Difference = 20% of total.
> 20% = 14,000 → 100% = 14,000 × 5 = **70,000 valid votes** ✅

**Q6. (The Magic Trick — x% of y = y% of x)**
Find: 12.5% of 64 + 6.25% of 128.
> **Solution**:
> 12.5% of 64 = 0.125 × 64 = **8**
> 6.25% of 128 = 0.0625 × 128 = **8**
> Total = 8 + 8 = **16**
>
> Shortcut: 12.5% = 1/8. So 1/8 × 64 = 8. And 6.25% = 1/16. So 1/16 × 128 = 8. Done in 5 seconds! ✅

---

## 📝 PYQs & Practice Problems (Divisibility — TCS NQT)

**Q7. (Divisibility by 9 — TCS Advanced)**
The number 8947A56B1 is divisible by 9 where B is odd. Find the sum of all possible values of A.
> **Solution**:
> Digit sum = 8+9+4+7+A+5+6+B+1 = **40 + A + B**.
> Must be divisible by 9 → A + B = 5 or A + B = 14 (next multiple of 9 would need A+B=23, max is 9+9=18, so impossible).
>
> **Case 1: A + B = 5** (B must be odd):
> - B=1 → A=4 ✅
> - B=3 → A=2 ✅
> - B=5 → A=0 ✅
> - B=7 → A=-2 ❌ (invalid)
>
> **Case 2: A + B = 14** (B must be odd):
> - B=5 → A=9 ✅
> - B=7 → A=7 ✅
> - B=9 → A=5 ✅
>
> Unique A values: {4, 2, 0, 9, 7, 5}
> **Sum = 4 + 2 + 0 + 9 + 7 + 5 = 27** ✅

**Q8. (Divisibility by 11)**
What least number must be subtracted from 210 so that the result is completely divisible by 11?
> **Solution**:
> 210 ÷ 11 = 19, remainder = 210 - (11 × 19) = 210 - 209 = **1**.
> Subtract 1 from 210 → 209 ÷ 11 = 19 exactly.
> **Answer: 1** ✅
