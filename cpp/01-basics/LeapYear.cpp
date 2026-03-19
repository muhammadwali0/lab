// Program to check if a year is a leap year or not

#include <iostream>

using namespace std;

int main() {
  int year;
  cout << "Enter a year: ";
  if (!(cin >> year)) {
    cout << "Invalid input.\n";

    return 1;
  }

  if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
    cout << year << " is a leap year.\n";
  }

  else {
    cout << year << " is not a leap year.\n";
  }

  return 0;
}
