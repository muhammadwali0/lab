// Program to calculate area of a circle

#define _USE_MATH_DEFINES
#include <cmath>
#include <iostream>

using namespace std;

int main() {
  double r;
  cout << "Enter radius of a circle: ";
  if (!(cin >> r)) {
    cout << "Invalid input.\n";
    return 1;
  }

  cout << "The area of a circle came out to be " << M_PI * r * r << "\n";

  return 0;
}
