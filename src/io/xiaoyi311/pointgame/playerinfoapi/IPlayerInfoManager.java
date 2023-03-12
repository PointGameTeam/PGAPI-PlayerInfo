package io.xiaoyi311.pointgame.playerinfoapi;

/**
 * API 接口
 * @author Xiaoyi311
 */
public interface IPlayerInfoManager {
    /**
     * 获取玩家信息
     *
     * @param uuid UUID
     * @return     玩家信息
     */
    PlayerInfo getPlayerInfo(String uuid);

    /**
     * 升级玩家等级
     *
     * @param uuid UUID
     * @param lvl  等级
     */
    void addLvL(String uuid, double lvl);

    /**
     * 设置玩家信息
     *
     * @param info 信息
     */
    void setPlayerInfo(PlayerInfo info);
}
