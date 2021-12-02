package controller;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidateInstructionTest {
    private PlaceRushOrderController placeRushOrderController;
    @BeforeEach
    void setUp() {
        placeRushOrderController = new PlaceRushOrderController();
    }

    @ParameterizedTest
    @CsvSource({
            "haloi,true",
            ",false"
    })
    void validateDeliveryInstruction(String instruction, boolean expected) {
        boolean isValided = placeRushOrderController.validateDeliveryInstruction(instruction);
        Assert.assertEquals(expected, isValided);
    }
}