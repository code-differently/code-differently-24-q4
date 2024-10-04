number = int(input("Enter the number:"))
#
flag = False

if (number <= 1):
    flag = False

for i in range (2, number):
    if (number % i ==0):
        flag = True
        break

if flag:
    print("Entered number {} is not a prime number".format(number))
else:
    print("Entered number {} is a prime number".format(number))