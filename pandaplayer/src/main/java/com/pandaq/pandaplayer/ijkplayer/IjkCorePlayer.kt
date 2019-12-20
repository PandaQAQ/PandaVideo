package com.pandaq.pandaplayer.ijkplayer

import android.view.Surface
import com.pandaq.pandaplayer.base.IPandaPlayer
import tv.danmaku.ijk.media.player.IMediaPlayer
import tv.danmaku.ijk.media.player.IjkMediaPlayer

/**
 * Created by huxinyu on 2019/12/20.
 * Email : panda.h@foxmail.com
 * Description :ijkplayer 播放内核管理器
 */
class IjkCorePlayer : IPandaPlayer {

    private var ijkMediaPlayer: IjkMediaPlayer? = null

    override fun initPlayer() {
        if (ijkMediaPlayer == null) {
            ijkMediaPlayer = IjkMediaPlayer()
        } else {
            ijkMediaPlayer?.reset()
        }
        ijkMediaPlayer?.let {
            // 清除 dns 缓存
            it.setOption(IjkMediaPlayer.OPT_CATEGORY_FORMAT, "dns_cache_clear", 1)
            // 开启硬解码
            it.setOption(IjkMediaPlayer.OPT_CATEGORY_PLAYER, "mediacodec", 1)
            it.setOption(IjkMediaPlayer.OPT_CATEGORY_PLAYER, "mediacodec-auto-rotate", 1)
            it.setOption(
                IjkMediaPlayer.OPT_CATEGORY_PLAYER,
                "mediacodec-handle-resolution-change",
                1
            )
            // 设置最大探测时间
            it.setOption(IjkMediaPlayer.OPT_CATEGORY_FORMAT, "analyzemaxduration", 100L)
            // 设置播放前探测时间，设置为 1 达到秒开效果
            it.setOption(IjkMediaPlayer.OPT_CATEGORY_FORMAT, "analyzeduration", 1)
            // 设置缓冲区大小
            it.setOption(IjkMediaPlayer.OPT_CATEGORY_FORMAT, "probesize", 1024 * 10)
            // 设置重连次数
            it.setOption(IjkMediaPlayer.OPT_CATEGORY_PLAYER, "reconnect", 5)
            // 允许拖动进度条
            it.setOption(IjkMediaPlayer.OPT_CATEGORY_PLAYER, "enable-accurate-seek", 1)
            // 设置允许跳帧，保持画音同步
            it.setOption(IjkMediaPlayer.OPT_CATEGORY_PLAYER, "framedrop", 5)
        }
    }

    override fun setUp(url: String) {
        // 先停止之前的播放,重置播放器
        ijkMediaPlayer?.stop()
        initPlayer()
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

    override fun getMediaPlayer(): IMediaPlayer? {
        return ijkMediaPlayer
    }
}