## Program to import and use the functions from `mypackage` without explicitly importing `module1` and `module2`.

from mypackage.module1 import sum
from mypackage.module2 import product

print(sum(2, 8))
print(product(2, 8))
