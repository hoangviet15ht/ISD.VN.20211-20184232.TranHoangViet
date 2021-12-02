package controller;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidateDeliveryDateTest {

    private PlaceRushOrderController placeRushOrderController;
    @BeforeEach
    void setUp() {
        placeRushOrderController = new PlaceRushOrderController();
    }
    @ParameterizedTest
    @CsvSource({
            "20-11-2021,true",
            "30-13-2017,false",
            "29-2-2026,false",
            ",false"
    })
    void validateDeliveryDate(String date, boolean expected) {
        boolean isValided = placeRushOrderController.validateDeliveryDate(date);
        Assert.assertEquals(expected, isValided);
    }
}