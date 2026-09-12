# Week 6 Recap

Selected from Week 6's record where **Should Solve Again = Yes**. The result fields below are blank for this new review attempt, not copied from the original attempt.

| No. | Problem | Difficulty | Solved Independently | Should Solve Again | Feedback |
| --- | --- | --- | --- | --- | --- |
| 1 | [541. Reverse String II](https://leetcode.com/problems/reverse-string-ii/) | Easy | Yes | No | 還有點印象是冗余在哪裡，對比後確實解第二遍簡潔許多 |
| 2 | [15. 3Sum](https://leetcode.com/problems/3sum/) | Medium | Yes | Yes | 核心概念還記得，但試了好幾次才通過，為了避免重複元素問題有很多細節條件要搞好 |
| 3 | [18. 4Sum](https://leetcode.com/problems/4sum/) | Medium | Yes | No | 3Sum解過後概念是一模一樣的，只是overflow還是發生了= =但我覺得還好，不是這題的重點 |
| 4 | [Kama 58. 区间和](https://kamacoder.com/problempage.php?pid=1070) | Unrated (Kamacoder) | Yes | No | 有些聰明的做法可以不用多加參數判斷，比如讓prefix陣列n+1，讓第一格是0，這樣就不用根據index=0去處理，prefix自然就是0 |

## Review Focus

Try each problem without hints first. Use these prompts afterward to check your reasoning.

- **541 — 簡化冗餘邏輯：** 原本可以獨立完成，但你提到有一處冗餘。重新寫一次，檢查每個區塊的處理方式，以及剩餘長度小於 k、等於 k、介於 k 與 2k 之間的邊界。這份紀錄沒有指出具體冗餘位置，重做後再比較原解法。
- **15 — 選對思考方向：** 原本受到 4Sum 類型提示影響，最後需要參考解答。這次先說明排序後如何縮小搜尋範圍、為什麼可以移動某一端指標，以及如何避免重複答案。也試著區分這題與 454. 4Sum II 的輸入及輸出要求。
- **18 — Overflow 與條件判斷：** 用包含大數值、負數、重複值的案例檢查運算與去重。確認型別提升發生在加總之前，而不是溢位之後。紀錄只提到有個條件式可改進，沒有記下是哪一個；重做後比較原程式，補記該條件成立的理由。
- **Kama 58 — 多次查詢的成本：** 原本可以算出答案，但沒有先考慮多組查詢。這次分別說明單次掃描與預先處理的總成本，明確定義 prefix 陣列的意義，再自行推導包含左右端點的區間公式。檢查 a = 0、a = b、整段陣列，以及讀取查詢直到 EOF。

## Quick Verbal Check — No Required Redo

The other four problems were marked **No** for another attempt. Briefly explain them; only add a coding retry if you discover a gap.

- **383. Ransom Note:** 字元計數如何表示剩餘可用的字母？
- **344. Reverse String:** 兩端交換時，指標如何移動與停止？
- **Kama 44. 开发商购买土地:** 如何涵蓋所有合法的水平與垂直切割，並避免空區域？
- **Kama 54. 替换数字:** 每個數字字元是否分別替換？使用可變字串緩衝區與反覆串接不可變 String，成本有何不同？

## Pacing

This is a review queue, not a single-day assignment. Keep Medium problems on separate coding days and give Kama 58 its own practice day. If using a three-Easy review day, combine 541 with the already-covered 383 and 344; those two are optional fillers, not new weaknesses. Update the table after each attempt.
