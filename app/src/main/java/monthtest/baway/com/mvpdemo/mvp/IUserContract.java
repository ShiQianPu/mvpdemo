package monthtest.baway.com.mvpdemo.mvp;

import android.content.Context;

import java.util.Map;

import monthtest.baway.com.mvpdemo.bean.User;

public interface IUserContract {
    //用户
    public interface IUserView{
        //注册成功
        void registSuccess(String result);

        //注册失败
        void registError();

        //登录成功
        void loginSuccess(String result);

        //登录失败
        void loginError();
    }
    //model
    public interface IUserModel{

    }
    //presenter
    public interface IUserPresenter{
        // 绑定view
        void attch(IUserView view);
        //解绑 释放内存
        void detach();
        //注册业务逻辑
        void regist(User user);
        //登录业务逻辑
        void login(User user);
        User inputToUser(String phone,String pwd);
        //跳转到主页面
        void toMain(Context context);
    }
}
