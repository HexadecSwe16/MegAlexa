package com.megalexa.hexadec.unitTest

import com.megalexa.hexadec.model.block.BlockRadio
import org.junit.Test

import org.junit.Assert.*

/**
 * BlockText unit test
 *
 */
class BlockRadioTest {
    val blockTest = BlockRadio("RadioGooGoo")
    @Test
    fun getNameBlockTest() {
        assertEquals("RADIO", blockTest.getNameBlock())
    }

    @Test
    fun getConfigTest() {
        assertEquals("RadioGooGoo", blockTest.getConfig())
    }

    @Test
    fun setConfigTest() {
        blockTest.setConfig("RadioGaGa")
        assertEquals("RadioGaGa", blockTest.getConfig())
    }
}
