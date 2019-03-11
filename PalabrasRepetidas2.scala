import scala.io.StdIn._ 
object PalabrasRepetidas2 {
  val listaNombre = List("JUAN", "MARIO","LUIS", "JIMENA","MARIA", "NATALIA","JOSE", "JUAN", "MONICA","HUGO")
  val listaNombre2 = List("JUAN", "JORGE","LUIS", "CAMILA","MARIA", "SUSANA","JOSE", "RICARDO", "MONICA","HUGO")
  
  
  val listaMutable = listaNombre.toBuffer
  val listaMutable2 = listaNombre2.toBuffer
  var c=0
  def eliminar():Unit={
  
   
    
    for (y<-0 to listaNombre.length-1){
      for (x<-0 to listaNombre2.length-1){
        if(listaNombre2(x)==listaNombre(y)){
         listaMutable.remove(x)
        }
      }
    }
    println(listaMutable)
  }
  
  def main(args: Array[String]): Unit = {
    
    eliminar()
    
  }
}