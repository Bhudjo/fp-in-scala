def isSorted[A] (as: Array[A], ordered: (A,A) => Boolean): Boolean = {
	@annotation.tailrec
	def loop(idx: Int, ordered: (A,A) => Boolean): Boolean = {
		if(idx+1 >= as.length) true
		else{
			if(ordered(as(idx),as(idx+1)))
				loop(idx+1,ordered)
			else false
		}
	}	
	loop(0, ordered)
}

def ordered(a:Int, b:Int): Boolean = {
	return a < b
}
