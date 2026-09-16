package leetcode225_ImplementStackUsingQueues;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode 225 - Implement Stack using Queues (Easy)
 * https://leetcode.com/problems/implement-stack-using-queues/
 *
 * Build a LIFO stack with two FIFO queues. Support adding an item, removing
 * and returning the top, inspecting the top, and checking whether it is empty.
 * Only enqueue-at-back, peek/dequeue-at-front, size, and empty checks are allowed.
 * A deque or list may represent a queue, but must obey those operation limits.
 *
 * Official example:
 * Operations: ["MyStack", "push", "push", "top", "pop", "empty"]
 * Arguments:  [[], [1], [2], [], [], []]
 * Results:    [null, null, null, 2, 2, false]
 *
 * Constraints:
 * - 1 <= x <= 9.
 * - At most 100 calls to push, pop, top, and empty.
 * - Calls to pop and top always have an element available.
 *
 * Follow-up: implement the stack with only one queue.
 * Submit this class without its package declaration; do not submit Test.java.
 */
class MyStack {

    Queue<Integer> first;
    Queue<Integer> second;

    public MyStack() {
        first = new LinkedList<>();
        second = new LinkedList<>();
    }

    public void push(int x) {
        if(first.peek() != null){
            first.offer(x);
        }else{
            second.offer(x);
        }
    }

    public int pop() {
        Integer e = null;
        if(first.peek() != null){
            while(first.peek() != null){
                e = first.poll();
                if(first.peek() != null){
                    second.offer(e);
                }
            }
            return e;
        }else{
            while(second.peek() != null){
                e = second.poll();
                if(second.peek() != null){
                    first.offer(e);
                }
            }
            return e;
        }
    }

    public int top() {
        Integer e = null;
        if(first.peek() != null){
            while(first.peek() != null){
                e = first.poll();
                second.offer(e);
            }
            return e;
        }else{
            while(second.peek() != null){
                e = second.poll();
                first.offer(e);
            }
            return e;
        }
    }

    public boolean empty() {
        return first.peek() == null && second.peek() == null;
    }
}
