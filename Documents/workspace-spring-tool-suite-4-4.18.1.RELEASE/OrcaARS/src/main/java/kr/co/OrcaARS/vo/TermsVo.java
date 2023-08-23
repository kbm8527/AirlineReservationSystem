package kr.co.OrcaARS.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "o_terms")
public class TermsVo {

	@Id
	private String terms;
	private String privacy;
	private String location;
	private String thirdparty;
	private String marketing;
}
