

This package makes TetrisObject to be a KeyListener interface type.

1) TetrisObject needs to know if there is any activity happens with
   keyboard so that it can respond to it (for example, if it finds that
   a left-arrow key is pressed, it wants to shift to the left.)
   However, unfortunately, TetrisObject cannot sense any keyboard activity.
   So, it has to rely on an object that can sense the keyboard activity,
   which in our case is the 'JFrame". JFrame requires our objects to be
   KeyListener interface type. So, TetrisObject has to be a KeyListener 
   interface type.


2) The important thing we need to know about 'interfaces' is
   a. Any objects can be any interface type. They just need to
      declare that they 'implements' the interface.
   b. When the object wants to be an interface type, meaning
      wants to implements the interface, it needs to take in
      the abstract methods of the interface and 'implement' them 
      (meaning, complete the methods by providing the method bodies.)
      
3) Once, the TetrisObject becomes a KeyListener interface type,
   it can give its reference(address) to the JFrame.
   In Coordinator, 
   
   	TetrisObject tObj = new LShape(250, 100, Color.yellow);
   	board.getJFrame().addKeyListener(tObj);
      
