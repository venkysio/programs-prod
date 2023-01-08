


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