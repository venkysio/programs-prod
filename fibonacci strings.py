#Copyrights to venkys.io
#For more programs visit venkys.io
#Python program for fibonacciStrings
#function to print fibonacci string
def fibonacci_string(n):
    if n <= 0:
        return ""
    elif n == 1:
        return "0"
    elif n == 2:
        return "0, 1"
    else:
        fib = [0, 1]
        for i in range(2, n):
            fib.append(fib[i-1] + fib[i-2])
        #converting binary sequence into string
        return ", ".join(str(x) for x in fib)
#driver code
print(fibonacci_string(5))