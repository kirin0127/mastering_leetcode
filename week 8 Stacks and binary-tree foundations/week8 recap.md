# Week 8 Recap

Selected from Week 8's record where **Should Solve Again = Yes**. The result fields below are blank for this new review attempt, not copied from the original attempt. Difficulty labels follow the project schedule.

| No. | Problem | Difficulty | Solved Independently | Should Solve Again | Feedback |
| --- | --- | --- | --- | --- | --- |
| 1 | [239. Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/) | Hard | No | Yes | 存索引是關鍵 |
| 2 | [347. Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/) | Medium |  |  |  |
| 3 | [530. Minimum Absolute Difference in BST](https://leetcode.com/problems/minimum-absolute-difference-in-bst/) | Easy |  |  |  |
| 4 | [145. Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/) | Easy |  |  |  |
| 5 | [226. Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/) | Easy |  |  |  |
| 6 | [617. Merge Two Binary Trees](https://leetcode.com/problems/merge-two-binary-trees/) | Easy |  |  |  |
| 7 | [101. Symmetric Tree](https://leetcode.com/problems/symmetric-tree/) | Easy |  |  |  |
| 8 | [111. Minimum Depth of Binary Tree](https://leetcode.com/problems/minimum-depth-of-binary-tree/) | Easy |  |  |  |
| 9 | [257. Binary Tree Paths](https://leetcode.com/problems/binary-tree-paths/) | Easy |  |  |  |

## Review Focus

Try without hints first, then use these prompts. Focus on explaining the state each data structure stores and when a node should be processed. Record the approach used, not just whether the submission passed.

- **239 — 從 TreeMap 改成 Monotonic Deque：** 原本已用 TreeMap 解出，這次練習 deque。先定義裡面保留的是哪些候選值或索引，說明過期元素與失去競爭力的元素分別何時移除，以及為什麼隊首能代表目前最大值。特別測試重複最大值、遞增、遞減、k = 1 與 k 等於陣列長度。解釋為什麼雖然有內層迴圈，每個索引最多只會入隊、出隊一次。
- **347 — 分開計數與挑選：** 原本需要參考解法，紀錄提到第二步有三種方法，但沒有列出是哪三種。這次先獨立完成頻率統計，再選一種方式取出最高頻的 k 個值。可比較排序、大小為 k 的 heap 與頻率 bucket；不必一次全寫。說明 heap 應把哪個候選放在頂端、比較的是數值還是頻率，並檢查 k = 1、k 等於不同值的數量及有相同頻率的情況。
- **530 — 先自己解讀，再使用 BST 性質：** 原本在請 AI 解釋題目時不小心得到提示。這次先用自己的話說明要比較的是任意兩個節點，而不只是父子。再說明為什麼中序遍歷後可以只比較相鄰值，以及如何不儲存整份遍歷結果、只保留前一個值。注意第一個節點沒有前一個值，不能把未初始化的狀態当作有效資料。
- **145 — 用 Stack 模擬後序：** 原本沒想出迭代解法。先寫出左、右、根的輸出順序，再選一種可解釋的做法：例如改變遍歷順序後反轉結果，或記錄節點是否已經完成子樹處理。不要混用不同版本的入棧與輸出規則。用左右子樹都有多層的例子追蹤，並檢查空樹、單節點與單邊樹。
- **226 — 遞迴以外的反轉方式：** 原本已能用遞迴解出，紀錄提到三種 follow-up 但未列出具體內容，不預設它們是哪三種。先練習 queue-based BFS 或 stack-based DFS 的一種，再比較交換孩子與安排後續訪問的先後順序。確認每個節點只被正確處理一次，且沒有漏掉原本某一側的子樹；理解後再決定是否補做其他版本。
- **617 — 合併的空節點情況與 Queue 版本：** 原本能獨立想出，但第一次提交有瑕疵，想再精簡並試迭代。先分清楚兩個節點都存在、只有一個存在、兩個都不存在時的結果。說明是修改原樹、共用原有子樹，還是建立全新結果，避免把不同需求混在一起。若用 queue，定義每組節點如何配對，以及只有其中一側有孩子時如何接回結果。
- **101 — 成對比較，而不是只比較每層數值：** 原本卡在遞迴與 queue 放 null 的處理。先定義一對節點互為鏡像需要滿足什麼條件，分別處理兩者皆空、只有一者空、值不同與繼續比較的情況。若選用不接受 null 的 queue 實作，可先判斷空值，或放入非 null 的配對容器來保存可為 null 的成員；不要只省略空位置而丟失結構資訊。用數值相同但左右位置不對稱的樹驗證。
- **111 — 缺少孩子不等於走到葉子：** 原本想把最大深度改成取較小值，但只有一個孩子時發現不成立。這次先定義葉節點，再推導 DFS 如何處理缺少一側孩子的情況。另比較 BFS 為什麼可以在第一次遇到葉節點時結束。檢查空樹、單節點、長單邊樹，以及一側很深但另一側很淺的樹。需要額外條件不代表 DFS 是錯的，關鍵是終止條件符合題意。
- **257 — 路徑狀態與精簡：** 原本能獨立完成，這次練習讓路徑建立與葉節點輸出更清楚。比較每次傳入新的字串，與共用可變緩衝區後恢復長度的方式。若共用狀態，說明離開某個子樹時要恢復什麼，避免左右分支互相污染。檢查單節點路徑、分隔符號、負數與多條不同長度的路徑。

## Quick Verbal Check — No Required Redo

The other three problems were marked **No** for another attempt. Briefly explain them; only add a coding retry if you discover a gap.

- **102. Binary Tree Level Order Traversal:** 為什麼要先記住目前層的 queue 大小？如何避免下一層節點混進本層結果？
- **104. Maximum Depth of Binary Tree:** 你已做過 BFS 和 DFS，分別說明層數與子樹高度的定義，並比較 queue 與遞迴堆疊的空間需求。
- **110. Balanced Binary Tree:** 紀錄提到原本用了 map，但後來知道可以不用。口頭說明如何讓一次後序遍歷同時回報高度與是否失衡；不必因為這個提示就自動新增必做重寫。

## Pacing

This is a review queue, not nine problems to finish on Sunday. Give **239** its own Hard practice day and **347** its own Medium day. Possible three-Easy sessions are **530 + 145 + 226**, **617 + 101 + 111**, and **257 + optional familiar reviews of 102 and 104**. The optional problems are fillers, not newly flagged weaknesses.

If a traversal variant takes the whole session, continue another day instead of rushing through three implementations. Prioritize the approaches you could not reconstruct independently, and use small hand-traced examples before consulting an explanation.

After each attempt, update the table. Keep **Should Solve Again = Yes** if only the original approach is reproducible or the intended alternative still requires hints. Do not modify the original record to represent these new attempts.
