package com.accenture.lkm.streamcreation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Stream creation
 * @author deepali.shende
 *
 */

public class Tester1002StreamCreation {
	public static void main(String[] args) {
		// 1. creating a stream from a Collection implementation using the stream() method:
		createStreamfromCollection1();
		
		// 1.1. creating a stream from a Collection implementation using the stream() method:
		//createStreamfromCollection2();
		
		// 1.2. creating a stream from Map:
		//createStreamfromMap();
		
		// 2. creating a stream from individual values:
		//createStreamFromIndividualValues();
		
		// 3. creating a stream from an array using Stream.of():
		//createStreamfromArray1();
		
		// 4. creating a stream from an array using Arrays.stream():
		//createStreamfromArray2();
		
		// 5. creating a empty stream using Stream.empty():
		//createEmptyStream();
		
		// 6. creating a stream using Stream.Builder():
		//createStreamUsingBuilder();
		
		// 7. creating a stream using Stream.iterate(): 
		//createStreamUsingIterator();
		
		// 8. creating a stream using Stream.generate()
		//createStreamUsingGenerate();
	}
	
	
	//-------------------------------------------------------------------------------------------------------
	// 1. creating a stream from a Collection implementation using the stream() method:
	//----------------------------------------------------------------------------------------------------------
	public static void createStreamfromCollection1() {
		List<String> productNames = Arrays.asList(new String[]{"TV", "Fan", "Mixer", "Washing machine"});
		Stream<String> streamOfProductNames = productNames.stream();
		// forEach - is high order function/first class function. Consumer object is passed to forEach. 
		streamOfProductNames.forEach(productName -> System.out.println(productName));
	}
	
	
	//-------------------------------------------------------------------------------------------------------
	// 1.1. creating a stream from a Collection implementation using the stream() method:
	//----------------------------------------------------------------------------------------------------------
	public static void createStreamfromCollection2() {
		Set<Integer> productIds = new HashSet<>();
		productIds.add(112);
		productIds.add(113);
		productIds.add(114);
		productIds.add(115);
		// converting Set to Stream
	    Stream<Integer> streamOfProductIds = productIds.stream();
	    // displaying elements of Stream
	    streamOfProductIds.forEach(productId -> System.out.println(productId));
	}
	
	
	//-------------------------------------------------------------------------------------------------------
	// 1.2. creating a stream from Map:
	//----------------------------------------------------------------------------------------------------------
	public static void createStreamfromMap() {
		Map<Integer, String> products = new HashMap<Integer, String>();
		products.put(1, "TV");
		products.put(20, "Fan");
		products.put(3, "Mouse");
		
		Stream<Entry<Integer, String>> entrySet = products.entrySet().stream();
		entrySet.forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
	}

	
	//-------------------------------------------------------------------------------------------------------
	// 2. creating a stream from individual values:
	//----------------------------------------------------------------------------------------------------------
	public static void createStreamFromIndividualValues() {
		Stream<String> productNames = Stream.of("Laptop", "Camera", "TV", "Phone");
		productNames.forEach(product -> System.out.println(product));			
		
		// Below line gives IllegalStateException as stream is already closed.
		//productNames.forEach(product -> System.out.println(product));
	}
	
	
	//----------------------------------------------------------------------------------------------------------
	// 3. creating a stream from an array using Stream.of():
	//----------------------------------------------------------------------------------------------------------
	public static void createStreamfromArray1() {
		String[] productNames = new String[]{"Laptop", "Camera", "TV", "Phone"};
		Stream<String> streamOfProductNames = Stream.of(productNames);
		// access using iterator
		Iterator<String> it = streamOfProductNames.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
	
	
	//------------------------------------------------------------------------------------------------------------
	// 4. creating a stream from an array using Arrays.stream():
	//----------------------------------------------------------------------------------------------------------
	public static void createStreamfromArray2() {
		String[] productNames = new String[]{"Laptop", "Camera", "TV", "Phone"};
		Stream<String> streamOfProductNames = Arrays.stream(productNames);	
		streamOfProductNames.forEach(productName -> System.out.println(productName));
	}
	
	
	//-----------------------------------------------------------------------------------------------------------
	// 5. creating a empty stream using Stream.empty():
	//-----------------------------------------------------------------------------------------------------------
	public static void createEmptyStream() {
		Stream<String> stream = Stream.empty();
		System.out.println(stream.count());		// 0
	}

	
	//-----------------------------------------------------------------------------------------------------------
	// 6. creating a stream using Stream.Builder():
	//-----------------------------------------------------------------------------------------------------------
	public static void createStreamUsingBuilder() {
		Stream.Builder<String> productsBuilder = Stream.<String>builder().add("TV").add("Phone").add("Laptop").add("IPad");
		productsBuilder.accept("IPhone");
		productsBuilder.accept("Headphone");
		Stream<String> allProducts = productsBuilder.build();
		System.out.println(allProducts.count());
	}
	
	
	//-----------------------------------------------------------------------------------------------------------
	// 7. creating a stream using Stream.iterate(): 
	//-----------------------------------------------------------------------------------------------------------
	public static void createStreamUsingIterator() {
		// start - 1st value in stream
		// limit - no of elements in stream
		// n->n*n - lambda to generate next number in stream
		// infinite stream can be created without limit
		int start = 1;
		int limit = 10;
		Stream<Integer> generatedProductIds = Stream.iterate(start, n -> n+1)
						          					.limit(limit);
		generatedProductIds.forEach(System.out::println);
	}

	
	//-----------------------------------------------------------------------------------------------------------
	// 8. creating a stream using Stream.generate() 
	//-----------------------------------------------------------------------------------------------------------
	public static void createStreamUsingGenerate() {
		// infinite stream can be created without limit
		Stream.generate(Math::random)
	    .limit(5)
	    .forEach(System.out::println);
	}
}
