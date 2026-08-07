# Week 1 Record

| Date | Problem | Type | Solved Independently | What I Learned Today |
| --- | --- | --- | --- | --- |
| 2026-08-03 | [704. Binary Search](https://leetcode.com/problems/binary-search/) | Binary Search | Yes | 知道概念就是不斷從中間切一半來去找目標值，若目標值比中間值大，那就往右邊找，因為array會是升冪排列。難在說怎麼讓程式找不到時乾淨的退出，以及若要找到最後一個值時如何讓條件進去。我是用head <= tail的條件，但其實也可以用head < tail的條件(想想差在哪) |
| 2026-08-04 | [35. Search Insert Position](https://leetcode.com/problems/search-insert-position/) | Binary Search | No | 不小心看到以前的答案，原本想嘗試讓idx維持或者加一的寫法，後來是會可以過，不過以前解法是直接return head，就不用再額外處理 |
| 2026-08-05 | [27. Remove Element](https://leetcode.com/problems/remove-element/) | Two Pointers | Yes | 一次解開，不過我會擔心把val換到left時但是我已經把left往前移，為了避免寫了一個判斷式去確保right不會指到val，如果是val就往左移，整個while重來一遍；但其實不用，只要while裡面不要每次都移動left，就算把val換到left，自然下一次判斷會再把right換過來，所以其實left只要在不是val時才往右就好了，程式會少一個判斷式 |
| 2026-08-06 | [977. Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/) | Two Pointers | No | 第一次的解法卡很久，我原本想維持index 0的位置，把小的值換過來，這樣就只要換right idx往左移動，然後繼續比較，但這樣一遇到負數區域就掛掉了，比如[-5,-3,-2,-1]，第一波可以順利換對，但第二波-1和-2的比較換得當下感覺沒錯，可是一輪到-3就掛了，因為我在上一輪已經把-2^2換到自己以為正確的位置，然後right idx已經往左移了。後來才想到關鍵是保持兩側都是極值，所以不可以換元素的位置，要換的是哪邊的index該挪動。 |
| 2026-08-07 | [26. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | Two Pointers | Yes | 第一次解用了兩個while比較醜一點，後來問AI哪邊可以改善，他建議可以用for，反正指標範圍是固定的，就不用跑到兩個while |