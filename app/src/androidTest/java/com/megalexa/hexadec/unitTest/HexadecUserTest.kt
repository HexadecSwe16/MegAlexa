package com.megalexa.hexadec

import com.megalexa.hexadec.model.HexadecUser
import org.junit.Test

import org.junit.Assert.*

/**
 *  Test di unità per HexadecUser
 */
class HexadecUserTest {
    private val constructorTest =  HexadecUser("nh37shj", "testName", "hexadec.swe@gmail.com")

    @Test
    fun getIdTest() {
        assertEquals("nh37shj", constructorTest.getId())
    }

    @Test
    fun getNameTest() {
        assertEquals("testName", constructorTest.getName())
    }

    @Test
    fun getEmailTest() {
        assertEquals("hexadec.swe@gmail.com", constructorTest.getEmail())
    }

    @Test
    fun getAndSetPinTest() {
        constructorTest.setPin("Pin12tre")
        assertEquals("Pin12tre", constructorTest.getPin())
    }

    @Test
    fun getAndSetApiGoogleTest() {
        constructorTest.setApiGoogle("ApiGoogle123")
        assertEquals("ApiGoogle123", constructorTest.getApiGoogle())
    }

    @Test
    fun getAndSetApiInstagramTest() {
        constructorTest.setApiInstagram("ApiInstagram123")
        assertEquals("ApiInstagram123", constructorTest.getApiInstagram())
    }
}
