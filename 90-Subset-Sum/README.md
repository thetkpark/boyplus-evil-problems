
## CSC102 #Do or die mock-up: Subset sum

#### Difficulty: `Mid`

- - -

### Description

> You are given an array size of N. Write the program to tell we that is there some subset of this array which the sum of this subset is equals to X or not for q queries.

### Input

>There are q+3 lines of input.
>The first line is N (the size of array). (1<=N<=15).
The second line contains N positive integer A[i]. (1<=A[i]<=100).
The third line is q (the number of query). (1<=q<=15)
Then q lines follow.
For each line represent to X. (0<=X<=100)

### Output

> There are q lines of output.
>For each line is the answer of each query. If there are some subset in this array which has sum equals to X, please output "Yes", otherwise output "No".
### Sample I/O

#### Input 1

```
5
3 4 6 10 7
3
13
15
19
```

#### Output 1

```
Yes
No
Yes
```