package com.megalexa.hexadec.unitTest

import com.megalexa.hexadec.model.block.BlockWeather
import org.junit.Test

import org.junit.Assert.*

/**
 * BlockText unit test
 *
 */
class BlockWeatherTest {
    val blockTest = BlockWeather("La mia città")
    @Test
    fun getNameBlockTest() {
        assertEquals("WEATHER", blockTest.getNameBlock())
    }

    @Test
    fun getConfigTest() {
        assertEquals("La mia città", blockTest.getConfig())
    }

    @Test
    fun setConfigTest() {
        blockTest.setConfig("MoltoMoltoLontano")
        assertEquals("MoltoMoltoLontano", blockTest.getConfig())
    }
}
