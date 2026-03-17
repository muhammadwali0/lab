// Program to calculate sum of n natural numbers

#include <iostream>

using namespace std;

int main() {
  int n;
  cout << "Enter an integer: ";
  if (!(cin >> n)) {
    cout << "Invalid input.\n";
    return 1;
  }

  cout << "The sum of first " << n << " natural numbers is " << n * (n + 1) / 2
       << "\n";

  return 0;
}
