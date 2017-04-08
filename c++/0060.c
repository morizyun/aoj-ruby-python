#include <iostream>

using namespace std;

int main() {
    int i;
    int c1, c2, c3;
    int count;
    int sum = 0;

    while (cin >> c1 >> c2 >> c3) {
        count = 0;
        for(i = 1; i < 11; i++) {
            if (c1 == i || c2 == i) {
                continue;
            } else if (c1 + c2 + i <= 20) {
                count++;
            }
        }

        if ((double)count/7.0 >= 0.5) {
            cout<<"YES"<<endl;
        } else {
            cout<<"NO"<<endl;
        }
    }
    return(0);
}