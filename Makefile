run:
	@clear
	@javac -cp bin -d bin src/*.java
	@java -cp bin StartupBust

test:
	@clear
	@javac -cp bin -d bin src/*.java
	@java -cp bin StartupTestDrive