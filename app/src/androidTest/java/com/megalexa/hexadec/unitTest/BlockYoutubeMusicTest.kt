package com.megalexa.hexadec.unitTest

import com.megalexa.hexadec.model.block.BlockYouTubeMusic
import org.junit.Test

import org.junit.Assert.*

/**
 * BlockText unit test
 *
 */
class BlockYoutubeMusicTest {
    val blockTest = BlockYouTubeMusic("YouTube music channel")
    @Test
    fun getNameBlockTest() {
        assertEquals("YOUTUBEMUSIC", blockTest.getNameBlock())
    }

    @Test
    fun getConfigTest() {
        assertEquals("YouTube music channel", blockTest.getConfig())
    }

    @Test
    fun setConfigTest() {
        blockTest.setConfig("MY YouTube music channel")
        assertEquals("MY YouTube music channel", blockTest.getConfig())
    }
}
