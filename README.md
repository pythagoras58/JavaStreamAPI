# JavaStreamAPI
Functional Programming


the Stream API is used to process collections
of objects. A stream is a sequence of objects
that supports various methods which can be
pipelined to produce the desired result.
  It is very similar to build().perform() 
  method in Actions class. It is chaining
  some operations in an order.

The features of Java stream are:
- A stream is not a data structure instead
it takes input from the Collections, 
Arrays or I/O channels.
- Streams don’t change the original data
structure, they only provide the result
as per the pipelined methods.
- Each intermediate operation is lazily
executed and returns a stream as a result,
hence various intermediate operations
can be pipelined. Terminal operations mark
the end of the stream and return the result.
