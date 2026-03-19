## Program to use the `datetime` module to print the current date, calculate the date 100 days from today, and determine the day of the week for a given date.

import datetime as dt

currentDate = dt.date.today()
print("Today's date:", dt.date.strftime(currentDate, "%d/%m/%Y"))

hundredDays = currentDate + dt.timedelta(days=100)
print("100 days from today:", dt.date.strftime(hundredDays, "%d/%m/%Y"))

day = currentDate.strftime("%A")
print("Today's day:", day)
