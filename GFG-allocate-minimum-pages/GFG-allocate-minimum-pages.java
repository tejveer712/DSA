class Solution {

    // Returns true if it is possible to allocate all books
    // such that no student gets more than 'mid' pages.
    boolean canAllocate(int[] arr, int k, int mid){

        // At least one student is needed initially.
        int students = 1;

        // Pages currently assigned to the current student.
        int pages = 0;

        for(int i = 0; i < arr.length; i++){

            // If the current book can be assigned to the current student
            // without exceeding the maximum allowed pages (mid),
            // continue assigning books to the same student.
            if(pages + arr[i] <= mid){
                pages += arr[i];
            }
            else{

                // Otherwise, allocate this book to a new student.
                students++;

                // This book becomes the first book for the new student.
                pages = arr[i];

                // If more than k students are required,
                // allocation is not possible.
                if(students > k){
                    return false;
                }
            }
        }

        // Successfully allocated all books within k students.
        return true;
    }


    public int findPages(int[] arr, int k) {

        // If there are fewer books than students,
        // each student must receive at least one book.
        if(arr.length < k){
            return -1;
        }

        // Minimum possible answer:
        // At least the largest book must fit.
        int low = 0;

        // Maximum possible answer:
        // One student takes all books.
        int high = 0;

        int ans = -1;

        for(int i = 0; i < arr.length; i++){
            low = Math.max(low, arr[i]);
            high += arr[i];
        }

        // Binary Search on Answer
        while(low <= high){

            int mid = low + (high - low) / 2;

            // If allocation is possible,
            // try to minimize the maximum pages.
            if(canAllocate(arr, k, mid)){
                ans = mid;
                high = mid - 1;
            }
            else{

                // If allocation is not possible,
                // increase the allowed pages.
                low = mid + 1;
            }
        }

        return ans;
    }
}