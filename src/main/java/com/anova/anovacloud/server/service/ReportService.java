

package com.anova.anovacloud.server.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.anova.anovacloud.shared.dto.ActionDueDto;
import com.anova.anovacloud.shared.dto.CustomerDto;
import com.anova.anovacloud.shared.dto.CustomerRatingDto;
import com.anova.anovacloud.shared.dto.MatterActionDto;
import com.anova.anovacloud.shared.dto.MatterDto;
import com.anova.anovacloud.shared.dto.RatingDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gwt.i18n.client.DateTimeFormat;

public class ReportService {
	public List <ActionDueDto> getDueThreeDaysActions(List<MatterActionDto> actionDtos)
	{
		List <ActionDueDto> results = new ArrayList<>();
		for (MatterActionDto actionDto : actionDtos){
			MatterDto matterDto = actionDto.getMatter();
			Date dueDate = actionDto.getDueDate();
			Date today = new Date();
			String status = matterDto.getMatterProperties().getStatus();
			if (dueDate != null && status != null)
			{
				if (!status.equalsIgnoreCase("inactive") && !status.equalsIgnoreCase("closed") && !status.equalsIgnoreCase("abandoned") )
				{
					long diff = dueDate.getTime() - today.getTime();
					int days = (int) (diff/1000*60*60*24);
										
					if (days < 4 )
					{
						results.add (new ActionDueDto(matterDto.getMatterNum()+"."+matterDto.getMatterSerialNum(), matterDto.getCustomer().getRefNum(),
								matterDto.getMatterProperties().getMatterTitle(),matterDto.getMatterProperties().getStatus(), DateTimeFormat.getShortDateFormat().format(actionDto.getDueDate()), actionDto.getActionDue(),
								actionDto.getAssignee1()+"/"+actionDto.getAssignee1Role()+";"+actionDto.getAssignee2()+"/"+actionDto.getAssignee2Role()+";"
								+actionDto.getAssignee3()+"/"+actionDto.getAssignee3Role()+";", actionDto.getActionRemarks()));
					}
					/*
					results.add (new ActionDueDto(matterDto.getMatterNum()+"."+matterDto.getMatterSerialNum(), matterDto.getCustomer().getRefNum(),
							matterDto.getMatterProperties().getMatterTitle(),matterDto.getMatterProperties().getStatus(), days_str, actionDto.getActionDue(),
							actionDto.getAssignee1()+"/"+actionDto.getAssignee1Role()+";"+actionDto.getAssignee2()+"/"+actionDto.getAssignee2Role()+";"
							+actionDto.getAssignee3()+"/"+actionDto.getAssignee3Role()+";", actionDto.getActionRemarks()));
				*/
				}
			}
			
		}
		return results;
	}
	
	public List <ActionDueDto> getDueOneWeekActions(List<MatterActionDto> actionDtos)
	{
		List <ActionDueDto> results = new ArrayList<>();
		for (MatterActionDto actionDto : actionDtos){
			MatterDto matterDto = actionDto.getMatter();
			Date dueDate = actionDto.getDueDate();
			Date today = new Date();
			String status = matterDto.getMatterProperties().getStatus();
			if (dueDate != null && status != null)
			{
				if (!status.equalsIgnoreCase("inactive") && !status.equalsIgnoreCase("closed") && !status.equalsIgnoreCase("abandoned") )
				{
					long diff = dueDate.getTime() - today.getTime();
					int days = (int) (diff/1000*60*60*24);
					
					if (days < 8 )
					{
						results.add (new ActionDueDto(matterDto.getMatterNum()+"."+matterDto.getMatterSerialNum(), matterDto.getCustomer().getRefNum(),
									matterDto.getMatterProperties().getMatterTitle(),matterDto.getMatterProperties().getStatus(), DateTimeFormat.getShortDateFormat().format(actionDto.getDueDate()), actionDto.getActionDue(),
									actionDto.getAssignee1()+"/"+actionDto.getAssignee1Role()+";"+actionDto.getAssignee2()+"/"+actionDto.getAssignee2Role()+";"
									+actionDto.getAssignee3()+"/"+actionDto.getAssignee3Role()+";", actionDto.getActionRemarks()));


					}
				}
			}
			
		}
		return results;
	}

	
    public List<CustomerRatingDto> getAverageMatterRatings(List<RatingDto> ratingDtos) {
        HashMap<String, AveragingCounter> averages = new HashMap<>();

        for (RatingDto ratingDto : ratingDtos) {
            MatterDto matterDto = ratingDto.getMatter();
            CustomerDto customer = matterDto.getCustomer();
            String customerName = customer.getName();
            Double rating = Double.valueOf(ratingDto.getRating());

            if (averages.containsKey(customerName)) {
                averages.get(customerName).add(rating);
            } else {
                averages.put(customerName, new AveragingCounter(rating));
            }
        }

        List<CustomerRatingDto> results = new ArrayList<>(averages.size());
        for (String customer : averages.keySet()) {
            results.add(new CustomerRatingDto(customer, averages.get(customer).average()));
        }

        return results;
    }

    private class AveragingCounter {
        private double sum;
        private int count;

        AveragingCounter(double number) {
            this.sum = number;
            this.count = 1;
        }

        void add(double number) {
            this.sum += number;
            this.count++;
        }

        double average() {
            return count == 0 ? Double.NaN : sum / count;
        }
    }
      
    
}
