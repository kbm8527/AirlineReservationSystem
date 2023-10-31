package kr.co.OrcaARS.dao;



import org.springframework.stereotype.Repository;

import kr.co.OrcaARS.vo.MemberVo;


@Repository
public interface MemberDao {

	public MemberVo selectMember(MemberVo vo);
	

	
	public int idCheck(String uid) throws Exception;
	 
	
 

}
