package com.accenture.lkm.primitive;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * Primitive streams
 * @author deepali.shende
 *
 */
public class Tester1001PrimitiveStreams {
	public static void main(String[] args) {
		//1. Using empty()
		//createEmptyPrimitiveStream();
		
		//2. Using of(int n)
		//createPrimitiveStreamUsingOf1();
		
		//3. Using of(Double... n)
		//createPrimitiveStreamUsingOf2();
		
		//4. Using range(int startInclusive, int endExclusive)
		//createPrimitiveStreamUsingRange();
		
		//5. Using rangeClosed(int startInclusive, int endInclusive)
		//createPrimitiveStreamUsingRangeClosed();
		
		//6. Using Arrays.stream()
		createPrimitiveStreamUsingArrays();
	}
	
	
	//-------------------------------------------------------------------------------------------------------
	// 1. Using empty()
	//-------------------------------------------------------------------------------------------------------
	public static void createEmptyPrimitiveStream() {
		IntStream productIds = IntStream.empty();
		System.out.println(productIds.count());
	}
	
	
	//-------------------------------------------------------------------------------------------------------
	// 2. Using of(int n)
	//-------------------------------------------------------------------------------------------------------
	public static void createPrimitiveStreamUsingOf1() {
		// stream of single element
		IntStream productIds = IntStream.of(10);
		productIds.forEach(id -> System.out.println(id));
	}

	
	//-------------------------------------------------------------------------------------------------------
	// 3. Using of(Double... n)
	//-------------------------------------------------------------------------------------------------------
	public static void createPrimitiveStreamUsingOf2() {
		DoubleStream productPrices = DoubleStream.of(67554.7, 8000.9, 14244.56, 22876.34, 55);
		productPrices.forEach(price -> System.out.println(price));
	}
	
	
	//-------------------------------------------------------------------------------------------------------
	// 4. Using range(int startInclusive, int endExclusive)
	//-------------------------------------------------------------------------------------------------------
	public static void createPrimitiveStreamUsingRange() {
		// from 10000 to 10499
		LongStream productPriceRange = LongStream.range(10000, 10500);
		productPriceRange.forEach(price -> System.out.println(price));
	}
	
	
	//-------------------------------------------------------------------------------------------------------
	// 5. Using rangeClosed(int startInclusive, int endInclusive)
	//-------------------------------------------------------------------------------------------------------
	public static void createPrimitiveStreamUsingRangeClosed() {
		// from 10000 to 10500
		LongStream productPriceRange = LongStream.rangeClosed(10000, 10500);
		productPriceRange.forEach(price -> System.out.println(price));
	}
	
	
	//-------------------------------------------------------------------------------------------------------
	// Using Arrays.stream()
	//-------------------------------------------------------------------------------------------------------
	public static void createPrimitiveStreamUsingArrays() {
		double[] productPrices = new double[] {67554.7, 8000.9, 14244.56, 22876.34, 55};
		
		DoubleStream prices1 = Arrays.stream(productPrices);
		// lambda
		prices1.forEach(price -> System.out.println(price));
		
		/*DoubleStream prices2 = Arrays.stream(productPrices);
		// method reference
		prices2.forEach(System.out::println);	*/
		
		Arrays.stream(productPrices, 1, 3).forEach(System.out::println);	// 8000.9, 14244.56
	}
}