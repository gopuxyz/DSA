class Solution {
    public int maxEvents(int[][] events) { 
        // 1. Sort the concerts by start date. Like organizing a list by date.
        Arrays.sort(events, (a, b) -> a[0] - b[0]);

        // 2. Find the latest end date. This tells us how far out we need to plan.
        int lastDay = 0;
        for (int[] event : events) {
            lastDay = Math.max(lastDay, event[1]);
        }

        // 3. Create a priority queue to pick concerts that end the soonest.
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 4. Counter for the number of concerts attended.
        int count = 0;

        // 5. Loop through each day from day 1 to the last day. Like planning each day of the week.
        int i = 0;
        for (int d = 1; d <= lastDay; ++d) {
            // 6. Remove concerts that have already ended. Like throwing out old concert tickets.
            while (!pq.isEmpty() && pq.peek() < d) {
                pq.poll();
            }

            // 7. Add concerts that start today or earlier to the priority queue.
            // This is like adding new, interesting concerts to our list.
            while (i < events.length && events[i][0] <= d) {
                pq.add(events[i][1]);
                i++;
            }

            // 8. If there are any concerts in the queue, attend the one that ends the soonest.
            if (!pq.isEmpty()) {
                pq.poll(); // Remove the "best" concert from the queue.
                count++; // Increase the concert count.
            }
        }

        return count;
    }
}