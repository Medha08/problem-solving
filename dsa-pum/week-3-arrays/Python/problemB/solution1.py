# solution by Poulami Ghosh
T = int(input())
for _ in range(T):
    N = int(input())
    arr = list(map(int, input().split()))
    K = int(input())
    left = right = 0
    for right in range(N):
        #if we encounter a zero in the array we decrement K value
        if arr[right] == 0:
            K -= 1
        # else no impact to K

        # if K < 0 then we need to move the left part of the window forward
        # to try and remove the extra 0's
        if K < 0:
            
            # if the left one was zero then we adjust K
            if arr[left] == 0:
                K += 1

            # regardless of whether we had a 1 or a 0 we can move left side by 1
            # if we keep seeing 1's the window still keeps moving 
            left += 1
    result = right-left+1
    print(result)
