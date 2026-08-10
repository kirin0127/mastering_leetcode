# Schedule: August 3–December 31, 2026

**Daily workload rule:** A day centred on one Medium problem remains a single-problem day. A day centred on one Easy problem includes up to three related Easy problems. Review, timed-set, and template days remain unchanged.

## Week 1 · Aug 3–9 — Arrays: binary search and two pointers

| Day | LeetCode |
| --- | --- |
| Mon | 704. Binary Search |
| Tue | 35. Search Insert Position |
| Wed | 27. Remove Element |
| Thu | 977. Squares of a Sorted Array |
| Fri | 26. Remove Duplicates from Sorted Array |
| Sat | 283. Move Zeroes<br>941. Valid Mountain Array<br>485. Max Consecutive Ones |
| Sun | Review 704, 27 and 977 |

**Focus:**

- Binary-search interval definitions
- `left <= right` versus `left < right`
- In-place array modification
- Fast and slow pointers

## Week 2 · Aug 10–16 — Arrays: sliding window, prefix sum and matrix

| Day | LeetCode |
| --- | --- |
| Mon | 209. Minimum Size Subarray Sum<br>Warm-up: 69. Sqrt(x) (**should solve again, and try Newton**), 374. Guess Number Higher or Lower (**Not solve yet**) |
| Tue | 904. Fruit Into Baskets<br>Warm-up: 744. Find Smallest Letter Greater Than Target, 1539. Kth Missing Positive Number |
| Wed | 59. Spiral Matrix II<br>Warm-up: 88. Merge Sorted Array, 905. Sort Array By Parity |
| Thu | 54. Spiral Matrix<br>Warm-up: 1089. Duplicate Zeros, 1299. Replace Elements with Greatest Element on Right Side |
| Fri | 724. Find Pivot Index<br>Warm-up: 1480. Running Sum of 1d Array, 1732. Find the Highest Altitude, 268. Missing Number |
| Sat | 560. Subarray Sum Equals K<br>Warm-up: 136. Single Number |
| Sun | Review 209, 59 and 560 |

**Stretch problem:** 76. Minimum Window Substring

Do not worry if LC 76 is too difficult now. It is primarily an advanced sliding-window reference problem.

## Week 3 · Aug 17–23 — Linked lists

| Day | LeetCode |
| --- | --- |
| Mon | 203. Remove Linked List Elements<br>237. Delete Node in a Linked List<br>876. Middle of the Linked List |
| Tue | 707. Design Linked List |
| Wed | 206. Reverse Linked List<br>83. Remove Duplicates from Sorted List<br>1290. Convert Binary Number in a Linked List to Integer |
| Thu | 24. Swap Nodes in Pairs |
| Fri | 19. Remove Nth Node From End of List |
| Sat | 160. Intersection of Two Linked Lists<br>876. Middle of the Linked List (review)<br>1290. Convert Binary Number in a Linked List to Integer (review) |
| Sun | Review 206, 24 and 19 |

**Important patterns:**

- Dummy head
- Pointer reassignment
- Fast and slow pointers
- Iterative versus recursive reversal

## Week 4 · Aug 24–30 — Linked-list consolidation and cycle detection

| Day | LeetCode |
| --- | --- |
| Mon | 141. Linked List Cycle<br>876. Middle of the Linked List (review)<br>21. Merge Two Sorted Lists (review) |
| Tue | 142. Linked List Cycle II |
| Wed | 143. Reorder List |
| Thu | 234. Palindrome Linked List<br>83. Remove Duplicates from Sorted List (review)<br>1290. Convert Binary Number in a Linked List to Integer (review) |
| Fri | Redo 707. Design Linked List |
| Sat | Timed set: 203, 206 and 19 |
| Sun | Write linked-list templates from memory |

You should be able to write these templates without reference:

```java
ListNode reverse(ListNode head)
ListNode findMiddle(ListNode head)
boolean hasCycle(ListNode head)
```

## Week 5 · Aug 31–Sep 6 — Hash tables

| Day | LeetCode |
| --- | --- |
| Mon | 242. Valid Anagram<br>205. Isomorphic Strings<br>387. First Unique Character in a String |
| Tue | 1002. Find Common Characters<br>771. Jewels and Stones<br>1160. Find Words That Can Be Formed by Characters |
| Wed | 349. Intersection of Two Arrays<br>350. Intersection of Two Arrays II<br>1207. Unique Number of Occurrences |
| Thu | 202. Happy Number<br>217. Contains Duplicate<br>219. Contains Duplicate II |
| Fri | 1. Two Sum<br>167. Two Sum II - Input Array Is Sorted<br>1929. Concatenation of Array |
| Sat | 454. 4Sum II |
| Sun | Review 242, 1 and 454 |

