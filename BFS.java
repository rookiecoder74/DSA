import java.util.*;
public class BFS {
    public static void bfs(int start, ArrayList<Integer>[] graph) {
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);
        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");
            for (int neighbor : graph[current]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer>[] graph = new ArrayList[4];
        for (int i = 0; i < 4; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(1);
        graph[0].add(2);
        graph[1].add(2);
        graph[2].add(0);
        graph[2].add(3);
        graph[3].add(3);
        bfs(2, graph);
    }

}
