package com.kdl.rf.modules.sys.controller;

import com.kdl.rf.common.controller.BaseController;
import com.kdl.rf.common.dto.R;
import com.kdl.rf.common.utils.ShiroKit;
import com.kdl.rf.modules.sys.entity.User;
import com.kdl.rf.modules.sys.service.IMenuService;
import com.kdl.rf.modules.sys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController extends BaseController {

    @Autowired
    private IMenuService menuService;

    @Autowired
    private IUserService userService;

    @GetMapping(value = "/")
    public ModelAndView index() {
        User user = userService.getById(ShiroKit.getUserId());
        return new ModelAndView("index").addObject("authUserInfo", user);
    }

    @GetMapping(value = "home")
    public ModelAndView home() {
        return new ModelAndView("home");
    }

    @GetMapping(value = "test")
    public ModelAndView test() {
        return new ModelAndView("test");
    }


    @GetMapping(value = "index/menus")
    public R menus() {
        return R.ok(menuService.listUserPermissionMenuWithSubByUserId(ShiroKit.getUserId()));
    }

    @GetMapping(value = "index/navMenus")
    public R navMenus() {
        return R.ok(menuService.listUserPermissionNavMenuByUserId(ShiroKit.getUserId()));
    }

}
