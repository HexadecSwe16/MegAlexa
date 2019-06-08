package com.megalexa.hexadec.unitTest

import com.megalexa.hexadec.model.block.BlockYouTube
import org.junit.Test

import org.junit.Assert.*

/**
 * BlockText unit test
 *
 */
class BlockYoutubeTest {
    val blockTest = BlockYouTube("YouTube channel")
    @Test
    fun getNameBlockTest() {
        assertEquals("YOUTUBE", blockTest.getNameBlock())
    }

    @Test
    fun getConfigTest() {
        assertEquals("YouTube channel", blockTest.getConfig())
    }

    @Test
    fun setConfigTest() {
        blockTest.setConfig("MY YouTube channel")
        assertEquals("MY YouTube channel", blockTest.getConfig())
    }
}
