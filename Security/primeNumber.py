import math 


def prime(n):
    for i in range(2,int(math.sqrt(n))+1):
        if n%i==0:
            return False 
    return True 
