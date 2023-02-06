public class BigO {

    // Big O(1)
    public void checkFirstElementOfArray(int arr[])
    {
        System.out.println("The first element of the array is " + arr[0]);
    }

    // // Big O()
    // public void loopThroughValuesInArray (int j, int arr[]) {
    //     for (int i = 0; i < j; i++) {
    //         System.out.println("The value is: " + arr[i]);
    //     }
    // }

    // Big O(n)
    public void loopThroughAList(int j) {
        for (int i = 1; i < j; i = i * 2){
            System.out.println("The value is: " + i);
        }
    }

    // Big O(n^2)
    public void checkAllPossibleValuePairs(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println(arr[i] + " = " + arr[j] +"\n");
            }
        }
    }
}