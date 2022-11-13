# This function returns wether the two strings are anagram or not
# It takes two strings as a parameters
def is_anagram(s1,s2):
    # we use hashtable to solve this problem
    if len(s1) != len(s2):
        print("The strings ",s1,s2,"are not anagrams")
    else:
        ht={} # empty hash table
        for i in range(len(s1)):
            if s1[i] in ht.keys():
                ht[s1[i]]+=1
            else:
                ht[s1[i]]=1
            if s2[i] in ht.keys():
                ht[s2[i]]-=1
            else:
                ht[s2[i]]=-1
        for i in ht.keys():
            if ht[i]!=0:
                print("The strings ",s1,s2,"are not anagrams")
                break
        else:
            print("The strings ",s1,s2,"are anagrams")
                
# test drive code
s1=input("Enter first string: ")
s2=input("Enter secound string: ")
is_anagram(s1,s2)
