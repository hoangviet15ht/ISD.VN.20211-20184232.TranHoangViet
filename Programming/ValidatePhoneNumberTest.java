package controller;

import static org.junit.jupiter.api.Assertions.fail;

import controller.PlaceOrderController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ValidatePhoneNumberTest {
	private PlaceOrderController placeOrderController;

	@BeforeEach
	public void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}

	@ParameterizedTest
	@CsvSource({
			"1123356789,false",
			"012335678923,false",
			"1123356789552,false",
			"1a34525555,false",
			"0000000000,true",
	})
	public void test(String phone, boolean expected) {
		boolean isValided = placeOrderController.validatePhoneNumber(phone);
		Assert.assertEquals(expected, isValided);

	}

}
