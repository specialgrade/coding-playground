import numpy as np

def countNumOccurences(target, arr):
    count = 0
    for i in range(len(arr)):
        if arr[i] == target:
            count += 1
    return count

size = int(input("Enter size of array: "))
target = int(input("Enter target number: "))

arr = np.zeros(size, dtype=int)

for i in range(size):
    arr[i] = int(input(f"Enter number {i+1}: "))

count = countNumOccurences(target, arr)
print(f"{target} occurs {count} time(s) in the array.")
