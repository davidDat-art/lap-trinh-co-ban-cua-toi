#include <iostream>
using namespace std;

int main() {
    string name;
    int age;

    cout << "Nhap ten: ";
    getline(cin, name);

    cout << "Nhap tuoi: ";
    cin >> age;

    cout << "\nXin chao " << name << endl;
    cout << "Ban " << age << " tuoi" << endl;

    return 0;
}
