#include <iostream>
using namespace std;

int abs(int x) {
  return x >= 0 ? x : (-1)*x;
}

int judge(char *s) {
  int map[3][3];
  for( int i=0; i<9; i++) {
      if(s[i]=='o') map[i%3][i/3] = 1;
      if(s[i]=='x') map[i%3][i/3] = -1;
      if(s[i]=='s') map[i%3][i/3] = 0;
  }

  int sum[8];
  for(int i = 0; i < 8; i++) { sum[i] = 0; }
  for(int i = 0; i < 3; i++) {
    sum[0] += map[i][i];
    sum[1] += map[i][2-i];
    sum[2] += map[0][i];
    sum[3] += map[1][i];
    sum[4] += map[2][i];
    sum[5] += map[i][0];
    sum[6] += map[i][1];
    sum[7] += map[i][2];
  }

  if(abs(sum[0])==3) return sum[0]/3;
  if(abs(sum[1])==3) return sum[1]/3;
  if(abs(sum[2])==3) return sum[2]/3;
  if(abs(sum[3])==3) return sum[3]/3;
  if(abs(sum[4])==3) return sum[4]/3;
  if(abs(sum[5])==3) return sum[5]/3;
  if(abs(sum[6])==3) return sum[6]/3;
  if(abs(sum[7])==3) return sum[7]/3;
  return 0;
}

int main() {
    int res;
    char str[10];
    while(cin >> str) {
        res = judge(str);
        cout << (res != 0 ? ( res > 0 ? "o" : "x" ) : "d") << endl;
    }
    return 0;
}