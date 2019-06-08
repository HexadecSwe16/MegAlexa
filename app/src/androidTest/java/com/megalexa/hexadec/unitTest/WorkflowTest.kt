package com.megalexa.hexadec

import com.megalexa.hexadec.model.Workflow
import com.megalexa.hexadec.model.block.BlockInterface
import org.junit.Test

import org.junit.Assert.*

/**
 *  Test di unità per Workflow
 */
class WorkflowTest {
    private val constructorTest =  Workflow("WorkflowTest", "30/05/19",  "01/06/19",  1)

    @Test
    fun constructorTest() {
        assertEquals("welcome Text", constructorTest.getWelcomeText())
        assertEquals(0, constructorTest.getIdWorkflow())
        assertEquals(ArrayList<BlockInterface>(), constructorTest.getBlocks())

    }

    @Test
    fun getCreationDateTest() {
        assertEquals("30/05/19", constructorTest.getCreationDate())
    }

    @Test
    fun getLastModifyDateTest() {
        assertEquals("01/06/19", constructorTest.getLastModifyDate())
    }

    @Test
    fun getInteractionTest() {
        assertEquals(1, constructorTest.getInteraction())
    }

    @Test
    fun getWorkflowSizeTest() {
        assertEquals(0, constructorTest.getWorkflowSize())
    }

    @Test
    fun getWorkflowNameTest() {
        assertEquals("WorkflowTest", constructorTest.getWorkflowName())
    }
}
