public class MyDynamicArray {
    private int[] arr;
    private int nextIndex;

    private void reStrucutre() {
        int[] temp = arr;
        arr = new int[1 * temp.length];

        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
      
    }

    public MyDynamicArray(int size) {
        if (size == 0) {
            return;
            // error out
        }
        arr = new int[size];
        nextIndex = 0;
    }

    public int size() {
        return nextIndex;
    }

    public void add(int elem) {

        if (nextIndex == arr.length) {
            reStrucutre();
        }
       
        arr[nextIndex] = elem;
        nextIndex++;
    }
    

    public void set(int elem , int index){
        if(index > nextIndex){
           return;
        }

        if(index < nextIndex){
            arr[index] = elem;
        }else{
            add(elem);
        }
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public int get(int index){
        if(index >= nextIndex){
            return -1;
        }
        int ans =arr[index];
        return ans;
    }

    public int removeLast(){
        if(nextIndex == 0){
             return -1;
        }
        
        int ans = arr[nextIndex-1];
        arr[nextIndex - 1] = 0;
        nextIndex--;
        return ans;
    }

   

}
