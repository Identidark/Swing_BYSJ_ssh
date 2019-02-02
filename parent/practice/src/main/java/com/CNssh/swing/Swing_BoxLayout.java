package com.CNssh.swing;

import javax.swing.*;

/**
 * @program: parent
 * @description: 箱式布局
 * @author: CN_ssh
 * @create: 2019-02-02 10:27
 **/

public class Swing_BoxLayout {
    public static void main(String args[]){
        //设置窗口
        JFrame jf = new JFrame("测试窗口");
        //设置关闭
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //初始化按钮
        JButton btn01 = new JButton("Button01");
        JButton btn02 = new JButton("Button02");
        JButton btn03 = new JButton("Button03");
        JButton btn04 = new JButton("Button04");
        JButton btn05 = new JButton("Button05");

        //创建第一个水平箱容器
        Box hBox01 = Box.createHorizontalBox();
        hBox01.add(btn01);
        hBox01.add(btn02);
        hBox01.add(btn03);

        //创建第二水平箱容器
        Box hBox02 = Box.createHorizontalBox();
        hBox02.add(btn04);
        hBox02.add(Box.createHorizontalGlue());         //添加一个水平方向胶状的不可见组件，撑满剩余水平空间
        hBox02.add(btn05);

        //创建一个垂直箱容器，防止上面两个水平箱(Box组合嵌套)
        Box vBox = Box.createVerticalBox();
        vBox.add(hBox01);
        vBox.add(hBox02);

        //把垂直箱容器作为内容面板设置到窗口
        jf.setContentPane(vBox);

        //调整此窗口的大小，以适合其子组件的首选大小和布局
        jf.pack();
        //设置窗口相对于指定组件的位置,如果组件当前未显示或者 c 为 null，则此窗口将置于屏幕的中央
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
}
