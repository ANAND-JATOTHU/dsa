# Day 1: Aptitude - Percentages (The Foundation)

## 🚀 Quick Revision (The "Cheat Sheet")
*   **Fraction to Percentage Shortcuts**:
    *   0.5 = 50%
    *   0.33 = 33.33%
    *   0.25 = 25%
    *   0.20 = 20%
    *   0.166 = 16.66%
    *   0.142 = 14.28%
    *   0.125 = 12.5%
*   **The Magic Formula (A = B)**: `x% of y = y% of x`. (Example: 12.5% of 80 is the same as 80% of 12.5).

## 🧠 Deep Dive: Basic Math Tricks (TCS Lifesavers)

Before diving into Percentages, you MUST know these calculation tricks. They will save you minutes in the exam.

**1. Divisibility Rules (For quick cancellation)**:
*   **By 3**: Sum of all digits is divisible by 3. (e.g., 123 -> 1+2+3 = 6. Yes!)
*   **By 4**: Last 2 digits are divisible by 4. (e.g., 512 -> 12 is div by 4. Yes!)
*   **By 9**: Sum of all digits is divisible by 9.
*   **By 11**: (Sum of odd places) - (Sum of even places) = 0 or multiple of 11.

**2. Finding LCM (Lowest Common Multiple)**:
*   **Standard Method**: Prime factorization.
*   **Shortcut Method (TCS Style)**: Take the largest number. Check if the smaller numbers divide it perfectly. If not, multiply the largest number by 2, then 3, until they do.
    *   *Example: LCM of 4, 6, 8*. Largest is 8. 4 divides 8, but 6 doesn't. Try 8 x 2 = 16. 6 doesn't divide 16. Try 8 x 3 = 24. 6 doesn't divide 24. Try 8 x 3 is wrong, wait. LCM of 4, 6, 8. Largest is 8. Multiples: 8, 16, 24. 4 and 6 both divide 24. LCM is 24!

**3. Cross Multiplication (For Ratio/Proportion)**:
When you have $\frac{a}{b} = \frac{c}{d}$, always cross multiply: $a \times d = b \times c$. 

---

## 🧠 Deep Dive: Percentages
Percentages are the backbone of Quantitative Aptitude. If you master percentages, you automatically master Profit & Loss, Simple Interest, Compound Interest, and Data Interpretation (DI). 

**Successive Percentage Change**:
If a value is increased by `A%` and then increased by `B%`, the net percentage change is NOT `A + B`. 
The formula is: **Net Change = A + B + (A * B) / 100**

*Example*: TCS increases a salary by 10% in Year 1, and 20% in Year 2. 
Net increase = 10 + 20 + (10 * 20)/100 = 30 + 2 = 32%. 

## 📝 PYQs & Practice Problems (TCS/Wipro Patterns)

**Q1. (Price & Consumption)**
The price of a commodity increases by 25%. By what percentage should a family reduce its consumption so that the expenditure remains the same?
> **Solution**:
> *Shortcut*: Increase is 25% (1/4). To keep expenditure same, decrease must be 1/(4+1) = 1/5 = 20%.

**Q2. (Relative Comparison)**
If A's salary is 20% less than B's salary, by how much percent is B's salary more than A's?
> **Solution**:
> *Shortcut*: Decrease is 20% (1/5). Therefore, the increase relative to the new base is 1/(5-1) = 1/4 = 25%. B earns 25% more than A.

**Q3. (Successive Percentage / Population)**
The population of a town increases by 10% in the first year and decreases by 10% in the second year. If the present population is 100, what will be the population after 2 years?
> **Solution**:
> Formula: $Net Change = A + B + \frac{A \times B}{100}$
> Net Change = $10 - 10 + \frac{10 \times -10}{100} = -1\%$. 
> Population decreases by 1%, so it becomes 99.

**Q4. (Examinations & Passing Marks)**
In an examination, a student who gets 20% of the maximum marks fails by 5 marks. Another student who scores 30% of the maximum marks gets 20 marks more than the pass marks. What are the maximum marks?
> **Solution**:
> Let max marks be M.
> Pass marks = 20% of M + 5
> Pass marks = 30% of M - 20
> Equating them: $20\% M + 5 = 30\% M - 20$
> $10\% M = 25 \implies M = 250$.

**Q5. (Elections)**
In an election between two candidates, the winner got 60% of the valid votes and won by a majority of 14,000 votes. Find the total number of valid votes.
> **Solution**:
> Winner gets 60%, loser gets 40%.
> Difference in votes = $60\% - 40\% = 20\%$ of total votes.
> $20\% = 14,000$
> Therefore, $100\% = 14,000 \times 5 = 70,000$ valid votes.

**Q6. (The Magic Trick A=B)**
What is 16.66% of 420 plus 42% of 166.6?
> **Solution**:
> 16.66% of 420 = $(1/6) \times 420 = 70$.
> 42% of 166.6 is the same as 166.6% of 42 (using x% of y = y% of x).
> 166.6% is $(100\% + 66.66\%) = 1 + 2/3 = 5/3$.
> So, $(5/3) \times 42 = 5 \times 14 = 70$.
> Total = $70 + 70 = 140$.

---

## 📝 PYQs & Practice Problems (Basic Math & Divisibility)

**Q7. (Divisibility by 9)**
If the number 8947A56B1 is divisible by 9, where B is an odd number. Find the sum of all possible values of A?
> **Solution**:
> Digit sum = 8+9+4+7+A+5+6+B+1 = 40 + A + B.
> For it to be divisible by 9, (40 + A + B) must be a multiple of 9 (e.g., 45, 54).
> So, A + B = 5 or A + B = 14.
> Since B is odd, B can be 1, 3, 5, 7, 9.
> Possible values for A based on B:
> If B=1, A=4. If B=3, A=2. If B=5, A=0 or 9. If B=7, A=7. If B=9, A=5.
> Sum of all possible values of A = 4 + 2 + 0 + 9 + 7 + 5 = 27.

**Q8. (Divisibility by 11)**
What least number must be subtracted from 210 so that the result is completely divisible by 11?
> **Solution**:
> Divide 210 by 11.
> $210 = 11 \times 19 + 1$.
> The remainder is 1. If we subtract the remainder (1) from 210, the result (209) is completely divisible by 11.
> Answer: 1.
