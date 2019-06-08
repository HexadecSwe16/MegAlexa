package com.megalexa.hexadec.unitTest

import com.megalexa.hexadec.model.block.BlockText
import org.junit.Test

import org.junit.Assert.*

/**
 * BlockText unit test
 *
 */
class BlockTextTest {
    val blockTest = BlockText("Test configuration")
    @Test
    fun getNameBlockTest() {
        assertEquals("TEXT", blockTest.getNameBlock())
    }

    @Test
    fun getConfigTest() {
        assertEquals("Test configuration", blockTest.getConfig())
    }

    @Test
    fun setConfigTest() {
        blockTest.setConfig("Test config new")
        assertEquals("Test config new", blockTest.getConfig())
    }
}
