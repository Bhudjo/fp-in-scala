def fib(n:Int) : Int = {
	@annotation.tailrec
	def go(cicli:Int, n1:Int, n2:Int): Int = {
		if(cicli == 1) n2
		else {
			go(cicli-1, n2, n1+n2 )
		}
	}
	go(n,0,1)
}
