#include <iostream>
#include <math.h>
using namespace std;

int main() {
    int num;
    cout << " Enter the Number";
    cin >> num;
    if (num>=0)
    {
        if (num%2 == 0){
            cout << "The number is positive and even";
        }else{
            cout << "The number is positive and odd";
        }
    }else{
        cout << "The number is Negative";
    }
    return 0;
}







