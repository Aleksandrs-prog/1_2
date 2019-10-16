package imperative;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;


public class PerfectNumber {
	public enum STATE {
		PERFECT, DEFICIENT, ABUNDANT;
		
	}

	public static STATE process(int n) {
		Integer summa = divisors(n).stream().mapToInt(Integer::intValue).filter((num) -> num != n).sum();
		if (summa == n)
			return STATE.PERFECT;
		else {
			if (summa < n) {
				return STATE.DEFICIENT;
			} else {
				return STATE.ABUNDANT;
			}
		}
	}

	public static Set<Integer> divisors(int n) {
		System.out.println(" ");
		System.out.println("Aleksandrs Olehnovics");
		System.out.println(" ");
		Set<Integer> sDivisors =  new HashSet<Integer>();
		int nsqr = (int) Math.round(Math.sqrt(n)) + 1;
		System.out.println(n);
		IntStream.range(1, nsqr).forEach( (num) ->{
			System.out.println(n);
			if (n%num == 0){
				sDivisors.add(num);
				sDivisors.add(n/num);
			}
		});
		return sDivisors;
	}
	}

