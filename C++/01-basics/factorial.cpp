#include <iostream>

int main() {
  int number{5};

  std::cout << number * (number - 1) * (number - 2) * (number - 3) *
                   (number - 4);
}
