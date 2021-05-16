package us.betahouse.ad.sender;

import us.betahouse.ad.mysql.dto.MySqlRowData;

/**
 * 投递增量数据接口
 */
public interface ISender {

    /**
     * 增量数据接收
     * @param rowData 改变值
     */
    void sender(MySqlRowData rowData);
}

