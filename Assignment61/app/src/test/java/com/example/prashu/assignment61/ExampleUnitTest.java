package com.example.prashu.assignment61;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void email_isCorrect() throws Exception {
        assertTrue("Invalid Username", Validation.checkUsername("prashu"));
    }

    //Testcase for Password
    @Test
    public void password_isCorrect() throws Exception {
        assertTrue("Invalid Password", Validation.checkPassword("wwwwww"));
    }
}