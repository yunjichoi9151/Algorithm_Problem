s1 = int(input())
s2 = int(input())
if s2 - s1 < 1:
    print("Congratulations, you are within the speed limit!")
elif s2 - s1 >= 1 and s2 - s1 <= 20:
    print("You are speeding and your fine is $100.")
elif s2 - s1 >= 21 and s2 - s1 <= 30:
    print("You are speeding and your fine is $270.")
elif s2 - s1 >= 31:
    print("You are speeding and your fine is $500.")