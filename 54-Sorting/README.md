## CSC102 Quiz#2 2019 Sorting
**Difficulty**: `Low`
- - -
### Description
>Write a program to sort an array of positive integers of a given array alternatively between descending and ascending order. In other words, in the sorted array,the value of the first element should be the maximum number, the second value should be the minimum number, the third should be second maximum number, the fourth should be the second minimum number and so on.

### Input
> There are two lines of input.
The first line represents N (the size of array).
The second line contains N integers each integer represent a[i] (the integer in array).
1<=N<=1,000.
1<=a[i]<=1,000.

### Output
> The only one line of output is elements in the array that are already sorted according to the aforementioned conditions.

### Sample I/O
#### Input 1
```
15 
15 14 13 12 11 10 9 8 7 6 5 4 3 2 1
```

#### Output 1
```
15 1 14 2 13 3 12 4 11 5 10 6 9 7 8
```



### Hint
> The array must be sorted in the terms of descending order first.
You can use methods of Arrays class --> Arrays.sort(int[] a) to sort the array in the ascending order. In order to use it, you must import java.util.Arrays.