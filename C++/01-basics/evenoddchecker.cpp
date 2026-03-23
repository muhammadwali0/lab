#include <iostream>

int main() {
  int number{4};

  if (number % 2 == 0) {
    std::cout << "Even";
  }

  else {
    std::cout << "Odd";
  }
}
