extern crate cpu_time;

use cpu_time::ProcessTime;

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

    let cpu_start_time = ProcessTime::now();

    bubble_sort(&mut arr);

    let cpu_end_time = ProcessTime::now();

    let cpu_elapsed_time = cpu_end_time.duration_since(cpu_start_time);

    println!("Sorted array: {:?}", arr);
    //println!("CPU Start Time : {:.5}", cpu_start_time.as_secs_f64());
    //println!("CPU End Time : {:.5}", cpu_end_time.as_secs_f64());
    println!("CPU Elapsed Time : {:.7}", cpu_elapsed_time.as_secs_f64());

}
