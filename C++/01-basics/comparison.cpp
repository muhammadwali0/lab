#include <iostream>

int main() {
  int a{5};
  int b{10};

  std::cout << std::boolalpha << (a == b) << '\n';
  std::cout << std::boolalpha << (a != b) << '\n';
  std::cout << std::boolalpha << (a > b) << '\n';
  std::cout << std::boolalpha << (a < b) << '\n';
  std::cout << std::boolalpha << (a >= b) << '\n';
  std::cout << std::boolalpha << (a <= b) << '\n';
}
