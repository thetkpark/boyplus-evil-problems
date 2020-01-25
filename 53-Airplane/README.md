## CSC102 Quiz#2 2019 Airplane
**Difficulty**: `Mid`
- - - 
### Description
> Tomorrow Goairline have many airplanes. Each of them has two seat columns and each column hasN seats. The airline assign passenger seat by consider the passenger queue (first comes first serves) and weight of passenger. Each passenger is assigned a seat according to the following rules:
1. A passenger will sit on the column that has lower total weight.
2. If total weight of both columns are equal passenger will sit on the left column.
3. If a passenger needs to sit on the column that is full, this passenger will replace the passenger who has the lowest weight on that column. The replaced passenger will then be seated on another column instead. In case of there are more than one lowest weighted passengers, select the one who is sitting in the rearmost seat.

### Input
> There are two lines of input.\
The first line represents N (the number of seats for each column).\
The second line contains N x 2 integers each integer represents the passenger weight in the queue.\
1<=N<=100.\
1<=weight<=100.

### Output
> There are N lines of output for each line represents weight of passenger sit on each seat.\
*Noted that number of passengers always equals to the number of total seats.

### Sample I/O
#### Input 1
```
3
1 2 3 4 5 6
```

#### Output 1
```
1 2
3 4
5 6
```
#### Input 2
```
4
8 1 1 2 5 5 2 6
```

#### Output 2
```
8 6
5 2
1 2
1 5
```