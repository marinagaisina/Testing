package com.marinagaisina;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MainApplicationTest {

    // positive testing
    @Test
    public void test1() {
        Assert.assertTrue(MainApplicationTest.isValid("fred"));
    }

    @Test
    public void test2() {
        Assert.assertTrue(MainApplicationTest.isValid("John"));
    }

    // negative testing
    @Test
    public void test3() {
        Assert.assertFalse(MainApplicationTest.isValid("Freddy!"));
    }

    @Test
    public void test4() {
        Assert.assertFalse(MainApplicationTest.isValid("@perscholas"));
    }


    public static Boolean isValid(String userName) {
        String[] invalidCharArray = "!@#$%^&*()".split("");
        List<String> invalidChars = Arrays.asList(invalidCharArray);
        String[] userNameCharacterArray = userName.split("");
        for (String currentCharacter : userNameCharacterArray) {
            if (invalidChars.contains(currentCharacter)) {
                System.out.println("Invalid username! "+userName);
                return false;
            }
        }
        System.out.println("Valid username: "+ userName);
        return true;
    }
}
