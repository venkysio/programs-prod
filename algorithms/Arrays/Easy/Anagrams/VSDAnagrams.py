#  Copyrights to venkys.io
#  For more programs visit venkys.io 
#  Python program for Anagrams



def is_anagram(s1,s2):
    # we use hashtable to solve this problem
    if len(s1) != len(s2):
        print("The strings ",s1,s2,"are not anagrams")
    else:
        ht=dict()
        for i in s1:
            if i in ht.keys():
                ht[i]+=1
            else:
                ht[i]=1
        for j in s2:
            if j not in ht.keys():
                return False
            ht[j]-=1
        for key,value in ht.items():
            if value!=0:
                return False 
        return True

                
# test drive code
if __name__ == "__main__":
    s1="hello"
    s2="olleh"
    if(is_anagram(s1,s2)):
        print(f"{s1} and {s2} are Anagrams")
    else:
        print(f"{s1} and {s2} are Not Anagrams")