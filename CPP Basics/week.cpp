#include <iostream>
#include <math.h>
using namespace std;

int main(){
    int day;
    cout << "Enter number from 0-6" << endl;
    cin >> day;
    switch(day){
        case 0:
           cout <<"Monday";
        break;
        case 1:
          cout <<"Tuesday";
        break;
        case 2:
          cout <<"Wednesday";
        break;
        case 3:
          cout <<"Thursday";
        break;
        case 4:
          cout <<"Friday";
        break;
        case 5:
          cout <<"Saturday";
        break;
        case 6:
          cout <<"Sunday";
        break;
        default:
          cout <<"Invalid Input";
        break;
    }
    return 0;
}