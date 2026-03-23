## Program to create a class named `BankAccount` with private attributes `account_number` and `balance`. Add methods to deposit and withdraw money, and to check the balance. Create an object of the class and perform some operations.


class BankAccount:
    def __init__(self, account_number: int, balance: float) -> None:
        self.__account_number = account_number
        self.__balance = balance

    def deposit(self, amount: float) -> tuple[float, float]:
        self.__balance += amount
        return amount, self.__balance

    def withdraw(self, amount: float) -> tuple[float, float | None]:
        if amount > self.__balance:
            return amount, None

        else:
            self.__balance -= amount
            return amount, self.__balance

    def check_balance(self) -> float:
        return self.__balance


my_bank_account = BankAccount(12345, 22000)
balance = my_bank_account.check_balance()
print("Current Balance: PKR", balance)
deposit_amount, balance = my_bank_account.deposit(5000)
print(f"PKR {deposit_amount} deposited\nCurrent Balance: PKR {balance}")
withdraw_amount, balance = my_bank_account.withdraw(11000)
if balance is None:
    print("Unsufficent balance")

else:
    print(f"PKR {withdraw_amount} withdrawn\nCurrent Balance: PKR {balance}")
