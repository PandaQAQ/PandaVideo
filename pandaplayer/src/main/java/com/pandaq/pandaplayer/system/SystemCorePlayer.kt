package com.pandaq.pandaplayer.system

import android.view.Surface
import com.pandaq.pandaplayer.base.IPandaPlayer
import tv.danmaku.ijk.media.player.AndroidMediaPlayer

/**
 * Created by huxinyu on 2019/12/20.
 * Email : panda.h@foxmail.com
 * Description :Android 系统内核播放器
 */
class SystemCorePlayer : IPandaPlayer {

    private var androidPlayer: AndroidMediaPlayer? = null

    override fun initPlayer() {
        if (androidPlayer==null){

        }
    }

    override fun setUp(url: String) {

    }

    override fun setSeek(seek: Long) {

    }

    override fun setSurface(surface: Surface) {

    }

    override fun pause() {

    }

    override fun start() {

    }

    override fun stop() {

    }

    override fun release() {

    }

    override fun getDuration() {

    }
}