## Raining #2
#### Difficulty: `Mid`
- - -
### Description
> There are N buckets in front of you and each bucket are numbered from 1 to N. In everyday, it will be raining and the rain will fall into every buckets which has number in range x to y inclusive (the rain will fall into bucket number x,x+1,x+2,...,y-2,y-1,y) for one unit. Write the program to calculate how many unit of water in each bucket after it is raining for q days.

### Input
> There are q+1 lines of input.

The first line contains two positive integer N and q (the number of buckets and the number of day respectively).

Then q lines follow. The i-th line contains two positive integer x and y.

1<=N,q<=100,000

1<=x<=y<=N

### Output
> The only one line of input contains N integer each integer represents the unit of water in each bucket after q days.

### Sample I/O
#### Input 1
```
5 3
2 3
1 4
4 5
```

#### Output 1
```
1 2 2 2 1
```



