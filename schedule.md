# Schedule: August 3, 2026–January 24, 2027 (lean first pass)

**Pace, not a hard deadline:** Aim to make steady progress toward year-end. This baseline finishes the last new problem on **January 23, 2027**, with a final Sunday review on **January 24**. Extra attempts may move completion into February; do not compress difficult topics just to protect the date.

**Daily rule from Week 6:** Monday–Saturday targets **3 Easy**, **1 Medium**, or **1 Hard** LeetCode problems. No extra Easy warm-ups on Medium/Hard days. Each unrated **Kamacoder exercise gets one full day**. If a problem needs another day, continue it and shift the remaining dates; do not stack multiple Medium/Hard problems onto one day.

**Sundays:** Targeted review, guided by the record files' **“should solve again”** flags and the week's concept notes. No new problems are assigned. If you code a review set, keep the same 3 Easy / 1 Medium / 1 Hard rule (or one Kamacoder exercise); otherwise explain approaches, trace examples, or review mistakes. Future retry needs are not predictable, so the dates are a first-pass baseline rather than a mastery guarantee.

**How to use the perspective notes:** Implement one sound approach first. The notes identify alternatives, invariants, or useful reformulations to understand during that attempt or a Sunday review—not extra same-day submissions. Implement a second approach when it addresses a weakness; items explicitly labelled optional can wait. For named curriculum variants such as Prim/Kruskal, DFS/BFS, or 1D/2D knapsack, learn the comparison even though the exercise is scheduled only once.

Weeks 1–5 below remain unchanged as historical plans. **Day 36 remains September 7, 2026.** Some future Easy groups span adjacent chapters so each day contains three Easy problems without padding the plan with new supplementary exercises. One Easy review fills the last group.

## Week 1 · Aug 3–9 — Arrays: binary search and two pointers

| Day | Weekdays | LeetCode |
| --- | --- | --- |
| 1 | Mon | 704. Binary Search |
| 2 | Tue | 35. Search Insert Position |
| 3 | Wed | 27. Remove Element |
| 4 | Thu | 977. Squares of a Sorted Array |
| 5 | Fri | 26. Remove Duplicates from Sorted Array |
| 6 | Sat | 283. Move Zeroes<br>941. Valid Mountain Array<br>485. Max Consecutive Ones |
| 7 | Sun | Review 704, 27 and 977 |

**Focus:**

- Binary-search interval definitions
- `left <= right` versus `left < right`
- In-place array modification
- Fast and slow pointers

## Week 2 · Aug 10–16 — Arrays: sliding window, prefix sum and matrix

| Day | Weekdays | LeetCode |
| --- | --- | --- |
| 8 | Mon | 209. Minimum Size Subarray Sum<br>Warm-up: 69. Sqrt(x) (**should solve again, and try Newton**), 374. Guess Number Higher or Lower |
| 9 | Tue | 904. Fruit Into Baskets<br>Warm-up: 744. Find Smallest Letter Greater Than Target, 1539. Kth Missing Positive Number |
| 10 | Wed | 59. Spiral Matrix II<br>Warm-up: 88. Merge Sorted Array, 905. Sort Array By Parity |
| 11 | Thu | 54. Spiral Matrix<br>Warm-up: 1089. Duplicate Zeros, 1299. Replace Elements with Greatest Element on Right Side |
| 12 | Fri | 724. Find Pivot Index<br>Warm-up: 1480. Running Sum of 1d Array, 1732. Find the Highest Altitude, 268. Missing Number |
| 13 | Sat | 560. Subarray Sum Equals K<br>Warm-up: 136. Single Number |
| 14 | Sun | Review 209, 59 and 560 |

**Stretch problem:** 76. Minimum Window Substring

Do not worry if LC 76 is too difficult now. It is primarily an advanced sliding-window reference problem.

## Week 3 · Aug 17–23 — Linked lists

| Day | Weekdays | LeetCode |
| --- | --- | --- |
| 15 | Mon | 203. Remove Linked List Elements<br>237. Delete Node in a Linked List<br>876. Middle of the Linked List |
| 16 | Tue | 707. Design Linked List |
| 17 | Wed | 206. Reverse Linked List<br>83. Remove Duplicates from Sorted List<br>1290. Convert Binary Number in a Linked List to Integer |
| 18 | Thu | 24. Swap Nodes in Pairs |
| 19 | Fri | 19. Remove Nth Node From End of List |
| 20 | Sat | 160. Intersection of Two Linked Lists<br>876. Middle of the Linked List (review)<br>1290. Convert Binary Number in a Linked List to Integer (review) |
| 21 | Sun | Review 206, 24 and 19 |

**Important patterns:**

- Dummy head
- Pointer reassignment
- Fast and slow pointers
- Iterative versus recursive reversal

## Week 4 · Aug 24–30 — Linked-list consolidation and cycle detection

| Day | Weekdays | LeetCode |
| --- | --- | --- |
| 22 | Mon | 141. Linked List Cycle<br>876. Middle of the Linked List (review)<br>21. Merge Two Sorted Lists (review) |
| 23 | Tue | 142. Linked List Cycle II |
| 24 | Wed | 143. Reorder List |
| 25 | Thu | 234. Palindrome Linked List<br>83. Remove Duplicates from Sorted List (review)<br>1290. Convert Binary Number in a Linked List to Integer (review) |
| 26 | Fri | Redo 707. Design Linked List |
| 27 | Sat | Timed set: 203, 206 and 19 |
| 28 | Sun | Write linked-list templates from memory |

You should be able to write these templates without reference:

```java
ListNode reverse(ListNode head)
ListNode findMiddle(ListNode head)
boolean hasCycle(ListNode head)
```

## Week 5 · Aug 31–Sep 6 — Hash tables

| Day | Weekdays | LeetCode |
| --- | --- | --- |
| 29 | Mon | 242. Valid Anagram<br>205. Isomorphic Strings<br>387. First Unique Character in a String |
| 30 | Tue | 1002. Find Common Characters<br>771. Jewels and Stones<br>1160. Find Words That Can Be Formed by Characters |
| 31 | Wed | 349. Intersection of Two Arrays<br>350. Intersection of Two Arrays II<br>1207. Unique Number of Occurrences |
| 32 | Thu | 202. Happy Number<br>217. Contains Duplicate<br>219. Contains Duplicate II |
| 33 | Fri | 1. Two Sum<br>167. Two Sum II - Input Array Is Sorted<br>1929. Concatenation of Array<br>1512. Number of Good Pairs |
| 34 | Sat | 454. 4Sum II |
| 35 | Sun | Review 242, 1 and 454 |

