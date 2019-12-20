package com.pandaq.pandaplayer.base

/**
 * Created by huxinyu on 2019/12/19.
 * Email : panda.h@foxmail.com
 * Description :播放资源对象
 */
interface IVideo {

    fun videoUrl(): String

    fun title(): String

    fun cover(): String

}