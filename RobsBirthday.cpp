#include <iostream>
#include <vector>
#include <queue>
#include <unordered_map>
#include <cstring>

using namespace std;

int bfs(unordered_map<int, vector<int>> & graph, int* distances, int start){
    queue<int> q;
    q.push(start);
    distances[start] = 0;
    int nearestDeadEnd = start;

    while(!q.empty()){
        int node = q.front();
        q.pop();
        for(int neighbor : graph[node]){
            if(distances[neighbor] == -1){
                q.push(neighbor);
                distances[neighbor] = distances[node] + 1;
                nearestDeadEnd = neighbor;
            }
        }
    }
    return nearestDeadEnd;
}

int calculatePartyFriends(int N, vector<pair<int, int>> & roads){
    unordered_map<int,vector<int>> graph;
    for(pair<int, int> & road : roads){
        graph[road.first].push_back(road.second);
        graph[road.second].push_back(road.first);
    }

    int* distances = new int[N+1];
    memset(distances,-1,sizeof(int)*(N+1));

    int nearestDeadEnd = bfs(graph,distances,0);

    int totalFriends = 0;
    for(int i=1; i<=N; i++){
        if(distances[i] == distances[nearestDeadEnd]){
            totalFriends += i;
        }
    }
    delete[] distances;
    return totalFriends;
}

int main(){
    int N;
    cin >> N;

    vector<pair<int, int>> roads;
    for(int i=0; i<N-1; i++){
        int a,b;
        cin >> a >> b;
        roads.push_back({a,b});
    }

    int result = calculatePartyFriends(N,roads);
    cout << result << endl;
    return 0;
}