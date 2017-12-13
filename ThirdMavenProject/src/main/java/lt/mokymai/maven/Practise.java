package lt.mokymai.maven;

import java.util.Arrays;

public class Practise {

	public static void main(String[] args) {
		
		String s = "Hello";
		String st = "World!";
		String v = "Greetings earthlings! We are Shpongled together";
		
		System.out.println(s);
		System.out.println(st);
		System.out.println(v);
		
		char[] charArray = s.toCharArray();
		System.out.println(charArray);
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		System.out.println(v.endsWith("together"));
		System.out.println(v.contains("Shpongled"));
		System.out.println(s.equals(st));
		System.out.println(s.equalsIgnoreCase(st));
		
		StringBuilder build = new StringBuilder();
		build.append(s);
		build.append(st);
		build.append(v);
		System.out.println(build);
		String ended = build.toString();
		System.out.println(ended);
		s= s.replace('H', 'h');
		System.out.println(s);
		
		String special = "Greetings \r \"earthlings\"! \n \t We are \'Shpongled\' together\\";
		System.out.println(special);
		
		int[] integerArray = {1, 2, 3, 8, 6, 5 ,9 ,7 ,4, 0};
		System.out.println(Arrays.toString(integerArray));
		
		String firstArrayElement = "An array is a ";
		String secondArrayElement = "container object";
		char[] firstOneDimensional = firstArrayElement.toCharArray();
		char[] secondOneDimensional = secondArrayElement.toCharArray();
		char[][] twoDimensional = {firstOneDimensional, secondOneDimensional};
		System.out.println(Arrays.deepToString(twoDimensional));
		
		java.util.Random randomInt = new java.util.Random();
		int[] number = new int[10];
		for (int i = 0; i<10; i++)
			number[i] = randomInt.nextInt(9) + 0;
		System.out.println(Arrays.toString(number));
		
		int[][] firstTwoDim = {{2, 5, 8, 4, 6},{1, 1, 3, 2, 7}};
		int[][] secondTwoDim = {{6, 5, 4, 7, 5}, {3, 2, 1, 9, 8}};
		int[][] both = new int[2][5];
		for(int i=0; i<firstTwoDim.length; i++) {
			for(int j=0; j<secondTwoDim[i].length; j++) {
				both[i][j] = firstTwoDim[i][j] + secondTwoDim[i][j];
			}
		}
		System.out.println(Arrays.deepToString(both));
		
		
		
		
		
		
		
		
		
	}

}
