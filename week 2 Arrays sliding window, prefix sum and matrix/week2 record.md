# Week 1 Record

| Date | Problem | Type | Solved Independently | What I Learned Today |
| --- | --- | --- | --- | --- |
| 2026-08-10 | [69. Sqrt(x)](https://leetcode.com/problems/sqrtx/) | Binary Search | No | 原本應該是暖身題，結果一個卡...和AI討論後才解出來，解法也不漂亮，多了一些判斷式。尤其是上限的決定卡很久，一直糾結在要算出Integer.MAX_VALUE的平方，但其實上限設很大也無所謂，因為binary search的特性一定會朝目標值靠攏。 |
| 2026-08-10 | [209. Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/) | Sliding Window | No | 看完題目對解法有想法，但細節操作上有問題導致沒有一次對。 |
| 2026-08-11 | [374. Guess Number Higher or Lower](https://leetcode.com/problems/guess-number-higher-or-lower/) | Binary Search | Yes | 就是一般的binary serach |
| 2026-08-11 | [744. Find Smallest Letter Greater Than Target](https://leetcode.com/problems/find-smallest-letter-greater-than-target/) | Binary Search | No | 下意識用暴力解，題型設計上暴力解也不會慢O(n)，但其實可以用binary search解會更有效率O(logn)，但我對binary search解法有點模糊 |
| 2026-08-11 | [1539. Kth Missing Positive Number](https://leetcode.com/problems/kth-missing-positive-number/) | Binary Search | No | 原本想請copilot給我提示要怎麼用binary serach解，不過他直接把解法說明了，但最後的答案表達我覺得很難懂，我以為是copilot表達錯誤，結果那個算式真的就是答案。看我第二次解會不會還記得。|
| 2026-08-11 | [904. Fruit Into Baskets](https://leetcode.com/problems/fruit-into-baskets/) | Sliding Window | Yes(again) | 第一次有解出來但很醜，有請AI優化，差很多。應該要再寫一次，我覺得會很醜就是代表想得不夠透徹。 |
| 2026-08-12 | [88. Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/) | Two Pointers | No | 本來的想法是對的，但是實作上讓我要處理一堆邊界問題，後來問AI提示，他又直接把答案寫出來= =就看到了，只要換個寫法一切都很順；還有個問題是我沒看出題目給的提示，用了消耗記憶體空間的寫法。 |
| 2026-08-12 | [59. Spiral Matrix II](https://leetcode.com/problems/spiral-matrix-ii/) | Matrix | No | 有些想法，但寫成code會很複雜；後來看解答發現要先找出規律候用變數代表，在解題。 |
| 2026-08-13 | [1089. Duplicate Zeros](https://leetcode.com/problems/duplicate-zeros/) | Two Pointers | No | 一開始覺得用挪的會很麻煩，應該有更fansy的解法，結果一直解不出來；最後看以前提交通過的紀錄，就是用挪的= = |
| 2026-08-13 | [54. Spiral Matrix](https://leetcode.com/problems/spiral-matrix/) | Matrix | No | 今天狀態不佳，直接看解答寫了 |
| 2026-08-14 | [724. Find Pivot Index](https://leetcode.com/problems/find-pivot-index/) | Prefix Sum | Yes | 初始條件覺得不夠漂亮，看了其他解答，發現確實有更漂亮的解法，先用表達式列出公式，就可以找到漂亮解法 |
| 2026-08-15 | [560. Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/) | Prefix Sum | No | 一開始下意識用sliding window解，後來發現題目的array並沒有排序，用sliding window變得沒意義；後來想請AI給提示，他又直接給答案= =後來就直接研究答案的想法了 |
| 2026-08-15 | [136. Single Number](https://leetcode.com/problems/single-number/) | Bit Manipulation | Yes | 一開始用map的解法，偏暴力但可以過，因為效率也是O(n)；後來總覺得有其他解法，看其他人解答時大家都是用XOR運算子，確實是最乾淨的解法。 |
| 2026-08-15 | [905. Sort Array By Parity](https://leetcode.com/problems/sort-array-by-parity/) | Two Pointers | Yes | 有一次解出來，但前置作業其實不用，主要邏輯部分其實就可以解決原本擔心的問題 |
| 2026-08-15 | [1299. Replace Elements with Greatest Element on Right Side](https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/) | Array Traversal | Yes | 第一次偏暴力解，O(n^2) 還是給過，後來看其他人解答發現應該換個方向跑，就可以O(n) |
| 2026-08-15 | [1480. Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/) | Prefix Sum | Yes | 和上一題太像了哈哈所以一看就知道在耍甚麼把戲 |
| 2026-08-15 | [1732. Find the Highest Altitude](https://leetcode.com/problems/find-the-highest-altitude/) | Prefix Sum | Yes | 沒任何把戲，感覺是在考閱讀測驗 |
| 2026-08-15 | [268. Missing Number](https://leetcode.com/problems/missing-number/) | Bit Manipulation | Yes | 一開始也算暴力解，但剛好暴力解也是O(n)；後來看其他人答案看到xor的解法，花了點時間了解 |