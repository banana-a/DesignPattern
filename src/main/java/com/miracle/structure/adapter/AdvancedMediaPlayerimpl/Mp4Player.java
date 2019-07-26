package com.miracle.structure.adapter.AdvancedMediaPlayerimpl;

import com.miracle.structure.adapter.AdvancedMediaPlayer;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-24 22:26
 **/


public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}