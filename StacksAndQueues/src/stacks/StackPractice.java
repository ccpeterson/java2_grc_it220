package stacks;

import java.util.Stack;

public class StackPractice {

	public static void main(String[] args)
	{
		Stack<Integer> numbers = new Stack<>();
		
		for (int i = 1; i<=100;i++)
		{
			numbers.push(i);
		}
		
		for (int element : numbers)
		{
			System.out.println(numbers.pop());
		}
		
//		for (int i = 1; i<=100;i++)
//		{
//			numbers.push(i);
//		}
//		
//		while (!numbers.isEmpty())
//		{
//			System.out.println(numbers.pop());
//		}
		Stack<Integer> stackOfNumbers = new Stack<>();
		
		stackOfNumbers.push(10);
		stackOfNumbers.push(20);
		System.out.println(stackOfNumbers.peek());
		System.out.println(stackOfNumbers.pop());
		stackOfNumbers.push(30);
		System.out.println(stackOfNumbers.pop());
		stackOfNumbers.push(40);
		stackOfNumbers.push(50);
		System.out.println(stackOfNumbers.pop());
		System.out.println(stackOfNumbers.peek());
		stackOfNumbers.push(60);
		System.out.println(stackOfNumbers.peek());
		stackOfNumbers.push(70);

	}

}
