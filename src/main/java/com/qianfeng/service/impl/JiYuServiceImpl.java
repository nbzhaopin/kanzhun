/**
 * 
 */
package com.qianfeng.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.dao.AreaMapper;
import com.qianfeng.dao.EmployInfoMapper;
import com.qianfeng.dao.JobDetailsMapper;
import com.qianfeng.dao.JobGangWeiMapper;
import com.qianfeng.dao.MyfrindsMapper;
import com.qianfeng.pojo.Area;
import com.qianfeng.pojo.EmployInfo;
import com.qianfeng.pojo.JobGangWei;
import com.qianfeng.pojo.Myfrinds;
import com.qianfeng.vo.ResultVo;

/** 
* @ClassName: JiYuService 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author wei 
* @date 2019年1月8日 下午10:25:07 
*  
*/
@Service
public class JiYuServiceImpl implements com.qianfeng.service.JiYuService {
	@Autowired
	MyfrindsMapper friendDao;
	
	@Autowired
	EmployInfoMapper empDao;
	
	@Autowired
	JobDetailsMapper jobDao;
	
	@Autowired
	AreaMapper areaDao;
	
	@Autowired
	JobGangWeiMapper jobgDao;
	
	/* (non-Javadoc)
	 * @see com.qianfeng.service.JiYuService#findFriends()
	 */
	@Override
	public ResultVo findFriends() {
		// TODO Auto-generated method stub
		return ResultVo.setOK(friendDao.findbyFlag(1));
		
	}

	/* (non-Javadoc)
	 * @see com.qianfeng.service.JiYuService#findTuiJianFriends()
	 */
	@Override
	public ResultVo findTuiJianFriends() {
		// TODO Auto-generated method stub
		return ResultVo.setOK(friendDao.findbyFlag(0));
	}

	/* (non-Javadoc)
	 * @see com.qianfeng.service.JiYuService#add(com.qianfeng.pojo.Myfrinds)
	 */
	@Override
	public ResultVo add(Myfrinds friends) {
		// TODO Auto-generated method stub
		int i = friendDao.updateflagById(friends.getId());
		return ResultVo.setOK("null");
	}

	/* (non-Javadoc)
	 * @see com.qianfeng.service.JiYuService#findFriendsByRelation(java.lang.String)
	 */
	@Override
	public ResultVo findFriendsByRelation(String relation) {
		// TODO Auto-generated method stub
		List<Myfrinds> list = friendDao.findFriendsByRelation(relation);
		return ResultVo.setOK(list);
	}

	/* (non-Javadoc)
	 * @see com.qianfeng.service.JiYuService#findEmployInfoAll()
	 */
	@Override
	public ResultVo findEmployInfoAll() {
		// TODO Auto-generated method stub
		List<EmployInfo> list = empDao.findEmployInfoAll();
		return ResultVo.setOK(list);
	}

	/* (non-Javadoc)
	 * @see com.qianfeng.service.JiYuService#findJobDetailsAll()
	 */
	@Override
	public ResultVo findJobDetailsAll() {
		// TODO Auto-generated method stub
		List<JobDetailsMapper> list = jobDao.findJobDetailsAll();
		return ResultVo.setOK(list);
	}

	/* (non-Javadoc)
	 * @see com.qianfeng.service.JiYuService#findAreaByid(int)
	 */
	@Override
	public ResultVo findAreaByid(int id2) {
		// TODO Auto-generated method stub
		List<Area> list = areaDao.findAreaByid(id2);
		return ResultVo.setOK(list);
	}

	/* (non-Javadoc)
	 * @see com.qianfeng.service.JiYuService#findJobgangweiByid(int)
	 */
	@Override
	public ResultVo findJobgangweiByid(int id2) {
		// TODO Auto-generated method stub
		List<JobGangWei> list = jobgDao.findJobgangweiByid(id2);
		return ResultVo.setOK(list);
	}
	
	

}
