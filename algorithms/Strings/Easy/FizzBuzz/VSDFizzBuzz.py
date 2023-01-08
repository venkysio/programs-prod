
def fizzBuzz(n :int )-> list[str]:
    answers=list()
    for number in range(1,n+1):
        if number%3==0 and number%5==0:
            answers.append("FizzBuzz")
        elif number%3==0:
            answers.append("Fizz")
        elif number%5==0:
            answers.append("Buzz")
        else:
            answers.append(str(number))
    return answers

n=15
print(fizzBuzz(n))