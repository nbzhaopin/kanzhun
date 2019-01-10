package com.qianfeng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.InterestpositionMapper;
import com.qianfeng.pojo.Interestposition;
import com.qianfeng.service.InterestPositionService;
import com.qianfeng.vo.ResultVo;

@Service
public class InterestPositionServiceImpl implements InterestPositionService{

	@Autowired
	private InterestpositionMapper interestpositionMapper;

	@Override
	public ResultVo addInterestPosition(Interestposition interestposition) {
		// TODO Auto-generated method stub
		if (interestpositionMapper.insertSelective(interestposition)>0) {
			return ResultVo.setOK("OK");
		}else {
			return ResultVo.setERROR();
		}
	}
	

}
