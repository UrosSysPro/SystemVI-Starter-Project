package org.examples.app

import com.systemvi.engine.application.Game
import com.systemvi.engine.ui.Scene
import com.systemvi.engine.ui.utils.data.Colors
import com.systemvi.engine.ui.widgets.Container
import com.systemvi.engine.utils.Utils
import com.systemvi.engine.window.Window

class Main:Game(3,3,60,800,600,"Kotlin App"){
    var scene:Scene?=null
    override fun setup(window: Window?) {
        scene=Scene(
            Container(null,Colors.blue500(),null),
            window
        )
        setInputProcessor(scene)
    }
    override fun loop(delta: Float) {
        Utils.clear(0f,0f,0f,1f,Utils.Buffer.COLOR_BUFFER)

        scene?.draw()
    }
}
fun main(){
    Main().run()
}