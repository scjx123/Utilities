package org.utils.stringutils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.utils.exceptions.InvalidStringInputException;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringParserTest {

    @Test
    void splitString_oneSeparator_returnTwostrings() throws InvalidStringInputException {
        StringParser sp = new StringParser();
        String inputString = "Hello|world";
        List<String> stringParts = sp.splitString(inputString,"\\|");
        assertEquals(stringParts.size(),2);
    }

    @Test
    void splitString_nullInput_expectException() {
        StringParser sp = new StringParser();
        String inputString = null;
        assertThrows(InvalidStringInputException.class, () ->
        {
            sp.splitString(inputString,"@");
        });
    }
}
