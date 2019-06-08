package com.megalexa.hexadec.unitTest

import com.megalexa.hexadec.model.block.BlockKindle
import org.junit.Test

import org.junit.Assert.*

/**
 * BlockText unit test
 *
 */
class BlockKindleTest {
    val blockTest = BlockKindle("PdfDiProva")
    @Test
    fun getNameBlockTest() {
        assertEquals("KINDLE", blockTest.getNameBlock())
    }

    @Test
    fun getConfigTest() {
        assertEquals("PdfDiProva", blockTest.getConfig())
    }

    @Test
    fun setConfigTest() {
        blockTest.setConfig("nuovoPdfDiProva")
        assertEquals("nuovoPdfDiProva", blockTest.getConfig())
    }
}
