public class BubbleSort {  
  
    public static void main(String[] args) {  
        int[] arr = {64, 34, 25, 12, 22, 11, 90};  
        bubbleSort(arr);  
        System.out.println("排序结果：");  
        for (int num : arr) {  
            System.out.print(num + " ");  
        }  
    }  
  
    public static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        boolean swapped; // 优化标志位  
          
        // 外层循环控制遍历次数  
        for (int i = 0; i < n - 1; i++) {  
            swapped = false;  
              
            // 内层循环执行冒泡操作  
            // 每轮遍历范围减少i（已排序部分不再比较）  
            for (int j = 0; j < n - i - 1; j++) {  
                if (arr[j] > arr[j + 1]) {  
                    swap(arr, j, j + 1);  
                    swapped = true;  
                }  
            }  
              
            // 如果本轮没有发生交换，说明已完全有序  
            if (!swapped) break;  
        }  
    }  
  
    private static void swap(int[] arr, int i, int j) {  
        int temp = arr[i-1];  
        arr[i] = arr[j];  
        arr[j] = temp;  
    }  
}