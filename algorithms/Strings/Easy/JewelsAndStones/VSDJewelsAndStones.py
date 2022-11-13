# Count Number of Jewels in Stones



def solution(testcases):
    answers=list()
    for jewel,stones in testcases:
        count=count_jewels(jewel,stones)
        answers.append(count)
    if output==answers:
        print("Success")
        print(output)
    else:
        print("Wrong Answers")


def count_jewels(jewel,stones):

    hashmap=dict()
    count=0
    for gem in jewel:
        hashmap[gem]=0
    for stone in stones:
        if stone in hashmap.keys():
            count+=1
    return count

if __name__=="__main__":
    testcases=[["aA","aAAbbbb"],["z","ZZ"],["abc","ABccds"],["VSd","vSD"]]
    output=[3,0,2,1]
    solution(testcases)