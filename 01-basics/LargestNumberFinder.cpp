// Program to find the largest number

#include <algorithm>
#include <iostream>

using namespace std;

int main() {
  double a, b, c;
  cout << "Enter three numbers: ";
  if (!(cin >> a >> b >> c)) {
    cout << "Invalid input.\n";

    return 1;
  }

  cout << max({a, b, c}) << " is the largest number.\n";

  return 0;
}
