# Week 10 Recap

Selected from Week 10's record where **Should Solve Again = Yes**. The result fields below are blank for this new review attempt, not copied from the original attempt. Difficulty labels follow the project schedule.

| No. | Problem | Difficulty | Solved Independently | Should Solve Again | Feedback |
| --- | --- | --- | --- | --- | --- |
| 1 | [501. Find Mode in Binary Search Tree](https://leetcode.com/problems/find-mode-in-binary-search-tree/) | Easy | No | Yes | 當初寫偏蝦寫，應該要想到inorder的概念，至於要不要符合follow up O(1)感覺其次 |
| 2 | [455. Assign Cookies](https://leetcode.com/problems/assign-cookies/) | Easy |  |  |  |
| 3 | [236. Lowest Common Ancestor of a Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/) | Medium |  |  |  |
| 4 | [701. Insert into a Binary Search Tree](https://leetcode.com/problems/insert-into-a-binary-search-tree/) | Medium |  |  |  |
| 5 | [450. Delete Node in a BST](https://leetcode.com/problems/delete-node-in-a-bst/) | Medium |  |  |  |
| 6 | [669. Trim a Binary Search Tree](https://leetcode.com/problems/trim-a-binary-search-tree/) | Medium |  |  |  |

## Review Focus

Try without hints first, then use these prompts. This week, focus on BST invariants and the meaning of a returned subtree root, rather than memorizing pointer changes. Record which approach you used and whether you needed help.

- **501 — 不用頻率 Map 找眾數：** 原本已能獨立完成，這次練習利用中序遍歷中相同值連續出現的性質。先定義「前一個值、目前連續次數、最高次數」各自代表什麼，再思考遇到更高次數或相同最高次數時如何更新答案。檢查所有值相同、多個眾數與單節點。說明空間時分清楚結果儲存、計數狀態與遞迴堆疊：常數個計數變數不代表整個遞迴程式只用 O(1)，若計入呼叫堆疊仍有 O(h)。針對 follow-up，先確認題目對額外空間的計算範圍，不要把它和完全沒有遍歷堆疊混為一談。
- **455 — 不被本週主題限制解法：** 原本一直往 BST 想，但這題要處理的是需求與資源的配對。先脫離樹的框架，說明排序能提供什麼資訊，以及選擇一塊餅乾滿足一個孩子後，為什麼不會犧牲更好的整體結果。檢查餅乾不足、全部太小、剛好符合需求與重複大小。寫出每個指標代表什麼，以及無法配對時應該移動哪個指標。
- **236 — 遞迴回傳的意義：** 原本沒想出來，但看完答案覺得單純。這次先用文字定義某個子樹的搜尋結果代表什麼，再分析兩側都有結果、只有一側有結果、都沒有結果時，父節點應如何解讀。用目標分居兩側、位於同側，以及其中一個目標就是另一個祖先的例子推演。這是一般二元樹，不能用 BST 的數值大小決定搜尋方向；辨識目標時也要注意題目給的是節點。
- **701 — 回傳修改後的子樹根：** 原遞迴解法已能完成，這次先定義遞迴函式回傳值，檢查呼叫者如何把它接回 left 或 right，讓空子樹的插入也能自然處理。接著試迭代版本，說明如何保留要接上新節點的位置。測試空樹、插入最小值與最大值；比較 O(h) 搜尋時間、遞迴 O(h) 堆疊與迭代 O(1) 額外空間。簡潔的目標是少掉不必要分支，不是把必要條件藏起來。
- **450 — 刪除後仍須保持整棵子樹有序：** 原本有想法但實作錯誤，且沒有看出哪裡違反 BST。先分開分析零、一、兩個孩子的情況。兩個孩子時，解釋什麼樣的替代值或子樹重接方式能同時滿足左右兩側的限制；可比較 inorder successor 和 predecessor 的選擇。畫出刪除前後的指標，確認沒有遺失其他節點、形成循環或留下重複替代節點。特別測試刪除根、key 不存在，以及替代節點本身還有孩子的情況。
- **669 — Trim 不等於反覆呼叫 Delete：** 已能解出，但原本太拘泥於刪除與提升節點。這次先利用 BST 排序性質判斷：目前值小於 low 或大於 high 時，哪一整側不可能留下？回傳什麼才能把仍可能合法的子樹接回去？若目前值在範圍內，還要處理哪些孩子？檢查邊界值等於 low/high、根節點不合法但後代合法、全部被移除與完全不需裁剪的情況。目標是保留符合條件節點的相對結構，不必逐個模擬一般刪除。

## Quick Verbal Check — No Required Redo

The other two problems were marked **No** for another attempt. Briefly explain them; only add a coding retry if you discover a gap.

- **108. Convert Sorted Array to Binary Search Tree:** 選根時如何兼顧排序與高度平衡？偶數長度時為什麼可能有不同的合法答案？區間縮小與終止條件是否一致？
- **235. Lowest Common Ancestor of a Binary Search Tree:** 相較於 236，BST 排序性質能省掉哪些搜尋？如何判斷目標分居兩側，或目前節點本身就是其中一個目標？

## Pacing

This is a review queue, not six problems to finish on Sunday. A three-Easy session can use **501 + 455 + an optional familiar review of 108**; 108 is only a filler, not a newly flagged weakness. Keep **236, 701, 450, and 669** on separate Medium coding days.

Prioritize **450** for preserving BST structure and **236** for understanding recursive results. If subtree reconnection still feels unclear, revisit **701** before 450, then compare deletion with **669**. Sunday can be used to draw small trees and explain invariants without coding every problem.

After each attempt, update the table. Keep **Should Solve Again = Yes** if you still need hints to explain why a pointer change preserves the BST, or if the intended alternative remains unclear. Extra attempts may shift later dates; do not combine several Medium problems into a catch-up day.
