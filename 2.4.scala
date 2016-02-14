def uncurry[A,B,C](f: A => B => C): (A, B) => C = 
	(a,b) => f(a)(b)

// A => B => C 
// A => (B => C)
// are the same since => associates to the right

//You want to return a binary function, so start by taking two arguments. You will have to pass those arguments to `f` one at a time.

