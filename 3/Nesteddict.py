list = []
dict = {'gfg': {"a":1,"b":21,"c":3},
        'is': {"a":1,"b":22,"c":3},
        'best': {"a":1,"b":23,"c":3}}
print("Enter Key value\n")        
temp = input()
for i,j in dict.items():
    list.append(j[temp])
print(sum(list))    
