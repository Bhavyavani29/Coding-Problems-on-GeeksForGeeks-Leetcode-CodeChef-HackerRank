# cook your dish here
data = input().split()
age, country = int(data[0]), data[1]
if age >= 18 and country == "India":
    print("Eligible")
else:
    print("Not Eligible")
