# Week 10 Recap

Selected from Week 10's record where **Should Solve Again = Yes**. The result fields below are blank for this new review attempt, not copied from the original attempt. Difficulty labels follow the project schedule.

| No. | Problem | Difficulty | Solved Independently | Should Solve Again | Feedback |
| --- | --- | --- | --- | --- | --- |
| 1 | [501. Find Mode in Binary Search Tree](https://leetcode.com/problems/find-mode-in-binary-search-tree/) | Easy | No | Yes | 當初寫偏蝦寫，應該要想到inorder的概念，至於要不要符合follow up O(1)感覺其次 |
| 2 | [455. Assign Cookies](https://leetcode.com/problems/assign-cookies/) | Easy | Yes | No | 順利解出 |
| 3 | [236. Lowest Common Ancestor of a Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/) | Medium | Yes | Yes | 有意思的遞迴題 |
| 4 | [701. Insert into a Binary Search Tree](https://leetcode.com/problems/insert-into-a-binary-search-tree/) | Medium | Yes | Yes | 看似很簡單但實際寫有滿多眉角 |
| 5 | [450. Delete Node in a BST](https://leetcode.com/problems/delete-node-in-a-bst/) | Medium |  |  |  |
| 6 | [669. Trim a Binary Search Tree](https://leetcode.com/problems/trim-a-binary-search-tree/) | Medium |  |  |  |

## Review Focus

先不看提示自己寫一次，卡住再看下面的說明。本週兩個重點：**BST 左小右大的性質**，以及**遞迴函式回傳的子樹根要由呼叫者接回去**（`root.left = f(root.left)` 這種寫法）。

### 501. Find Mode in Binary Search Tree
- **目標：** 不用 HashMap 找出眾數。
- **關鍵：** BST 做中序遍歷會得到排序好的序列，所以相同的值一定會連在一起。只要邊走邊數「目前這個值連續出現幾次」就好。
- **需要三個變數：** `prev`（上一個值）、`count`（目前連續次數）、`maxCount`（目前最高次數）。
  - 和 `prev` 相同 → `count + 1`；不同 → `count` 重設為 1
  - `count > maxCount` → 清空答案，放入目前值，更新 `maxCount`
  - `count == maxCount` → 把目前值加進答案
- **測試：** 只有一個節點、所有值都相同、有多個眾數（例如 `[1,null,2]` 答案是 `[1,2]`）。
- **空間：** 題目的 follow-up 說明遞迴的 stack 不算額外空間，所以上面這個寫法就已經符合 follow-up，不需要再追求更多。

### 455. Assign Cookies
- **目標：** 跳出 BST 的思維，這是一題 greedy。
- **關鍵：** 把孩子胃口 `g` 和餅乾大小 `s` 都由小到大排序，用兩個指標，拿目前最小的餅乾去試胃口最小的孩子：
  - 餅乾夠大 → 配對成功，兩個指標都往後移
  - 餅乾太小 → 後面的孩子胃口只會更大，這塊餅乾誰都餵不飽，丟掉它，只移動餅乾指標
- **為什麼 greedy 是對的：** 用「剛好夠」的小餅乾餵胃口小的孩子，大餅乾就能留給胃口大的孩子，不會浪費。
- **測試：** 餅乾比孩子少、所有餅乾都太小、餅乾大小剛好等於胃口。

### 236. Lowest Common Ancestor of a Binary Tree
- **目標：** 搞懂「遞迴回傳值代表什麼」。
- **先定義回傳值：** 在這棵子樹裡，找到 p 或 q 就回傳它；如果 p、q 都在裡面，就回傳它們的 LCA；都沒找到就回傳 `null`。
- **寫法：**
  - `root` 是 `null`、或 `root` 就是 p 或 q → 直接回傳 `root`
  - 左右子樹都遞迴完之後（postorder）看結果：
    - 左右都不是 `null` → p、q 分在兩邊，目前節點就是 LCA
    - 只有一邊不是 `null` → 回傳那一邊
    - 兩邊都是 `null` → 回傳 `null`
- **想一想：** p 是 q 的祖先時，為什麼遇到 p 直接回傳就對了？（q 一定在 p 底下，所以 p 本身就是答案。）
- **和 235 的差別：** 一般二元樹沒有大小順序，不能用值的大小決定往左還是往右，只能兩邊都找。

### 701. Insert into a Binary Search Tree
- **目標：** 練習「遞迴回傳新的子樹根，由呼叫者接回去」的寫法，這是 450、669 的基礎。
- **遞迴版：**
  - `root == null` → 回傳 `new TreeNode(val)`，這裡就是插入的位置
  - `val < root.val` → `root.left = insertIntoBST(root.left, val)`，否則接到右邊
  - 最後回傳 `root`
  - 重點：不需要另外判斷「`root.left` 是不是 `null`」，因為走到 `null` 時遞迴自然會建立新節點並接回來。
- **迭代版：** 用迴圈往下走，同時記住 `parent`。走到 `null` 時，把新節點接在 `parent` 的左邊或右邊。空樹要另外處理。
- **比較：** 兩種時間都是 O(h)；遞迴要 O(h) 的 stack，迭代只要 O(1)。
- **測試：** 空樹、插入比所有值都小的值、比所有值都大的值。

### 450. Delete Node in a BST
- **目標：** 刪除節點後，整棵樹仍然要符合 BST。
- **先找到 key：** 和 701 一樣，比 `root.val` 小就 `root.left = deleteNode(root.left, key)`，大就往右。
- **找到後分三種情況：**
  1. 沒有孩子 → 回傳 `null`
  2. 只有一個孩子 → 回傳那個孩子，讓它取代自己的位置
  3. 有兩個孩子 → 找右子樹裡最小的節點（inorder successor：先往右一步，再一路往左走到底）。把它的值複製到目前節點，再到右子樹把那個 successor 刪掉。
- **為什麼用 successor：** 它比左子樹所有值都大，又比右子樹其他值都小，放到被刪的位置剛好不違反 BST。改用左子樹最大值（predecessor）也可以。
- **寫錯時怎麼檢查：** 畫一棵 5～7 個節點的小樹，刪除前後逐一確認每個節點都還是「左邊全部比它小、右邊全部比它大」，也確認沒有節點弄丟。
- **測試：** 刪除根節點、key 不存在、successor 本身還有右孩子。

### 669. Trim a Binary Search Tree
- **目標：** 利用 BST 性質一次丟掉整個不合法的子樹，不需要像 450 一樣一個一個刪除。
- **寫法（`trim(root)` 回傳裁剪後的子樹根）：**
  - `root.val < low` → `root` 和它整個左子樹都太小，全部不要，答案只可能在右子樹 → 回傳 `trim(root.right)`
  - `root.val > high` → 反過來，回傳 `trim(root.left)`
  - 在範圍內 → 保留 `root`，`root.left = trim(root.left)`、`root.right = trim(root.right)`，回傳 `root`
- **和 450 的差別：** 450 要找替代節點來補位；669 是把不合法的節點連同一整側直接丟掉，剩下那一側的根直接往上接，不需要 successor。
- **測試：** 值剛好等於 `low` 或 `high`（要保留）、根不合法但後代合法、全部被裁掉、完全不用裁。

## Quick Verbal Check — No Required Redo

The other two problems were marked **No** for another attempt. Briefly explain them; only add a coding retry if you discover a gap.

- **108. Convert Sorted Array to Binary Search Tree:** 選根時如何兼顧排序與高度平衡？偶數長度時為什麼可能有不同的合法答案？區間縮小與終止條件是否一致？
- **235. Lowest Common Ancestor of a Binary Search Tree:** 相較於 236，BST 排序性質能省掉哪些搜尋？如何判斷目標分居兩側，或目前節點本身就是其中一個目標？

## Pacing

This is a review queue, not six problems to finish on Sunday. A three-Easy session can use **501 + 455 + an optional familiar review of 108**; 108 is only a filler, not a newly flagged weakness. Keep **236, 701, 450, and 669** on separate Medium coding days.

Prioritize **450** for preserving BST structure and **236** for understanding recursive results. If subtree reconnection still feels unclear, revisit **701** before 450, then compare deletion with **669**. Sunday can be used to draw small trees and explain invariants without coding every problem.

After each attempt, update the table. Keep **Should Solve Again = Yes** if you still need hints to explain why a pointer change preserves the BST, or if the intended alternative remains unclear. Extra attempts may shift later dates; do not combine several Medium problems into a catch-up day.
