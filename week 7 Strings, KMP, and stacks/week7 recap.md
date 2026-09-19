# Week 7 Recap

Selected from Week 7's record where **Should Solve Again = Yes**. The result fields below are blank for this new review attempt, not copied from the original attempt.

| No. | Problem | Difficulty | Solved Independently | Should Solve Again | Feedback |
| --- | --- | --- | --- | --- | --- |
| 1 | [Kama 55. 右旋字符串](https://kamacoder.com/problempage.php?pid=1065) | Unrated (Kamacoder) | Yes | No | 反轉三次的好處在於可以in place處理(不過對於java而言String轉char[]的過程已經耗費O(n)的空間了其實) |
| 2 | [28. Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/) | Easy |  |  |  |
| 3 | [459. Repeated Substring Pattern](https://leetcode.com/problems/repeated-substring-pattern/) | Easy |  |  |  |
| 4 | [496. Next Greater Element I](https://leetcode.com/problems/next-greater-element-i/) | Easy | Yes | No | 一開始卡了一下，果然只要是看解答寫的都會當下感覺懂，但其實沒有完全了解細節，這次有完整想過一遍 |
| 5 | [144. Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/) | Easy | Yes | No | 有試著用stack想出來 |
| 6 | [94. Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/) | Easy | No | Yes | 想不出來，卡在不曉得如何處理底下的右節點；問AI後才知道解法 |

## Review Focus

This week's focus is learning alternative approaches, not merely reproducing an already accepted solution. Try without hints first, then use the prompts below. Note whether the approach you wanted to practice was completed independently.

- **Kama 55 — 三次反轉：** 原解法已能獨立完成，這次練習三次反轉。先把字串分成兩段，手動追蹤每次反轉後的內容，說明為什麼最後能保留兩段各自的字元順序。檢查旋轉方向與分段邊界，也考慮 k 等於或大於字串長度的情況。
- **28 — KMP 與 LPS：** 目前的卡點是理解後仍無法自己實作。先不要同時寫搜尋和 LPS 建表：用 `ababaca` 手算每個位置的 LPS，說明 proper prefix 為何不能包含整段字串；再解釋失配時哪些已匹配資訊仍可保留。能說明回退不需要重頭比對的理由後，再分開完成建表與搜尋。檢查第一次出現的位置、找不到、模式比文字長，以及重複前綴的情況。
- **459 — 從暴力法轉成週期判斷：** 原本已用暴力法完成。等 LC 28 的 LPS 定義穩定後，再思考最後一個 LPS 值和候選重複區塊長度的關係。比較 `abab`、`aba`、`aaaa` 和單字元字串；說明為什麼有共同前後綴還不夠，整段字串必須能由完整區塊重複組成。
- **496 — Monotonic Stack：** 原本暴力法已完成，這次練習讓多個元素共用一次掃描。先說明 stack 內哪些元素還在等待答案、何時可以確定答案，以及為什麼每個元素只需入棧與出棧一次。注意要找的是右方第一個「嚴格較大」的值，最後結果仍要依 nums1 的順序排列。測試遞增、遞減與沒有更大值的情況。
- **144 — 用顯式 Stack 寫前序：** 已能用遞迴完成，這次不用遞迴。先寫下拜訪順序，再推導 LIFO 結構需要的子節點入棧順序。用左右子樹都有多層的例子追蹤 stack，避免只靠單邊樹就以為順序正確。也檢查空樹與單節點。
- **94 — 用顯式 Stack 寫中序：** 已能用遞迴完成，這次思考如何保存尚未拜訪的祖先，以及何時才可以處理目前節點。追蹤目前節點與 stack 的狀態，說明為什麼目前節點為 null 時不一定代表遍歷結束。最後比較這題和前序遍歷的「輸出時機」，而不是只背兩份模板。

## Quick Verbal Check — No Required Redo

The other six problems were marked **No** for another attempt. Briefly explain them; only add a coding retry if you discover a gap.

- **151. Reverse Words in a String:** 如何處理前後空白與連續空白，同時保留單字內部字元順序？
- **232. Implement Queue using Stacks:** 什麼時候需要搬移元素？為什麼不是每次操作都搬移？
- **225. Implement Stack using Queues:** 目前操作如何維持 LIFO？單一 queue 的 follow-up 可以口頭推演，不必自動加成必做重寫。
- **20. Valid Parentheses:** 遇到多餘的右括號、類型不符，或掃描結束仍有左括號時，分別如何判斷？
- **1047. Remove All Adjacent Duplicates In String:** 移除一對字元後，為什麼仍能處理新產生的相鄰重複？
- **150. Evaluate Reverse Polish Notation:** 減法與除法的兩個運算元順序如何決定？Java 整數除法遇到負數時會如何截斷？

## Pacing

This is a review queue, not six problems to finish on Sunday. Keep Kama 55 on its own practice day. Keep LC 28 before LC 459 so the LPS explanation carries over; the stack and traversal problems can be reviewed independently.

For a three-Easy coding session, possible groups are **496 + 144 + 94** and **28 + 459 + an optional familiar Easy review such as 1047**. These are workload targets, not a reason to rush: if KMP needs the whole session, stop there and continue another day. A hand-traced LPS table and a clear fallback explanation are useful progress even before an independent implementation.

After each attempt, record which approach you used and whether you needed hints. Keep **Should Solve Again = Yes** if only the old approach is reproducible and the intended alternative is still unclear.
