// Prorgam to create a basic claculator

#include <iostream>

int main() {
  double a, b;
  char sign;
  std::cout << "Enter two numbers: ";
  if (!(std::cin >> a >> b)) {
    std::cout << "Invalid input.\n";
    return 1;
  }

  std::cout << "Enter an operator (+, -, *, /): ";
  if (!(std::cin >> sign)) {
    std::cout << "Invalid input.\n";
    return 1;
  }

  if (sign == '+') {
    std::cout << a + b << "\n";
  }

  if (sign == '-') {
    std::cout << a - b << "\n";
  }

  if (sign == '*') {
    std::cout << a * b << "\n";
  }

  if (sign == '/') {
    if (b == 0) {
      std::cout << "ERROR: divison by zero\n";
    }

    else {
      std::cout << a / b << "\n";
    }
  }

  return 0;
}
