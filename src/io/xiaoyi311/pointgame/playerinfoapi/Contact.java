package io.xiaoyi311.pointgame.playerinfoapi;

import java.util.ArrayList;
import java.util.List;

/**
 * 社交平台
 * @author Xiaoyi311
 */
public class Contact {
    /**
     * B站<br><br>
     * 需注意屏蔽特殊字符："," ";"<br>
     * 出现会导致缓存系统错误
     */
    public String bilibili = "none";
    /**
     * QQ
     */
    public Long qq = 0L;
    /**
     * 微信<br><br>
     * 需注意屏蔽特殊字符："," ";"<br>
     * 出现会导致缓存系统错误
     */
    public String wechat = "none";

    /**
     * 初始化
     */
    public Contact(){}

    /**
     * 数据字符串转数据
     *
     * @param data 数据字符串
     */
    public Contact(String data){
        if(data == null) {
            return;
        }

        String[] datas = data.split(",");
        bilibili = datas[0];
        qq = Long.parseLong(datas[1]);
        wechat = datas[2];
    }

    /**
     * 生成数据字符串
     *
     * @return 数据字符串
     */
    public String getString() {
        List<String> data = new ArrayList<>();
        data.add(bilibili);
        data.add(qq.toString());
        data.add(wechat);

        StringBuilder result = new StringBuilder();
        int index = 0;
        for (Object com: data) {
            result.append(com.toString());
            if (index != data.size() - 1) {
                result.append(",");
            }
            index++;
        }

        return result.toString();
    }
}
