package com.pandaq.pandaplayer

import com.pandaq.pandaplayer.base.IPandaPlayer
import com.pandaq.pandaplayer.exo.ExoCorePlayer
import com.pandaq.pandaplayer.ijkplayer.IjkCorePlayer
import com.pandaq.pandaplayer.system.SystemCorePlayer

/**
 * Created by huxinyu on 2019/12/19.
 * Email : panda.h@foxmail.com
 * Description :播放器入口
 */
class PandaVideoPlayer {

    /**
     * 获取播放器，默认为 ijkplayer 播放器
     *
     * @param coreType 指定默认播放器内核
     */
    fun getPlayer(coreType: PlayerCore = PlayerCore.IJK): IPandaPlayer {
        return when (coreType) {

            PlayerCore.IJK -> {
                IjkCorePlayer()
            }

            PlayerCore.EXO -> {
                ExoCorePlayer()
            }

            PlayerCore.SYSTEM -> {
                SystemCorePlayer()
            }

        }
    }

}