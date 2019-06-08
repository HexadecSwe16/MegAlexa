package com.megalexa.hexadec.unitTest

import com.megalexa.hexadec.model.block.BlockInstagram
import org.junkit.Test

import org.junit.Assert.*

/**
 * BlockText unit test
 *
 */
class BlockInstagramTest {
    val blockTest = BlockInstagram("Instagram configuration")
    @Test
    fun getNameBlockTest() {
        assertEquals("INSTAGRAM", blockTest.getNameBlock())
    }

    @Test
    fun getConfigTest() {
        assertEquals("Instagram configuration", blockTest.getConfig())
    }

    @Test
    fun setConfigTest() {
        blockTest.setConfig("Set config block")
        assertEquals("Set config block", blockTest.getConfig())
    }
}
