// Program to declare and print variables and there types

#include <iostream>

int main() {
  int integer{1};
  double doubleFloat{1.234};
  char character{'A'};
  bool isGood{true};

  std::cout << integer << " is an integer.\n";
  std::cout << doubleFloat << " is a double floating point number.\n";
  std::cout << character << " is a character.\n";
  std::cout << std::boolalpha << isGood << " is a boolean value.\n";

  return 0;
}
