# Solution by Poulami Ghosh
from collections import defaultdict

# The functionality of both dictionaries and defaultdict are almost same except for the fact that defaultdict never raises a KeyError.
#  It provides a default value for the key that does not exists.

T = int(input())
for _ in range(T):
    N, K = map(int, input().split())
    arr = list(map(int, input().split()))

    hashmap = defaultdict(lambda: 0)
    count = 0
    result_array = []

    # Traverse the first window and store count of every element in hash map 
    for i in range(K):
        if hashmap[arr[i]] == 0:
            count += 1
        hashmap[arr[i]] += 1

    result_array.append(count)
    for i in range(K, N):
        # Remove first element of previous window 
        # If there was only one occurrence,then reduce distinct count.
        if hashmap[arr[i-K]] == 1:
            count -= 1
        hashmap[arr[i-K]] -= 1

        # Adding new element of current window If this element appears first time, 
        # increment distinct element count
        if hashmap[arr[i]] == 0:
            count += 1
        hashmap[arr[i]] += 1

        result_array.append(count)
    print(result_array)
