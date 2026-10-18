# Week 11 Recap

Selected from Week 11's record where **Should Solve Again = Yes**. The result fields below are blank for this new review attempt, not copied from the original attempt. Difficulty labels follow the project schedule.

| No. | Problem | Difficulty | Solved Independently | Should Solve Again | Feedback |
| --- | --- | --- | --- | --- | --- |
| 1 | [538. Convert BST to Greater Tree](https://leetcode.com/problems/convert-bst-to-greater-tree/) | Medium | Yes | No | 對iterative的binary tree遍歷真的很不拿手，一開始也是卡在infinite loop，後來冷靜重新分析後才寫出來 |
| 2 | [77. Combinations](https://leetcode.com/problems/combinations/) | Medium | Yes | No | backtracking基礎題 |
| 3 | [216. Combination Sum III](https://leetcode.com/problems/combination-sum-iii/) | Medium | Yes | Yes | 被backtracking起始值寫錯搞很久，沒想到這那邊寫錯 |
| 4 | [39. Combination Sum](https://leetcode.com/problems/combination-sum/) | Medium | Yes | No | 應該是說target判讀的優化，不用另外宣告一個sum去判斷 |
| 5 | [40. Combination Sum II](https://leetcode.com/problems/combination-sum-ii/) | Medium | Yes | Yes | 這題真的tricky，看我之後還能不能想到 |

## Review Focus

Try without hints first, then use these prompts. Record which approach you practiced and whether you could explain it independently, not just whether the submission passed.

- **538 — 用迭代實作 Reverse Inorder：** 原本已能獨立完成，這次練習顯式 stack。先說明為什麼必須先處理較大的值，以及累積值在更新目前節點前後各代表什麼。再追蹤目前節點與 stack 的變化，確認沒有漏掉左子樹，或把已更新的值重複加進累積值。檢查空樹、單節點、單邊樹與包含負數的 BST。比較遞迴與迭代的狀態保存方式；換成 stack 並不自動把額外空間變成 O(1)。
- **77 — 從組合數轉成列舉組合：** 原本想到 Pascal's law，但實作沒有成功。先區分「計算有幾種組合」和「列出所有組合」；Pascal 的關係並非沒有用，但若要列舉，還要保存並組合實際選擇。這次用 backtracking，定義目前路徑、下一個可選數字與完成條件。說明為什麼需要 startIndex，如何避免把同一組數字的不同排列重複輸出，以及為什麼加入答案時需要複製路徑。先完成正確版本，再根據還缺多少個數字推導迴圈上界。檢查 k = 1、k = n，並用 n = 4、k = 2 手動畫出搜尋樹。
- **216 — 加入可解釋的 Pruning：** 原本已獨立完成，這次保留正確的選擇、遞迴、撤銷架構，再加入剪枝。每次停止搜尋都要能說明：剩下的選擇為什麼不可能同時滿足數量與總和？分別考慮已選數量、剩餘目標、可用數字是否足夠；更進一步可比較剩餘數字能形成的最小與最大總和。區分何時只能跳過目前候選、何時連後面的候選也不必嘗試。檢查無解、剛好達到目標但數量不對，以及數量足夠但總和不可能的情況。剪枝後的答案應與原版本一致，不是只讓範例變快。

- **39 — 保留正確架構，再做優化：** 已能獨立完成，紀錄提到還有優化空間，但沒有指出具體位置。這次先說明候選數字可以重複使用時，下一層搜尋起點應如何設定，以及為什麼不會產生同一組合的不同排列。再比較排序後能否提早停止搜尋；每個剪枝都要依據正數與排序等前提來解釋。檢查同一數字需要使用多次、無解與候選值已超過剩餘目標的情況，確認優化前後輸出相同。
- **40 — 同層去重與同一路徑的使用次數：** 已能慢慢拆解並獨立完成，但你覺得這題最難。紀錄沒有寫出具體 tricky 的位置，因此重做後也補記真正讓你卡住的條件。重點比較 39 與 40：每個輸入位置只能使用一次，但不同位置可以有相同數值。說明為什麼同一層需要跳過重複選擇，卻不能把所有重複值一律禁止。用 `[1,1,2]`、target = 2 手動畫搜尋樹，確認 `[1,1]` 可以保留而重複答案不會出現；再檢查回溯還原、下一層起點與剪枝條件。

## Quick Verbal Check — No Required Redo

**17. Letter Combinations of a Phone Number** was marked **No** for another attempt. Briefly explain it; only add a coding retry if you discover a gap.

- 每一層遞迴對應哪一個輸入位置？它和 77 中的 startIndex 扮演相同角色嗎？
- 如何選擇目前數字對應的字母，並確保不同分支不會互相污染路徑？
- 紀錄提到 AI 建議了優化，但未記下內容；不預設是哪一種，也不因此自動增加必做重寫。

## Pacing

This is a review queue, not five Medium problems to finish on Sunday. Keep **538, 77, 216, 39, and 40** on separate coding days. Review **77 → 216 → 39 → 40** to compare fixed-length selection, sum constraints, candidate reuse, and duplicate handling; 538 can be practiced independently.

Sunday can focus on tracing a small tree and explaining choose/recurse/undo without coding the entire queue. After each attempt, update the recap table. Keep **Should Solve Again = Yes** if the intended iterative approach or pruning reasoning still requires hints. Extra attempts may shift later dates rather than creating a catch-up pile.
