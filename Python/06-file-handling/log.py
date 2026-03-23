## Program to write a function that creates a log file and writes log messages with timestamps

import datetime


def logs(message):
    with open("activity.log", "a") as file:
        log = f"{datetime.datetime.now()} - {message}"
        file.writelines(log)


logs("ran log.py")
