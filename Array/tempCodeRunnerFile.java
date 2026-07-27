 while (left <= right) {
            
            if (arr[left] == 0) {
                left++;
            } 
            
            else if (arr[right] == 1) {
                right--;
            } 
            
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }