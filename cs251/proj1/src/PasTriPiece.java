import java.lang.Thread;
/**
 * Created by Crystal on 9/5/2015.
 */
public class PasTriPiece extends Thread{
    private int r,c,value;
    private boolean isValueSet;
    private MonitorPasTri monitor;
    PasTriPiece(int r,int c,MonitorPasTri monitor){
       // System.out.println("Creating Thread: ("+r+","+c+")");
        this.r = r;
        this.c = c;
        this.monitor = monitor;
    }
    public boolean isValueSet(){
        return isValueSet;
    }
    public int getValue(){
       return value;
    }
    public void setValue(int value){
        this.value = value;
        isValueSet = true;
    }
    public void run(){
        monitor.getValue(r, c);
    }
    public String toString(){
        return Integer.toString(value);
    }
}