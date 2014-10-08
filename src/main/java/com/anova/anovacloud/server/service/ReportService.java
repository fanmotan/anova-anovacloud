

package com.anova.anovacloud.server.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import com.anova.anovacloud.shared.dto.ActionDueDto;
import com.anova.anovacloud.shared.dto.MatterActionDto;
import com.anova.anovacloud.shared.dto.MatterDto;
import com.google.gwt.i18n.client.DateTimeFormat;

public class ReportService {
	public List <ActionDueDto> getDueThreeDaysActionList(List<MatterActionDto> actionDtos)
	{
		List <ActionDueDto> results = new ArrayList<>();
		for (MatterActionDto actionDto : actionDtos){
			MatterDto matterDto = actionDto.getMatter();
			Date dueDate = actionDto.getDueDate();
			
			String status = actionDto.getActionStatus().getStatusName();
			if (dueDate != null && status != null)
			{
				//if (!status.equalsIgnoreCase("closed") )
				//{
					//int days = getDiffDays(dueDate);
										
				//	if (days < 4 )
					//{
						results.add (new ActionDueDto("1111", 
								matterDto.getMatterProperties().getCaseTitle(),matterDto.getCaseStatus().getStatusName(), DateTimeFormat.getShortDateFormat().format(actionDto.getDueDate()), actionDto.getActionDue(),
								actionDto.getAtty(), actionDto.getActionRemarks()));
				//	}
					
				//}
			}
			
		}
		return results;
	}
	
	 private int getDiffDays(Date dueDate)
	 {
		 Calendar c1 = Calendar.getInstance();
	     Calendar c2 = Calendar.getInstance();
	     c1.setTime(dueDate);
	     int diffDay = 0;
	     if (c1.before(c2)) {
	           c1.add(Calendar.DAY_OF_MONTH, 1);
	           diffDay++;
	
	         if (diffDay > 0) {
	           diffDay = diffDay - 1;
	         }
	       } else {
	             c2.add(Calendar.DAY_OF_MONTH, 1);
	             diffDay++;
	
	           if (diffDay > 0) {
	             diffDay = diffDay - 1;
	           }
	       }
	     return diffDay;
	 }
    
}
