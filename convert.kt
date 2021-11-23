fun main() {
   do {
      menu()
      when (Integer.valueOf(readLine())) {
          1 -> {
             println("How much meters do you want convert?")
             val meter:Int= Integer.valueOf(readLine())
             meterConversion(meter.toFloat())
          }
          2 -> {
             println("How much centimeters do you want convert?")
             val centimeters:Int= Integer.valueOf(readLine())
             centimeterConversion(centimeters.toFloat())
          }
          3 -> {
             println("How much milliters do you want convert?")
             val milliters:Int= Integer.valueOf(readLine())

             milliterConversion(milliters.toFloat())
          }
         4->{
            println("How much liters do you want convert?")
            val liters:Int= Integer.valueOf(readLine())
            literConversion(liters.toFloat())
         }
      }

      println("Do you exit or want convert new value? type it 'exit' or 'continue'")
      val exit = readLine()
      if (exit == "exit")
         println(" The program closed!!!")
   }while (exit != "exit")
}

   fun meterConversion(meter: Float) {
      val centimeters: Float = meter * 100
      println("The amount of centimeters in $meter m are is $centimeters cm")

      }

   fun centimeterConversion(centimeters: Float) {
      val meter: Float = centimeters / 100f
      println("The amount of meters in $centimeters cm are iws $meter m")

      }
   fun milliterConversion(milliter: Float){
      val liter: Float= milliter/1000f
      println("The amount of milliter in $milliter ml are iws $liter l")
   }

   fun literConversion(liter: Float){
      val milliter: Float= liter*1000
      println("The amount of milliter in $liter l are iws $milliter ml")
   }
   fun menu(){
      println("-----------------------------------------\n"
              +"\nWhat do you want to do?" +
              "\n1-Convert meter for centimeter" +
              "\n2-Convert centimeter for meter" +
              "\n3-Convert milliter for liter" +
              "\n4-Convert liter for milliter" +
              "\nEnter the correspondent value\n\n" +
              "-----------------------------------------")
   }