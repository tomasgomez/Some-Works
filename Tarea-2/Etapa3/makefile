JFLAGS = -g
JC = javac
JVM= java  # Added by Agust�n Gonz�lez
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = Ball.java BallView.java Receptacle.java ReceptacleView.java MyWorld.java MyWorldView.java PhysicsElement.java Simulateable.java PhysicsLab.java Spring.java SpringView.java WorldControlMenuListener.java EditMenuListener.java Vector2D.java Wall.java MouseListener.java

# main variable: Added by Agust�n Gonz�lez
MAIN = PhysicsLab

default: classes

classes: $(CLASSES:.java=.class)

# run tarjet added by Agust�n Gonz�lez
run: $(MAIN).class
	$(JVM) $(MAIN)

clean:
	$(RM) *.class