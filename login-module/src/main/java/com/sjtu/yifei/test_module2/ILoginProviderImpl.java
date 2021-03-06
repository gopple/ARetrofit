package com.sjtu.yifei.test_module2;

import android.app.Application;

import com.sjtu.yifei.annotation.Route;
import com.sjtu.yifei.route.ILoginProvider;
import com.sjtu.yifei.route.RouteService;
import com.sjtu.yifei.route.Routerfit;

/**
 * 类描述：
 * 创建人：yifei
 * 创建时间：2018/5/24
 * 修改人：
 * 修改时间：
 * 修改备注：
 */

@Route(path = "/login-module/ILoginProviderImpl")
public class ILoginProviderImpl implements ILoginProvider {

    private String para1;
    private int para2;
    private Application application;

    public ILoginProviderImpl(String para1, int para2, Application application) {
        this.para1 = para1;
        this.para2 = para2;
        this.application = application;
    }

    @Override
    public String login() {
        Routerfit.register(RouteService.class).launchLoginActivity(null);
        return "ILoginProviderImpl para1:" + para1 + ",para2:" + para2 + ",application:" + application.getPackageCodePath();
    }
}
