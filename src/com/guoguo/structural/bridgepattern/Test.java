package com.guoguo.structural.bridgepattern;

import com.guoguo.structural.bridgepattern.normalimpl.AudionPlayer;

/**
 * @ClassName Test
 * @description 测试
 * @author MPED
 * @Date 2021/9/3 23:36
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new AudionPlayer();
        /**
         * 通过下面的方法能明显看出来桥接模式的弊端：我明明调用的是AudionPlay。但是内部根据文件类型，
         * 又选择了其他实现类，如果这种情况多的话，维护起来真的是头发一抓一大把。
         */
        mediaPlayer.play("mp3","欢喜中国年.mp3");
        mediaPlayer.play("mp4" ,"奥特曼打小怪兽.mp4");
        mediaPlayer.play("avi","变形金刚大战奥特曼.avi");
        mediaPlayer.play("svf","猫吃鱼狗吃肉奥特曼打小怪兽.svf");
    }
}
