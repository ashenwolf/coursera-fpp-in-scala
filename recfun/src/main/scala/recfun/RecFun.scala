package recfun

object RecFun extends RecFunInterface:

  def main(args: Array[String]): Unit =
    println("Pascal's Triangle")
    for row <- 0 to 10 do
      for col <- 0 to row do
        print(s"${pascal(col, row)} ")
      println()

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
    if c == 0 || c == r
    then 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean =
    def inner(chars: List[Char], total: Int): Boolean =
      if chars.isEmpty
      then total == 0
      else
          if total < 0
          then false
          else
            if chars.head == '('
            then inner(chars.tail, total + 1)
            else
              if chars.head == ')'
              then inner(chars.tail, total - 1)
              else inner(chars.tail, total)
    inner(chars, 0)

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int =
    def countByCoin(rest: Int, coins: List[Int]): Int =
      if coins.isEmpty || rest < 0 then 0
      else if rest == 0 then 1
      else
        countByCoin(rest - coins.head, coins) + countByCoin(rest, coins.tail)
    countByCoin(money, coins)
