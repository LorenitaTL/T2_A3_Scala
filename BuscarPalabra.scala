import scala.io.StdIn._ 

object BuscarPalabra {
  val listaNombre = List("JUAN", "MARIO","LUIS", "JIMENA","MARIA", "NATALIA","JOSE", "JUAN", "MONICA","LUIS","HUGO")
  
  
  def buscarPalabra():Unit={
    
    println("Ingresa la palabra qque deseas buscar")
    val palabra = readLine()
    palabra.toUpperCase()
    val repeticion = listaNombre.filter(e => e.equals(palabra))
    println("La palabra aparece: "+repeticion.size+" veces")
  }
  
  
  
  def main(args: Array[String]): Unit = {
    buscarPalabra()
  }
}