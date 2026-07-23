#include <iostream>
#include <math.h>
using namespace std;

int main(){
    int a;
    cout << "Enter value for A:" <<endl;
    cin >> a;
    int b;
    cout << "Enter value for B:" <<endl;
    cin >> b;
    int c;
    cout << "Enter value for C:" <<endl;
    cin >> c;
    if(a>b && a>c)
    {
        cout << "A is Greater";
    }else if(b>a && b>c){
        cout << "B is Greater";
    }else{
        cout << "C is Greater";
    } 
    return 0;
}