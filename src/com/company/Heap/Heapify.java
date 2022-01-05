package com.company.Heap;


        void print(vector <int> arr) {
        for(int ele : arr) {
        cout << ele << " ";
        }
        cout << endl;
        }


// T : (n)
        void heapify(vector <int>& arr, int& n, int i) {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if(left < n and arr[left] > arr[largest]) {
        largest = left;
        }
        if(right < n and arr[right] > arr[largest]) {
        largest = right;
        }

        if(largest != i) {
        swap(arr[i], arr[largest]);
        heapify(arr, n, largest);
        }
        }

        void buildHeap(vector <int>& arr, int& n) {

        for(int i = n/2 - 1; i >= 0; i--) {
        heapify(arr, n, i);
        }
        }

        int main() {

        vector <int> arr;
        int n = 10;
        for(int i = 0; i < n; i++) {
        arr.push_back(rand() % 20);
        }

        print(arr);

// Step 1 : build heap
        buildHeap(arr, n);

        print(arr);

        return 0;
        }