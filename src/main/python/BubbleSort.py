import time

def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]

arr = [10, 7, 9, 8, 5, 6, 4, 2, 1, 3]

cpu_start_time = time.process_time()

bubble_sort(arr)

cpu_end_time = time.process_time()

cpu_elapsed_time = (cpu_end_time - cpu_start_time)

print("Sorted array is:", arr)
print(f"\nStart Time : {cpu_start_time:.5f}")
print(f"End Time : {cpu_end_time:.5f}")
print(f"Elapsed Time : {cpu_elapsed_time:.5f}")

