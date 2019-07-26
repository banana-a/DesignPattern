package com.miracle.structure.adapter.AdvancedMediaPlayerimpl;

import com.miracle.structure.adapter.AdvancedMediaPlayer;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-24 22:25
 **/


public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}