// Program to take input from keyboard

#include <iostream>
#include <string>

using namespace std;

int main() {
  string name;
  int number;
  cout << "Enter your name: ";
  getline(cin, name);
  cout << "Enter your favorite number: ";
  cin >> number;
  cout << "Hello " << name << ", your favorite number is " << number << ".\n";

  return 0;
}