## Week 6 · Sep 7–13 — Hash tables and sum problems

| Day | LeetCode |
| --- | --- |
| Mon | 383. Ransom Note<br>1189. Maximum Number of Balloons<br>1832. Check if the Sentence Is Pangram |
| Tue | 15. 3Sum |
| Wed | Continue and optimize 15. 3Sum |
| Thu | 18. 4Sum |
| Fri | 49. Group Anagrams |
| Sat | Timed set: 1, 15 and 454 |
| Sun | Review duplicate-removal logic |

LC 15 and LC 18 belong in the hash-table chapter, but their best solutions mainly exercise:

- Sorting
- Two pointers
- Duplicate elimination

## Week 7 · Sep 14–20 — Strings

| Day | LeetCode |
| --- | --- |
| Mon | 344. Reverse String<br>345. Reverse Vowels of a String<br>125. Valid Palindrome |
| Tue | 541. Reverse String II<br>557. Reverse Words in a String III<br>58. Length of Last Word |
| Wed | 151. Reverse Words in a String |
| Thu | 28. Find the Index of the First Occurrence in a String<br>14. Longest Common Prefix<br>796. Rotate String |
| Fri | Continue LC 28 using KMP |
| Sat | 459. Repeated Substring Pattern<br>1071. Greatest Common Divisor of Strings<br>415. Add Strings |
| Sun | Review KMP prefix table |

For LC 28, first solve it using the straightforward approach. Then study KMP; do not expect to derive KMP independently on the first attempt.

## Week 8 · Sep 21–27 — Stacks and queues

| Day | LeetCode |
| --- | --- |
| Mon | 232. Implement Queue Using Stacks<br>933. Number of Recent Calls<br>1700. Number of Students Unable to Eat Lunch |
| Tue | 225. Implement Stack Using Queues<br>682. Baseball Game<br>1544. Make The String Great |
| Wed | 20. Valid Parentheses<br>844. Backspace String Compare<br>496. Next Greater Element I |
| Thu | 1047. Remove All Adjacent Duplicates in String<br>2696. Minimum String Length After Removing Substrings<br>3174. Clear Digits |
| Fri | 150. Evaluate Reverse Polish Notation |
| Sat | 239. Sliding Window Maximum |
| Sun | Review 20, 150 and 239 |

LC 239 is the first important monotonic-queue problem. It is normal to require the course explanation.

## Week 9 · Sep 28–Oct 4 — Priority queues and binary-tree foundations

| Day | LeetCode |
| --- | --- |
| Mon | 347. Top K Frequent Elements |
| Tue | 144. Binary Tree Preorder Traversal<br>589. N-ary Tree Preorder Traversal<br>100. Same Tree |
| Wed | 94. Binary Tree Inorder Traversal<br>897. Increasing Order Search Tree<br>530. Minimum Absolute Difference in BST |
| Thu | 145. Binary Tree Postorder Traversal<br>590. N-ary Tree Postorder Traversal<br>572. Subtree of Another Tree |
| Fri | Redo all three traversals iteratively |
| Sat | 102. Binary Tree Level Order Traversal |
| Sun | Write DFS and BFS templates |

This week begins the tree section. Learn both:

```java
void dfs(TreeNode node)
void bfs(TreeNode root)
```

## Week 10 · Oct 5–11 — Binary-tree structure and depth

| Day | LeetCode |
| --- | --- |
| Mon | 226. Invert Binary Tree<br>617. Merge Two Binary Trees<br>100. Same Tree (review) |
| Tue | 101. Symmetric Tree<br>965. Univalued Binary Tree<br>572. Subtree of Another Tree (review) |
| Wed | 104. Maximum Depth of Binary Tree<br>543. Diameter of Binary Tree<br>559. Maximum Depth of N-ary Tree |
| Thu | 111. Minimum Depth of Binary Tree<br>671. Second Minimum Node In a Binary Tree<br>993. Cousins in Binary Tree |
| Fri | 222. Count Complete Tree Nodes<br>101. Symmetric Tree (review)<br>100. Same Tree (review) |
| Sat | 110. Balanced Binary Tree<br>563. Binary Tree Tilt<br>872. Leaf-Similar Trees |
| Sun | Review recursive return-value design |

## Week 11 · Oct 12–18 — Tree paths and construction

