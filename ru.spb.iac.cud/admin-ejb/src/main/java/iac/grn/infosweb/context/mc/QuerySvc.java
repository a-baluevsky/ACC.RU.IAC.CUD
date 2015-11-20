package iac.grn.infosweb.context.mc;

public class QuerySvc implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -516328967470140924L;
	//17.02.15: AB: MANTIS-4954
	protected long[] m_QueryStats;	
	public String getQueryStatText() {
		String sResult = ""; 
		if(m_QueryStats!=null) {
			StringBuffer sb = new StringBuffer("�����");
			if(m_QueryStats[1]==0) {
					sb.append("� �� �������");
			} else if(m_QueryStats[0]==m_QueryStats[1]) {
				sb.append("� ").append(m_QueryStats[0]);
				if(m_QueryStats[1]==m_QueryStats[2])
					sb.append(" (���������)");
			} else if(m_QueryStats[1]==m_QueryStats[2]) {
				sb.append("� ").append(m_QueryStats[0]).append("-")
				  .append(m_QueryStats[1])
				  .append(" (���������)");				
			} 
			else { // "40-50 / 126";
				sb.append("� ").append(m_QueryStats[0]).append("-")
				  .append(m_QueryStats[1]);			
				if(m_QueryStats[2]>0) {
					sb.append(" �� ")
					  .append(m_QueryStats[2]);
				}
			}
			sResult = sb.toString(); 
		}		
		return sResult;
	}
	
	public String QueryStatsToString() {
		StringBuffer sb = new StringBuffer("[");
		sb.append(m_QueryStats[0]).append(", ")
		.append(m_QueryStats[1]).append(", ")
		.append(m_QueryStats[2]).append("]");
		return sb.toString();
	}

}
