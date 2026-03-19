## Program to write a function that attempts to open a URL and read its contents. Use try, except, and finally blocks to handle network-related errors and print an appropriate message.

import requests


def webReader(url: str) -> None:
    try:
        response = requests.get(url, timeout=5)
        response.raise_for_status()
        print(response.text)

    except requests.exceptions.Timeout as to:
        print(f"ERROR: {to}")

    except requests.exceptions.HTTPError as he:
        print(f"ERROR: {he}")

    except requests.exceptions.RequestException as re:
        print(f"ERROR: {re}")

    finally:
        print("Request completed.")


webReader("https://jsonplaceholder.typicode.com/posts/")
