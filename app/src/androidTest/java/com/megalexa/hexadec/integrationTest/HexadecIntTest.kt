package com.megalexa.hexadec.integrationTest

import com.megalexa.hexadec.model.HexaDec
import com.megalexa.hexadec.model.HexadecUser
import com.megalexa.hexadec.model.Workflow
import com.megalexa.hexadec.model.block.BlockText
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class HexadecIntTest {
    val user =  HexadecUser("nh37shj", "testName", "hexadec.swe@gmail.com")
    val workflow =  Workflow("WorkflowTest", "30/05/19",  "01/06/19",  1)
    val hexadex = HexaDec.getInstance()

    @Test
    fun addWorkflowTest() {
        val workflowList = ArrayList<Workflow>()
        workflowList.add(workflow)
        hexadex.addWorkflow(workflow)
        assertEquals(workflowList, hexadex.getWorkflowList())
    }

    @Test
    fun getUserTest() {
        hexadex.saveUser(user)
        assertEquals(user, hexadex.getUser())
    }

    @Test
    fun hexadecUserTest() {
        assertEquals(hexadex, HexaDec.getInstance())
    }
}
