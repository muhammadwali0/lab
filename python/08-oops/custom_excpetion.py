## Program to create a custom exception in a class, raise this exception and handle the exception and print an appropriate message.


class InsufficientBalanceError(Exception):
    pass


class BankAccount:
    def __init__(self, account_number: int, balance: float) -> None:
        self.__account_number = account_number
        self.__balance = balance

    def deposit(self, amount: float) -> tuple[float, float]:
        self.__balance += amount
        return amount, self.__balance

    def withdraw(self, amount: float) -> tuple[float, float | None]:
        if amount > self.__balance:
            raise InsufficientBalanceError("Balance is insufficient")

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
try:
    withdraw_amount, balance = my_bank_account.withdraw(1100)

except InsufficientBalanceError as ibe:
    print(f"ERROR: {ibe}")

else:
    print(f"PKR {withdraw_amount} withdrawn\nCurrent Balance: PKR {balance}")
