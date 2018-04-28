package com.hsx;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xing on 18/3/27.
 */
public class Server {

    private static ClassPathXmlApplicationContext context;

    /**
     * 启动服务
     * @throws InterruptedException
     */
    public void run() throws InterruptedException {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            // add hook here
        });

        context = new ClassPathXmlApplicationContext(new String[] {"classpath*:/spring-root.xml","classpath*:/application-service.xml"});
        context.start();
        System.out.println("service Server Start Ok!");

        while (true) {
            Thread.sleep(Long.MAX_VALUE);
        }
    }

    public static void main(String[] args){

        Server server = new Server();
        try{
            server.run();
        }catch (InterruptedException e){
        e.printStackTrace();
    }

}
}
