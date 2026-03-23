## Progrma to write a function that attempts to parse a JSON string

import json
from typing import Any


def parser(jsonString: str) -> dict[Any, Any] | None:
    try:
        jsondict = json.loads(jsonString)
        return jsondict

    except json.JSONDecodeError:
        print("ERROR: not a JSON string")

    except Exception as ex:
        print(f"ERROR: {ex}")

    finally:
        print("Parsing completed.")


print(
    "Result:", parser('{"name": "John", "age": 25, "hobbies": ["reading", "coding"]}')
)
