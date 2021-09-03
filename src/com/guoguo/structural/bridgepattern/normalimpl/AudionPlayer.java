package com.guoguo.structural.bridgepattern.normalimpl;

import com.guoguo.structural.bridgepattern.MediaPlayer;
import com.guoguo.structural.bridgepattern.adapter.MediaAdapter;

/**
 * @ClassName AudionPlayer
 * @Description 使用适配器调用
 * @Author MPED
 * @Date 2021/9/3 23:26
 * @Version 1.0
 **/
public class AudionPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        if ("mp3".equalsIgnoreCase(audioType)){
            System.out.println("播放MP3：" + fileName);
        }else if ("avi".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)){

            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }else {
            System.out.println("Invalid media:" + audioType);
        }





    }
}
