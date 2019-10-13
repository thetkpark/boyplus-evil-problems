## CSC102 Quiz#2 2019 Rubik
**Difficulty**: `Mid`
- - - 
### Description
>Write a program to print each value of each cube in the first z-dimension of the rubik after finish rotating in the given order. In the initial state, all cubes in the rubik contain the value of 1-27 as depicted in the following figure (noted: in the figure each z-dimension is separated for clear visualization).

[![Rubik1](https://raw.githubusercontent.com/thetkpark/boyplus-evil-problems/master/51-Rubik/rubikturn1.JPG "Rubik1")](https://raw.githubusercontent.com/thetkpark/boyplus-evil-problems/master/51-Rubik/rubikturn1.JPG "Rubik1")

>There are 4 types of rotation: up, down, right, and left as shown below.

[![Rubik2](https://raw.githubusercontent.com/thetkpark/boyplus-evil-problems/master/51-Rubik/rubikturn2.JPG "Rubik2")](https://raw.githubusercontent.com/thetkpark/boyplus-evil-problems/master/51-Rubik/rubikturn2.JPG "Rubik2")

>#### Example input:

>2
up 0
right 2

>The example input means the rotation is performed 2 times. The first time is to rotate the rubik up at column 0. The second time is to rotate the rubik to the right at row 2. These rotations are illustrated as below.

[![Rubik3](https://raw.githubusercontent.com/thetkpark/boyplus-evil-problems/master/51-Rubik/rubikturn3.JPG "Rubik3")](https://raw.githubusercontent.com/thetkpark/boyplus-evil-problems/master/51-Rubik/rubikturn3.JPG "Rubik3")

>The output of the first z-dimension should print as follows:
7 2 3
16 5 6
19 22 25

### Input
> The input consists of two parts. The first part is the number of rotations. The second part is the detail of each rotation (which contains direction and index of rotation in row or column) in order.

### Output
>The output of the first z-dimension.

### Sample I/O
#### Input 1
```
2
up 0
right 2
```
#### Output 1
```
7 2 3
16 5 6
19 22 25
```


