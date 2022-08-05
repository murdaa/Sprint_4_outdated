package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {

    private final String testName;
    private final boolean expected;

    public AccountTest(String testName, boolean expected) {
        this.testName = testName;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTestName() {
        return new Object[][] {
                {"", false},
                {"   ", false},
                {"Ая", false},
                {" Ольга Слуцкая", false},
                {" Ольга Иванова ", false},
                {"Владимир Попов ", false},
                {"ОлегДимитров", false},
                {" ОлегДимитров ", false},
                {"Кирилл Петропольский", false},
                {"Ю К", true},
                {"Ян К", true},
                {"Полина Дмитревская", true},
                {"Кристин Дмитревская", true},
                {"Анна Краснова", true}
        };
    }

    @Test
    public void testOfAccountClass() {
        Account account = new Account(testName);
        boolean actual = account.checkNameToEmboss();
        assertEquals(expected, actual);
        System.out.println(actual);
    }

}
