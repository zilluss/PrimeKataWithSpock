package ziel

import java.lang.invoke.MethodHandleImpl.BindCaller.T

import spock.lang.*

class PrimeFactorTest extends Specification {

  def  "Correct primes are generated up to the given boundary"(){
    expect:
      PrimeFactors.generate(boundary) == expectedPrimes

    where:
      boundary | expectedPrimes
      2           | [2]
      3           | [2, 3]
      15          | [2, 3, 5, 7, 11, 13]
      100         | [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
  }

  def  "No primes are returned if the boundary is 0"(){
    expect:
      PrimeFactors.generate(boundary) == expectedPrimes

    where:
      boundary | expectedPrimes
      0        | []
  }

  def  "No primes are returned if the boundary is negative"(){
    expect:
      PrimeFactors.generate(boundary) == expectedPrimes

    where:
      boundary | expectedPrimes
      -4       | []
  }

  def  "No primes are returned if the boundary is 1"(){
    expect:
      PrimeFactors.generate(boundary) == expectedPrimes

    where:
      boundary | expectedPrimes
      1        | []
  }
}
