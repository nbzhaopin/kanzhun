/**
 * 
 */
package com.qianfeng.service;

import java.util.List;

import com.qianfeng.pojo.Myfrinds;
import com.qianfeng.vo.ResultVo;

/** 
* @ClassName: JiYuService 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author wei 
* @date 2019年1月8日 下午10:21:39 
*  
*/
public interface JiYuService {
	ResultVo findFriends();
	ResultVo findTuiJianFriends();
	/**
	 * @param friends
	 * @return
	 */
	ResultVo add(Myfrinds friends);
	/**
	 * @return
	 */
	ResultVo findFriendsByRelation(String relation);
	/**
	 * @return
	 */
	ResultVo findEmployInfoAll();
	/**
	 * @return
	 */
	ResultVo findJobDetailsAll();
	/**
	 * @param id2
	 * @return
	 */
	ResultVo findAreaByid(int id2);
	/**
	 * @param id2
	 * @return
	 */
	ResultVo findJobgangweiByid(int id2);
}
