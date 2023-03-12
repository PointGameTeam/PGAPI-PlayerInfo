package io.xiaoyi311.pointgame.playerinfoapi;

/**
 * 玩家信息实体
 * @author Xiaoyi311
 */
public class PlayerInfo {
    /**
     * UUID
     */
    public String uuid;
    /**
     * 玩家名
     */
    public String name;
    /**
     * 国际化
     */
    public String lang;
    /**
     * Rank
     */
    public Rank rank;
    /**
     * 等级
     */
    public double lvl;
    /**
     * 玩家身份
     */
    public PlayerIdentity identity;
    /**
     * 社交平台
     */
    public Contact contact;

    /**
     * 实例化玩家信息
     *
     * @param uuid UUID
     * @param name 玩家名
     */
    public PlayerInfo(String uuid, String name){
        this.uuid = uuid;
        this.name = name;
        this.lang = "ZH_CN";
        this.rank = Rank.Default;
        this.lvl = 0;
        this.identity = PlayerIdentity.Player;
        this.contact = new Contact();
    }

    /**
     * 实例化玩家信息
     *
     * @param uuid UUID
     * @param name 玩家名
     */
    public PlayerInfo(String uuid, String name, String lang, Rank rank, int lvl, PlayerIdentity identity, Contact contact){
        this.uuid = uuid;
        this.name = name;
        this.lang = lang;
        this.rank = rank;
        this.lvl = (double)lvl / 100;
        this.identity = identity;
        this.contact = contact;
    }
}
