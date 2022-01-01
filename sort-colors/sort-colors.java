class Solution {
    public void sortColors(int[] arr) {
         boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {  //  Outer Loop Is For Passed
            swapped = false;
            // For Each Index , Max Item Will  Come At Last Respective Index

            for (int j = 1; j < arr.length - i; j++) {
                // Swap if J Is Small Than J-1

                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }


            }
            if (swapped == false) {
                break;

            }

        }
    }
}