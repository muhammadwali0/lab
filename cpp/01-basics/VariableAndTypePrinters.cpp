// Program to declare and print variables and there types

#include <iostream>
#include <string>

using namespace std;

int main() {
  int integer = 1;
  double doubleFloat = 1.234;
  char character = 'A';
  string strVal = "Apple";
  bool isGood = true;

  cout << integer << " is an integer.\n";
  cout << doubleFloat << " is a double floating point number.\n";
  cout << character << " is a character.\n";
  cout << strVal << " is a string.\n";
  cout << boolalpha << isGood << " is a boolean value.\n";

  return 0;
}
