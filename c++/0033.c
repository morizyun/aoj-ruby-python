#include <iostream>
#include <stdio.h>

using namespace std;

int a[10];

bool dfs(int i, int left, int right) {
  if(i == 10) { return true; }

  bool ans = false;
  if(left < a[i]) {
    ans = dfs(i+1, a[i], right);
  }
  if(right < a[i]) {
    ans = dfs(i+1, left, a[i]);
  }
  return ans;
}

int main() {
  int n;
  scanf("%d", &n);

  for(int i = 0; i < n; i++) {
    for(int j = 0; j < 10; j++) {
      scanf("%d", &a[j]);
    }
    cout << (dfs(0, 0, 0) ? "YES" : "NO") << endl;
  }
  return 0;
}
