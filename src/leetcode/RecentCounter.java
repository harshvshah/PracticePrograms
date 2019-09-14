package leetcode;
//        Write a class RecentCounter to count recent requests.
//
//        It has only one method: ping(int t), where t represents some time in milliseconds.
//
//        Return the number of pings that have been made from 3000 milliseconds ago until now.
//
//        Any ping with time in [t - 3000, t] will count, including the current ping.
//
//        It is guaranteed that every call to ping uses a strictly larger value of t than before.

import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    Queue<Integer> q;

    public RecentCounter() {
        q = new LinkedList();
    }

    public int ping(int t) {
        q.add(t);
        while (q.peek() < t - 3000)
            q.poll();
        return q.size();
    }
}
