package com.kdl.rf.modules.generator.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.kdl.rf.modules.generator.dto.TableColumnDTO;
import com.kdl.rf.modules.generator.dto.TableDTO;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@MapperScan
public interface ITableService {

    IPage<TableDTO> listTablePage(String tableName, int current, int size);

    List<TableColumnDTO> listTableColumn(String tableName);
}
