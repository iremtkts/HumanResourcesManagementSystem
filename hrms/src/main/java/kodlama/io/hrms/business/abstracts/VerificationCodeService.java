package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.VerificationCode;

public interface VerificationCodeService {
	
	
	Result add (VerificationCode verificationCode);
	
	DataResult <VerificationCode> getByUserIdAndVerificationCode(int userId , String verificationCode);
	
	Result update (VerificationCode verificationCode);
}
