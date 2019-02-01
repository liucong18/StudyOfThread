package callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Boolean> {
    @Override
    public Boolean call() throws Exception {
        for(int i = 0; i < 10; i++) {
            System.out.println("吃着火锅3");
        }
        return true;
    }
}
