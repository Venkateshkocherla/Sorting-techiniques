arr = [int(i) for i in input().split()]
for i in range(len(arr)):
            for j in range(len(arr)):
                if arr[i]<arr[j] and i!=j:
                    (arr[i],arr[j])=(arr[j],arr[i])
for i in range(len(arr)):
    print(arr[i],end= ' ')
