package lectures.part1basics

object DefaultArgs extends App
{
  def trFact(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else trFact(n - 1, n * acc)

  val fact10 = trFact(10, 1)
  val fact20 = trFact(20)


  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("....")

  savePicture("jpg", 800, 600)
  //savePicture(800, 600) // Error
  savePicture()
  savePicture("bpm")
  savePicture(width = 800)
  savePicture(height = 600, format = "png", width = 800)
}
