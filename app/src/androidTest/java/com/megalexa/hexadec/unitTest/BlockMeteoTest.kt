package com.megalexa.hexadec.unitTest

import com.megalexa.hexadec.model.block.BlockText
import org.junit.Test

import org.junit.Assert.*

/**
 * BlockText unit test
 *
 */
class BlockMeteoTest {
    val blockTest = BlockText("Blocco di test")
    @Test
    fun getNameBlockTest() {
        assertEquals("Blocco di test", blockTest.getNameBlock())
    }

    @Test
    fun setNameTest() {
        blockTest.setText("Set text block")
        assertEquals("Set text block", blockTest.getNameBlock())
    }
}
