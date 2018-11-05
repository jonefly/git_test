package cn.itheima.git;

import java.util.UUID;

public class GitTestDemo {
    public static void main(String[] args) {
        System.out.println("git测试代码1");
        System.out.println("git测试代码2");
        System.out.println("git测试代码3");
        System.out.println("git测试代码4");
        System.out.println("git测试代码5");
        getAddress();
        System.out.println(getAddress());
        System.out.println("clone后的项目"+getAddress());
    }

    private static  String   getAddress(){
        return UUID.randomUUID().toString();
    }

}
