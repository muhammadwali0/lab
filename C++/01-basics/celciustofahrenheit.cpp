#include <iostream>

int main() {
  double temp_in_c{32.2};
  std::cout << temp_in_c << " in Celcius is " << (temp_in_c * 9 / 5) + 32
            << " in Fahrenheit.\n";

  return 0;
}
