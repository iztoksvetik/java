package io.iztok.katas;

public class BitCounting {

	public static int countBits(int n){
        var bits = Integer.toBinaryString(n);
		return (int) bits.chars().filter(c -> c == '1').count();
	}
	
}
