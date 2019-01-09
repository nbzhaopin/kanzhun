package com.qianfeng.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.AskMapper;
import com.qianfeng.dao.CommentMapper;
import com.qianfeng.pojo.Ask;
import com.qianfeng.service.AskService;
import com.qianfeng.vo.AskVo;
import com.qianfeng.vo.CommentVo;
import com.qianfeng.vo.ResultVo;
@Service
public class AskServiceImpl implements AskService{

	@Autowired
	private AskMapper askMapper;
	@Autowired
	private CommentMapper commentMapper;
	@Override
	public List<AskVo> findAll() {
		// TODO Auto-generated method stub
		List<AskVo> list = new ArrayList<AskVo>();
		List<Ask> asks = askMapper.findAll();
		for (Ask ask : asks) {
			if (ask.getState() == 1) {
				AskVo vo = new AskVo();
				vo.setType("精选");
				vo.setAsk(new ArrayList<Ask>());
				vo.getAsk().add(ask);
				list.add(vo);
			}else if(ask.getState() == 2) {
				AskVo vo = new AskVo();
				vo.setType("干货");
				vo.setAsk(new ArrayList<Ask>());
				vo.getAsk().add(ask);
				list.add(vo);
			}else if(ask.getState() == 3) {
				AskVo vo = new AskVo();
				vo.setType("狗血");
				vo.setAsk(new ArrayList<Ask>());
				vo.getAsk().add(ask);
				list.add(vo);
			}else if(ask.getState() == 2) {
				AskVo vo = new AskVo();
				vo.setType("唠嗑");
				vo.setAsk(new ArrayList<Ask>());
				vo.getAsk().add(ask);
				list.add(vo);
			}
		}
		return list;
	}

	@Override
	public ResultVo addAsk(Ask ask) {
		// TODO Auto-generated method stub
		if (askMapper.insertSelective(ask) > 0) {
			return ResultVo.setOK(null);
		}else {
			return ResultVo.setERROR();
		}
	}

	@Override
	public ResultVo updateAsk(Ask ask) {
		// TODO Auto-generated method stub
		return ResultVo.setOK(askMapper.updateByPrimaryKeySelective(ask));
	}

	@Override
	public ResultVo deleteAskById(Integer id) {
		// TODO Auto-generated method stub
		if (askMapper.deleteByPrimaryKey(id) > 0) {
			return ResultVo.setOK(null);
		}else {
			return ResultVo.setERROR();
		}
	}

	@Override
	public ResultVo askdetailById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CommentVo> findAnswerByAskId(Integer id) {
		// TODO Auto-generated method stub
		return commentMapper.findCommentByAskId(id);
	}

}
