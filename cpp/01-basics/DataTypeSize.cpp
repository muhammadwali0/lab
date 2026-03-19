// Program to print size in bytes of different data types

#include <iostream>

int main() {
  int integer = 1;
  float floatingPointNum = 1.2;
  double doubleFloatingPointNum = 1.23456;
  char character = 'A';

  std::cout << "Integer size in bytes: " << sizeof(integer) << "\n";
  std::cout << "Floating point number size in bytes: "
            << sizeof(floatingPointNum) << "\n";
  std::cout << "Double floating point number size in bytes: "
            << sizeof(doubleFloatingPointNum) << "\n";
  std::cout << "Character size in bytes: " << sizeof(character) << "\n";

  return 0;
}
