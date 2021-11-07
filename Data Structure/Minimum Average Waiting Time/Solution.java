import java.util.*;

/**
 * Task
 */
class Task {
    int T, L;

    Task(int t, int l) {
        T = t;
        L = l;
    }

}

class Solution {
    private static PriorityQueue<Task> queue = new PriorityQueue<>((l, r) -> Integer.compare(l.L, r.L)),
            tasks = new PriorityQueue<>((l, r) -> Integer.compare(l.L, r.L));

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; ++i)
            tasks.add(new Task(sc.nextInt(), sc.nextInt()));

        long waiting = 0, completed = 0;
        while (!tasks.isEmpty() || !queue.isEmpty()) {
            if (queue.isEmpty()) {
                queue.add(tasks.peek());
                completed += (tasks.poll().T - completed);
            }
            waiting += (completed += queue.peek().L) - queue.poll().T;
            while (!tasks.isEmpty() && completed > tasks.peek().T) {
                queue.add(tasks.poll());
            }
        }
        System.out.println(waiting / N);
        sc.close();
    }

}