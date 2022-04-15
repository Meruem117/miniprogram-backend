package com.niit.share.service;

import com.niit.share.entity.Record;

import java.util.List;

public interface RecordService {
    List<Record> getAll();

    List<Record> getPages(Integer userId, String key);

    Integer addRecord(Record record);
}
