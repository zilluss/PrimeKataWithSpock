package ziel

class PrimeFactors {
  def static generate(int boundary){
    if(noPrimesCanBeCalculatedBecauseOfATooLow(boundary))
      return anEmptyList()
    else
      return allPrimesFromTwoTo(boundary)
  }

  def static noPrimesCanBeCalculatedBecauseOfATooLow(int boundary){
    boundary < 2
  }

  def static anEmptyList(){
    []
  }

  def static allPrimesFromTwoTo(int boundary){
    def listOfFoundPrimes = []
    for(ifNumberIsAPrime in 2 .. boundary){
      addNumberTo(listOfFoundPrimes, ifNumberIsAPrime)
    }
    return listOfFoundPrimes
  }

  def static addNumberTo(listOfFoundPrimes, number){
    if(listOfFoundPrimes.every{ byPreviouslyFoundPrime-> cannotDivide(number, byPreviouslyFoundPrime)}){
      listOfFoundPrimes.add(number)
    }
  }

  def static cannotDivide(number, prime){
    number % prime != 0
  }
}
