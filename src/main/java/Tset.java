import sun.security.krb5.internal.Ticket;

public class Tset {
    /*
    题目：三个人卖三十张票
    前提：高内聚低耦合
    1.线程   操作    资源类

        1.1创建一个资源类
     */
    /*
    主线程一切资源的入口
     */
    public static void main(String[] args) {
        /*
        四个线程 t1，t2，t3，main
         */

        SoureceTicket Ticket = new SoureceTicket();

        //api:Thread(Runnable target,String name)allocates a new Thread Object
        /*
        特殊的
        New（创建）
        Runnable（运行）
        Blocked（阻塞）
        WAITTING
        TIMED_WAITTING(超时)

         */

        //售票一
        /*
        new Thread(new Runnable){
        }
         */
        new Thread(()->{for(int i = 1 ; i <= 30 ; i++) Ticket.sale();},"A").start();
        //售票二
        new Thread(()->{for(int i = 1 ; i <= 30 ; i++) Ticket.sale();},"B").start();
        //售票三
        new Thread(()->{for(int i = 1 ; i <= 30 ; i++) Ticket.sale();},"C").start();
    }
}
