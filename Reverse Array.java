   int[] array = {1, 2, 3, 4};
                
                // Reverse the array
                for (int i = 0; i < array.length / 2; i++) {
                    int temp = array[i];
                    array[i] = array[array.length - 1 - i];
                    array[array.length - 1 - i] = temp;
                }
        
                // Print the reversed array
                for (int num : array) {
                    System.out.print(num + " "); // Output:  4 3 2 1 
             
                }
