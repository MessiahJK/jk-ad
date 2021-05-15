package us.betahouse.ad.mysql.listener;

import us.betahouse.ad.mysql.dto.BinlogRowData;


public interface Ilistener {

    /**
     * 注册不同的监听器
     */
    void register();

    void onEvent(BinlogRowData eventData);
}
