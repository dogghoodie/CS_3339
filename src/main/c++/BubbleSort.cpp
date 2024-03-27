#include <iostream>
#include <ctime>
#include <vector>
#include <iomanip>

using namespace std;

void bubbleSort(int arr[], int n) {
    for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}

int main() {
	
	int arr[] = {10, 7, 9, 8, 5, 6, 4, 2, 1, 3};
    int n = sizeof(arr)/sizeof(arr[0]);
   
	clock_t cStartTime = clock();

    bubbleSort(arr, n);

	clock_t cEndTime = clock();

	double cElapsedTime = static_cast<double>(cEndTime - cStartTime);

    cout << "Sorted array : [";
    for (int i = 0; i < n; i++){
		if (i < n - 1) {
		cout << arr[i] << ", ";
		} else {
			cout << arr[i] << "]" << endl;
		}
	}	
	
	cout << fixed << setprecision(7);
	cout << "CPU Elapsed Time : " << cElapsedTime / CLOCKS_PER_SEC << " seconds." << endl;

    return 0;
}

