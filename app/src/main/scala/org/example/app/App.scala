package org.example.app
import com.systemvi.engine.application.Game
import com.systemvi.engine.renderers.ShapeRenderer
import com.systemvi.engine.window.Window
object App extends Game(3,3,60,800,600,"Test"):
  var renderer:ShapeRenderer=null
  override def setup(window: Window): Unit =
    renderer=new ShapeRenderer()
  override def loop(v: Float): Unit = {}
  def main(args: Array[String]): Unit =
    run()

