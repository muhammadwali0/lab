## Program to use a standard library module os to perform operations

import os

os.mkdir("NewDir")
print("Created a new directory\nListing all the content of this directory:")
print(os.listdir("NewDir"))
os.rmdir("NewDir")
print("Successfully removed the direcotry")
