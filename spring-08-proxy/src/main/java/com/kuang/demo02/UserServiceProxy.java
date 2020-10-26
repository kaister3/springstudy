package com.kuang.demo02;

public class UserServiceProxy implements UserService{

    private  UserServiceImpl userService;

    public UserServiceImpl getUserService() {
        return userService;
    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        //System.out.println("使用了add方法");
        //这一句作为日志，如果重复写的话太麻烦
        log("add");
        userService.add();
    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }

    @Override
    public void query() {

    }

    //因此采用一个日志方法
    public void log(String msg) {
        System.out.println("使用了"+ msg +"方法");
    }
}
