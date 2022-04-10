class Solution:
    def calPoints(self, ops: List[str]) -> int:
        l = []
        print(l)
        for i in ops:
            if i == "+":
                x = l.pop()
                y = l.pop()
                z = x + y
                l.append(int(y))
                l.append(int(x))
                l.append(int(z))
                print(l)
            elif i == 'D':
                x = l.pop()
                z = 2*x
                l.append(int(x))
                l.append(int(z))
                print(l)
            elif i == 'C':
                l.pop()
                print(l)
            else:
                l.append(int(i))
                print(l)
        p = 0     
        print(l)
        for i in l:
            p = p+int(i)
        return p
            
                
                    
        