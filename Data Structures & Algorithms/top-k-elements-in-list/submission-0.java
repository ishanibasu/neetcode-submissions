class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap <>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        int arr [] = new int[map.size()];
        int index = 0;
        for(int i : map.keySet()){
            arr[index] = i;
            index++;
        }
        heapSort(arr, map);
        int [] ans = new int [k];
        int j = 0;
        for(int i = arr.length - 1; i >= arr.length - k; i--){
            ans[j] = arr[i];
            j++;
        }
        return ans;
    }

    static void heapSort(int [] arr, HashMap <Integer, Integer> map){
        int n = arr.length;
        for(int i = n / 2 - 1; i >= 0; i--){
            heapify(arr, n, i, map);
        }
        for(int i = n - 1; i >= 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0, map);
        }
    }
    static void heapify(int [] arr, int n, int i, HashMap <Integer, Integer> map){
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if(l < n && map.get(arr[l]) > map.get(arr[largest])){
            largest = l;
        }
        if(r < n && map.get(arr[r]) > map.get(arr[largest])){
            largest = r;
        }
        if (largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest, map);
        }
    }
}
