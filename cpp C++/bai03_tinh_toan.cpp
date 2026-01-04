#include <iostream>
using namespace std;

int main() {
    float a, b;

    cout << "Nhap so a: ";
    cin >> a;

    cout << "Nhap so b: ";
    cin >> b;

    cout << "Tong: " << a + b << endl;
    cout << "Hieu: " << a - b << endl;
    cout << "Tich: " << a * b << endl;

    if (b != 0) {
        cout << "Thuong: " << a / b << endl;
    } else {
        cout << "Khong the chia cho 0!" << endl;
    }

    return 0;
}
