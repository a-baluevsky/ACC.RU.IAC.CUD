package iac.grn.infosweb.context;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.ScopeType;

/**
 * Сохраняет пользовательские настройки элементов
 * отображения данных в сессии
 * @author bubnov
 *
 */
@Name("profile")
@Scope(ScopeType.SESSION)
 public class Profile {

	/**
	 * определяет количество отображаемых 
	 * строк в таблице Организации
	 */
	 private Long rowsCountOrg=Long.valueOf(10);
	 
	 private Long rowsCountClOrg=Long.valueOf(10);
	 /**
	   * определяет количество отображаемых 
	   * строк в таблице Пользователи
	   */
	 private Long rowsCountUsr=Long.valueOf(10);
	 
	 private Long rowsCountBind=Long.valueOf(10);
	 
	 private Long rowsCountAppSystem=Long.valueOf(10);
	 
	 private Long rowsCountAppUser = Long.valueOf(10);
	 
	 private Long rowsCountAppAccess= Long.valueOf(10);
	 
	 private Long rowsCountAppBlock= Long.valueOf(10);
	 
	 private Long rowsCountAppSystemModify=Long.valueOf(10);
	 
	 private Long rowsCountAppUserModify=Long.valueOf(10);
	 
	 private Long rowsCountAppUserAccModify=Long.valueOf(10);
	 
	 private Long rowsCountAppUserCertModify=Long.valueOf(10);
	 
	 private Long rowsCountAppUserDepModify=Long.valueOf(10);
	 
	 private Long rowsCountAppMySystem=Long.valueOf(10);
	 
	 private Long rowsCountAppMyUser = Long.valueOf(10);
	 
	 private Long rowsCountAppMyBlock= Long.valueOf(10);
	 
     private Long rowsCountAppMyUserModify=Long.valueOf(10);
	 
	 private Long rowsCountAppMyUserAccModify=Long.valueOf(10);
	 
	 private Long rowsCountAppMyUserCertModify=Long.valueOf(10);
	 
	 private Long rowsCountAppAdminSys=Long.valueOf(10);
	 
	 private Long rowsCountAppOrgMan=Long.valueOf(10);
	 
	 private Long rowsCountClUsr=Long.valueOf(10);
	 
	 private Long rowsCountAFunc=Long.valueOf(10);
	   /**
		 * определяет количество отображаемых 
		 * строк в таблице Консоли
		 */ 
	 private Long rowsCountCpar=Long.valueOf(10);
	
	 private Long rowsCountUgroup=Long.valueOf(10);
	 
	 private Long rowsCountArm=Long.valueOf(10);
	 
	 private Long rowsCountArmSub=Long.valueOf(10);
	 
	 private Long rowsCountArmGroup=Long.valueOf(10);
	   /**
		 * определяет количество отображаемых 
		 * строк в таблице Роли
		 */
	 private Long rowsCountRol=Long.valueOf(10);
	
	 private Long rowsCountPerm=Long.valueOf(10);

	     /**
			 * определяет количество отображаемых 
			 * строк в таблице Аудита УФМС
			 */ 
	 private Long rowsCountAudit=Long.valueOf(10);
	 
	 private Long rowsCountAuditSearch=Long.valueOf(10);
	 
	 private Long rowsCountRai=Long.valueOf(10);
	 
	 private Long rowsCountRepos=Long.valueOf(10);
	 
	 private Long rowsCountHosts=Long.valueOf(10);
	 
	 private Long rowsCountDocs=Long.valueOf(10);
	 
	 private Long rowsCountSupport=Long.valueOf(10);
	 
	 public Long getRowsCountArmSub() {
		return rowsCountArmSub;
	 }
	 public void setRowsCountArmSub(Long rowsCountArmSub) {
		this.rowsCountArmSub = rowsCountArmSub;
	 }
	 
	 public Long getRowsCountClOrg() {
	      return rowsCountClOrg;
     }
     public void setRowsCountClOrg(Long rowsCountClOrg) {
		      this.rowsCountClOrg = rowsCountClOrg;
     }

     public Long getRowsCountClUsr() {
	      return rowsCountClUsr;
     }
     public void setRowsCountClUsr(Long rowsCountClUsr) {
		      this.rowsCountClUsr = rowsCountClUsr;
     }

  	 public Long getRowsCountOrg() {
		      return rowsCountOrg;
	 }
	 public void setRowsCountOrg(Long rowsCountOrg) {
			      this.rowsCountOrg = rowsCountOrg;
	 }
	 
	 public Long getRowsCountUsr() {
	      return rowsCountUsr;
     }
     public void setRowsCountUsr(Long rowsCountUsr) {
		      this.rowsCountUsr = rowsCountUsr;
     }
     
     public Long getRowsCountBind() {
	      return rowsCountBind;
     }
     public void setRowsCountBind(Long rowsCountBind) {
		      this.rowsCountBind = rowsCountBind;
     }
    
     public Long getRowsCountAppSystem() {
	      return rowsCountAppSystem;
     }
     public void setRowsCountAppSystem(Long rowsCountAppSystem) {
		      this.rowsCountAppSystem = rowsCountAppSystem;
     }
    
     public Long getRowsCountAppUser() {
	    return rowsCountAppUser;
     }
     public void setRowsCountAppUser(Long rowsCountAppUser) {
		 this.rowsCountAppUser = rowsCountAppUser;
     }
    
     public Long getRowsCountAFunc() {
	      return rowsCountAFunc;
     }
     public void setRowsCountAFunc(Long rowsCountAFunc) {
		      this.rowsCountAFunc = rowsCountAFunc;
     }
     
     public Long getRowsCountCpar() {
	      return rowsCountCpar;
     }
     public void setRowsCountCpar(Long rowsCountCpar) {
		  this.rowsCountCpar = rowsCountCpar;
     }
     
     public Long getRowsCountUgroup() {
	      return rowsCountUgroup;
     }
     public void setRowsCountUgroup(Long rowsCountUgroup) {
		  this.rowsCountUgroup = rowsCountUgroup;
     }
     
     public Long getRowsCountArmGroup() {
	      return rowsCountArmGroup;
     }
     public void setRowsCountArmGroup(Long rowsCountArmGroup) {
		  this.rowsCountArmGroup = rowsCountArmGroup;
     }
    
     public Long getRowsCountArm() {
	      return rowsCountArm;
     }
     public void setRowsCountArm(Long rowsCountArm) {
		      this.rowsCountArm = rowsCountArm;
     }
     public Long getRowsCountRol() {
	      return rowsCountRol;
     }
     public void setRowsCountRol(Long rowsCountRol) {
		      this.rowsCountRol = rowsCountRol;
     }
     
     public Long getRowsCountPerm() {
	      return rowsCountPerm;
     }
     public void setRowsCountPerm(Long rowsCountPerm) {
		      this.rowsCountPerm = rowsCountPerm;
     }
     
     public Long getRowsCountAudit() {
	      return rowsCountAudit;
     }
     public void setRowsCountAudit(Long rowsCountAudit) {
		      this.rowsCountAudit = rowsCountAudit;
     }
     public Long getRowsCountRai() {
	      return rowsCountRai;
     }
     public void setRowsCountRai(Long rowsCountRai) {
		      this.rowsCountRai = rowsCountRai;
     }
     public Long getRowsCountAuditSearch() {
	      return rowsCountAuditSearch;
     }
     public void setRowsCountAuditSearch(Long rowsCountAuditSearch) {
		      this.rowsCountAuditSearch = rowsCountAuditSearch;
     }
     
     public Long getRowsCountRepos() {
	      return rowsCountRepos;
     }
     public void setRowsCountRepos(Long rowsCountRepos) {
		      this.rowsCountRepos = rowsCountRepos;
     }
     
     public Long getRowsCountHosts() {
	      return rowsCountHosts;
     }
     public void setRowsCountHosts(Long rowsCountHosts) {
		      this.rowsCountHosts = rowsCountHosts;
     }
     
     public Long getRowsCountDocs() {
	      return rowsCountDocs;
     }
     public void setRowsCountDocs(Long rowsCountDocs) {
		      this.rowsCountDocs = rowsCountDocs;
     }
     
     public Long getRowsCountSupport() {
	      return rowsCountSupport;
    }
    public void setRowsCountSupport(Long rowsCountSupport) {
		      this.rowsCountSupport = rowsCountSupport;
    }
	public Long getRowsCountAppAccess() {
		return rowsCountAppAccess;
	}
	public void setRowsCountAppAccess(Long rowsCountAppAccess) {
		this.rowsCountAppAccess = rowsCountAppAccess;
	}
	public Long getRowsCountAppBlock() {
		return rowsCountAppBlock;
	}
	public void setRowsCountAppBlock(Long rowsCountAppBlock) {
		this.rowsCountAppBlock = rowsCountAppBlock;
	}
	public Long getRowsCountAppSystemModify() {
		return rowsCountAppSystemModify;
	}
	public void setRowsCountAppSystemModify(Long rowsCountAppSystemModify) {
		this.rowsCountAppSystemModify = rowsCountAppSystemModify;
	}
	public Long getRowsCountAppUserModify() {
		return rowsCountAppUserModify;
	}
	public void setRowsCountAppUserModify(Long rowsCountAppUserModify) {
		this.rowsCountAppUserModify = rowsCountAppUserModify;
	}
	public Long getRowsCountAppUserDepModify() {
		return rowsCountAppUserDepModify;
	}
	public void setRowsCountAppUserDepModify(Long rowsCountAppUserDepModify) {
		this.rowsCountAppUserDepModify = rowsCountAppUserDepModify;
	}
	public Long getRowsCountAppUserAccModify() {
		return rowsCountAppUserAccModify;
	}
	public void setRowsCountAppUserAccModify(Long rowsCountAppUserAccModify) {
		this.rowsCountAppUserAccModify = rowsCountAppUserAccModify;
	}
	public Long getRowsCountAppUserCertModify() {
			return rowsCountAppUserCertModify;
	}
	public void setRowsCountAppUserCertModify(Long rowsCountAppUserCertModify) {
			this.rowsCountAppUserCertModify = rowsCountAppUserCertModify;
	}
	public Long getRowsCountAppMySystem() {
		return rowsCountAppMySystem;
	}
	public void setRowsCountAppMySystem(Long rowsCountAppMySystem) {
		this.rowsCountAppMySystem = rowsCountAppMySystem;
	}
	public Long getRowsCountAppMyUser() {
		return rowsCountAppMyUser;
	}
	public void setRowsCountAppMyUser(Long rowsCountAppMyUser) {
		this.rowsCountAppMyUser = rowsCountAppMyUser;
	}
	public Long getRowsCountAppMyBlock() {
		return rowsCountAppMyBlock;
	}
	public void setRowsCountAppMyBlock(Long rowsCountAppMyBlock) {
		this.rowsCountAppMyBlock = rowsCountAppMyBlock;
	}
	public Long getRowsCountAppMyUserModify() {
		return rowsCountAppMyUserModify;
	}
	public void setRowsCountAppMyUserModify(Long rowsCountAppMyUserModify) {
		this.rowsCountAppMyUserModify = rowsCountAppMyUserModify;
	}
	public Long getRowsCountAppMyUserAccModify() {
		return rowsCountAppMyUserAccModify;
	}
	public void setRowsCountAppMyUserAccModify(Long rowsCountAppMyUserAccModify) {
		this.rowsCountAppMyUserAccModify = rowsCountAppMyUserAccModify;
	}
	public Long getRowsCountAppMyUserCertModify() {
		return rowsCountAppMyUserCertModify;
	}
	public void setRowsCountAppMyUserCertModify(Long rowsCountAppMyUserCertModify) {
		this.rowsCountAppMyUserCertModify = rowsCountAppMyUserCertModify;
	}
	public Long getRowsCountAppAdminSys() {
		return rowsCountAppAdminSys;
	}
	public void setRowsCountAppAdminSys(Long rowsCountAppAdminSys) {
		this.rowsCountAppAdminSys = rowsCountAppAdminSys;
	}
	public Long getRowsCountAppOrgMan() {
		return rowsCountAppOrgMan;
	}
	public void setRowsCountAppOrgMan(Long rowsCountAppOrgMan) {
		this.rowsCountAppOrgMan = rowsCountAppOrgMan;
	}
}
