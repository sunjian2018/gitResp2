package com.sj.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunjian3 on  2021/9/5.
 */
public class User {
    //region Description
    private String usrename;
    private String password;

    public String getUsrename() {
        return usrename;
    }

    public void setUsrename(String usrename) {
        this.usrename = usrename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //endregion
    public static void main(String[] args) {
        User user = new User();
        List<User> users = new ArrayList<User>();
        try {
            if (true) {
                //            user.getPassword.ver + Tab
                String password = user.getPassword();
                //            users.for + Tab
                for (User user2 : users) {

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

/*
        窗口快捷键
        代码编辑快捷键
        +return
        ⌘ ⌥ ⇧ ⌃ Enter  option command shift

        control+Enter command+N
        command+opton+T 包裹

        command+F12
        command+E   最近的文件
        command+shift+E 最近更改的文件
        command+O
        control+H   打开类层次窗口
        shift+ESC   隐藏工具窗口，回到编辑器

        commond+F7
        control+F7
        shift+shift
        commond+B/点击    进入类或方法的定义
        commond+option+B/点击    进入类或方法的实现

        command+G
        command+L   查找行



        command+F   查找
        command+shift+F 全工程查找
        command+R   替换
        command+shift+R
        command+N
        command+shift+N
        command+/   注释
        command+shift+/ 块注释
        command+-/= 折叠
        command+shift+-/=   全部折叠

        command+D
        command+C
        command+X
        command+V
        command+shift+V 打开剪贴板


        command+[/]
        command+Left/Right  行首
        command+shift+Left/Right  上次浏览位置
        option+Left/Right   词首
        option+Dackspace    按词删除

        command+shift+Up/Down 块上移一行
        option+shift+Up/Down 行上移一行

        command+1   隐藏工程目录
        option+Enter    导入包、快速修复
        shift+Enter 插入到下方一行
        command+Enter   下方加一行
        command+shift+Enter 补全


        command+option+T    包裹
        command+option+J    动态模板环绕
        command+option+O    导入优化
        command+option+L    格式化代码
        command+option+I    自动缩进

        command+J   查看所有代码模板
        command+shift+Enter


        command+shift+option+N
        command+shift+option+T


        control+shift+数字 添加书签
        control+数字 添加书签






*/

    }
}
