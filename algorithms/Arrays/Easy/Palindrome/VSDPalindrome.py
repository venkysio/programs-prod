
# // Copyrights to venkys.io
# // For more programs visit venkys.io 
# // Python program for Palindrome


# function return wether the input string is palindrome or not
# It takes a string as a parameter
def string_palindrome(string):
    length=len(string) # length variable stores the length of string  
    for i in range(len(string)//2):# loop iterates half of the length of string 
        if string[i]!=string[length-(i+1)]:
            print(string,"is not a palindrome string")
            break
    else:
        print(string,"is a palindrome string")

#test drive code:
string="level"
string_palindrome(string)
