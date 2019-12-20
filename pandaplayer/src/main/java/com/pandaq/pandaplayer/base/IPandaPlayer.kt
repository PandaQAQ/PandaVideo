package com.pandaq.pandaplayer.base

import android.view.Surface
import tv.danmaku.ijk.media.player.IMediaPlayer

/**
 * Created by huxinyu on 2019/12/19.
 * Email : panda.h@foxmail.com
 * Description :播放器功能接口对象
 */
interface IPandaPlayer {

    fun initPlayer()

    /**
     * 链接快捷打开
     */
    fun setUp(url: String)

    /**
     * 设置播放进度
     */
    fun setSeek(seek: Long)

    /**
     * 设置播放 surface
     */
    fun setSurface(surface: Surface)

    /**
     * 暂停播放
     */
    fun pause()

    /**
     * 开始播放
     */
    fun start()

    /**
     * 停止播放
     */
    fun stop()

    /**
     * 释放播放内核资源
     */
    fun release()

    /**
     * 获取视频资源长度
     */
    fun getDuration()

    /**
     * 获取 ijkplayer 对象
     */
    fun getMediaPlayer(): IMediaPlayer?
}