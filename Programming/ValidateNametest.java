package controller;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class ValidateNametest {
    private PlaceOrderController placeOrderController;
    @BeforeEach
    public void setUp() throws Exception{
        placeOrderController = new PlaceOrderController();
    }

    @ParameterizedTest
    @CsvSource({
            "az,true",
            "viet45,false",
            ",false"
    })
    public void validateName(String name, boolean expected) {
        boolean isValided = placeOrderController.validateName(name);
        Assert.assertEquals(expected, isValided);
    }
}