# Will Vanderploeg: plaindrome.py
# Checks to see if a user inputed string is a palindrome

word = input("Enter a word:\n ").lower()

halfWay = len(word)/2 # Determines the halfway point of the string
# Initializes build1-3 for string manipulation
build1 = ""
build2 = ""
build3 = ""
count = 0 # counter for the loop
for letter in word: # goes through each letter of the input
    count += 1
    if count <= halfWay: # if the count hasn't reached the halfway point, it puts lettes into build 1
        build1 += letter
    elif count > halfWay: # once it gets past the halfway point, it puts the rest into build two 
        build2 += letter
        
# Turns build 2 into a list, reverses it, and then reconstructs it as a string
other = list(build2)
other.reverse()
for i in other:
    build3 += i 

# Checks to see if the two ends are the same an outputs accordingly
if build1 == build3:
    print("The input is a palindrome!")
else:
    print("The input is not a palindrome :(")
