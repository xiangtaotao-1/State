package State;

public class BlockedState extends ThreadState{
    public BlockedState(){
        state=StateSet.BLOCKED;
        System.out.println("阻塞线程");
    }
    public void resume(ThreadContext tc){
        System.out.println("调用resume方法");
        if (state==StateSet.BLOCKED)
            tc.setThreadState(new RunnableState());
        else System.out.println("当前线程不是阻塞状态");
    }
}
