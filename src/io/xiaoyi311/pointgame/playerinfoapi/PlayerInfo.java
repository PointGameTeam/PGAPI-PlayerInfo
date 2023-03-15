package io.xiaoyi311.pointgame.playerinfoapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 玩家信息实体
 * @author Xiaoyi311
 */
public class PlayerInfo {
    /**
     * UUID
     */
    public final String uuid;
    /**
     * 玩家名
     */
    public final String name;
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
    public final Contact contact;

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

    /**
     * 实例化玩家信息
     *
     * @param list 数据列表
     */
    public PlayerInfo(String list){
        List<String> data = Arrays.asList(list.split(";"));
        this.uuid = data.get(0);
        this.name = data.get(1);
        this.lang = data.get(2);
        this.rank = Rank.valueOf(data.get(3));
        this.lvl = Double.parseDouble(data.get(4));
        this.identity = PlayerIdentity.valueOf(data.get(5));
        this.contact = new Contact(data.get(6));
    }

    /**
     * 获取数据
     */
    public String getString(){
        List<String> temp = new ArrayList<>();
        temp.add(uuid);
        temp.add(name);
        temp.add(lang);
        temp.add(rank.name());
        temp.add(String.valueOf(lvl));
        temp.add(identity.name());
        temp.add(contact.getString());

        StringBuilder result = new StringBuilder();
        int index = 0;
        for (Object com: temp) {
            result.append(com.toString());
            if (index != temp.size() - 1) {
                result.append(";");
            }
            index++;
        }

        return result.toString();
    }
}
