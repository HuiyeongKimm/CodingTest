package Basic;

import java.util.Iterator;
import java.util.LinkedList;

/* 인접 리스느 이용 */
public class Graph {
    private  int V;
    private LinkedList<Integer> adj[];

    Graph(int v){
        V = v;
        adj = new LinkedList[v];

        for (int i = 0; i < v; i++) { // 인접 리스트 초기화
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w){
        adj[v].add(w);
    }

    /* DFS */
    void DFS(int v){
        boolean[] visited = new boolean[V];

        DFSUtil(v, visited); // v를 시작 노드는 DFSUtil 재귀 호출
    }

    /* DFS에 의해 사용되는 함수 */
    void DFSUtil(int v, boolean[] visited){
        visited[v] = true; // 현재 노드를 방문한 것으로 표시하고 값을 출력
        System.out.print(v + " ");

        Iterator<Integer> it = adj[v].listIterator(); // 방문한 노드와 인접한 모든 노드를 가져온다.
        while(it.hasNext()){
            int n = it.next();
            if (!visited[n]){ // 방문하지 않은 노드면 해당 노드를 시작 노드로 다시 DFSUtil 호출
                DFSUtil(n, visited);
            }
        }
    }
}
