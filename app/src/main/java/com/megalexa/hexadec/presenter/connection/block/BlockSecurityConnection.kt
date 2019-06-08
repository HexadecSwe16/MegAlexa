package com.megalexa.hexadec.presenter.connection.block

import com.megalexa.hexadec.model.block.BlockSecurity
import com.megalexa.hexadec.model.block.BlockText
import com.megalexa.hexadec.presenter.BlockConnection
import org.json.JSONObject

object BlockSecurityConnection: BlockConnection() {

    override fun convertFromJSON(jsonObject: JSONObject): BlockSecurity {
        return BlockSecurity(jsonObject.getJSONObject("config").getString("TEXT"))
    }

    override fun <BlockSecurity> convertToJSON(t: BlockSecurity): JSONObject {
        val pinBLock = t as com.megalexa.hexadec.model.block.BlockSecurity
        val allBlock = JSONObject()
        allBlock.put("PIN", pinBLock.getConfig())
        return allBlock
    }
    override val resource: String
        get() = "blocks/security"
}