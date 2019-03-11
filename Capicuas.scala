import scala.collection.mutable.ListBuffer

object Capicuas {
  val lista = List(452,323,211,242,67876,6116)
  var lista2 = ListBuffer[String]()
  
  def capicuas():Unit={
    
    for(x<-0 to lista.length-1){
      lista2 += lista(x).toString().reverse
      if(lista(x).toString()==lista2(x)){
        println(lista2(x))
      }
    }
  }
  
  def main(args: Array[String]): Unit = {
    capicuas()
  }
  
}
