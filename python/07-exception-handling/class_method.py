## Program to define a class with a method that performs a division operation


class MathematicalOperations:
    def inverse(self, number: int | float) -> int | float | None:
        try:
            return 1 / number

        except ZeroDivisionError as zde:
            print(f"ERROR: {zde}")

        except Exception as ex:
            print(f"ERROR: {ex}")

        finally:
            print("Done.")


math_ops = MathematicalOperations()
print("Result:", math_ops.inverse(0))
