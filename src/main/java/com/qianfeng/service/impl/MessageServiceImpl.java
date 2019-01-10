package com.qianfeng.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.CompanyMapper;
import com.qianfeng.dao.MessageMapper;
import com.qianfeng.pojo.Company;
import com.qianfeng.pojo.Message;
import com.qianfeng.service.MessageService;
import com.qianfeng.vo.MessageVo;
import com.qianfeng.vo.ResultVo;

@Service
public class MessageServiceImpl implements MessageService {
	
	@Autowired
	private MessageMapper mmr;
	
	@Autowired
	private CompanyMapper cmr;
	
	@Override
	public ResultVo findById(Integer id) {
		// TODO Auto-generated method stub
		List<MessageVo> list;
		try {
			list = mmr.selectAllById(id);
			return ResultVo.setOK(list) ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return ResultVo.setERROR();
		}
		
	}

	@Override
	public ResultVo addById(Message record, String grade) {
		// TODO Auto-generated method stub
		Company coy = new Company();
		coy.setId(record.getCid());
		coy.setGrade(grade);
		cmr.updateByPrimaryKeySelective(coy);
		if (mmr.insertSelective(record) > 0) {
			return ResultVo.setOK(null);
		} else {
			return ResultVo.setERROR();
		}
		
	}

}
