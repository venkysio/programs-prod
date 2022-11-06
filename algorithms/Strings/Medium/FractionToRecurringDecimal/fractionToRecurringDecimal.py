# # #  Fraction to Recurring Decimal

# # Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.

# # If the fractional part is repeating, enclose the repeating part in parentheses.

# # If multiple answers are possible, return any of them.

# # It is guaranteed that the length of the answer string is less than 104 for all the given inputs.

# Example 1:

# Input: numerator = 1, denominator = 2
# Output: "0.5"
# Example 2:

# Input: numerator = 2, denominator = 1
# Output: "2"
# Example 3:

# Input: numerator = 4, denominator = 333
# Output: "0.(012)"
 

# Constraints:

# -231 <= numerator, denominator <= 231 - 1
# denominator != 0


def fractionToDecimal(numerator,denominator):

    if numerator%denominator==0:
        return str(numerator//denominator)
    
    sign="" if numerator * denominator >=0 else "-"

    numerator,denominator=abs(numerator),abs(denominator)

    res=sign+str(numerator//denominator)+"."

    numerator%=denominator
    i,part=0,""
    m={numerator:i}
    while numerator%denominator:
        numerator*=10
        i+=1
        rem=numerator%denominator
        part+=str(numerator//denominator)
        if rem in m:
            part=part[:m[rem]]+"("+part[m[rem]:]+")"
            return res+part
        m[rem]=i
        numerator=rem 
    return res+part 

if __name__=="__main__":
    n=1
    d=2 
    print(fractionToDecimal(n,d))