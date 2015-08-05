package iac.grn.infosweb.context.mc;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



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
			StringBuffer sb = new StringBuffer("Запис");
			if(m_QueryStats[1]==0) {
					sb.append("и не найдены");
			} else if(m_QueryStats[0]==m_QueryStats[1]) {
				sb.append("ь ").append(m_QueryStats[0]);
				if(m_QueryStats[1]==m_QueryStats[2])
					sb.append(" (последняя)");
			} else if(m_QueryStats[1]==m_QueryStats[2]) {
				sb.append("и ").append(m_QueryStats[0]).append("-")
				  .append(m_QueryStats[1])
				  .append(" (последние)");				
			} 
			else { // "40-50 / 126";
				sb.append("и ").append(m_QueryStats[0]).append("-")
				  .append(m_QueryStats[1]);			
				if(m_QueryStats[2]>0) {
					sb.append(" из ")
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
