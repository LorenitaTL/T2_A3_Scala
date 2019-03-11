import scala.io.StdIn._ 

object SustituirPalabra {
  val listaNombre = List("JUAN", "MARIO","JORGE", "JIMENA","JUAN", "NATALIA","JOSE", "CARLOS", "MONICA","LUIS","HUGO")
    
  def sustituirPalabra(): Unit ={
    val listaMutable = listaNombre.toBuffer
    println(listaMutable)
    println("Ingresa la palabra que deseas eliminar")
    val eliminar = readLine().toUpperCase()
    println("Ingresa la palabra que deseas agregar")
    val nueva = readLine().toUpperCase()
    
    for (y<-0 to listaMutable.length-1){ 
      if(listaMutable(y).equals(eliminar)){
      listaMutable.update(y, nueva)
      }
    }
    println(listaMutable)
  }
  
  def main(args: Array[String]): Unit = {
    sustituirPalabra()
  }
}