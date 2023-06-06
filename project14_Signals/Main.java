package project1;
import java.util.concurrent.*;

public class Main {
public static void main(String[] args) {
ExecutorService signals1=Executors.newSingleThreadExecutor();
for(int i=0;i<3;i++) {
	signals1.execute(new Signal1());
}
signals1.shutdown();

ExecutorService signals2=Executors.newSingleThreadExecutor();
for(int i=0;i<3;i++) {
	signals2.execute(new Signal2());
}
signals2.shutdown();


ExecutorService signals3=Executors.newSingleThreadExecutor();
for(int i=0;i<3;i++) {
	signals3.execute(new Signal3());
}
signals3.shutdown();
}
}
