package kr.co.OrcaARS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.OrcaARS.dao.MemberDao;
import kr.co.OrcaARS.vo.MemberVo;



@Service
public class MemberService {

	@Autowired
	private MemberDao dao;
	
	//public ResultVo selectCountUid(String uid) {
		//return dao.selectCountUid(uid);
	//}
	
	public int idCheck(String uid) throws Exception{
		
		return dao.idCheck(uid);
	}

 
	public MemberVo selectMember(MemberVo vo) {
		
		return dao.selectMember(vo);
	}
	
	 

	
	
}
