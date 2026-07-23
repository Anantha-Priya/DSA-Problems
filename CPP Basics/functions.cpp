#include <iostream>
using namespace std;

// without Returning Data
// void addtwonumbers(){
//     int a,b;
//     cout << "Enter two numbers: ";
//     cin >> a >> b;
//     cout << "Sum: " << a + b << endl;
// }

// int main() {
//     addtwonumbers();
//     return 0;
// }

// with Returning Data
int  addtwonumbers(int a,int b){
    return a+b;
}

int main(){
    int x,y;
    cout<<"Enter two Numbers";
    cin>>x>>y;
    int result=addtwonumbers(x,y);
    cout<<result;
}