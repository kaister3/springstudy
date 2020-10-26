package com.kuang.demo01;

public class Client {
    public static void main(String[] args) {
        //房东要租房
        Host host = new Host();
        //中介代理房东租房子，会有一些附属操作
        Proxy proxy = new Proxy(host);
        //你不用面对房东，直接找中介即可
        proxy.rent();
    }
}
