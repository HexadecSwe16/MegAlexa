package com.megalexa.hexadec.unitTest

import com.megalexa.hexadec.model.block.BlockFeedRss
import org.junit.Test

import org.junit.Assert.*

/**
 * BlockText unit test
 *
 */
class BlockFeedRssTest {
    val blockTest = BlockFeedRss("https://www.urlDiProva.com")
    @Test
    fun getNameBlockTest() {
        assertEquals("FEEDRSS", blockTest.getNameBlock())
    }

    @Test
    fun getConfigTest() {
        assertEquals("https://www.urlDiProva.com", blockTest.getConfig())
    }

    @Test
    fun setNameTest() {
        blockTest.setConfig("https://www.nuovoUrlDiProva.com")
        assertEquals("https://www.nuovoUrlDiProva.com", blockTest.getNameBlock())
    }
}
