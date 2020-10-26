package com.kuang.demo01;

public class Proxy implements Rent{

    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        sign();;
        fare();
    }

    //看房

    public void seeHouse() {
        System.out.println("中介带你看房!");
    }

    public void fare() {
        System.out.println("收费");
    }

    public void sign() {
        System.out.println("签合同");
    }
}
