import sun.awt.SunToolkit;

import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SoureceTicket {
    /*
    定义实列变量和方法
    高内聚变量和方法
     */
    //票的张数
    private int number = 30;

    //list list = new ArrayList();
    //卖票的方法(重锁粒度不好)
//    public synchronized  void sale(){
//
//    }
    //卖票的方法（lock）
    /*
    api中
    lock 1= 。。。。；
    1.lock（）；
    try{
    }finally{
    1.unlock();
    }

    lock interface 的实现类
    Reen。。。可重复
        */
    /*
    可重复锁
     */
    Lock lock = new ReentrantLock();
    public void sale(){
        lock.lock();
        try {

            if(number > 0){
                //多线程编程中打印线程的id和name
                System.out.println(Thread.currentThread().getName()+"\t卖出第"+number--+"张票"+"还剩下" + number);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
