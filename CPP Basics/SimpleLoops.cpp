# include <iostream>
#include <math.h>
using namespace std;

int main() {
    int x;
    cout <<"Enter the number"<< endl;
    cin >> x;

    //FOR LOOP
    // for(int i=0;i<x;i+=5){
    //     cout << i<<endl;
    // }

    //WHILE LOOP
    // int i=0;
    // while(i<x){
    //     cout<<i;
    //     i+=5;
    // }

    //DO WHILE LOOP
    // int i=0;
    // do{
    //     cout << i;
    //     i+=5;
    // }while(i<x);

    //INFINTE LOOP
    int i=0;
    do{
        cout << i <<endl;
        i+=5;
    }while(i>0);
    return 0;
}
