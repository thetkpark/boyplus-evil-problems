
  
## CSC102 Quiz#3 2019 Calculator (OOP)

#### Difficulty: `Low`

- - -

### Description

> Write Java classes according to the given UML Class diagram.
> 
> ![enter image description here](https://github.com/thetkpark/boyplus-evil-problems/raw/master/64-Cal/calculatorUML.jpg)
>
>The Calculator class provide an interface for necessary methods that the calculator should have. The BasicCalculator class must provide all implementation of each method in the Calculator class. The explanation of how each constructor and method should be implemented for the BasicCalculator is provided below.
>
>The BasicCalculator constructor will set the initial value of result as 0.
>
>The add method will add the input double to the result.
>
>The substract method will substract the input double from the result.
>
>The divide method will divide the result by the input double.
>
>The multiply method will multiply the result with the input double.
>
>The getResult method returns the current value of result.
>
>The clear method resets the value of result to 0.
>
>The BasicCalculatorTester class is a driver class that uses the BasicCalculator. In details, it will retrieve an input as a mathematics expression (String) and then tokennize the expression into number and operators. Each number will be evaluated according to the input operator, then it returns a result. For example: if the input is "2 *3 + 10 / 8", it should print the result as 2.0.
>
>The code of BasicCalculatorTester is already provided in you programming console. Please DO NOT modify this class, otherwise it may results to the failure. Your task is to write the code of the Calculator class and the BasicCalculator class. Important hint: DO NOT specify the visibility modifier for the Calculator class and the BasicCalculator class. The BasicCalculatorTester must be the only public class in this program.


### Input

>There is no input in this problem.

### Output

> The output of program from Driver class (Main class).

### Code Templates

```java
import java.util.Scanner;
import java.util.StringTokenizer;
//Write your code here
class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		BasicCalculator cal = new BasicCalculator();
		String expression = sc.nextLine();
		StringTokenizer st = new StringTokenizer(expression);
		int count = 1;
		String operator = "";
	    while (st.hasMoreTokens()) {
	        //System.out.println(st.nextToken());
	        if(count==1){
				cal.add(Double.parseDouble(st.nextToken()));
			}
			else{
				if(count%2==1){
					operator = st.nextToken();
				}
				else{
					switch(operator){
						case "+": cal.add(Double.parseDouble(st.nextToken())); break;
						case "-": cal.substract(Double.parseDouble(st.nextToken())); break;
						case "/": cal.divide(Double.parseDouble(st.nextToken())); break;
						case "*": cal.multiply(Double.parseDouble(st.nextToken())); break;
					}
				}
			}
	        count++;
	    }
	    System.out.println(cal.getResult());
	}
}
```
