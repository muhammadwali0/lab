#include <iostream>

int main() {
  int num1{0};
  int num2{0};
  int num3{1};

  if (num1 == num2 && num2 == num3) {
    std::cout << "All are equal, you dumb*ss\n";
  }

  else if (num1 >= num2 && num1 >= num3) {
    std::cout << num1 << " is the largest\n";
  }

  else if (num2 >= num1 && num2 >= num3) {
    std::cout << num2 << " is the largest\n";
  }

  else {
    std::cout << num3 << " is the largest\n";
  }

  return 0;
}
