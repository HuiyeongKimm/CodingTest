package Basic;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphBFS {
    private int V;
    private LinkedList<Integer> adj[];

    GraphBFS(int v) {
        V = v;
        adj = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    /* BFS */
    void BFS(int v) {
        boolean[] visited = new boolean[V]; // 방문여부 확인용 변수
        LinkedList<Integer> queue = new LinkedList<>();

        visited[v] = true;
        queue.add(v);

        while (!queue.isEmpty()) {
            v = queue.poll(); // 방문한 노드를 큐에서 추출(dequeue)하고 값을 출력
            System.out.print(v + " ");

            Iterator<Integer> it = adj[v].listIterator(); // 방문한 노드를 큐에서 추출(dequeue)하고 값을 출력

            while (it.hasNext()) {
                int w = it.next();

                if (!visited[w]) { // 방문한 노드와 인접한 모든 노드를 가져온다.
                    visited[w] = true;
                    queue.add(w);
                }
            }
        }
    }
}
