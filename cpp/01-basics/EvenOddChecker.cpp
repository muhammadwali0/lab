// Program to check whether a number is even or odd

#include <iostream>

using namespace std;

int main() {
  int number;
  cout << "Enter a number: ";
  cin >> number;
  if (number % 2 == 0)
    cout << number << " is an even number.\n";
  else
    cout << number << " is an odd number.\n";

  return 0;
}
