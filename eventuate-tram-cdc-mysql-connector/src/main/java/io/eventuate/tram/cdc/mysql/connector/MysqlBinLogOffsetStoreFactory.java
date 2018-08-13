package io.eventuate.tram.cdc.mysql.connector;

import io.eventuate.local.db.log.common.OffsetStore;
import io.eventuate.local.unified.cdc.properties.MySqlBinlogCdcPipelineProperties;

public interface MysqlBinLogOffsetStoreFactory {
  OffsetStore create(MySqlBinlogCdcPipelineProperties mySqlBinlogCdcPipelineProperties);
}
