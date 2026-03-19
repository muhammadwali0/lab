// Program to perform logical operations

#include <iostream>

int main() {
  bool isTrue = true;
  bool isFalse = false;

  std::cout << std::boolalpha << "true AND false is " << (isTrue && isFalse)
            << "\n";
  std::cout << std::boolalpha << "true OR false is " << (isTrue || isFalse)
            << "\n";
  std::cout << std::boolalpha << "NOT true is " << !(isTrue)
            << " and NOT false is " << !(isFalse) << "\n";

  return 0;
}
