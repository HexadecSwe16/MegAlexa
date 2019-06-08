package com.megalexa.hexadec.unitTest

import com.megalexa.hexadec.model.block.BLockTelegram
import org.junit.Test

import org.junit.Assert.*

/**
 * BlockText unit test
 *
 */
class BlockTelegramTest {
    val blockTest = BLockTelegram("Telegram configuration")
    @Test
    fun getNameBlockTest() {
        assertEquals("TELEGRAM", blockTest.getNameBlock())
    }

    @Test
    fun getConfigTest() {
        assertEquals("Telegram configuration", blockTest.getConfig())
    }

    @Test
    fun setConfigTest() {
        blockTest.setConfig("Telegram config new")
        assertEquals("Telegram config new", blockTest.getConfig())
    }
}
