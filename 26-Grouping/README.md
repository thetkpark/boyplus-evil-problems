## Asst.Prof.Dr. Chonlameth's class grouping  

#### Difficulty: `Mid`

- - -

### Description

> Now, You are a first year student in Computer Science at School of Information Technology (SIT@KMUTT). In Invention and innovation class, Asst.Prof.Dr. Chonlameth assign the students to form into two groups. There are N students in this class and every student has their own smartness point represent by a[i]. Asst.Prof.Dr. Chonlameth want the two groups to have same fairness, so the different of the total smartness point in each group must be minimum as possible and for each group must has at least one member.
>
> For example N = 5 and smartness point for each students are 2,7,4,3,5
>
> The sum of smartness point of the first group is 7+3 = 10.
>
> The sum of smartness point of the second group is 2+4+5 = 11.
>
> The different of the sum of all smartness point of two groups is 11-10 = 1.
>
> So this solution to form student into two groups is the best solution possible because the different of the total smartness point between two groups need to be as low as possible.

### Input

>There are two lines of input.
>
>First line represents one positive integer N (the number of student in class). (2<=N<=20)
>
>Second line contains N positive integer represent by a[i] (the smartness point for each student). (1<=a[i]<=100)

### Output

> The only one line represent the minimum different of the total smartness point between two groups. 

### Sample I/O

#### Input 1

```
5
2 7 4 3 5
```

#### Output 1

```
1
```



#### Input 2

```
7
17 15 17 11 6 15 7 
```

#### Output 2

```
2
```



### Hint

>In sample2
>
>The sum of smartness point of the first group is 17+6+15+7 = 45.
>
>The sum of smartness point of the second group is 17+15+11 = 43.
>
>The different is 45-43 = 2 and it is low as possible.