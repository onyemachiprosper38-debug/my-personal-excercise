# 1. Compile with the JAR on the classpath
javac -cp .:junit-platform-console-standalone-1.13.4.jar RandomNumbersTest.java

# 2. Run using the 'execute' subcommand and explicit class selection
java -jar junit-platform-console-standalone-1.13.4.jar execute --class-path . --select-class TestClass --details=verbose




import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

