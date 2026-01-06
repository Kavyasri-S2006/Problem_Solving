class Solution:
    def halvesAreAlike(self, s: str) -> bool:
        s=s.lower()
        vowel="aeiou"
        mid=len(s)//2
        a=s[ :mid]
        b=s[mid: ]
        count1=count2=0
        for ch in a:
            if ch in vowel:
                count1+=1
        for ch in b:
            if ch in vowel:
                count2+=1
        if count1==count2:
            return True
        return False