## Week 6 · 2026-09-07–2026-09-13 — Hash tables, reversal, and array/string gaps

| Day | Date | Weekdays | Workload | Problems and perspectives |
| --- | --- | --- | --- | --- |
| 36 | 2026-09-07 | Mon | 3 Easy | [383. Ransom Note](https://leetcode.com/problems/ransom-note/)<br>Perspective: Compare a fixed-size frequency array with a hash map.<br><br>[344. Reverse String](https://leetcode.com/problems/reverse-string/)<br>Perspective: Use two pointers; recognize why an extra reversed copy is unnecessary.<br><br>[541. Reverse String II](https://leetcode.com/problems/reverse-string-ii/)<br>Perspective: Track the 2k block boundaries; compare index-based reversal with substring construction. |
| 37 | 2026-09-08 | Tue | 1 Medium | [15. 3Sum](https://leetcode.com/problems/3sum/)<br>Perspective: Know sorting + two pointers and duplicate removal; compare with a hash-based search. |
| 38 | 2026-09-09 | Wed | 1 Medium | [18. 4Sum](https://leetcode.com/problems/4sum/)<br>Perspective: Extend the sorted two-pointer approach; watch Java integer overflow in sums. |
| 39 | 2026-09-10 | Thu | 1 Kamacoder (unrated) | [Kama 58. 区间和](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/kamacoder/0058.%E5%8C%BA%E9%97%B4%E5%92%8C.md)<br>Perspective: Prefix sums versus repeated range scans; pay attention to inclusive endpoints. |
| 40 | 2026-09-11 | Fri | 1 Kamacoder (unrated) | [Kama 44. 开发商购买土地](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/kamacoder/0044.%E5%BC%80%E5%8F%91%E5%95%86%E8%B4%AD%E4%B9%B0%E5%9C%9F%E5%9C%B0.md)<br>Perspective: Use row/column totals and prefix splits; compare with rescanning each candidate partition. |
| 41 | 2026-09-12 | Sat | 1 Kamacoder (unrated) | [Kama 54. 替换数字](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/kamacoder/0054.%E6%9B%BF%E6%8D%A2%E6%95%B0%E5%AD%97.md)<br>Perspective: Compare building a new buffer with expanding a character array and filling backward. |
| 42 | 2026-09-13 | Sun | Targeted review | Review Week 5's flagged problems and explain duplicate removal in sum problems. Use flagged problems if a coding review is needed. |

## Week 7 · 2026-09-14–2026-09-20 — Strings, KMP, and stacks

| Day | Date | Weekdays | Workload | Problems and perspectives |
| --- | --- | --- | --- | --- |
| 43 | 2026-09-14 | Mon | 1 Kamacoder (unrated) | [Kama 55. 右旋字符串](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/kamacoder/0055.%E5%8F%B3%E6%97%8B%E5%AD%97%E7%AC%A6%E4%B8%B2.md)<br>Perspective: Know triple reversal; compare with rotation through a temporary buffer. |
| 44 | 2026-09-15 | Tue | 1 Medium | [151. Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/)<br>Perspective: Compare split/rebuild with reverse-whole-string then reverse-each-word; note Java String immutability. |
| 45 | 2026-09-16 | Wed | 3 Easy | [28. Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)<br>Perspective: Start with direct matching; understand KMP's prefix table and fallback transitions.<br><br>[459. Repeated Substring Pattern](https://leetcode.com/problems/repeated-substring-pattern/)<br>Perspective: Know the prefix-table/KMP perspective; understand why the doubled-string test works.<br><br>[232. Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/)<br>Perspective: Understand amortized cost when transferring between two stacks. |
| 46 | 2026-09-17 | Thu | 3 Easy | [225. Implement Stack using Queues](https://leetcode.com/problems/implement-stack-using-queues/)<br>Perspective: Compare rotating on push with rearranging on pop.<br><br>[20. Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)<br>Perspective: Use a stack; understand why counts alone cannot validate nesting.<br><br>[496. Next Greater Element I](https://leetcode.com/problems/next-greater-element-i/)<br>Perspective: Learn the monotonic-stack + lookup-map pattern; revisit its invariant during the monotonic-stack chapter. |
| 47 | 2026-09-18 | Fri | 3 Easy | [1047. Remove All Adjacent Duplicates In String](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/)<br>Perspective: Compare a stack with a character-array write pointer.<br><br>[144. Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/)<br>Perspective: Know recursive and iterative preorder; recognize the unified marker-stack pattern.<br><br>[94. Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/)<br>Perspective: Know recursive and iterative inorder; connect sorted output to the BST invariant. |
| 48 | 2026-09-19 | Sat | 1 Medium | [150. Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/)<br>Perspective: Use a stack; preserve operand order for subtraction and division. |
| 49 | 2026-09-20 | Sun | Targeted review | Explain KMP fallback transitions and stack/queue invariants. Use flagged problems if a coding review is needed. |

## Week 8 · 2026-09-21–2026-09-27 — Stacks and binary-tree foundations

| Day | Date | Weekdays | Workload | Problems and perspectives |
| --- | --- | --- | --- | --- |
| 50 | 2026-09-21 | Mon | 1 Hard | [239. Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/)<br>Perspective: Know the monotonic deque; compare its cost with a heap-based window. |
| 51 | 2026-09-22 | Tue | 1 Medium | [347. Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/)<br>Perspective: Compare a size-k heap with frequency buckets. |
| 52 | 2026-09-23 | Wed | 3 Easy | [530. Minimum Absolute Difference in BST](https://leetcode.com/problems/minimum-absolute-difference-in-bst/)<br>Perspective: Use sorted inorder values; compare collecting values with retaining only the previous node.<br><br>[145. Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/)<br>Perspective: Know recursive and iterative postorder; understand why children must finish before the parent.<br><br>[226. Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/)<br>Perspective: Compare recursive DFS with iterative BFS/DFS. |
| 53 | 2026-09-24 | Thu | 1 Medium | [102. Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/)<br>Perspective: Know queue-based BFS; compare with DFS that records depth. |
| 54 | 2026-09-25 | Fri | 3 Easy | [617. Merge Two Binary Trees](https://leetcode.com/problems/merge-two-binary-trees/)<br>Perspective: Compare mutating an input tree with allocating a new result tree.<br><br>[101. Symmetric Tree](https://leetcode.com/problems/symmetric-tree/)<br>Perspective: Compare paired-node recursion with an iterative queue of mirrored pairs.<br><br>[104. Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)<br>Perspective: Compare recursive height with counting BFS levels. |
| 55 | 2026-09-26 | Sat | 3 Easy | [111. Minimum Depth of Binary Tree](https://leetcode.com/problems/minimum-depth-of-binary-tree/)<br>Perspective: Know why a missing child is not a zero-length root-to-leaf path; compare BFS early exit with DFS.<br><br>[110. Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/)<br>Perspective: Compare repeated height calculation with one-pass postorder and an unbalanced sentinel.<br><br>[257. Binary Tree Paths](https://leetcode.com/problems/binary-tree-paths/)<br>Perspective: Compare copying each path with backtracking a shared path buffer. |
| 56 | 2026-09-27 | Sun | Targeted review | Compare recursive and iterative traversals; explain when BFS is useful. Use flagged problems if a coding review is needed. |

## Week 9 · 2026-09-28–2026-10-04 — Tree structure, paths, and BST validation

| Day | Date | Weekdays | Workload | Problems and perspectives |
| --- | --- | --- | --- | --- |
| 57 | 2026-09-28 | Mon | 1 Medium | [222. Count Complete Tree Nodes](https://leetcode.com/problems/count-complete-tree-nodes/)<br>Perspective: Compare ordinary traversal with exploiting perfect-subtree heights. |
| 58 | 2026-09-29 | Tue | 3 Easy | [404. Sum of Left Leaves](https://leetcode.com/problems/sum-of-left-leaves/)<br>Perspective: Distinguish a left leaf from every left child; compare DFS and BFS.<br><br>[112. Path Sum](https://leetcode.com/problems/path-sum/)<br>Perspective: Compare passing a remaining sum downward with tracking the current path sum.<br><br>[700. Search in a Binary Search Tree](https://leetcode.com/problems/search-in-a-binary-search-tree/)<br>Perspective: Exploit BST ordering; compare iterative and recursive search. |
| 59 | 2026-09-30 | Wed | 1 Medium | [513. Find Bottom Left Tree Value](https://leetcode.com/problems/find-bottom-left-tree-value/)<br>Perspective: Compare level-order traversal with depth-aware DFS. |
| 60 | 2026-10-01 | Thu | 1 Medium | [106. Construct Binary Tree from Inorder and Postorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/)<br>Perspective: Use inorder positions to split subtrees; compare the reasoning with preorder-based construction. |
| 61 | 2026-10-02 | Fri | 1 Medium | [654. Maximum Binary Tree](https://leetcode.com/problems/maximum-binary-tree/)<br>Perspective: Start with recursive maximum selection; monotonic-stack construction is an optional later optimization. |
| 62 | 2026-10-03 | Sat | 1 Medium | [98. Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/)<br>Perspective: Know lower/upper-bound recursion and inorder monotonicity. |
| 63 | 2026-10-04 | Sun | Targeted review | Review recursive return values, path state, and BST bounds. Use flagged problems if a coding review is needed. |

## Week 10 · 2026-10-05–2026-10-11 — BST queries and modification

| Day | Date | Weekdays | Workload | Problems and perspectives |
| --- | --- | --- | --- | --- |
| 64 | 2026-10-05 | Mon | 3 Easy | [501. Find Mode in Binary Search Tree](https://leetcode.com/problems/find-mode-in-binary-search-tree/)<br>Perspective: Compare a frequency map with run counting in BST inorder order.<br><br>[108. Convert Sorted Array to Binary Search Tree](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/)<br>Perspective: Use midpoint partitioning; understand that multiple balanced outputs are valid.<br><br>[455. Assign Cookies](https://leetcode.com/problems/assign-cookies/)<br>Perspective: Explain the greedy matching choice; compare sorting orders. |
| 65 | 2026-10-06 | Tue | 1 Medium | [236. Lowest Common Ancestor of a Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/)<br>Perspective: Understand the postorder return meaning; compare with recording parent pointers. |
| 66 | 2026-10-07 | Wed | 1 Medium | [235. Lowest Common Ancestor of a Binary Search Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/)<br>Perspective: Exploit BST ordering; contrast with the general binary-tree LCA method. |
| 67 | 2026-10-08 | Thu | 1 Medium | [701. Insert into a Binary Search Tree](https://leetcode.com/problems/insert-into-a-binary-search-tree/)<br>Perspective: Compare iterative insertion with recursive subtree returns. |
| 68 | 2026-10-09 | Fri | 1 Medium | [450. Delete Node in a BST](https://leetcode.com/problems/delete-node-in-a-bst/)<br>Perspective: Know the zero/one/two-child cases; compare inorder successor and predecessor replacement. |
| 69 | 2026-10-10 | Sat | 1 Medium | [669. Trim a Binary Search Tree](https://leetcode.com/problems/trim-a-binary-search-tree/)<br>Perspective: Use BST bounds to discard a whole side; distinguish trimming from single-node deletion. |
| 70 | 2026-10-11 | Sun | Targeted review | Explain BST insertion, deletion, trimming, and ancestor search. Use flagged problems if a coding review is needed. |

## Week 11 · 2026-10-12–2026-10-18 — BST completion and backtracking combinations

| Day | Date | Weekdays | Workload | Problems and perspectives |
| --- | --- | --- | --- | --- |
| 71 | 2026-10-12 | Mon | 1 Medium | [538. Convert BST to Greater Tree](https://leetcode.com/problems/convert-bst-to-greater-tree/)<br>Perspective: Use reverse inorder; compare recursive and explicit-stack traversal. |
| 72 | 2026-10-13 | Tue | 1 Medium | [77. Combinations](https://leetcode.com/problems/combinations/)<br>Perspective: Understand startIndex and pruning the remaining search range. |
| 73 | 2026-10-14 | Wed | 1 Medium | [216. Combination Sum III](https://leetcode.com/problems/combination-sum-iii/)<br>Perspective: Combine fixed-length selection with remaining-sum pruning. |
| 74 | 2026-10-15 | Thu | 1 Medium | [17. Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)<br>Perspective: Separate the decision-tree model from digit-to-letter mapping. |
| 75 | 2026-10-16 | Fri | 1 Medium | [39. Combination Sum](https://leetcode.com/problems/combination-sum/)<br>Perspective: Understand why choosing a value does not advance past that candidate. |
| 76 | 2026-10-17 | Sat | 1 Medium | [40. Combination Sum II](https://leetcode.com/problems/combination-sum-ii/)<br>Perspective: Distinguish same-level deduplication from reuse along one search path. |
| 77 | 2026-10-18 | Sun | Targeted review | Review the choose/recurse/undo template and pruning. Use flagged problems if a coding review is needed. |

## Week 12 · 2026-10-19–2026-10-25 — Backtracking: partitions, subsets, and permutations

| Day | Date | Weekdays | Workload | Problems and perspectives |
| --- | --- | --- | --- | --- |
| 78 | 2026-10-19 | Mon | 1 Medium | [131. Palindrome Partitioning](https://leetcode.com/problems/palindrome-partitioning/)<br>Perspective: Separate partition enumeration from palindrome testing; precomputed palindrome DP is an optional optimization. |
| 79 | 2026-10-20 | Tue | 1 Medium | [93. Restore IP Addresses](https://leetcode.com/problems/restore-ip-addresses/)<br>Perspective: Prune by segment length, numeric range, leading zeros, and remaining characters. |
| 80 | 2026-10-21 | Wed | 1 Medium | [78. Subsets](https://leetcode.com/problems/subsets/)<br>Perspective: Compare backtracking with iterative subset expansion. |
| 81 | 2026-10-22 | Thu | 1 Medium | [90. Subsets II](https://leetcode.com/problems/subsets-ii/)<br>Perspective: Compare sorted-neighbor skipping with a per-level deduplication set. |
| 82 | 2026-10-23 | Fri | 1 Medium | [491. Non-decreasing Subsequences](https://leetcode.com/problems/non-decreasing-subsequences/)<br>Perspective: Use per-level deduplication without sorting away the original order. |
| 83 | 2026-10-24 | Sat | 1 Medium | [46. Permutations](https://leetcode.com/problems/permutations/)<br>Perspective: Compare a used array with in-place swapping. |
| 84 | 2026-10-25 | Sun | Targeted review | Compare same-level deduplication with reuse along one search path. Use flagged problems if a coding review is needed. |

## Week 13 · 2026-10-26–2026-11-01 — Backtracking completion and greedy foundations

| Day | Date | Weekdays | Workload | Problems and perspectives |
| --- | --- | --- | --- | --- |
| 85 | 2026-10-26 | Mon | 1 Medium | [47. Permutations II](https://leetcode.com/problems/permutations-ii/)<br>Perspective: Know sorted + used-array deduplication; compare with a per-level set. |
| 86 | 2026-10-27 | Tue | 1 Hard | [332. Reconstruct Itinerary](https://leetcode.com/problems/reconstruct-itinerary/)<br>Perspective: Understand backtracking and lexical order; recognize the Eulerian-trail / Hierholzer perspective. |
| 87 | 2026-10-28 | Wed | 1 Hard | [51. N-Queens](https://leetcode.com/problems/n-queens/)<br>Perspective: Compare scanning for conflicts with tracking occupied columns and diagonals. |
| 88 | 2026-10-29 | Thu | 1 Hard | [37. Sudoku Solver](https://leetcode.com/problems/sudoku-solver/)<br>Perspective: Understand row/column/box constraints; bit masks and choosing the most constrained cell are optional optimizations. |
| 89 | 2026-10-30 | Fri | 3 Easy | [860. Lemonade Change](https://leetcode.com/problems/lemonade-change/)<br>Perspective: Explain why preserving smaller change can help future customers.<br><br>[1005. Maximize Sum Of Array After K Negations](https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/)<br>Perspective: Compare sorting by absolute value with reasoning about the remaining flip parity.<br><br>[509. Fibonacci Number](https://leetcode.com/problems/fibonacci-number/)<br>Perspective: Compare full-table DP with rolling state; avoid exponential naive recursion. |
| 90 | 2026-10-31 | Sat | 1 Medium | [376. Wiggle Subsequence](https://leetcode.com/problems/wiggle-subsequence/)<br>Perspective: Compare the greedy turning-point view with up/down DP states. |
| 91 | 2026-11-01 | Sun | Targeted review | Review backtracking constraints and justify the first greedy choices. Use flagged problems if a coding review is needed. |

## Week 14 · 2026-11-02–2026-11-08 — Greedy sequences and allocation

| Day | Date | Weekdays | Workload | Problems and perspectives |
| --- | --- | --- | --- | --- |
| 92 | 2026-11-02 | Mon | 1 Medium | [53. Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)<br>Perspective: Know both the greedy reset view and the DP state 'best sum ending here'. |
| 93 | 2026-11-03 | Tue | 1 Medium | [122. Best Time to Buy and Sell Stock II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/)<br>Perspective: Know both positive-difference greedy reasoning and holding/not-holding DP. |
| 94 | 2026-11-04 | Wed | 1 Medium | [55. Jump Game](https://leetcode.com/problems/jump-game/)<br>Perspective: Use a farthest-reachable boundary; compare forward reach with backward goal movement. |
| 95 | 2026-11-05 | Thu | 1 Medium | [45. Jump Game II](https://leetcode.com/problems/jump-game-ii/)<br>Perspective: Distinguish the current jump's boundary from the next jump's farthest reach. |
| 96 | 2026-11-06 | Fri | 1 Medium | [134. Gas Station](https://leetcode.com/problems/gas-station/)<br>Perspective: Know the total-feasibility check and why a failed prefix eliminates starting positions. |
| 97 | 2026-11-07 | Sat | 1 Hard | [135. Candy](https://leetcode.com/problems/candy/)<br>Perspective: Understand the two directional constraints and why one pass is insufficient. |
| 98 | 2026-11-08 | Sun | Targeted review | Explain local-choice arguments; contrast greedy and DP views of stocks and maximum subarray. Use flagged problems if a coding review is needed. |

## Week 15 · 2026-11-09–2026-11-15 — Greedy intervals and ordering

| Day | Date | Weekdays | Workload | Problems and perspectives |
| --- | --- | --- | --- | --- |
| 99 | 2026-11-09 | Mon | 1 Medium | [406. Queue Reconstruction by Height](https://leetcode.com/problems/queue-reconstruction-by-height/)<br>Perspective: Compare insertion-based reconstruction with other ordering choices; consider Java list insertion cost. |
| 100 | 2026-11-10 | Tue | 1 Medium | [452. Minimum Number of Arrows to Burst Balloons](https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/)<br>Perspective: Compare sorting by interval end with maintaining the overlap's right boundary. |
| 101 | 2026-11-11 | Wed | 1 Medium | [435. Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/)<br>Perspective: Connect the greedy choice to interval scheduling; contrast removal count with selection count. |
| 102 | 2026-11-12 | Thu | 1 Medium | [763. Partition Labels](https://leetcode.com/problems/partition-labels/)<br>Perspective: Use last occurrences to maintain the current partition boundary. |
| 103 | 2026-11-13 | Fri | 1 Medium | [56. Merge Intervals](https://leetcode.com/problems/merge-intervals/)<br>Perspective: Compare overlap merging with the interval-selection logic of the previous problems. |
| 104 | 2026-11-14 | Sat | 1 Medium | [738. Monotone Increasing Digits](https://leetcode.com/problems/monotone-increasing-digits/)<br>Perspective: Understand why a decrease can propagate left and why the suffix becomes 9s. |
| 105 | 2026-11-15 | Sun | Targeted review | Compare interval sort keys, overlap conditions, and selection versus merging. Use flagged problems if a coding review is needed. |

## Week 16 · 2026-11-16–2026-11-22 — Tree greedy and dynamic-programming foundations

| Day | Date | Weekdays | Workload | Problems and perspectives |
| --- | --- | --- | --- | --- |
| 106 | 2026-11-16 | Mon | 1 Hard | [968. Binary Tree Cameras](https://leetcode.com/problems/binary-tree-cameras/)<br>Perspective: Know the postorder three-state greedy method; tree DP is another way to model the choices. |
| 107 | 2026-11-17 | Tue | 3 Easy | [70. Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)<br>Perspective: Know the basic recurrence and the ordered-choice / complete-knapsack perspective.<br><br>[392. Is Subsequence](https://leetcode.com/problems/is-subsequence/)<br>Perspective: Know two pointers first; also understand the subsequence-DP formulation.<br><br>[746. Min Cost Climbing Stairs](https://leetcode.com/problems/min-cost-climbing-stairs/)<br>Perspective: Compare arriving-at-a-step and starting-from-a-step state definitions. |
| 108 | 2026-11-18 | Wed | 1 Medium | [62. Unique Paths](https://leetcode.com/problems/unique-paths/)<br>Perspective: Compare two-dimensional DP with a rolling row; combinatorial counting is another perspective. |
| 109 | 2026-11-19 | Thu | 1 Medium | [63. Unique Paths II](https://leetcode.com/problems/unique-paths-ii/)<br>Perspective: Reuse path DP while handling blocked cells and boundary initialization. |
| 110 | 2026-11-20 | Fri | 1 Medium | [343. Integer Break](https://leetcode.com/problems/integer-break/)<br>Perspective: Know DP partitioning; understand the greedy argument favoring factors of 3. |
| 111 | 2026-11-21 | Sat | 1 Medium | [96. Unique Binary Search Trees](https://leetcode.com/problems/unique-binary-search-trees/)<br>Perspective: Use each value as root; connect the recurrence to Catalan numbers. |
| 112 | 2026-11-22 | Sun | Targeted review | Review DP state definitions and the complete-knapsack perspective on climbing stairs. Use flagged problems if a coding review is needed. |

## Week 17 · 2026-11-23–2026-11-29 — 0/1 knapsack and complete-knapsack foundations

| Day | Date | Weekdays | Workload | Problems and perspectives |
| --- | --- | --- | --- | --- |
| 113 | 2026-11-23 | Mon | 1 Kamacoder (unrated) | [Kama 46. 0/1 Knapsack](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/%E8%83%8C%E5%8C%85%E7%90%86%E8%AE%BA%E5%9F%BA%E7%A1%8001%E8%83%8C%E5%8C%85-1.md)<br>Perspective: Know both two-dimensional and one-dimensional 0/1-knapsack DP; explain descending capacity updates. |
| 114 | 2026-11-24 | Tue | 1 Medium | [416. Partition Equal Subset Sum](https://leetcode.com/problems/partition-equal-subset-sum/)<br>Perspective: Translate to 0/1 knapsack; compare boolean reachability with maximum packed sum. |
| 115 | 2026-11-25 | Wed | 1 Medium | [1049. Last Stone Weight II](https://leetcode.com/problems/last-stone-weight-ii/)<br>Perspective: Transform stone cancellation into two groups with the smallest sum difference. |
| 116 | 2026-11-26 | Thu | 1 Medium | [494. Target Sum](https://leetcode.com/problems/target-sum/)<br>Perspective: Know the subset-sum transformation; compare with memoized plus/minus recursion. |
| 117 | 2026-11-27 | Fri | 1 Medium | [474. Ones and Zeroes](https://leetcode.com/problems/ones-and-zeroes/)<br>Perspective: Understand two resource capacities and descending updates for both. |
| 118 | 2026-11-28 | Sat | 1 Kamacoder (unrated) | [Kama 52. Complete Knapsack](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/%E8%83%8C%E5%8C%85%E9%97%AE%E9%A2%98%E7%90%86%E8%AE%BA%E5%9F%BA%E7%A1%80%E5%AE%8C%E5%85%A8%E8%83%8C%E5%8C%85.md)<br>Perspective: Know both two-dimensional and one-dimensional complete-knapsack DP; explain ascending capacity updates. |
| 119 | 2026-11-29 | Sun | Targeted review | Compare two-dimensional and one-dimensional knapsack; explain capacity iteration direction. Use flagged problems if a coding review is needed. |

## Week 18 · 2026-11-30–2026-12-06 — Complete and bounded knapsack

| Day | Date | Weekdays | Workload | Problems and perspectives |
| --- | --- | --- | --- | --- |
| 120 | 2026-11-30 | Mon | 1 Medium | [518. Coin Change II](https://leetcode.com/problems/coin-change-ii/)<br>Perspective: Count combinations with coin-first iteration; contrast with ordered sequences. |
| 121 | 2026-12-01 | Tue | 1 Medium | [377. Combination Sum IV](https://leetcode.com/problems/combination-sum-iv/)<br>Perspective: Count ordered sequences with target-first iteration; contrast with Coin Change II. |
| 122 | 2026-12-02 | Wed | 1 Medium | [322. Coin Change](https://leetcode.com/problems/coin-change/)<br>Perspective: Compare minimum-count DP with BFS over reachable amounts. |
| 123 | 2026-12-03 | Thu | 1 Medium | [279. Perfect Squares](https://leetcode.com/problems/perfect-squares/)<br>Perspective: Compare minimum-count DP with BFS; number-theoretic shortcuts are optional. |
| 124 | 2026-12-04 | Fri | 1 Medium | [139. Word Break](https://leetcode.com/problems/word-break/)<br>Perspective: Compare prefix DP with memoized segmentation; explain why naive recursion repeats work. |
| 125 | 2026-12-05 | Sat | 1 Kamacoder (unrated) | [Kama 56. Multiple Knapsack](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/%E8%83%8C%E5%8C%85%E9%97%AE%E9%A2%98%E7%90%86%E8%AE%BA%E5%9F%BA%E7%A1%80%E5%A4%9A%E9%87%8D%E8%83%8C%E5%8C%85.md)<br>Perspective: Understand bounded counts and conversion to 0/1 items; binary grouping is an optional optimization. |
| 126 | 2026-12-06 | Sun | Targeted review | Explain combinations versus permutations, bounded counts, and segmentation states. Use flagged problems if a coding review is needed. |

## Week 19 · 2026-12-07–2026-12-13 — Robber and stock DP

| Day | Date | Weekdays | Workload | Problems and perspectives |
| --- | --- | --- | --- | --- |
| 127 | 2026-12-07 | Mon | 1 Medium | [198. House Robber](https://leetcode.com/problems/house-robber/)<br>Perspective: Compare a full DP table with two rolling states. |
| 128 | 2026-12-08 | Tue | 1 Medium | [213. House Robber II](https://leetcode.com/problems/house-robber-ii/)<br>Perspective: Reduce the cycle to two linear ranges; handle very short inputs separately. |
| 129 | 2026-12-09 | Wed | 1 Medium | [337. House Robber III](https://leetcode.com/problems/house-robber-iii/)<br>Perspective: Use take/skip states for each subtree; compare with the linear robber recurrence. |
| 130 | 2026-12-10 | Thu | 3 Easy | [121. Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)<br>Perspective: Know running-minimum greedy reasoning and holding/not-holding DP.<br><br>[674. Longest Continuous Increasing Subsequence](https://leetcode.com/problems/longest-continuous-increasing-subsequence/)<br>Perspective: Distinguish a contiguous increasing run from an increasing subsequence.<br><br>[1207. Unique Number of Occurrences](https://leetcode.com/problems/unique-number-of-occurrences/) (review)<br>Perspective: Easy review to complete this three-problem group; check frequency uniqueness. |
| 131 | 2026-12-11 | Fri | 1 Hard | [123. Best Time to Buy and Sell Stock III](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/)<br>Perspective: Model transaction stages; compare the formulation with general k-transaction DP. |
| 132 | 2026-12-12 | Sat | 1 Hard | [188. Best Time to Buy and Sell Stock IV](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/)<br>Perspective: Generalize transaction states; recognize the unlimited-transactions case. |
| 133 | 2026-12-13 | Sun | Targeted review | Compare robber states on paths, cycles, and trees; explain stock transaction states. Use flagged problems if a coding review is needed. |

## Week 20 · 2026-12-14–2026-12-20 — Stock DP and sequence matching

| Day | Date | Weekdays | Workload | Problems and perspectives |
| --- | --- | --- | --- | --- |
| 134 | 2026-12-14 | Mon | 1 Medium | [309. Best Time to Buy and Sell Stock with Cooldown](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/)<br>Perspective: Make the cooldown transition explicit; compare three-state and delayed-transition formulations. |
| 135 | 2026-12-15 | Tue | 1 Medium | [714. Best Time to Buy and Sell Stock with Transaction Fee](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/)<br>Perspective: Know stock-state DP; understand the fee-adjusted greedy perspective. |
| 136 | 2026-12-16 | Wed | 1 Medium | [300. Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/)<br>Perspective: Know quadratic DP first; understand the O(n log n) tails + binary-search method. |
| 137 | 2026-12-17 | Thu | 1 Medium | [718. Maximum Length of Repeated Subarray](https://leetcode.com/problems/maximum-length-of-repeated-subarray/)<br>Perspective: Contrast contiguous-match DP with general longest-common-subsequence DP. |
| 138 | 2026-12-18 | Fri | 1 Medium | [1143. Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/)<br>Perspective: Understand match/skip transitions; compare full-table DP with rolling rows. |
| 139 | 2026-12-19 | Sat | 1 Medium | [1035. Uncrossed Lines](https://leetcode.com/problems/uncrossed-lines/)<br>Perspective: Translate noncrossing connections into longest common subsequence. |
| 140 | 2026-12-20 | Sun | Targeted review | Compare increasing subsequences, contiguous matches, and common subsequences. Use flagged problems if a coding review is needed. |

## Week 21 · 2026-12-21–2026-12-27 — Sequence DP and monotonic-stack foundations

| Day | Date | Weekdays | Workload | Problems and perspectives |
| --- | --- | --- | --- | --- |
| 141 | 2026-12-21 | Mon | 1 Hard | [115. Distinct Subsequences](https://leetcode.com/problems/distinct-subsequences/)<br>Perspective: Count matching subsequences rather than maximizing their length; handle empty-prefix states. |
| 142 | 2026-12-22 | Tue | 1 Medium | [583. Delete Operation for Two Strings](https://leetcode.com/problems/delete-operation-for-two-strings/)<br>Perspective: Compare direct deletion DP with the longest-common-subsequence relationship. |
| 143 | 2026-12-23 | Wed | 1 Medium | [72. Edit Distance](https://leetcode.com/problems/edit-distance/)<br>Perspective: Understand insert/delete/replace transitions; compare bottom-up DP with memoized recursion. |
| 144 | 2026-12-24 | Thu | 1 Medium | [647. Palindromic Substrings](https://leetcode.com/problems/palindromic-substrings/)<br>Perspective: Know center expansion and interval DP. |
| 145 | 2026-12-25 | Fri | 1 Medium | [516. Longest Palindromic Subsequence](https://leetcode.com/problems/longest-palindromic-subsequence/)<br>Perspective: Use interval DP; contrast palindromic subsequences with contiguous palindromes. |
| 146 | 2026-12-26 | Sat | 1 Medium | [739. Daily Temperatures](https://leetcode.com/problems/daily-temperatures/)<br>Perspective: Maintain unresolved indices in a monotonic stack; explain when an answer becomes known. |
| 147 | 2026-12-27 | Sun | Targeted review | Review counting versus optimization DP, palindrome states, and monotonic-stack invariants. Use flagged problems if a coding review is needed. |

## Week 22 · 2026-12-28–2027-01-03 — Monotonic stacks and graph traversal

| Day | Date | Weekdays | Workload | Problems and perspectives |
| --- | --- | --- | --- | --- |
| 148 | 2026-12-28 | Mon | 1 Medium | [503. Next Greater Element II](https://leetcode.com/problems/next-greater-element-ii/)<br>Perspective: Simulate circular traversal; separate pushing indices from resolving answers. |
| 149 | 2026-12-29 | Tue | 1 Hard | [42. Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/)<br>Perspective: Know the DP-boundary, two-pointer, and monotonic-stack perspectives; implement one first. |
| 150 | 2026-12-30 | Wed | 1 Hard | [84. Largest Rectangle in Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram/)<br>Perspective: Know nearest-smaller boundaries and the monotonic stack; explain sentinels and equal heights. |
| 151 | 2026-12-31 | Thu | 1 Kamacoder (unrated) | [Kama 98. 所有可达路径](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/kamacoder/0098.%E6%89%80%E6%9C%89%E5%8F%AF%E8%BE%BE%E8%B7%AF%E5%BE%84.md)<br>Perspective: Know adjacency-list and adjacency-matrix representations; use DFS/backtracking for path enumeration. |
| 152 | 2027-01-01 | Fri | 1 Kamacoder (unrated) | [Kama 99. 岛屿的数量](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/kamacoder/0099.%E5%B2%9B%E5%B1%BF%E7%9A%84%E6%95%B0%E9%87%8F%E6%B7%B1%E6%90%9C.md)<br>Perspective: Know both DFS and BFS flood fill; compare recursive DFS with an explicit stack. |
| 153 | 2027-01-02 | Sat | 1 Kamacoder (unrated) | [Kama 100. 岛屿的最大面积](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/kamacoder/0100.%E5%B2%9B%E5%B1%BF%E7%9A%84%E6%9C%80%E5%A4%A7%E9%9D%A2%E7%A7%AF.md)<br>Perspective: Use flood fill to accumulate component area; compare DFS and BFS. |
| 154 | 2027-01-03 | Sun | Targeted review | Compare the rain-water approaches; explain DFS/BFS visited-state handling. Use flagged problems if a coding review is needed. |

## Week 23 · 2027-01-04–2027-01-10 — Graph grids and boundary problems

| Day | Date | Weekdays | Workload | Problems and perspectives |
| --- | --- | --- | --- | --- |
| 155 | 2027-01-04 | Mon | 1 Kamacoder (unrated) | [Kama 101. 孤岛的总面积](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/kamacoder/0101.%E5%AD%A4%E5%B2%9B%E7%9A%84%E6%80%BB%E9%9D%A2%E7%A7%AF.md)<br>Perspective: Compare boundary flood fill with marking each component as boundary-connected or enclosed. |
| 156 | 2027-01-05 | Tue | 1 Kamacoder (unrated) | [Kama 102. 沉没孤岛](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/kamacoder/0102.%E6%B2%89%E6%B2%A1%E5%AD%A4%E5%B2%9B.md)<br>Perspective: Mark boundary-connected land before changing enclosed cells; compare DFS and BFS. |
| 157 | 2027-01-06 | Wed | 1 Kamacoder (unrated) | [Kama 103. 水流问题](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/kamacoder/0103.%E6%B0%B4%E6%B5%81%E9%97%AE%E9%A2%98.md)<br>Perspective: Understand reverse traversal from the boundaries instead of searching outward from every cell. |
| 158 | 2027-01-07 | Thu | 1 Kamacoder (unrated) | [Kama 104. 建造最大岛屿](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/kamacoder/0104.%E5%BB%BA%E9%80%A0%E6%9C%80%E5%A4%A7%E5%B2%9B%E5%B1%BF.md)<br>Perspective: Label components and store their areas; deduplicate neighboring component IDs when joining them. |
| 159 | 2027-01-08 | Fri | 1 Kamacoder (unrated) | [Kama 106. 岛屿的周长](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/kamacoder/0106.%E5%B2%9B%E5%B1%BF%E7%9A%84%E5%91%A8%E9%95%BF.md)<br>Perspective: Compare counting exposed edges with counting land cells minus shared edges; traversal is not required. |
| 160 | 2027-01-09 | Sat | 1 Kamacoder (unrated) | [Kama 110. 字符串接龙](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/kamacoder/0110.%E5%AD%97%E7%AC%A6%E4%B8%B2%E6%8E%A5%E9%BE%99.md)<br>Perspective: Use BFS for shortest transformation length; bidirectional BFS is an optional optimization. |
| 161 | 2027-01-10 | Sun | Targeted review | Review boundary-connected components, reverse traversal, and component labels. Use flagged problems if a coding review is needed. |

## Week 24 · 2027-01-11–2027-01-17 — Connectivity, spanning trees, and topological sorting

| Day | Date | Weekdays | Workload | Problems and perspectives |
| --- | --- | --- | --- | --- |
| 162 | 2027-01-11 | Mon | 1 Kamacoder (unrated) | [Kama 105. 有向图的完全可达性](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/kamacoder/0105.%E6%9C%89%E5%90%91%E5%9B%BE%E7%9A%84%E5%AE%8C%E5%85%A8%E5%8F%AF%E8%BE%BE%E6%80%A7.md)<br>Perspective: Know directed reachability through DFS/BFS; do not treat edges as undirected. |
| 163 | 2027-01-12 | Tue | 1 Kamacoder (unrated) | [Kama 107. 寻找存在的路径](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/kamacoder/0107.%E5%AF%BB%E6%89%BE%E5%AD%98%E5%9C%A8%E7%9A%84%E8%B7%AF%E5%BE%84.md)<br>Perspective: Know DFS/BFS connectivity and union-find with path compression and union by rank/size. |
| 164 | 2027-01-13 | Wed | 1 Kamacoder (unrated) | [Kama 108. 冗余连接](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/kamacoder/0108.%E5%86%97%E4%BD%99%E8%BF%9E%E6%8E%A5.md)<br>Perspective: Use union-find to detect the first edge joining already-connected endpoints. |
| 165 | 2027-01-14 | Thu | 1 Kamacoder (unrated) | [Kama 109. 冗余连接II](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/kamacoder/0109.%E5%86%97%E4%BD%99%E8%BF%9E%E6%8E%A5II.md)<br>Perspective: Distinguish a node with two parents from a directed cycle; combine that reasoning with union-find. |
| 166 | 2027-01-15 | Fri | 1 Kamacoder (unrated) | [Kama 53. 寻宝](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/kamacoder/0053.%E5%AF%BB%E5%AE%9D-prim.md)<br>Perspective: Know both Prim and Kruskal; compare growing a tree with selecting edges between components. |
| 167 | 2027-01-16 | Sat | 1 Kamacoder (unrated) | [Kama 117. 软件构建](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/kamacoder/0117.%E8%BD%AF%E4%BB%B6%E6%9E%84%E5%BB%BA.md)<br>Perspective: Know indegree-based Kahn sorting and DFS postorder; understand cycle detection. |
| 168 | 2027-01-17 | Sun | Targeted review | Compare DFS/BFS with union-find, Prim with Kruskal, and Kahn sorting with DFS postorder. Use flagged problems if a coding review is needed. |

## Week 25 · 2027-01-18–2027-01-24 — Shortest paths and first-pass recap

| Day | Date | Weekdays | Workload | Problems and perspectives |
| --- | --- | --- | --- | --- |
| 169 | 2027-01-18 | Mon | 1 Kamacoder (unrated) | [Kama 47. 参会](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/kamacoder/0047.%E5%8F%82%E4%BC%9Adijkstra%E6%9C%B4%E7%B4%A0.md)<br>Perspective: Know naive and heap-optimized Dijkstra; explain the nonnegative-edge requirement. |
| 170 | 2027-01-19 | Tue | 1 Kamacoder (unrated) | [Kama 94. 城市间货物运输I](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/kamacoder/0094.%E5%9F%8E%E5%B8%82%E9%97%B4%E8%B4%A7%E7%89%A9%E8%BF%90%E8%BE%93I.md)<br>Perspective: Know Bellman–Ford and queue-based SPFA; SPFA has no better worst-case guarantee. |
| 171 | 2027-01-20 | Wed | 1 Kamacoder (unrated) | [Kama 95. 城市间货物运输II](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/kamacoder/0095.%E5%9F%8E%E5%B8%82%E9%97%B4%E8%B4%A7%E7%89%A9%E8%BF%90%E8%BE%93II.md)<br>Perspective: Understand why an additional relaxation reveals a reachable negative-weight cycle. |
| 172 | 2027-01-21 | Thu | 1 Kamacoder (unrated) | [Kama 96. 城市间货物运输III](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/kamacoder/0096.%E5%9F%8E%E5%B8%82%E9%97%B4%E8%B4%A7%E7%89%A9%E8%BF%90%E8%BE%93III.md)<br>Perspective: Use the previous relaxation round when enforcing an edge-count limit. |
| 173 | 2027-01-22 | Fri | 1 Kamacoder (unrated) | [Kama 97. 小明逛公园](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/kamacoder/0097.%E5%B0%8F%E6%98%8E%E9%80%9B%E5%85%AC%E5%9B%AD.md)<br>Perspective: Know Floyd–Warshall's intermediate-vertex DP interpretation; compare with repeated single-source searches. |
| 174 | 2027-01-23 | Sat | 1 Kamacoder (unrated) | [Kama 126. 骑士的攻击](https://github.com/youngyangyang04/leetcode-master/blob/master/problems/kamacoder/0126.%E9%AA%91%E5%A3%AB%E7%9A%84%E6%94%BB%E5%87%BBastar.md)<br>Perspective: Understand how A* combines path cost with a heuristic; compare with Dijkstra and BFS, and when the heuristic preserves optimality. |
| 175 | 2027-01-24 | Sun | Targeted review | Compare shortest-path assumptions and complexity. Audit the mistake log and choose the next targeted recap. Use flagged problems if a coding review is needed. |

## Scope and timing

This lean plan follows the [leetcode-master README's main curriculum](https://github.com/youngyangyang04/leetcode-master/blob/master/README.md), as checked on September 7, 2026. It covers all 129 distinct numbered LeetCode entries linked directly there, plus the three tree traversals and the linked-list intersection equivalent (LC 160). It also covers the 25 distinct numbered Kamacoder entries and the three knapsack exercises linked from theory articles (Kama 46, 52, and 56).

Weeks 1–5 are treated as already covered for first-pass counting; a scheduled historical exercise is not proof of mastery. Use the record files to decide which need another attempt.

| Remaining first-pass work from Week 6 | Practice days |
| --- | --- |
| 35 distinct Easy problems + 1 Easy review | 12 |
| 69 distinct Medium problems | 69 |
| 11 distinct Hard problems | 11 |
| 28 distinct Kamacoder exercises | 28 |
| Total | 120 (20 weeks at six practice days per week) |

Unlike the previous April plan, this version does not retain every supplementary exercise. It omits duplicate LeetCode counterparts for the Kamacoder graph exercises, supplementary tree variants and warm-ups, separately scheduled alternate implementations, automatic repeat sets, and the two fixed final-consolidation weeks. Historical stretch notes in Weeks 1–5 remain historical; they do not add mandatory future assignments. The scope is the main README curriculum, not every problem linked inside every article or every file in the repository.

LeetCode labels use the [problem catalog](https://leetcode.com/api/problems/all/) checked on September 7, 2026. Kamacoder exercises remain unrated rather than being assigned an invented LeetCode difficulty. If ratings change, regroup future days using the same workload rule.

## Review method

- Before a chapter, read its theory introduction. After it, explain the key invariants and review your flagged mistakes.
- For every DP problem, write the state, recurrence, initialization, iteration order, and one example. Treat greedy/DP and 1D/2D formulations as perspectives on the same exercise rather than automatic extra assignments.
- For graphs, state whether edges are directed or weighted, whether negative weights are allowed, and why the chosen algorithm applies. Practice Java console input/output on the Kamacoder exercises.
- For targeted retries, attempt the problem without hints, then explain correctness and time/space complexity. Clear a “should solve again” flag only when you can reproduce the reasoning, not merely after an accepted submission.
- Reassess dates at each chapter boundary. Twelve additional Monday–Saturday practice days would move the last-problem baseline from January 23 to February 6, 2027. Sundays remain available for review, and no catch-up pile is required.

### Perspectives worth revisiting from Weeks 1–5

These are reference notes for already-scheduled problems, not new mandatory slots.

| Earlier problems | Perspective to understand |
| --- | --- |
| LC 704, 35 | Closed versus half-open binary-search intervals; make the loop invariant explicit. |
| LC 209, 904 | Sliding-window validity and why the left boundary advances; understand when the assumptions permit this approach. |
| LC 560 | Prefix sums + frequency map; distinguish this from sliding windows when negative values are possible. |
| LC 206, 24 | Iterative versus recursive pointer changes; dummy heads and safe reassignment order. |
| LC 141, 142, 160 | Hash-set detection versus pointer-based methods; cycle-entry reasoning versus switching list heads. |
| LC 242, 349, 350, 1207 | Frequency arrays versus maps/sets; distinguish existence, multiplicity, and uniqueness of frequencies. |
| LC 1, 167, 454 | Hash lookup versus sorted two pointers; pair-sum aggregation and the resulting time/space tradeoff. |
