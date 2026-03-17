// Program to check whether a number is positive, negative or zero.

#include <iostream>

using namespace std;

int main() {
  double number;
  cout << "Enter a number: ";
  if (!(cin >> number)) {
    cout << "Invalid input.\n";
    return 1;
  }

  if (number > 0) {
    cout << number << " is a positive number.\n";
  }

  else if (number < 0) {
    cout << number << " is a negative number.\n";
  }

  else {
    cout << "The number is zero.\n";
  }

  return 0;
}
