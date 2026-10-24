# Week 12 Record

| Day | Date | Problem | Type | Solved Independently | Should Solve Again | What I Learned Today |
| --- | --- | --- | --- | --- | --- | --- |
| Day78 | 2026-10-19 | [131. Palindrome Partitioning](https://leetcode.com/problems/palindrome-partitioning/) | Backtracking / Partitioning / String | Yes | Yes | 有解出來不過AI給出一些可以優化的建議 |
| Day79 | 2026-10-20 | [93. Restore IP Addresses](https://leetcode.com/problems/restore-ip-addresses/) | Backtracking / Partitioning / Pruning | Yes | No | 跟昨天那題感覺一樣概念，少了pruning |
| Day80 | 2026-10-21 | [78. Subsets](https://leetcode.com/problems/subsets/) | Backtracking / Subsets | Yes | Yes | 第一次解想用滑窗，但這樣會漏了非連續的組合；第二次解用backtracking解出來，但是多了一層limit迴圈，其實可以不用...，然後AI還給出另一個解法(Appendix01) |
| Day81 | 2026-10-22 | [90. Subsets II](https://leetcode.com/problems/subsets-ii/) | Backtracking / Subsets / Deduplication | Yes | No | 跟昨天那題幾乎一樣，不過多了leetcode40(Combination Sum II)的機關 |
| Day82 | 2026-10-23 | [491. Non-decreasing Subsequences](https://leetcode.com/problems/non-decreasing-subsequences/) | Backtracking / Subsequences / Deduplication | No | Yes | 重複的條件錯了，一直卡在過去的解法 |
| Day83 | 2026-10-24 | [46. Permutations](https://leetcode.com/problems/permutations/) | Backtracking / Permutations | Yes | No | 有卡了一下，也是因為之前幾題的印象，後來有找到問題點修正 |

## Sunday Review · 2026-10-25 (Day84)

Compare same-level deduplication with reuse along one search path. Use flagged problems if a coding review is needed.

### Appendix01:
Day80 AI給出另一個Pascal's rule解法:
```
private void dfs(int i, int[] nums, Deque<Integer> path, List<List<Integer>> result) {
    if (i == nums.length) {
        result.add(new ArrayList<>(path));
        return;
    }
    dfs(i + 1, nums, path, result);        // skip nums[i]
    path.addLast(nums[i]);
    dfs(i + 1, nums, path, result);        // take nums[i]
    path.removeLast();
}
```