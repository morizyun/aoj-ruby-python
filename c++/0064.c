#include <iostream>
using namespace std;

int addCharNum(string s, int *i){
  int n = 0;
  int j;
  for (j = *i; '0' <= s[j] && s[j] <= '9' && j < s.size(); j++){
    n *= 10;
    n += s[j] - '0';
  }
  *i = j;
  return n;
}

int main() {
  int sum = 0;
  int i;
  string s;
  while(cin>>s) {
    for(i = 0; i < s.size() ; i++) {
      if('0' <= s[i] && s[i] <= '9') {
        sum += addCharNum(s, &i);
      }
    }
  }
  cout << sum << endl;
}
