JFLAGS = -g
JC = javac
JVM= java  # Added by Agust�n Gonz�lez
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = Ball.java Container.java MyWorld.java PhysicsElement.java PhysicsLab.java Spring.java Vector2D.java

# main variable: Added by Agust�n Gonz�lez
MAIN = PhysicsLab

default: classes

classes: $(CLASSES:.java=.class)

# run tarjet added by Agust�n Gonz�lez
run: 
	$(JVM) $(MAIN)

clean:
	$(RM) *.class