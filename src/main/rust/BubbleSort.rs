fn bubble_sort(arr: &mut [i32]) {
    let mut n = arr.len();
    let mut swapped = true;

    while swapped {
        swapped = false;
        for i in 1..n {
            if arr[i - 1] > arr[i] {
                arr.swap(i - 1, i);
                swapped = true;
            }
        }
        n -= 1;
    }
}

fn main() {
    let mut arr = [10, 7, 9, 8, 5, 6, 4, 2, 1, 3];
    bubble_sort(&mut arr);
    println!("Sorted array: {:?}", arr);
}

