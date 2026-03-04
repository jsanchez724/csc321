#Joan Sanchez Lopez
#CSC 321
#Lab 8


winnum = 2
print("Input Guess:")
temp = input("Please Guess A Number Between 0 - 9: ")

userinput = int(temp)


if userinput == winnum:
    print("You have guessed correctly, the number was 2.")
elif userinput < winnum:
    print("You have guessed incorrectly, your guessed number was lower than the chosen number. ")
else: 
    print("You have guessed incorrectly, your guess number was greater than the chosen number.")


joke = "Why did the Python programmer break up with Java? Too many classes and no self."

print("\nFor Loop:")

for i in range(6):
    print(joke)

print("\nWhile Loop:")

x = 4
while(x > 0):
    print("Burrito")
    x -= 1



