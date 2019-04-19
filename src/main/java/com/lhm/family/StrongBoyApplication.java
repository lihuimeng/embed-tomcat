package com.lhm.family;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;

/**
 * created by huimeng.li on 2019/4/19 17:50
 * description:
 **/
public class StrongBoyApplication {

    public static void main(String[] args) throws ServletException, LifecycleException {
        Tomcat tomcat = new Tomcat();
        //获取用户工作目录
        String userDir = System.getProperty("user.dir");
        tomcat.addWebapp("", userDir+"/src/main/webapp");
        tomcat.start();
        tomcat.getServer().await();

    }
    
}
