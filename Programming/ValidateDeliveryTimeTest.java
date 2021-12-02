package controller;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidateDeliveryTimeTest {

    private PlaceRushOrderController placeRushOrderController;
    @BeforeEach
    void setUp() {
        placeRushOrderController = new PlaceRushOrderController();
    }

    @ParameterizedTest
    @CsvSource({
            "23:59,true",
            "25:30,false",
            "01:60,false",
            ",false"
    })
    void validateDeliveryTime(String time, boolean expected) {
        boolean isValided = placeRushOrderController.validateDeliveryTime(time);
        Assert.assertEquals(expected, isValided);
    }
}