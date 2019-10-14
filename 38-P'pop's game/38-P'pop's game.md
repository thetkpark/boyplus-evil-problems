##  P'Pop's game 

#### Difficulty: `Low`

- - -

### Description

>  Now, you are playing P'Pop's game (P'pop is your teacher assistant of Introduction to Programming course). In this game there are N monster that you have to kill and each monster is far from you m[i] meter. So, you decided to kill monster that is closest to you first then you will kill the closest monster again until all of monster are killed. If there is any monsters which has the same distance between you and monster, you will kill the monster that has the lowest index (Firstly input) first. Write the program to input the distance between you and each monster then print the index (index started with 1 to N) of monster that you will kill in order. 

### Input

>There are two lines of input.
>
>The first line represent N (the number of monsters). (1<=N<=1,000)
>
>The second line contains N positive integer m[i]. which each integer represent the distance between you and i-th monster. (1<=m[i]<=300)

### Output

> The only one line contains N integer and each number represent the index (index started with 1 to N) of monster that you kill in order. 

### Sample I/O

#### Input 1

```
6
7 2 1 3 2 5
```

#### Output 1

```
3 2 5 4 6 1 
```

