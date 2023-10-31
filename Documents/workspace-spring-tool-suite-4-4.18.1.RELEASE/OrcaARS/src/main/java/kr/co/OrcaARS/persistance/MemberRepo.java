package kr.co.OrcaARS.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.OrcaARS.vo.MemberVo;

@Repository
public interface MemberRepo extends JpaRepository<MemberVo, String> {

	
	
	//public int idCheck(MemberVo vo) throws Exception;
	
	
}
