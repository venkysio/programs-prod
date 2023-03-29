#Copyrights to venkys.io
#For more programs visit venkys.io
#Python program for Roman to Integer

#Function to compute roman numeral to integer
def roman_to_int(s):
    # Create a dictionary to map each Roman numeral to its corresponding integer value
    roman_numerals = {"I": 1, "V": 5, "X": 10, "L": 50, "C": 100, "D": 500, "M": 1000}

    # Initialize the result variable to zero
    result = 0

    # Iterate over the input string from right to left
    for i in range(len(s) - 1, -1, -1):
        # If the current numeral is smaller than the previous one, subtract its value from the result
        if i < len(s) - 1 and roman_numerals[s[i]] < roman_numerals[s[i + 1]]:
            result -= roman_numerals[s[i]]
        # Otherwise, add its value to the result
        else:
            result += roman_numerals[s[i]]

    return result
print(roman_to_int("XIV"))
#sample output
#4