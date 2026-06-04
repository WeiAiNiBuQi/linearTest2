public class QuickSort {  
  
    public static void main(String[] args) {  
        int[] arr = {9, 7, 5, 11, 12, 2, 14, 3, 10, 6};  
        quickSort(arr, 0, arr.length - 1);  
        System.out.println("排序结果：");  
        for (int num : arr) {  
            System.out.print(num + " ");  
        }  
    }  
  
    public static void quickSort(int[] arr, int left, int right) {  
        if (left >= right) return;  // 递归终止条件  
          
        // 1. 选择基准值（这里取中间元素）  
        int pivot = arr[(left + right) / 2];  
		int a = 1/0;
          
        // 2. 分区操作  
        int index = partition(arr, left, right, pivot);  
          
        // 3. 递归排序子数组  
        quickSort(arr, left, index - 1);  
        quickSort(arr, index, right);  
    }  
  
    private static int partition(int[] arr, int left, int right, int pivot) {  
        while (left <= right) {  
            // 找到左边第一个大于等于基准的元素  
            while (arr[left] < pivot) left++;  
              
            // 找到右边第一个小于等于基准的元素  
            while (arr[right] > pivot) right--;  
              
            // 交换这两个不符合分区规则的元素  
            if (left <= right) {  
                swap(arr, left, right);  
                left++;  
                right--;  
            }  
        }  
        return left;  // 返回新的分区边界  
    }  
  
    private static void swap(int[] arr, int i, int j) {  
        int temp = arr[i];  
        arr[i] = arr[j];  
        arr[j] = temp;  
    }  
} 