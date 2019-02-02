package com.CNssh.swing;

import javax.swing.*;

/**
 * @program: parent
 * @description: Swing练习
 * @author: CN_ssh
 * @create: 2019-02-02 09:40
 **/

public class Swing_EZAccidence {
    public static void main(String args[]){
        //创建一个顶层容器窗口
        JFrame jf = new JFrame("测试窗口");             //创建窗口
        jf.setSize(250, 250);                  //设置窗口大小
        jf.setLocationRelativeTo(null);                     //把窗口位置设置到屏幕中间
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);         //当点击窗口的关闭按钮时退出程序(必要)

        //创建中间容器（面板容器）
        JPanel panel = new JPanel();                //使用默认布局管理器创建面版容器

        //创建一个基本组件（按钮），并添加到面板容器中
        JButton btn = new JButton("测试按钮");
        panel.add(btn);

        //将 面板容器 作为窗口的内容面板设置到窗口
        jf.setContentPane(panel);

        //显示窗口，前面创建的信息都在内存中，通过jf.setVisible(true)把内存汇总的窗口显示在屏幕上
        jf.setVisible(true);
    }
}
