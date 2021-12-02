package controller;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class ValidateAddressTest {
    private PlaceOrderController placeOrderController;
    @BeforeEach
    public void setUp() throws Exception{
        placeOrderController = new PlaceOrderController();
    }
    @ParameterizedTest
    @CsvSource({
            "haloi,true",
            "hatinh45,false",
            ",false"
    })
    public void validateAddress(String address, boolean expected) {
        boolean isValided = placeOrderController.validateAddress(address);
        Assert.assertEquals(expected, isValided);
    }
}