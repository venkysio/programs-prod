# shuffle the string in corresponding to indices

testcases=[["codeleet",[4,5,6,7,0,2,1,3]],["abc",[0,1,2]]]
output=["leetcode","abc"]

def solution(testcases):
    answer=list()
    for string,index in testcases:
        filteredans=shuffle_string(string,index)
        answer.append(filteredans)
    
    if output==answer:
        print("success")
        print(answer)
    else:
        print("Wrong Answer")


def shuffle_string(string : str,indices : list ) -> str :
    n=len(string)
    answer=[" "]*n 
    for index in range(n):
        answer[indices[index]]=string[index]
    return ("").join(answer)

if __name__=="__main__":
    solution(testcases)