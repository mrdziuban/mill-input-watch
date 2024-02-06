import mill._
import mill.scalalib._

trait TestModule extends ScalaModule {
  def scalaVersion = "3.3.1"

  def generatedSources = T.input {
    val file = T.dest / "generated.scala"
    os.write(file, "package test\nobject generated", createFolders = true)
    super.generatedSources() :+ PathRef(file)
  }
}
object test extends TestModule
