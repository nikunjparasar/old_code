

This package prepares the design of TetrisObject and Block.
Notice the followings in the design:

1) TetrisObject is made of several Blocks.
   It will use a data structure (array) to hold references of
   blocks it own. 

2) It needs to move down, shift left, shift right, rotate, etc.
   It will need to keep track of its coordinate values (x, y).
   
3) It should be able to draw on the screen.



Relationship between TetrisObject and Blocks:

1) TetrisObject designates one of its blocks to be the 'center-block'.
   Then, it makes all other block object to know their relative position
   to the center-block. Blocks uses fields, xRel and yRel, to know
   its relative position. The one with (0,0) will be the center block.
   The one with (1, 0) will be the one one block to the right of the center block.
   The one with (2, 0) will be the one two blocks to the right of the center block.
   The one with (-1, 0) will be the one one block to the left of the center block.
   The one with (0, -1) will be the one one block above the center block.

2) When TetrisObject needs all its blocks to calculate their coordinate values (x, y),
   it will call the updateBlocks() method. It will make all blocks to update their
   positions. Since each block knows its relative position and block size, they
   should be able to calculate their coordinate values.


Inheritance relations of TetrisObject:

We decided to make the 'TetrisObject' to be an abstract class. As the top class of
TetrisObject family, it knows it should be able to do the following things:

1) form tetris shape
2) move down
3) respond to keys (shify left, right, and rotate)
4) draw on screen

However, TetrisObject itself is too vague (too generalized) to KNOW how to
form the shape. So, it keeps the formaShape() method as incomplete (abstract).
As its subclasses get more specialized, they actually know exactly what shapes
they are and therefore knows how to formShape().