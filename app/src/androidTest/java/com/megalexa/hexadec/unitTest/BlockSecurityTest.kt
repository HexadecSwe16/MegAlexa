package com.megalexa.hexadec.unitTest

import com.megalexa.hexadec.model.block.BlockSecurity
import org.junit.Test

import org.junit.Assert.*

/**
 * BlockText unit test
 *
 */
class BlockSecurityTest {
    val blockTest = BlockSecurity("abcs394ja")
    @Test
    fun getNameBlockTest() {
        assertEquals("SECURITY", blockTest.getNameBlock())
    }

    @Test
    fun getConfigTest() {
        assertEquals("abcs394ja", blockTest.getConfig())
    }
    /*
    @Test
    fun setConfigTest() {
        blockTest.setConfig("RadioGaGa")
        assertEquals("RadioGaGa", blockTest.getConfig())
    }
    */
}
