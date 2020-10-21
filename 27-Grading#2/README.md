## Grading#2  

#### Difficulty: `Low`

- - -

### Description

> After you finish your grading task in just a minute. P’POP just gave you another task which is harder because he just wants to see you suffer and lost in the world of computer programming. This time, it’s grading program again, but slightly different. In CSC102 we use what are we called Norm-referenced Grading. Because your boss is P’POP, The only thing that he tells you is that he wants the grade to be A, B, C, D, and F.
>
> This is how to grading work.
>
> The student who has score at least 90th percentile will get 'A'
>
> The student who has score at least 70th percentile will get 'B'
>
> The student who has score at least 50th percentile will get 'C'
>
> The student who has score at least 30th percentile will get 'D'
>
> The student who has score at least10th percentile will get 'E'
>
> Lastly, student who has a score below 10th percentile will get an 'F'
>
> 
>
> This is how you find a k percentile from the data.
>
> ![CodeCogsEqn.gif](https://cscms.me/public/upload/2cd7a27259.gif)
>
> Pk = index of the percentile in sorted data
>
> k = percentile that we to know
>
> n = total number of data

### Input

>The first input is 'N', which is number of student in the class. 10<=N<=10000
>
>From 2 to N is the input of score of each student in the class which has a range from 0 to 100

### Output

> The grade of each student that him/she get.

### Sample I/O

#### Input 1

```
14
32 65 87 23 56 77 12 89 90 45 78 34 23 67
```

#### Output 1

```
E C B E D C F B A D B D E C
```



#### Input 2

```
20
10 20 30 40 0 50 60 70 80 90 100 89 67 45 23 12 45 67 58 35
```

#### Output 2

```
F E E D F C C B B A A B B D E E D B C D
```

