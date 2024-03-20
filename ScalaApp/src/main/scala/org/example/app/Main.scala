package org.example.app
import com.systemvi.engine.application.Game
import com.systemvi.engine.camera.Camera3
import com.systemvi.engine.renderers.ShapeRenderer
import com.systemvi.engine.ui.Scene
import com.systemvi.engine.ui.widgets.Container
import com.systemvi.engine.window.Window
import org.joml.Vector4f

object Main extends Game(3,3,60,800,600,"Test"):
  var renderer:ShapeRenderer=null
  var camera:Camera3=null
  override def setup(window: Window): Unit =
    camera=Camera3.builder2d()
      .size(window.getWidth,window.getHeight)
      .position(window.getWidth/2,window.getHeight/2)
      .scale(1,-1)
      .build()
    renderer=new ShapeRenderer()
    renderer.setView(camera.view)
    renderer.setProjection(camera.projection)
  override def loop(v: Float): Unit =
    renderer.rect(100,100,300,200,new Vector4f(0.3f,0.6f,0.9f,1.0f))
    renderer.flush()
  def main(args: Array[String]): Unit =
    run()

