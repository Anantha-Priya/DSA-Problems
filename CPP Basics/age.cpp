#include <iostream>
#include <math.h>
using namespace std;

int main(){
    int age;
    cout << "Enter Your Age:" <<endl;
    cin >> age;
    
    if(age>=18)
    {
        cout << "Person is Eligible to Vote";
    }else{
        cout << "Person is not eligible to Vote";
    }
    return 0;
}