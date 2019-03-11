import scala.io.StdIn._ 

object EliminarPalabra {
  
  val listaNombre = List("JUAN", "MARIO","LUIS", "JIMENA","MARIA", "NATALIA","JOSE", "JUAN", "MONICA","LUIS","HUGO")
  
  def eliminarPalabra(): Unit ={
    println("Ingresa la palabra que deseas eliminar")
    val eliminar = readLine()
    val nuevaLista = listaNombre.filter(_!=eliminar)
    println(nuevaLista)
  }
  def main(args: Array[String]): Unit = {
    eliminarPalabra()
  }
}