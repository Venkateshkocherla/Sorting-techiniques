a = [int(i) for i in input().split()]
count = 1
for i in range(len(a)):
    if a[i]>0:
        for j in range(i+1,len(a)):
            if ((a[j] == a[i])and a[j]!=0):
                count+=1
                a[j] = 0
        print(a[i],"-",count)
        count = 1
