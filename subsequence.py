def printsubsequence(A):
    n = len(A)
    for i in range(2**n):
        subsequence = []
        for j in range(n):
            if(i&(1<<j) != 0):
                subsequence.append(A[j])
        print(subsequence)        
printsubsequence([1,2,3])

#TC : O(N*(2**N)) SC : )
