package com.accenture.lkm.optionalmethods;

import java.time.LocalDate;
import java.util.Optional;

import com.accenture.lkm.sampleclasses.Product;

/**
 * Optional class
 * 
 * @author deepali.shende
 *
 */

public class Tester1001OptionalMethods {
	public static void main(String[] args) throws NoProductPresentException  {
		//emptyCreation();
		
		//ofCreation();
		
		//ofNullableCreation();
		
		//getValueFromOptional();
		
		//checkIfOptionalPresent();
		
		//getValueOrElseDefault();
		
		getValueOrThrowException();
	}

	//------------------------------------------------------------------------------------------------------------
	// Empty Optional
	//------------------------------------------------------------------------------------------------------------
	private static void emptyCreation() {
		Optional<Product> optional = Optional.empty();
		if(!optional.isPresent()) {
			System.out.println("Empty object");
		}
	}
	
	//------------------------------------------------------------------------------------------------------------
	// Case1: Comment line no 49 and uncomment line no 48 and observe the output.
	// Case2: Comment line no 48 and uncomment line no 49 and observe the exception. isPresent() throws NullPointerException 
	//		  if Optional is null. 
	//------------------------------------------------------------------------------------------------------------
	private static void ofCreation() {
		//String productName = "Television";
		String productName = null;
		
		Optional<String> prdName = Optional.of(productName);
		System.out.println(prdName.isPresent());
	}
	
	//------------------------------------------------------------------------------------------------------------
	// Case1: Comment line no 61 and uncomment line no 60 and observe the output.
	// Case2: Comment line no 60 and uncomment line no 61 and observe the output.
	//------------------------------------------------------------------------------------------------------------
	private static void ofNullableCreation() {
		//String productName = "Television";
		String productName = null;
		
		Optional<String> prdName = Optional.ofNullable(productName);
		
		System.out.println(prdName.isPresent());
		
	}
	
	//------------------------------------------------------------------------------------------------------------
	// Case1: Uncomment line no 76 to 78. Comment line no 82 to 84 and 88 to 95 and observe the output.
	// Case2: Comment line no 76 to 78 and 88 to 95. Uncomment line no 82 to 84. and observe the output.
	// Case3: Comment line no 76 to 78 and 82 to 84. Uncomment line no 88 to 85 and observe the output.
	//------------------------------------------------------------------------------------------------------------
	private static void getValueFromOptional() {
		//Case 1:
		/*Optional<Product> optionalProduct = Optional.of(new Product(1, "IPhone", "O", 40000.0, LocalDate.of(2000, 12, 12)));	
		Product product = optionalProduct.get();
		System.out.println(product);*/
		
		//Case 2:
		// NoSuchElementException
		/*Optional<Product> optionalProduct = Optional.empty();
		Product product = optionalProduct.get();
		System.out.println(product);*/
		
		//Case 3:
		// To avoid exception, always check isPresent()
		Optional<Product> optionalProduct = Optional.empty();
		if(optionalProduct.isPresent()) {
			Product product = optionalProduct.get();
			System.out.println(product);
		}
		else {
			System.out.println("Product not present");
		}
	}

	//--------------------------------------------------------------------------------------------------------------------
	// Case1: Comment line no 104 and uncomment line no 103. Observe the output.
	// Case2: Comment line no 103 and uncomment line no 104. Observe the output.
	//--------------------------------------------------------------------------------------------------------------------
	private static void checkIfOptionalPresent() {
		//Optional<Product> optionalProduct = Optional.of(new Product(1, "IPhone", "O", 40000.0, LocalDate.of(2000, 12, 12)));
		Optional<Product> optionalProduct = Optional.empty();
		optionalProduct.ifPresent(product -> System.out.println(product.getProductName()));
	}
	
	//-----------------------------------------------------------------------------------------------------------------------
	// Case1: Comment line nos from 119 to 121 and uncomment line nos from 114 to 116. Observe the output.
	// Case2: Comment line nos from 114 to 116 and uncomment line nos from 119 to 121. Observe the output.
	//-----------------------------------------------------------------------------------------------------------------------
	private static void getValueOrElseDefault() {
		// will returns dummyProduct object as Optional is empty
		/*Optional<Product> optionalProduct = Optional.empty();
		Product product = optionalProduct.orElse(new Product(0, "dummy", "dummy", 0.0, null));
		System.out.println(product);*/
		
		// returns IPhone product object as Optional is not empty.
		Optional<Product> optionalProduct = Optional.of(new Product(1, "IPhone", "O", 40000.0, LocalDate.of(2000, 12, 12)));
		Product product = optionalProduct.orElse(new Product(0, "dummy", "dummy", 0.0, null));
		System.out.println(product);
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	//Case1: Comment line no 130 and uncomment line no 129. Observe the output.
	//Case2: Comment line no 129 and uncomment line no 130. Observe the exception.
	//--------------------------------------------------------------------------------------------------------------------------
	private static void getValueOrThrowException() throws NoProductPresentException  {
		//Optional<Product> optionalProduct = Optional.of(new Product(1, "IPhone", "O", 40000.0, LocalDate.of(2000, 12, 12)));
		Optional<Product> optionalProduct = Optional.empty();
		Product product = optionalProduct.orElseThrow(NoProductPresentException :: new);
		System.out.println(product);
	}
}
