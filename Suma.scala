import scala.collection.mutable.ListBuffer

object Suma {
  val numeros = ListBuffer(1,2,3,4,5,6,7,8,9,0)
  var suma = ListBuffer [Int]()
  
  def sum():Unit={
    
    suma += 1
    for(x<-0 to numeros.length){
      suma +=suma(x)+numeros(x+1)
      println(suma(x))
    }
    
  }
  
  def main(args: Array[String]): Unit = {
    sum()
  }
}