| Day | LeetCode |
| --- | --- |
| Mon | 257. Binary Tree Paths<br>637. Average of Levels in Binary Tree<br>993. Cousins in Binary Tree (review) |
| Tue | 404. Sum of Left Leaves<br>563. Binary Tree Tilt (review)<br>617. Merge Two Binary Trees (review) |
| Wed | 513. Find Bottom Left Tree Value |
| Thu | 112. Path Sum<br>653. Two Sum IV - Input is a BST<br>872. Leaf-Similar Trees (review) |
| Fri | 106. Construct Binary Tree from Inorder and Postorder Traversal |
| Sat | 654. Maximum Binary Tree |
| Sun | Review 112, 106 and 654 |

The major distinction this week is:

- Use parameters to carry information downward.
- Use return values to carry information upward.
- Use backtracking when restoring path state.

## Week 12 · Oct 19–25 — Binary search trees

| Day | LeetCode |
| --- | --- |
| Mon | 700. Search in a Binary Search Tree<br>938. Range Sum of BST<br>783. Minimum Distance Between BST Nodes |
| Tue | 98. Validate Binary Search Tree |
| Wed | 530. Minimum Absolute Difference in a BST<br>783. Minimum Distance Between BST Nodes (review)<br>897. Increasing Order Search Tree (review) |
| Thu | 501. Find Mode in Binary Search Tree<br>108. Convert Sorted Array to Binary Search Tree<br>938. Range Sum of BST (review) |
| Fri | 236. Lowest Common Ancestor of a Binary Tree |
| Sat | 235. Lowest Common Ancestor of a BST |
| Sun | Compare LC 236 and LC 235 |

## Week 13 · Oct 26–Nov 1 — BST modification and tree review

| Day | LeetCode |
| --- | --- |
| Mon | 701. Insert into a Binary Search Tree |
| Tue | 450. Delete Node in a BST |
| Wed | 669. Trim a Binary Search Tree |
| Thu | 108. Convert Sorted Array to BST<br>100. Same Tree (review)<br>101. Symmetric Tree (review) |
| Fri | 538. Convert BST to Greater Tree |
| Sat | Timed tree set: 102, 98 and 236 |
| Sun | Tree-module review |

At the end of this week, you should recognize whether a tree problem needs:

- Preorder
- Inorder
- Postorder
- Level-order traversal
- General binary-tree recursion
- BST ordering properties

## Week 14 · Nov 2–8 — Backtracking: combinations

| Day | LeetCode |
| --- | --- |
| Mon | 77. Combinations |
| Tue | Redo LC 77 with pruning |
| Wed | 216. Combination Sum III |
| Thu | 17. Letter Combinations of a Phone Number |
| Fri | 39. Combination Sum |
| Sat | 40. Combination Sum II |
| Sun | Write the backtracking template |

**Template:**

```java
void backtrack(...) {
    if (terminationCondition) {
        result.add(...);
        return;
    }

    for (...) {
        choose();
        backtrack(...);
        undo();
    }
}
```

## Week 15 · Nov 9–15 — Backtracking: partitioning, subsets and permutations

| Day | LeetCode |
| --- | --- |
| Mon | 131. Palindrome Partitioning |
| Tue | 93. Restore IP Addresses |
| Wed | 78. Subsets |
| Thu | 90. Subsets II |
| Fri | 491. Non-decreasing Subsequences |
| Sat | 46. Permutations |
| Sun | Review deduplication techniques |

## Week 16 · Nov 16–22 — Backtracking completion and greedy foundations

| Day | LeetCode |
| --- | --- |
| Mon | 47. Permutations II |
| Tue | 332. Reconstruct Itinerary |
| Wed | 51. N-Queens |
| Thu | 455. Assign Cookies<br>860. Lemonade Change<br>1710. Maximum Units on a Truck |
| Fri | 376. Wiggle Subsequence |
| Sat | 53. Maximum Subarray |
| Sun | Backtracking review |

**Stretch problem:** 37. Sudoku Solver

Treat Sudoku as optional. N-Queens is sufficient for learning two-dimensional backtracking.

## Week 17 · Nov 23–29 — Greedy algorithms

| Day | LeetCode |
| --- | --- |
| Mon | 122. Best Time to Buy and Sell Stock II |
| Tue | 55. Jump Game |
| Wed | 45. Jump Game II |
| Thu | 1005. Maximize Sum of Array After K Negations |
| Fri | 134. Gas Station |
| Sat | 135. Candy |
| Sun | Review local versus global optimality |

## Week 18 · Nov 30–Dec 6 — Greedy intervals and dynamic-programming foundations

