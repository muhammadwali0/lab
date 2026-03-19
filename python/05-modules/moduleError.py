## Program to write code that attempts to import a non-existent function from package and gracefully handles the import error by printing an error message.

try:
    from mypackage import module3
except ImportError:
    print("Sorry! The requested module does not exist.")
