## Program to import a non exisitng module and handle the error by printing a proper error message

try:
    import nolib

    print("Module successfully")
except ImportError:
    print("Imported module does not exist")
