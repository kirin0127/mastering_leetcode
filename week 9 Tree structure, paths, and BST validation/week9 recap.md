# Week 9 Recap

Selected from Week 9's record where **Should Solve Again = Yes**. The result fields below are blank for this new review attempt, not copied from the original attempt. Difficulty labels follow the current project schedule.

| No. | Problem | Difficulty | Solved Independently | Should Solve Again | Feedback |
| --- | --- | --- | --- | --- | --- |
| 1 | [222. Count Complete Tree Nodes](https://leetcode.com/problems/count-complete-tree-nodes/) | Medium | No | Yes | 對概念有印象但還是寫不出來 |
| 2 | [404. Sum of Left Leaves](https://leetcode.com/problems/sum-of-left-leaves/) | Easy | Yes | No | 嘗試了BFS |
| 3 | [112. Path Sum](https://leetcode.com/problems/path-sum/) | Easy | Yes | No | 順利解出且簡潔 |
| 4 | [700. Search in a Binary Search Tree](https://leetcode.com/problems/search-in-a-binary-search-tree/) | Easy | Yes | No | 一開始還是下意識用了遞迴 |
| 5 | [513. Find Bottom Left Tree Value](https://leetcode.com/problems/find-bottom-left-tree-value/) | Medium |  |  |  |
| 6 | [106. Construct Binary Tree from Inorder and Postorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/) | Medium |  |  |  |
| 7 | [98. Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/) | Medium | No | Yes | 還是卡在一層一層的想法，但其實這題要跳多一般的遞迴思路，要思考的是BST的特性 |

## Review Focus

Try without hints first, then use these prompts. Distinguish rebuilding an unfamiliar solution from simplifying an approach you already understand. Record the approach used and whether you needed help.

- **222 — 利用完全二元樹的結構：** 原本需要 AI 協助才能想到 binary search。先說明最後一層節點的排列有什麼特性，以及如何判斷某個位置是否存在；再推導搜尋範圍與每次判斷的成本。也可以比較利用子樹高度、直接計算完美子樹節點數的思路。檢查空樹、單節點、最後一層全滿與只填入部分節點。目標是能解釋為何比逐一拜訪更快，而不是只記得用了二分搜尋。
- **404 — 簡化 DFS，再比較 BFS：** 已能獨立完成，但想去掉往下傳的 flag。嘗試從父節點判斷左孩子是否為葉節點；說明「左孩子」和「左葉子」差在哪裡。另用 BFS 思考如何辨識同一條件。檢查只有根節點、只有右葉子，以及左孩子本身還有子節點的情況。保留 flag 的版本也可以是正確且清楚的解法，精簡不是正確性的必要條件。
- **112 — 終止條件與回傳值：** 概念已正確，這次重點是精簡。明確定義每次遞迴的參數與 boolean 回傳值，再比較「目前累積總和」和「剩餘目標值」兩種表達。注意必須走到葉節點才算一條有效路徑；內部節點剛好達到目標仍不夠。檢查空樹、單節點、負數與只有一側子樹的情況。
- **700 — 迭代搜尋與空間成本：** 已能用遞迴完成，這次以迴圈沿著一條搜尋路徑前進。先說明 BST 的排序性質如何決定下一步，再解釋為什麼不需要保存回頭路徑。比較時間 O(h)、遞迴呼叫堆疊 O(h) 與迭代額外空間 O(1)，並記得樹不一定平衡。確認找到時回傳的是原本的子樹根節點，而不是重建的單節點。
- **513 — BFS 順序與 DFS 深度：** 原本已能獨立完成。紀錄提到 BFS 改一個地方就能更漂亮，但沒有記下具體修改，不預設你指的是哪一種。重做時先解釋如何保留每一層最左節點，再比較改變子節點入隊順序會如何影響最後訪問的節點。另試 DFS，明確定義何時更新答案及同深度時如何保留最左值。使用左右子樹深度不同、同層多個節點的例子驗證。
- **106 — 從遍歷序列重建子樹：** 原本已有一些想法，但因疲勞先參考了解答。這次先在紙上找出目前子樹的根，再利用 inorder 分出左右子樹，推導各自對應的 postorder 範圍。選定閉區間或半開區間並保持一致；檢查空區間、單節點與單邊樹。若使用共用的 postorder 倒序指標，解釋為什麼遞迴處理順序很重要；若分別傳入左右範圍，則清楚列出各範圍的意義。也比較每次尋找根位置與事先建立索引表的成本。
- **98 — BST 是整個子樹的限制：** 這題目前概念還不穩，優先理解再寫程式。先用 `[5,1,6,null,null,3,7]` 說明為什麼只比較父子大小不夠。分別解釋「往下傳遞允許的上下界」和「中序遍歷必須嚴格遞增」的理由，先選一種獨立實作。檢查重複值、只有一側子樹，以及節點值等於 Java int 極值的情況；避免用 int 極值當作不能取等號的初始界線，誤排除合法節點。

## Quick Verbal Check — No Required Redo

**654. Maximum Binary Tree** was the only problem marked **No** for another attempt. Briefly explain it; only add a coding retry if you discover a gap.

- 如何從目前區間選根並劃分左右子樹？
- 它和 106 的重建問題共用哪些遞迴結構，又各自依靠什麼資訊選根？
- 每次重新掃描最大值時，排序好的輸入為什麼可能導致 O(n²) 時間，而不一定是 O(n log n)？

## Pacing

This is a review queue, not seven problems to finish on Sunday. A three-Easy coding session can cover **404 + 112 + 700**. Keep **222, 513, 106, and 98** on separate Medium practice days rather than combining them into a catch-up set.

Prioritize **98** for conceptual clarity, then **106** and **222** for independent reconstruction. The record mentions fatigue on 106 and 98; retry when rested before judging how well you understand them. Sunday can be used to trace small trees and explain invariants without coding the entire queue.

After each attempt, update the table. Keep **Should Solve Again = Yes** if you can reproduce code but cannot yet explain why it works, or if the intended alternative still requires hints. Extra retries may shift later dates; they are not a reason to overload one day.
