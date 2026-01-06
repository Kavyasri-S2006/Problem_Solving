class Solution:
    def reverseVowels(self, s: str) -> str:
        vowel={'a','e','i','o','u','A','E','I','O','U'}
        s=list(s)
        n=len(s)-1
        left,right=0,n
        while left<right:
            if s[left] not in vowel:
                left+=1
            elif s[right] not in vowel:
                right-=1
            else:
                s[left],s[right]=s[right],s[left]
                left+=1
                right-=1
        return "".join(s)
