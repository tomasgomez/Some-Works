JFLAGS = -g
JC = javac
JVM= java  # Added by Agust�n Gonz�lez
JDOC = javadoc -d SoftwareDentalDoc
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = SoftwareDental.java IngresoUsuarioListener.java IngresoUsuario_GUI.java 

# main variable: Added by Agust�n Gonz�lez
MAIN = SoftwareDental

default: classes

classes: $(CLASSES:.java=.class)

# run tarjet added by Agust�n Gonz�lez
run: $(MAIN).class
	$(JVM) $(MAIN)

clean:
	$(RM) *.class

doc:
	$(JDOC) *.java