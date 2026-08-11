# Week 1 Record

| Date | Problem | Type | Solved Independently | What I Learned Today |
| --- | --- | --- | --- | --- |
| 2026-08-10 | [69. Sqrt(x)](https://leetcode.com/problems/sqrtx/) | Binary Search | No | 原本應該是暖身題，結果一個卡...和AI討論後才解出來，解法也不漂亮，多了一些判斷式。尤其是上限的決定卡很久，一直糾結在要算出Integer.MAX_VALUE的平方，但其實上限設很大也無所謂，因為binary search的特性一定會朝目標值靠攏。 |
| 2026-08-10 | [209. Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/) | Sliding Window | No | 看完題目對解法有想法，但細節操作上有問題導致沒有一次對。 |
| 2026-08-11 | [374. Guess Number Higher or Lower](https://leetcode.com/problems/guess-number-higher-or-lower/) | Binary Search | Yes | 就是一般的binary serach |
| 2026-08-11 | [744. Find Smallest Letter Greater Than Target](https://leetcode.com/problems/find-smallest-letter-greater-than-target/) | Binary Search | No | 下意識用暴力解，題型設計上暴力解也不會慢O(n)，但其實可以用binary search解會更有效率O(logn)，但我對binary search解法有點模糊 |

```
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int missing = arr[mid] - (mid + 1);
            if(missing < k){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        int max = arr[left];
        
    }
}
```