def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]

arr = [10, 7, 9, 8, 5, 6, 4, 2, 1, 3]
bubble_sort(arr)

print("Sorted array is:", arr)

