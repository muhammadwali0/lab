## Generate Prime Numbers From 1 To 100

for num in range(2, 101):
    is_prime = True

    for check in range(2, num):
        if num % check == 0:
            is_prime = False
            break

    if is_prime:
        print(num)
