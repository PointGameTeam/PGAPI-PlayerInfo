package io.xiaoyi311.pointgame.playerinfoapi;

/**
 * 玩家身份
 * @author Xiaoyi311
 */
public enum PlayerIdentity {
    /**
     * 封禁玩家
     */
    BAN,
    /**
     * 禁言
     */
    MUTE,
    /**
     * 普通玩家
     */
    Player,
    /**
     * 认证主播
     */
    UP,
    /**
     * 管理员
     */
    OP,
    /**
     * 巡逻
     */
    Patrol,
    /**
     * 服主
     */
    ServerHost,
}
