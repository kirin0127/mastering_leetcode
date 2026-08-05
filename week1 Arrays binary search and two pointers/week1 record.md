# Week 1 Record

| Date | Problem | Type | Solved Independently | What I Learned Today |
| --- | --- | --- | --- | --- |
| 2026-08-03 | [704. Binary Search](https://leetcode.com/problems/binary-search/) | Binary Search | Yes | 知道概念就是不斷從中間切一半來去找目標值，若目標值比中間值大，那就往右邊找，因為array會是升冪排列。難在說怎麼讓程式找不到時乾淨的退出，以及若要找到最後一個值時如何讓條件進去。我是用head <= tail的條件，但其實也可以用head < tail的條件(想想差在哪) |
| 2026-08-04 | [35. Search Insert Position](https://leetcode.com/problems/search-insert-position/) | Binary Search | No | 不小心看到以前的答案，原本想嘗試讓idx維持或者加一的寫法，後來是會可以過，不過以前解法是直接return head，就不用再額外處理 |
| 2026-08-05 | [27. Remove Element](https://leetcode.com/problems/remove-element/) | Two Pointers | Yes | 一次解開，不過我會擔心把val換到left時但是我已經把left往前移，為了避免寫了一個判斷式去確保right不會指到val，如果是val就往左移，整個while重來一遍；但其實不用，只要while裡面不要每次都移動left，就算把val換到left，自然下一次判斷會再把right換過來，所以其實left只要在不是val時才往右就好了，程式會少一個判斷式 |