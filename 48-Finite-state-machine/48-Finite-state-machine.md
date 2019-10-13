## CSC102 Quiz#1 2019 Finite State Machine
**Difficulty**: `Low`
- - - 
### Description
>Mr. Ukrit is a new manager of Continental Hotel, Bangkok. He has to be prepared to welcome the most famous assassin of the continental ground, Mr. John Wick. He develops IoT light switches showing his customer need to inform butlers. These light switches are toggle switches. One of switches has a light signal of “Make Up Room” (MuR). Another one has a light signal of “Do not Disturb” (DnD). These two switches can be both “off”, but either one of them can be “on” at a time. There are two states of signal which are 0 and 1 representing "on" and "off" respectively.

[![Finite1](https://raw.githubusercontent.com/thetkpark/boyplus-evil-problems/master/48-Finite-state-machine/img1.png "Finite1")](https://raw.githubusercontent.com/thetkpark/boyplus-evil-problems/master/48-Finite-state-machine/img1.png "Finite1")

>With these conditions, it can be depicted by using the Finite State Machine diagram shown below.

[![Finite2](https://raw.githubusercontent.com/thetkpark/boyplus-evil-problems/master/48-Finite-state-machine/img2.png "Finite2")](https://raw.githubusercontent.com/thetkpark/boyplus-evil-problems/master/48-Finite-state-machine/img2.png "Finite2")

### Input
>The input consists of two lines. The first line is a pair of current state representing the on/off status of each switch. The second line is the switch input clicking of MuR switch and DnD switch, each represented by “1” or “-” where "1" represents clicking and "-" represents not clicking.

### Output
>The output is the status of the next state which are either "NEUTRAL" if both switch off, "MuR" if the MuR switch is on, or "DnD" if the DnD switch is on.

### Sample I/O
#### Input 1
```
0 0
- -
```

#### Output 1
```
NEUTRAL
```
#### Input 2
```
0 0
- 1
```

#### Output 2
```
DnD
```
#### Input 3
```
0 0
1 -
```

#### Output 3
```
MuR
```

