package com.qianfeng.service;

import com.qianfeng.pojo.Message;
import com.qianfeng.vo.ResultVo;

public interface MessageService {
	
	public ResultVo findById(Integer id);
	
	public ResultVo addById(Message record, String grade);
}
