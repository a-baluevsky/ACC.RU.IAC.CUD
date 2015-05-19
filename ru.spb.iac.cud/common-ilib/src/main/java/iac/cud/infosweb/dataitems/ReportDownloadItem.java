package iac.cud.infosweb.dataitems;

import java.io.Serializable;

 public class ReportDownloadItem implements Serializable {

	private static final long serialVersionUID = 1L;

	private byte[] content;
	private int flagExec;

	public byte[] getContent() {
		return (content==null)?null: content.clone();
	}

	public void setContent(byte[] content) {
		this.content = (content==null)?null: content.clone();
	}

	public int getFlagExec() {
		return flagExec;
	}

	public void setFlagExec(int flagExec) {
		this.flagExec = flagExec;
	}

}
