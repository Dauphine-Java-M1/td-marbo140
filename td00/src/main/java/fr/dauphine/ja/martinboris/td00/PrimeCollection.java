package fr.dauphine.ja.martinboris.td00;

import java.util.ArrayList;
import java.util.Random;

public class PrimeCollection {
	ArrayList<Integer> numbers;

	public PrimeCollection() {
		this.numbers = new ArrayList<Integer>();
	}

	public void initRandom(int n, int m) {
		for (int i=0; i<n; i++) {
			Random rand = new Random();
			int nb = rand.nextInt(m + 1);
			numbers.add(nb);
		}
	}
	public boolean isPrime(int n) {
		if (n<=1) {
			return false;
		}
		for (int i=2; i<Math.sqrt(n); i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}

	public void printPrimes(){
		for (int i=0; i<numbers.size(); i++) {
			if (this.isPrime(numbers.get(i))){
				System.out.println(i);
			}
		}
	}

	public static void main (String[] args) {
		PrimeCollection p = new PrimeCollection();
		p.initRandom(100, 2000);
		p.printPrimes();
	}
}