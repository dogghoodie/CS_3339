import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class BubbleSort {
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    public static void main(String args[]) {
        BubbleSort ob = new BubbleSort();
        int arr[] = {10, 7, 9, 8, 5, 6, 4, 2, 1, 3};

		ThreadMXBean bean = ManagementFactory.getThreadMXBean();
		long cpu_start_time = bean.isCurrentThreadCpuTimeSupported() ?
			bean.getCurrentThreadCpuTime() : 0L;

		ob.bubbleSort(arr);
	
		long cpu_end_time = bean.isCurrentThreadCpuTimeSupported() ?
			bean.getCurrentThreadCpuTime() : 0L;

		long cpu_elapsed_time = cpu_end_time - cpu_start_time;	

        System.out.print("Sorted array : [");
        for (int i=0; i < arr.length; i++){
			if (i < arr.length - 1) {
            System.out.print(arr[i] + ", ");
			} else {
				System.out.println(arr[i] + "]");
    		}
		}
		
		System.out.println(String.format("CPU Start Time : %.5f", cpu_start_time / 1_000_000_000.0));
		System.out.println(String.format("CPU End Time : %.5f" , cpu_end_time / 1_000_000_000.0));
		System.out.println(String.format("CPU Elapsed Time %.5f", cpu_elapsed_time / 1_000_000_000.0));
	}
}	