| Day | LeetCode |
| --- | --- |
| Mon | 406. Queue Reconstruction by Height |
| Tue | 452. Minimum Number of Arrows to Burst Balloons |
| Wed | 435. Non-overlapping Intervals |
| Thu | 763. Partition Labels |
| Fri | 56. Merge Intervals |
| Sat | 738. Monotone Increasing Digits |
| Sun | Greedy-module review |

**Optional advanced tree-greedy problem:** 968. Binary Tree Cameras

## Week 19 · Dec 7–13 — Dynamic programming: foundations and knapsack

| Day | LeetCode |
| --- | --- |
| Mon | 509. Fibonacci Number<br>1137. N-th Tribonacci Number<br>1025. Divisor Game |
| Tue | 70. Climbing Stairs<br>338. Counting Bits<br>392. Is Subsequence |
| Wed | 746. Min Cost Climbing Stairs<br>1646. Get Maximum in Generated Array<br>1025. Divisor Game (review) |
| Thu | 62. Unique Paths |
| Fri | 63. Unique Paths II |
| Sat | 343. Integer Break |
| Sun | 96. Unique Binary Search Trees |

For every DP problem, explicitly write:

- `dp[i]` or `dp[i][j]` definition
- Recurrence
- Initialization
- Traversal order
- Example walkthrough

## Week 20 · Dec 14–20 — Knapsack and derived DP problems

| Day | LeetCode |
| --- | --- |
| Mon | 416. Partition Equal Subset Sum |
| Tue | 1049. Last Stone Weight II |
| Wed | 494. Target Sum |
| Thu | 474. Ones and Zeroes |
| Fri | 518. Coin Change II |
| Sat | 322. Coin Change |
| Sun | Compare 0/1 and complete knapsack |

**Optional:**

- 377. Combination Sum IV
- 279. Perfect Squares

The critical distinction:

```text
0/1 knapsack:
for item
    for capacity descending

Complete knapsack:
for item
    for capacity ascending
```

## Week 21 · Dec 21–27 — Robber, stock and subsequence DP

| Day | LeetCode |
| --- | --- |
| Mon | 198. House Robber |
| Tue | 213. House Robber II |
| Wed | 337. House Robber III |
| Thu | 121. Best Time to Buy and Sell Stock<br>118. Pascal's Triangle<br>119. Pascal's Triangle II |
| Fri | 300. Longest Increasing Subsequence |
| Sat | 1143. Longest Common Subsequence |
| Sun | DP review |

**Stretch problems:**

- 309. Best Time to Buy and Sell Stock with Cooldown
- 714. Best Time to Buy and Sell Stock with Transaction Fee
- 718. Maximum Length of Repeated Subarray

## Week 22 · Dec 28–31 — Final consolidation

Do not add a large number of new problems during these four days.

| Date | Assignment |
| --- | --- |
| Dec 28 | Timed set: 704, 209, 15 |
| Dec 29 | Timed set: 206, 102, 98 |
| Dec 30 | Timed set: 77, 55, 416 |
| Dec 31 | Timed set: 300, 1143, then yearly review |

For each timed set:

- Easy: maximum 15 minutes
- Medium: maximum 30 minutes
- No solution or hints during the timer
- Explain the final solution aloud
- State time and space complexity

## Problems deferred to January 2027

The full repository also contains important graph and monotonic-stack sections. Because December 31 is only about 22 weeks away, it is better to consolidate the foundational material than rush through every chapter.

Start January with:

### Monotonic stack

- 739. Daily Temperatures
- 496. Next Greater Element I
- 503. Next Greater Element II
- 42. Trapping Rain Water
- 84. Largest Rectangle in Histogram

### Graphs

- 797. All Paths From Source to Target
- 200. Number of Islands
- 695. Max Area of Island
- 1020. Number of Enclaves
- 130. Surrounded Regions
- 417. Pacific Atlantic Water Flow
- 827. Making A Large Island
- 684. Redundant Connection
- 207. Course Schedule
- 210. Course Schedule II
- 743. Network Delay Time

The repository itself is structured as an approximately 200-problem progression and recommends completing the foundational modules before advancing to trees, backtracking, greedy, DP and graphs. [GitHub](https://github.com/youngyangyang04/leetcode-master/blob/master/README.md?utm_source=chatgpt.com)

## Your end-of-year target

By December 31:

- Approximately 180–200 unique problems
- Approximately 270–330 total submissions, including repeated attempts
- All essential array, list, hash, string, stack, tree, backtracking, greedy and core-DP patterns
- At least 30 problems solved twice
- At least 15 problems solved three times
- Ability to finish a familiar Medium problem within approximately 25–30 minutes

That is a stronger target than recording 200 unique solved problems but being unable to reproduce their solutions independently.
