public class PhysicsLab {
   public static void main(String[] args) {
      if (args.length != 3)  {
         System.out.println("usage: java PhysicsLab <delta_time[s]> <end_time[s]> <sampling_time[s]>");
         System.exit(-1);
      }

      double deltaTime = Double.parseDouble(args[0]);    // [s]
      double endTime = Double.parseDouble(args[1]);      // [s]
      double samplingTime = Double.parseDouble(args[2]); // [s]
      MyWorld world = new MyWorld(System.out);
      
      double mass1 = 1.0;      // [kg] 
      double mass2 = 1.0;      // [kg] 
      double mass3 = 1.0;      // [kg] 

      Vector2D position1 = new Vector2D(0.0,0.0);  // [m] 
      Vector2D position2 = new Vector2D(10.0,10.0);  // [m]
      Vector2D position3 = new Vector2D(4.0,5.0);  // [m]
      Vector2D speed1 = new Vector2D(1.2,1.5);     // [m/s]
      Vector2D speed2 = new Vector2D(-1.3,-0.9);     // [m/s]
      Vector2D speed3 = new Vector2D(1.3,1.2);     // [m/s]
      Vector2D upLeftPosition1=new Vector2D(0.0,10.0);
      Vector2D upLeftPosition2=new Vector2D(4.0,6.0);
	  Vector2D downRightPosition1=new Vector2D(10.0,0.0);	
      Vector2D downRightPosition2=new Vector2D(6.0,4.0);
      double radio1= 0.1;     // [m]
      double radio2= 0.1;     // [m]
      double radio3= 0.1;     // [m]
      Ball b1 = new Ball(mass1, radio1, position1, speed1, world);
      Ball b2 = new Ball(mass2, radio2, position2, speed2, world);
      Ball b3 = new Ball(mass3, radio3, position3, speed3, world);
      Container c1 = new Container(upLeftPosition1,downRightPosition1, world);
      Container c2 = new Container(upLeftPosition2,downRightPosition2, world);

      world.addElement(b1);
      world.addElement(b2);
      world.addElement(b3);
      world.addElement(c1);
      world.addElement(c2);
      world.simulate(deltaTime, endTime, samplingTime); // delta time[s], total simulation time [s].
      
   }
}
