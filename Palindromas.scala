import scala.collection.mutable.ListBuffer

object Palindromas {
  val lista = List("ala","cama", "oro","rosa", "oso")
  var lista2 = ListBuffer[String]()
  
  def palindromas():Unit={
    
    for(x<-0 to lista.length-1){
      lista2 += lista(x).reverse
      if(lista(x)==lista2(x)){
        println(lista2(x))
      }
    }
  }
  
  def main(args: Array[String]): Unit = {
    palindromas()
  }
  
}
