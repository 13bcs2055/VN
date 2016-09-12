#include <stdio.h>
#define ARRAY_SIZE 100

void getMajorityElement(int *array, int size) {
 int i, majorityIndex = 0, count = 1;
    /* Find Majority Element */
    for(i = 1; i < size; i++) {
     /* Check if current element is same as majority element, 
  If yes then increment count otherwise decrement count */
        if(array[majorityIndex] == array[i])
            count++;
        else
            count--;
        
        if(count == 0) {
            majorityIndex = i;
            count = 1;
        }
    }
    /* Verify, If array[majorityIndex] is the majority element */
    count = 0;
    /* Count the frequency of array[majorityIndex] in array */
    for (i = 0; i < size; i++) {
        if(array[i] == array[majorityIndex])
            count++; 
 }
 /* Check if count of majority element is more than size/2, 
 If yes, then it is a majority element otherwise not  */
    if(count > (size/2))
        printf("Majority Element : %d\n", array[majorityIndex]);
    else
        printf("No Majority Element Found\n");
}

int main(){
    int i, array[ARRAY_SIZE], count, sum;
    printf("Enter the number of elements in Array\n");
    scanf("%d", &count);
    
    printf("Enter %d numbers\n", count);
    for(i = 0; i < count; i++){
 scanf("%d", &array[i]);
    } 
 
    getMajorityElement(array, count);

    return 0;
}
